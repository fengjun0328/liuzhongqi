package cn.bdqn.service.impl;

import cn.bdqn.dao.UsersMapper;
import cn.bdqn.pojo.Users;
import org.springframework.stereotype.Service;
import cn.bdqn.service.UsersService;
import javax.annotation.Resource;
import java.util.List;

@Service("usersService")
public  class UserServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users findUser(String userName, String usePassword) {
        return null;
    }

    @Override
    public List<Users> findAll(Users users) {
        return null;
    }
}
