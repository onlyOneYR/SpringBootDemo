package com.sunsan.beetsqltest.user.service;

import java.util.List;
import com.sunsan.beetsqltest.user.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    User getById(Integer id);
    List<User> query(String name);
}
