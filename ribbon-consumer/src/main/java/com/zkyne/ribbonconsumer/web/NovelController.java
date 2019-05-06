package com.zkyne.ribbonconsumer.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: NovelController
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:20
 */
@RestController
@RequestMapping("ribbon")
public class NovelController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("novel/{novelId}")
    @HystrixCommand(fallbackMethod = "serviceError")
    public String selectById(@PathVariable("novelId")Long novelId){
        System.out.println(novelId);
        return restTemplate.getForEntity("http://service-provider/selectNovelById?novelId="+novelId,String.class).getBody();
    }

    public String serviceError(Long novelId){
        return "error" + novelId;
    }


    @RequestMapping("")
    public String index(){
        return "success";
    }
}
