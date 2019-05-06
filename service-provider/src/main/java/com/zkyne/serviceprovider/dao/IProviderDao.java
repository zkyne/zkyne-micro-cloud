package com.zkyne.serviceprovider.dao;


import com.zkyne.serviceprovider.entity.Provider;

import java.util.List;

/**
 * @author
 */
public interface IProviderDao extends IBaseDao<Provider> {

    List<Provider> selectByProviderCode(String code);
}