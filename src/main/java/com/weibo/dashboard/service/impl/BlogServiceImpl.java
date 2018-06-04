package com.weibo.dashboard.service.impl;

import com.weibo.dashboard.dao.BlogMapper;
import com.weibo.dashboard.dao.PostMapper;
import com.weibo.dashboard.entity.Blog;
import com.weibo.dashboard.entity.Post;
import com.weibo.dashboard.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

	@Resource
	PostMapper postMapper;
	@Resource
	BlogMapper blogMapper;
	
	public List<Blog> findList() {
		return blogMapper.findList();
	}

	public List<Post> postByUser(String userName) {
		return postMapper.postByUser(userName);
	}

	public int insert(Post post) {
		return postMapper.insert(post);
	}

	public int delete(int id) {
		return postMapper.delete(id);
	}

	public int like(int id) {
		return postMapper.like(id);
	}

	public int dislike(int id) {
		return postMapper.dislike(id);
	}

}
