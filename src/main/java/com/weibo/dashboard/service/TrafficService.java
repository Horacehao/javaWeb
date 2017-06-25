package com.weibo.dashboard.service;


import com.weibo.dashboard.entity.Traffic;

import java.util.List;

public interface TrafficService {
	List<Traffic> getAll();
	Traffic select(int id);
	int insert(Traffic traffic);
	int delete(int id);

}
