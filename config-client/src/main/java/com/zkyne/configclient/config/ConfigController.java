package com.zkyne.configclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/5/6 16:56
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {
    @Value("${test.name}")
    private String testName;

    @RequestMapping("/test")
    public String test(){
        System.out.println(testName);
        return testName;
    }
}
