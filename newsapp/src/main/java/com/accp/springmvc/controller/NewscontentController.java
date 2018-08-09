package com.accp.springmvc.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.entity.Newscontent;
import com.accp.springmvc.entity.Pinglun;
import com.accp.springmvc.entity.Users;
import com.accp.springmvc.entity.Zan;
import com.accp.springmvc.service.NewscontentService;

@Controller
@RequestMapping("/newscontent")
public class NewscontentController {

	@Autowired
	public NewscontentService newscontentService;

	@ResponseBody
	@RequestMapping("/{typeId}")
	public List<Newscontent> selectById(@PathVariable int typeId) {
		return this.newscontentService.selectById(typeId);
	}

	@ResponseBody
	@RequestMapping("/news/{newsId}")
	public List<Newscontent> selectNews(@PathVariable int newsId) {
		return this.newscontentService.selectNewsById(newsId);
	}

	@ResponseBody
	@RequestMapping("/zan/{newsId}")
	public int selectZan(@PathVariable int newsId) {
		int i = this.newscontentService.selectZan(newsId);
		return i;
	}

	@ResponseBody
	@RequestMapping("/gfzan/{newsId}")
	public String gilfzan(@PathVariable int newsId, HttpSession session, Zan za) {
		String ret = "";
		List<Users> user = (List<Users>) session.getAttribute("user");
		if (!user.isEmpty()) {
			int i = this.newscontentService.selectZan(newsId);
			List<Zan> zan = this.newscontentService.gfZan(newsId, user.get(0).getUserId());
			if (zan.size() > 0) {
				ret = i + "";
			} else {
				za.setUserId(user.get(0).getUserId());
				za.setNewsId(newsId);
				this.newscontentService.zan(za);
				ret = (i + 1) + "";
			}
		} else {
			ret = "Î´µÇÂ¼";
		}

		return ret;
	}
	
	
	
	/**
	 * ·ÖÏí
	 */
	
	@RequestMapping("/fenxian/{newsId}")
	public String fenxiao(@PathVariable int newsId,Model model) {
		List<Newscontent> newsList=this.newscontentService.selectNewsById(newsId);
		model.addAttribute("newsList", newsList);
		return "/fenxiang.jsp";
	}
	
	/**
	 * ÆÀÂÛ
	 */
	
	@ResponseBody
	@RequestMapping("/pingLun/{newsId}")
	public int pingLun(@PathVariable int newsId,Pinglun pinglin,String content,HttpSession session) {
		List<Users> user = (List<Users>) session.getAttribute("user");
		pinglin.setContent(content);
		pinglin.setNewsId(newsId);
		pinglin.setUserName(user.get(0).getUserName());
		int i=this.newscontentService.pinglun(pinglin);
		return i;
	}
	
	
	@ResponseBody
	@RequestMapping("findPl/{newsId}")
	public List<Pinglun> findPingLun(@PathVariable int newsId) throws UnsupportedEncodingException{
		List<Pinglun> li =this.newscontentService.findPingL(newsId);
		return li;
	}
}
