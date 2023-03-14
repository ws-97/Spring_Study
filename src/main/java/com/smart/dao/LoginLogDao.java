package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * @Author ws
 * @create 2023/3/13 16:35
 * @Description
 */
@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemple;
    //保存登录日志SQL
    private final static  String INSERT_LOGIN_LOG_SQL="INSERT into t_login_log(user_id,ip,login_datetime) " +
            "values(?,?,?)";

    public void insertLoginLog(LoginLog loginLog){
        Object[] args={loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()};
        jdbcTemple.update(INSERT_LOGIN_LOG_SQL,args);

    }

    @Autowired
    public void setJdbcTemple(JdbcTemplate jdbcTemplate){
        this.jdbcTemple=jdbcTemplate;
    }


}
