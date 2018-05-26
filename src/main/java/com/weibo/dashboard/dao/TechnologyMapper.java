package com.weibo.dashboard.dao;

import com.weibo.dashboard.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyMapper {
	List<Post> findList();
	List<Post> postByUser(@Param("userName") String userName);
	int insert(Post post);
	int delete(@Param("id") int id);
	int like(@Param("id") int id);
	int dislike(@Param("id") int id);
	
}
