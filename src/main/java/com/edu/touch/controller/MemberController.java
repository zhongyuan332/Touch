package com.edu.touch.controller;

import com.edu.touch.pojo.Member;
import com.edu.touch.service.IUserService;
import com.edu.touch.service.impl.IUserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhongyuan on 2016/5/11.
 */
@Controller
@RequestMapping( value = "/user")
public class MemberController {
    private static Logger logger = Logger.getLogger(MemberController.class);
    @Resource
    private IUserServiceImpl userService;

    @RequestMapping("/showUser")
    public String toIndex(String id ,HttpServletRequest request,Model model){

        System.out.println("111111111111111111111111:"+id);
        System.out.println("111111111111111111111111:"+id);

        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("222222222222222222222222222::"+userId);
        Member member = this.userService.getMemberById(userId);
        model.addAttribute("user", member);
        return "showUser";
    }
}
