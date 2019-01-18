package cn.bdqn.dao;

import cn.bdqn.pojo.Users;

import java.util.List;

public interface UsersMapper {
   /**
    * 登录
    * @param userName
    * @param usePassword
    * @return
    */
   public Users findUser(String userName, String usePassword);

   /**
    * 查询全部
    * @param users
    * @return
    */
   public List<Users> findAll(Users users);

}
