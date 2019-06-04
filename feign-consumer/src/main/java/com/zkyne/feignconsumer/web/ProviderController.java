package com.zkyne.feignconsumer.web;

import com.zkyne.feignconsumer.service.ProviderConsumer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: ProviderController
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/4 18:10
 */
@RestController
@RequestMapping("feign")
public class ProviderController {
    @Resource
    private ProviderConsumer providerConsumer;

    @RequestMapping("provider/{code}")
    public String selectById(@PathVariable("code")String code){
        System.out.println(code);
        return providerConsumer.selectByCode(code);
    }
}
