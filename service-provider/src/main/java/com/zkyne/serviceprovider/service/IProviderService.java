package com.zkyne.serviceprovider.service;

import com.zkyne.serviceprovider.entity.Provider;

import java.util.List;

/**
 * @ClassName: IProviderService
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/25 16:26
 */
public interface IProviderService {

    List<Provider> selectByCode(String code);
}
