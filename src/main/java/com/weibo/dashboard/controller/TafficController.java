package com.weibo.dashboard.controller;

import com.weibo.dashboard.entity.Traffic;
import com.weibo.dashboard.service.TrafficService;
import com.weibo.util.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static com.mysql.cj.api.x.Type.JSON;

@RestController
@RequestMapping(value="/traffic")
public class TafficController {
	@Resource
	TrafficService trafficService;


	@ResponseBody
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public ResponseData findList(){
		List<Traffic> list = trafficService.getAll();
		return new ResponseData(list);
	}



	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public int delete(@PathVariable("id") int id){
		int res = trafficService.delete(id);
		return res;
	}
	@ResponseBody
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public ResponseData add(@RequestBody Traffic traffic){
		trafficService.insert(traffic);
		return new ResponseData(traffic);
	}

}
