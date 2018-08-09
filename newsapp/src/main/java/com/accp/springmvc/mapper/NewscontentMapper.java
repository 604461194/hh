package com.accp.springmvc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc.entity.Newscontent;
import com.accp.springmvc.entity.Pinglun;
import com.accp.springmvc.entity.Zan;

public interface NewscontentMapper {
List<Newscontent> selectNewsById(@Param("typeId")int typeId);

List<Newscontent> selectNews(@Param("newsId")int newsId);

int selectZan(@Param("newsId")int newsId);

List<Zan> gfZan(@Param("newsId")int newsId,@Param("userId")int userId);


int zan(Zan zan);

int addPinglun(Pinglun pinglun);

List<Pinglun> findPingL(@Param("newsId")int newsId);
}
