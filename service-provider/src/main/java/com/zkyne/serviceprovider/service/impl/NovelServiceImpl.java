package com.zkyne.serviceprovider.service.impl;

import com.zkyne.serviceprovider.entity.Novel;
import com.zkyne.serviceprovider.service.INovelService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: NovelServiceImpl
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:15
 */
@Service
public class NovelServiceImpl implements INovelService {

    @Override
    public Novel selectById(Long novelId) {
        Novel novel = new Novel();
        novel.setNovelId(novelId);
        novel.setTitle("通过eureka 远程调用查询的作品");
        return novel;
    }
}
