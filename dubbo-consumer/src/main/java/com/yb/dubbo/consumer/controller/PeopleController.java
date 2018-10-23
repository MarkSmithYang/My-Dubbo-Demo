package com.yb.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yb.dubbo.common.service.PeopleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 * @Description:服务消费的控制层(接口)
 * @date 2018/10/22
 */
@RestController
@CrossOrigin
public class PeopleController {

    @Reference(interfaceName = "com.yb.dubbo.common.service.PeopleService")
    private PeopleService peopleService;

    @GetMapping("findAll")
    public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> result = peopleService.findAll();
        return result;
    }

    @GetMapping("findById")
    public Map<String, Object> findById(@RequestParam String id) {
        Map<String, Object> result = peopleService.findById(id);
        return result;
    }

}
