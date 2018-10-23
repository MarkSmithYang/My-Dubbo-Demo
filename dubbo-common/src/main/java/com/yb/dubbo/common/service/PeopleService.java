package com.yb.dubbo.common.service;

import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 * @Description:提供服务的接口
 * @date 2018/10/22
 */
public interface PeopleService {

    public List<Map<String, Object>> findAll();

    public Map<String, Object> findById(String id);
}
