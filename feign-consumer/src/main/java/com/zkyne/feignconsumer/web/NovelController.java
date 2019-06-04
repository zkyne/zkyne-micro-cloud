package com.zkyne.feignconsumer.web;

import com.zkyne.feignconsumer.service.ProviderConsumer;
import com.zkyne.feignconsumer.service.NovelConsumer;
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
    private NovelConsumer novelConsumer;
    @Resource
    private ProviderConsumer providerConsumer;

    @RequestMapping("novel/{novelId}")
    public String selectById(@PathVariable("novelId")Long novelId){
        System.out.println(novelId);
        return novelConsumer.selectById(novelId);
    }



    @RequestMapping("")
    public String index(){
        return "success";
    }
}
