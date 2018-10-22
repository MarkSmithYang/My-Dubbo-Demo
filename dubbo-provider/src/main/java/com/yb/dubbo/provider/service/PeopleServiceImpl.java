package com.yb.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yb.dubbo.common.model.People;
import com.yb.dubbo.common.service.PeopleService;
import com.yb.dubbo.provider.repository.PeopleRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 * @Description:
 * @date 2018/10/22
 */
@Service(interfaceName = "com.yb.dubbo.common.service.PeopleService")
@org.springframework.stereotype.Service
public class PeopleServiceImpl implements PeopleService {
     public static final Logger log = LoggerFactory.getLogger(PeopleServiceImpl.class);

    @Autowired
    private PeopleRepository peopleRepository;
    
    @Override
    public List<Map<String,Object>> findAll() {
        List<Map<String, Object>> result = peopleRepository.findAll();
        return result;
    }

    @Override
    public People findById(String id) {
        if(StringUtils.isBlank(id)){
            log.info("findById(String id)方法的id为空");
            return null;
        }
        People result = peopleRepository.findById(id);
        return result;
    }
}
