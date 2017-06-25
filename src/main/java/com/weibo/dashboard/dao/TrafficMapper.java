package com.weibo.dashboard.dao;

import com.weibo.dashboard.entity.Traffic;
import com.weibo.dashboard.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrafficMapper {
	List<Traffic>  getAll();
	Traffic select(@Param("id") int id);
	int insert(Traffic traffic);
	int delete(@Param("id") int id);

}
