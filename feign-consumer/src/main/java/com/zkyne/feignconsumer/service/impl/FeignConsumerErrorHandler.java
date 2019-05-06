package com.zkyne.feignconsumer.service.impl;

import com.zkyne.feignconsumer.service.FeignConsumer;
import org.springframework.stereotype.Service;

/**
 * @ClassName: NovelServiceImpl
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 16:52
 */
@Service
public class FeignConsumerErrorHandler implements FeignConsumer {

    @Override
    public String selectById(Long novelId) {
        return "service provider selectById error :" + novelId;
    }

    @Override
    public String selectByCode(String code) {
        return "service provider selectByCode error :" + code;
    }
}
