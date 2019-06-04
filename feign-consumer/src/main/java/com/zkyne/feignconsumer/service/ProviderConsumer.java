package com.zkyne.feignconsumer.service;

import com.zkyne.feignconsumer.service.impl.ProviderConsumerErrorHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: ProviderConsumer
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/4 17:55
 */
@FeignClient(contextId = "providerConsumer",value = "service-provider",fallback = ProviderConsumerErrorHandler.class)
public interface ProviderConsumer {
    /**
     * 通过ID查询
     * @param code
     * @return
     */
    @RequestMapping(value = "/selectProviderByCode",method = RequestMethod.GET)
    String selectByCode(@RequestParam(value = "code")String code);

}
