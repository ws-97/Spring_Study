package com.smart.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import com.smart.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author ws
 * @create 2023/3/13 16:12
 * @Description
 */
@Repository //通过Spring 注解一个DAO
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired//自动注入JdbcTemplate的bean
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(String userName,String password){
        String sqlStr=" select count(*) from t_user" +
                " where user_name=? and password=?";
        return jdbcTemplate.queryForObject(sqlStr,new Object[]{userName,password},Integer.class);
    }

    private final  static  String MATCH_COUNT_SQL=" select count(*) " +
            "from t_user " +
            "where user_name=? and password=?";
    private final static  String UPDATE_LOGIN_INFO_SQL="update t_user " +
            "set last_visit=?,last_ip=?,credits=? " +
            "where user_id=?";

    public User findUserByUserName(final String userName){
        String sqlStr = " SELECT user_id,user_name,credits "
                + " FROM t_user WHERE user_name =? ";
        final  User user=new User();
        jdbcTemplate.query(sqlStr,new Object[]{
                userName
        },
                //匿名类方式实现的回调函数
                new RowCallbackHandler(){
            public void processRow(ResultSet rs) throws SQLException{
                user.setUserId(rs.getInt("user_id"));
                user.setUserName(userName);
                user.setCredits(rs.getInt("credits"));
            }
                }
                );
        return user;
    }


    public void updateLoginInfo(User user){
        jdbcTemplate.update(UPDATE_LOGIN_INFO_SQL,new Object[]{user.getLastVisit(),
        user.getLastIp(),user.getCredits(),user.getUserId()});

    }
}
