package com.wenong.feign.application.service;

import org.springframework.stereotype.Component;

/**
 * @author ZengZhiHang
 * @create 2019-04-10-13:42
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务器发生故障";
    }
}
