package com.kuang.service;

import com.kuang.dao.UserDao;

public class UserServiceImpl implements UserService {

    //region 原来的方式，每次增加一个userDao的实现类都需要修改UserServiceImpl
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMysqlImpl();
    //private UserDao userDao = new UserDaoOracleImpl();
    //endregion

    //region新的方式，通过set注入值，将变化放在用户层，而UserServiceImpl则不需要改变
    private UserDao userDao;
    //利用set进行动态注入值
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    //endregion

    public void getUser() {
        userDao.getUser();
    }
}
