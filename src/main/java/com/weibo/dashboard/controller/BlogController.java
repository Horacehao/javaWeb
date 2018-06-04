package com.weibo.dashboard.controller;


import com.weibo.dashboard.entity.Blog;
import com.weibo.dashboard.service.BlogService;
import com.weibo.util.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping(value="/blog")
public class BlogController {
    @Resource
    BlogService blogService;


    @ResponseBody
    @RequestMapping(value="/show",method=RequestMethod.GET)
    public ResponseData findList(){
//        List<Post> list =  new ArrayList<Post>();
        List<Blog> list = blogService.findList();
        System.out.println("bloglist size:"+list.size());
        return new ResponseData(list);
    }



    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public int delete(@PathVariable("id") int id){
        int res = blogService.delete(id);
        return res;
    }
    @ResponseBody
    @RequestMapping(value="/new",method=RequestMethod.POST)
    public ResponseData add(@RequestBody Blog blog){
//        blogService.insert(blog);
        return new ResponseData(blog);
    }

}
