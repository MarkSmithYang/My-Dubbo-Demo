package com.yb.dubbo.consumer;

import com.yb.dubbo.consumer.controller.PeopleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * @author yangbiao
 * @Description:
 * @date 2018/10/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConsumerTest {

    @Autowired
    private PeopleController peopleController;

    @Test
    public void MeTest(){
        //实测,参数前面有不应该有的空格则报错--->"   1",后面有空格却毫无影响-->"1      "
        Map<String,Object> result = peopleController.findById("1");
        System.err.println(result);
    }

}
