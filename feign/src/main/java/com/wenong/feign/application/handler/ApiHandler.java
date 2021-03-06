package com.wenong.feign.application.handler;

import com.wenong.feign.application.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZengZhiHang
 * @create 2019-04-10-13:47
 */
@RestController
public class ApiHandler {

    @Resource
    private ApiService apiService;

    @RequestMapping("index")
    public String index (){
     return  apiService.index();
    }
}
