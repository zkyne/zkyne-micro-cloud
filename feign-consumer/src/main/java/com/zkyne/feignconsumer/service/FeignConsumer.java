package com.zkyne.feignconsumer.service;

import com.zkyne.feignconsumer.service.impl.FeignConsumerErrorHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: FeignConsumer
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:58
 */
@FeignClient(value = "service-provider",fallback = FeignConsumerErrorHandler.class)
public interface FeignConsumer {
    /**
     * 通过ID查询
     * @param novelId
     * @return
     */
    @RequestMapping(value = "/selectNovelById",method = RequestMethod.GET)
    String selectById(@RequestParam(value = "novelId")Long novelId);

    /**
     * 通过ID查询
     * @param code
     * @return
     */
    @RequestMapping(value = "/selectProviderByCode",method = RequestMethod.GET)
    String selectByCode(@RequestParam(value = "code")String code);

}
