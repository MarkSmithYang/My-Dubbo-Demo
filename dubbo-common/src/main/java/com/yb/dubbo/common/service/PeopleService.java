package com.yb.dubbo.common.service;


import com.yb.dubbo.common.model.People;
import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 * @Description:提供服务的接口
 * @date 2018/10/22
 */
public interface PeopleService {

    public List<Map<String, Object>> findAll();

    public People findById(String id);
}
