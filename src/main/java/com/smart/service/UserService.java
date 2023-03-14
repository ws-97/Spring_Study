package com.smart.service;

import com.smart.dao.UserDao;
import com.smart.domain.LoginLog;
import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smart.dao.LoginLogDao;

/**
 * @Author ws
 * @create 2023/3/13 17:17
 * @Description 业务层
 */
@Service //将UserService标注为一个服务层的Bean
public class UserService {
    private UserDao userDao;
    private LoginLogDao loginLogDao;

    @Autowired  //注入UserDao
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Autowired//注入LoginLogDao
    public void setLoginLogDao(LoginLogDao loginLogDao) {
        this.loginLogDao = loginLogDao;
    }


    public boolean hasMatchUser(String userName, String password) {
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }

    @Transactional //标注为事务注解
    public void loginSuccess(User user) {
        //通过此方法将两个DAP组织起来，共同完成一个事务性的数据操作
        user.setCredits(5 + user.getCredits());
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());
        userDao.updateLoginInfo(user);
        loginLogDao.insertLoginLog(loginLog);
    }


}
