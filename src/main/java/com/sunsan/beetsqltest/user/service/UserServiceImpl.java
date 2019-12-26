package com.sunsan.beetsqltest.user.service;

import com.sunsan.beetsqltest.user.dao.UserDao;
import com.sunsan.beetsqltest.user.entity.User;
import com.sunsan.beetsqltest.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    public User getById(Integer id) {
        return userDao.unique(id);
    }

    public List<User> query(String name) {
        User user = new User();
        user.setName(name);
        return userDao.template(user);
    }

}