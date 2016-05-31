package com.edu.touch.service.impl;

import com.edu.touch.dao.MemberMapper;
import com.edu.touch.pojo.Member;
import com.edu.touch.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhongyuan on 2016/5/11.
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

    private static Logger logger = Logger.getLogger(IUserServiceImpl.class);

    @Resource
    private MemberMapper memberMapper;

    public Member getMemberById(int userId) {
        System.out.println("444444444444444444444444444::" + memberMapper);
        logger.info("1111111111111111111111111111111111111111111111::"+memberMapper );
        return this.memberMapper.selectByPrimaryKey(userId);
    }
}
