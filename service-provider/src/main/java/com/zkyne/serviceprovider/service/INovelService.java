package com.zkyne.serviceprovider.service;

import com.zkyne.serviceprovider.entity.Novel;

/**
 * @ClassName: INovelService
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:14
 */
public interface INovelService {

    Novel selectById(Long novelId);
}
