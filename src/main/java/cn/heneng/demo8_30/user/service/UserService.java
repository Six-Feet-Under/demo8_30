package cn.heneng.demo8_30.user.service;

import cn.heneng.demo8_30.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);
}
