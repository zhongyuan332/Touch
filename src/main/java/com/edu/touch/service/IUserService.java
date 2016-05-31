package com.edu.touch.service;

import com.edu.touch.pojo.Member;
import org.springframework.stereotype.Service;

/**
 * Created by zhongyuan on 2016/5/11.
 */
public interface IUserService {
    public Member getMemberById(int userId);
}
