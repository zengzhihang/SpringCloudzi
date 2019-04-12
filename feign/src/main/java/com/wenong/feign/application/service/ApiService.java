package com.wenong.feign.application.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZengZhiHang
 * @create 2019-04-08-16:25
 */
@FeignClient(value="eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
