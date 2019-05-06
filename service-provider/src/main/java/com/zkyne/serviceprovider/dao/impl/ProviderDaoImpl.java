package com.zkyne.serviceprovider.dao.impl;

import com.zkyne.serviceprovider.dao.IProviderDao;
import com.zkyne.serviceprovider.entity.Provider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 */
@Repository
public class ProviderDaoImpl extends BaseDaoImpl<Provider> implements IProviderDao {
    @Override
    public List<Provider> selectByProviderCode(String code) {
        return this.selectList("ProviderMapper.selectByProviderCode", code);
    }
}