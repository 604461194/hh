package com.accp.springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Classes;
import com.accp.springmvc.entity.Jiexi;
import com.accp.springmvc.entity.Timu;
import com.accp.springmvc.serivce.ClassSerivce;
import com.accp.springmvc.serivce.JiexiSerivce;
import com.accp.springmvc.serivce.TimuSerivce;

@Controller
@RequestMapping("/last")
public class LastController {

	@Autowired
	public TimuSerivce timuSerivce;

	@Autowired
	public JiexiSerivce jiexiSerivce;

	@Autowired
	public ClassSerivce classSerivce;
	
	@RequestMapping("/huo")
	public String houtai() {

		return "huoTai";
	}

	@ResponseBody
	@RequestMapping("/daochu")
	public String dao(Class clazz, String name)
			throws IllegalArgumentException, IllegalAccessException, SecurityException {
		// 查出相对的数据表
		List<Map<String, Object>> map = null;
		if (name.equals("班级")) {
			clazz = Classes.class;
			
		} else if (name.equals("题目")) {
			clazz = Timu.class;
			map = this.timuSerivce.selectAllD();
			System.err.println(map);
		} else if (name.equals("解析")) {
			clazz = Jiexi.class;
			map = this.jiexiSerivce.selectAll();
		}

		// 表头 数据库字段，获取对象字段名
		Field[] fields = clazz.getDeclaredFields();
		// 创建excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 创建一个工作表
		HSSFSheet sheet = workbook.createSheet();
		// 创建第一行
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		// 表头
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field.getName());
			cell = row.createCell(i);
			cell.setCellValue(field.getName());
		}
		// 追加数据
		for (int a = 0; a < map.size(); a++) {
			// 创建一行
			HSSFRow nextrow = sheet.createRow(a + 1);
			for (int i = 0; i < fields.length; i++) {
				// 创建一格
				HSSFCell cell2 = nextrow.createCell(i);
				String value = "";
				System.err.println(map.get(a).get(fields[i].getName()));
				if (map.get(a).get(fields[i].getName()) == null) {
					value = null;
				} else {
					value = map.get(a).get(fields[i].getName()).toString();
				}
				cell2.setCellValue(value);
			}
		}
		File file = new File("e:/" + clazz.getSimpleName() + ".xls");
		try {
			file.createNewFile();
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "a";
	}

	@RequestMapping("/daoRu")
	public String ru(Class clazz, String path)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {

				clazz = Timu.class;
		if (path.indexOf(clazz.getSimpleName() + ".xls") != -1) {
			// 需要解析的excel文件
			File file = new File("e:/" + clazz.getSimpleName() + ".xls");
			System.err.println(clazz.newInstance().getClass().getSimpleName());
			// 创建excel,读取文件内容
			try {
				HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
				/*
				 * 按名次读取 HSSFSheet sheet=workbook.getSheet("Sheet0");
				 */
				// 默认读取第一个工作表
				HSSFSheet sheet = workbook.getSheetAt(0);

				int firstRowNm = 0;
				// 获取sheet中最后一行行号
				int lastRowNum = sheet.getLastRowNum();
				for (int i = 1; i < lastRowNum; i++) {
					HSSFRow row = sheet.getRow(i);
					// 获取当前行最后单元格号
					Map<String, Object> map = null;
					int lastCellNum = row.getLastCellNum();
					for (int j = 0; j < lastCellNum; j++) {
						HSSFCell cell = row.getCell(j);
						String value = cell.getStringCellValue();
						Field[] fields = clazz.getDeclaredFields();
						System.out.print(value + " ");
						System.err.println();
						Field field = clazz.getDeclaredField(fields[j].getName());
						field.setAccessible(true);
						if (!value.equals("")){
							if(fields[j].getType().toString().equals("int")){
								field.set(clazz.newInstance(),Integer.parseInt(value));
							}else {
								field.set(clazz.newInstance(),value);
							}
						}
						clazz = Timu.class;
						this.timuSerivce.insertA(Timu.class.newInstance());
						
					}
					
					System.out.println();
				}

			} catch (IOException e) {

				e.printStackTrace();
			}

		} else {
			return "此文件无法导入";
		}

		return null;
	}

}
