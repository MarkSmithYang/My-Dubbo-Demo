package com.yb.dubbo.provider.repository;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 * @Description:持久层服务
 * @date 2018/10/22
 */
@Repository
public class PeopleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired//使用map来封装参数的用法,使用in的时候就需要用
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * 查询所有people数据
     *
     * @return
     */
    public List<Map<String, Object>> findAll() {
        //把map在封装成people是没有必要的,因为返回的数据都是key:vaule的json格式
        List<Map<String, Object>> result = jdbcTemplate.queryForList("select * from people");
        return result;
    }

    /**
     * 根据id查询people信息
     *
     * @return
     */
    public Map<String, Object> findById(String id) {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from people where id=?", id);
        return CollectionUtils.isNotEmpty(maps)?maps.get(0):null;
    }
}
