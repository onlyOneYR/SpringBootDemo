package com.sunsan.beetsqltest.user.dao;

import com.sunsan.beetsqltest.user.entity.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@SqlResource("dao.user")
public interface UserDao extends BaseMapper<User> {
//    List<User> query(User user);
}