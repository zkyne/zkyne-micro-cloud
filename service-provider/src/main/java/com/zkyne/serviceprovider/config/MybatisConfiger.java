package com.zkyne.serviceprovider.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ClassName: MybatisConfig
 * @Description:
 * @Author: zhangkun01
 * @Date: 2018/7/24 16:11
 */
@Configuration
@AutoConfigureAfter({DruidDataSourceConfiger.class})
public class MybatisConfiger {
    @Resource(name = "masterDataSource")
    private DataSource masterDataSource;
    @Resource(name = "slaveDataSource")
    private DataSource slaveDataSource;

    @Value("${mybatis.type-aliases-package}")
    private String typeAliasesPackage;
    @Value("${mybatis.config-location}")
    private String configLocation;
    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;

    private SqlSessionFactory masterSqlSessionFactory() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(this.masterDataSource);
        try {
            bean.setTypeAliasesPackage(this.typeAliasesPackage);
            bean.setConfigLocation(new DefaultResourceLoader().getResource(this.configLocation));
            org.springframework.core.io.Resource[] resources = new PathMatchingResourcePatternResolver().getResources(this.mapperLocations);
            bean.setMapperLocations(resources);
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "master_sqlSession")
    public SqlSessionTemplate masterSqlSessionTemplate() {
        return new SqlSessionTemplate(masterSqlSessionFactory());
    }

    private SqlSessionFactory slaveSqlSessionFactory() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(this.slaveDataSource);
        try {
            bean.setTypeAliasesPackage(this.typeAliasesPackage);
            bean.setConfigLocation(new DefaultResourceLoader().getResource(this.configLocation));
            org.springframework.core.io.Resource[] resources = new PathMatchingResourcePatternResolver().getResources(this.mapperLocations);
            bean.setMapperLocations(resources);
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "slave_sqlSession")
    public SqlSessionTemplate slaveSqlSessionTemplate() {
        return new SqlSessionTemplate(slaveSqlSessionFactory());
    }

}
