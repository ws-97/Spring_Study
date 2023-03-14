package com.ioc;

/**
 * @Author ws
 * @create 2023/3/13 11:46
 * @Description
 */
public interface IFXNewListener {
    String[] getAvailableNewsIds();

    FXNewsBean getNewsByPK(String newsId);
//    CREATE TABLE t_user (
//        `user_id` INT AUTO_INCREMENT PRIMARY KEY,
//                user_name VARCHAR(30),
//        `credits` INT,
//        `password` VARCHAR(32),
//        `last_visit` datetime,
//        `last_ip` VARCHAR(23)
//) ENGINE=InnoDB;


}
