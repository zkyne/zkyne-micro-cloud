package com.zkyne.serviceprovider.dao.impl;

import com.zkyne.serviceprovider.dao.IBaseDao;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param <T>
 * @author
 */
@Repository
public abstract class BaseDaoImpl<T> implements IBaseDao<T> {

    @Resource(name = "master_sqlSession")
    private SqlSessionTemplate sqlSession;

    @Resource(name = "slave_sqlSession")
    private SqlSessionTemplate sqlSessionQurey;

    @Override
    public SqlSessionTemplate getSqlSessionQueryTemplate() {
        return this.sqlSessionQurey;
    }

    @Override
    public SqlSessionTemplate getSqlSessionTemplate() {
        return this.sqlSession;
    }

    /**
     * 从库查询
     */

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    @Override
    public T selectOne(String statement) {
        return (T) this.getSqlSessionQueryTemplate().selectOne(statement);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public T selectOne(String statement, Object parameter) {
        return (T) this.getSqlSessionQueryTemplate().selectOne(statement, parameter);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public Map<?, ?> selectMap(String statement, String mapKey) {
        return this.getSqlSessionQueryTemplate().selectMap(statement, mapKey);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public Map<?, ?> selectMap(String statement, Object parameter, String mapKey) {
        return this.getSqlSessionQueryTemplate().selectMap(statement, parameter, mapKey);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public Map<?, ?> selectMap(String statement, Object parameter,
                               String mapKey, RowBounds rowBounds) {
        return this.getSqlSessionQueryTemplate().selectMap(statement, parameter, mapKey,
                rowBounds);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<T> selectList(String statement) {
        return (List<T>) this.getSqlSessionQueryTemplate().selectList(statement);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<T> selectList(String statement, Object parameter) {
        return (List<T>) this.getSqlSessionQueryTemplate().selectList(statement, parameter);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<T> selectList(String statement, Object parameter,
                              RowBounds rowBounds) {
        return (List<T>) this.getSqlSessionQueryTemplate().selectList(statement, parameter, rowBounds);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public void select(String statement, ResultHandler handler) {
        this.getSqlSessionQueryTemplate().select(statement, handler);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public void select(String statement, Object parameter, ResultHandler handler) {
        this.getSqlSessionQueryTemplate().select(statement, parameter, handler);
    }

    /**
     * 从库查询
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public void select(String statement, Object parameter, RowBounds rowBounds,
                       ResultHandler handler) {
        this.getSqlSessionQueryTemplate().select(statement, parameter, rowBounds, handler);
    }

    /**
     * 主库插入
     */
    @Override
    public int insert(String statement) {
        return this.getSqlSessionTemplate().insert(statement);
    }

    /**
     * 主库插入
     */
    @Override
    public int insert(String statement, Object parameter) {
        return this.getSqlSessionTemplate().insert(statement, parameter);
    }

    /**
     * 主库更新
     */
    @Override
    public int update(String statement) {
        return this.getSqlSessionTemplate().update(statement);
    }

    /**
     * 主库更新
     */
    @Override
    public int update(String statement, Object parameter) {
        if (parameter != null) {
            return this.getSqlSessionTemplate().update(statement, parameter);
        }
        return 0;
    }

    /**
     * 主库删除
     */
    @Override
    public int delete(String statement) {
        return this.getSqlSessionTemplate().delete(statement);
    }

    /**
     * 主库删除
     */
    @Override
    public int delete(String statement, Object parameter) {
        if (parameter != null) {
            return this.getSqlSessionTemplate().delete(statement, parameter);
        }
        return 0;
    }

    /**
     * 主库查询(查询及时信息)
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<T> selectMasterList(String statement, Object parameter) {
        return (List<T>) this.getSqlSessionTemplate().selectList(statement, parameter);
    }

    /**
     * 主库查询(查询及时信息)
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<T> selectMasterList(String statement) {
        return (List<T>) this.getSqlSessionTemplate().selectList(statement);
    }

    /**
     * 主库查询(查询及时信息)
     */
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public T selectMasterOne(String statement, Object parameter) {
        return (T) this.getSqlSessionTemplate().selectOne(statement, parameter);
    }

    /**
     * 根据参数构造map，参数必须为偶数个，依次为key1，value1，key2，value2…….
     *
     * @param datas 参数列表
     * @return 构造出的map
     */
    protected Map map(final Object... datas) {
        Assert.isTrue(datas.length % 2 == 0, "参数必须为偶数个");
        final Map map = new HashMap();
        for (int i = 0; i < datas.length; i += 2) {
            map.put(datas[i], datas[i + 1]);
        }
        return map;
    }

}
