package com.weibo.dashboard.service.impl;

import com.weibo.dashboard.dao.TrafficMapper;
import com.weibo.dashboard.entity.Traffic;
import com.weibo.dashboard.service.TrafficService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TrafficServiceImpl implements TrafficService{

	@Resource
	private TrafficMapper trafficMapper;


	public List<Traffic> getAll() {
		return trafficMapper.getAll();
	}

	public Traffic select(int id) {
		return trafficMapper.select(id);
	}

	public int insert(Traffic traffic) {
		return trafficMapper.insert(traffic);
	}

	public int delete(int id) {
		return trafficMapper.delete(id);
	}

}
