package com.zkyne.serviceprovider.service.impl;

import com.zkyne.serviceprovider.dao.IProviderDao;
import com.zkyne.serviceprovider.entity.Provider;
import com.zkyne.serviceprovider.service.IProviderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ProviderServiceImpl
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/25 16:26
 */
@Service
public class ProviderServiceImpl implements IProviderService {
    @Resource
    private IProviderDao providerDao;
    @Override
    public List<Provider> selectByCode(String code) {
        return providerDao.selectByProviderCode(code);
    }
}
