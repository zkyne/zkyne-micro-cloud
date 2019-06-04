package com.zkyne.feignconsumer.service.impl;

import com.zkyne.feignconsumer.service.ProviderConsumer;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ProviderConsumerErrorHandler
 * @Description:
 * @Author: zkyne
 * @Date: 2019/6/4 18:12
 */
@Service
public class ProviderConsumerErrorHandler implements ProviderConsumer {

    @Override
    public String selectByCode(String code) {
        return "service provider selectByCode error :" + code;
    }
}
