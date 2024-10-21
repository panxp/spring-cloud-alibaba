package org.micro.alibaba.consumer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${wx.appId}")
    private String appId;
    @Value("${wx.secret}")
    private String secret;

    @Value("${wechat}")
    private String wechat;

    @GetMapping("/config")
    public String config() {
        return "wechat：" + wechat + ", appId：" + appId;
    }


}