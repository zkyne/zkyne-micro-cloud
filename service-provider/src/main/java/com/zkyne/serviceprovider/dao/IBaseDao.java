package com.zkyne.serviceprovider.dao;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;


/**
 * @author
 * @param <T>
 */
public interface IBaseDao<T> {
    SqlSessionTemplate getSqlSessionQueryTemplate();

    SqlSessionTemplate getSqlSessionTemplate();

    /**
     * 从库查询
     */
    T selectOne(String statement);

    /**
     * 从库查询
     */
    T selectOne(String statement, Object parameter);

    /**
     * 从库查询
     */
    Map<?, ?> selectMap(String statement, String mapKey);

    /**
     * 从库查询
     */
    Map<?, ?> selectMap(String statement, Object parameter, String mapKey);

    /**
     * 从库查询
     */
    Map<?, ?> selectMap(String statement, Object parameter,
                        String mapKey, RowBounds rowBounds);

    /**
     * 从库查询
     */
    List<T> selectList(String statement);

    /**
     * 从库查询
     */
    List<T> selectList(String statement, Object parameter);

    /**
     * 从库查询
     */
    List<T> selectList(String statement, Object parameter,
                       RowBounds rowBounds);

    /**
     * 从库查询
     */
    void select(String statement, ResultHandler handler);

    /**
     * 从库查询
     */
    void select(String statement, Object parameter, ResultHandler handler);

    /**
     * 从库查询
     */
    void select(String statement, Object parameter, RowBounds rowBounds,
                ResultHandler handler);

    /**
     * 主库插入
     */
    int insert(String statement);

    /**
     * 主库插入
     */
    int insert(String statement, Object parameter);

    /**
     * 主库更新
     */
    int update(String statement);

    /**
     * 主库更新
     */
    int update(String statement, Object parameter);

    /**
     * 主库删除
     */
    int delete(String statement);

    /**
     * 主库删除
     */
    int delete(String statement, Object parameter);

    /**
     * 主库查询(查询及时信息)
     */
    List<T> selectMasterList(String statement, Object parameter);

    /**
     * 主库查询(查询及时信息)
     */
    List<T> selectMasterList(String statement);

    /**
     * 主库查询(查询及时信息)
     */
    T selectMasterOne(String statement, Object parameter);
}
