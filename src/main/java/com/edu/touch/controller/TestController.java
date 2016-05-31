package com.edu.touch.controller;

import com.alibaba.fastjson.JSON;
import com.edu.touch.pojo.Member;
import com.edu.touch.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by zhongyuan on 2016/5/11.
 */

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        Member member = userService.getMemberById(3);
        System.out.println(member.getMembername());
        // logger.info("值："+user.getUserName());
        logger.info("1111111111111111111111111111111111111111111111::"+JSON.toJSONString(member));
    }
}
