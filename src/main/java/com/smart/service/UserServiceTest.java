//package org.精通Spring4.x企业应用开发实战.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
//import org.testng.annotations.Test;
//import org.精通Spring4.x企业应用开发实战.domain.User;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
///**
// * @Author ws
// * @create 2023/3/13 20:13
// * @Description
// */
//@ContextConfiguration("classpath*:/smart-context_1.xml") //启动Spring容器
//public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {
//    private UserService userService;
//    @Autowired //注入Spring容器中的Bean
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Test
//    public void hasMatchUser(){
//        boolean b1= userService.hasMatchUser("admin","123456");
//        boolean b2= userService.hasMatchUser("admin","1111");
//        assertTrue(b1);
//        assertTrue(!b2);
//
//    }
//
//    public void findUserByUserName(){
//        User user= userService.findUserByUserName("admin");
//        assertEquals(user.getUserName(),"admin");
//    }
//
//
//}
