package com.zkyne.feignconsumer.service.impl;

import com.zkyne.feignconsumer.service.NovelConsumer;
import org.springframework.stereotype.Service;

/**
 * @ClassName: NovelServiceImpl
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 16:52
 */
@Service
public class NovelConsumerErrorHandler implements NovelConsumer {

    @Override
    public String selectById(Long novelId) {
        return "service provider selectById error :" + novelId;
    }


}
