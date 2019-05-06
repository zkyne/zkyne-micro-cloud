package com.zkyne.feignconsumer.web;

import com.zkyne.feignconsumer.service.FeignConsumer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: NovelController
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:20
 */
@RestController
@RequestMapping("feign")
public class NovelController {
    @Resource
    private FeignConsumer feignConsumer;

    @RequestMapping("novel/{novelId}")
    public String selectById(@PathVariable("novelId")Long novelId){
        System.out.println(novelId);
        return feignConsumer.selectById(novelId);
    }

    @RequestMapping("provider/{code}")
    public String selectById(@PathVariable("code")String code){
        System.out.println(code);
        return feignConsumer.selectByCode(code);
    }

    @RequestMapping("")
    public String index(){
        return "success";
    }
}
