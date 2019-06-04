package com.zkyne.feignconsumer.service;

import com.zkyne.feignconsumer.service.impl.NovelConsumerErrorHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: NovelConsumer
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:58
 */
@FeignClient(contextId = "novelConsumer",value = "service-provider",fallback = NovelConsumerErrorHandler.class)
public interface NovelConsumer {
    /**
     * 通过ID查询
     * @param novelId
     * @return
     */
    @RequestMapping(value = "/selectNovelById",method = RequestMethod.GET)
    String selectById(@RequestParam(value = "novelId")Long novelId);
}
