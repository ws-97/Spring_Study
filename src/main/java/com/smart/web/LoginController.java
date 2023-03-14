package com.smart.web;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Author ws
 * @create 2023/3/14 09:47
 * @Description 标注成为一个Spring MVC的Controller
 */
@Controller//通过此注解可以将任何一个POJO类标注为SpringMVC的控制器，处理HTTP请求
public class LoginController {
    private UserService userService;

    //一个处理器可以拥有处理多个处理映射不同HTTP请求路径的方法
    @RequestMapping(value="/index.html")
    public String loginPage(){
        return "login";
    }

    //3.负责处理/loginCheck.html的请求
    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request,
                                   LoginCommand loginCommand){
        boolean isValidUser=userService.hasMatchUser(loginCommand.getUserName(),
                loginCommand.getPassword());
        if(!isValidUser){
            return new ModelAndView("login","error","用户名或密码错误。");
        }else{
            User user=userService.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(request.getLocalAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user",user);
            return new ModelAndView("main");
        }
    }

    @Autowired
    public void setUserService(UserService userService){
        this.userService=userService;
    }





}
