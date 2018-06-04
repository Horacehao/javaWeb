package com.weibo.dashboard.service;

import com.weibo.dashboard.entity.Blog;
import com.weibo.dashboard.entity.Post;

import java.util.List;

public interface BlogService {
	List<Blog> findList();

	List<Post> postByUser(String userName);

	int insert(Post post);

	int delete(int id);

	int like(int id);

	int dislike(int id);
}
