package cn.com.taiji.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    setting注入
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    @Transaction(propagate = "service_save")
    public void save(){
//        userDao.save();
        System.out.println("service save");
    }
}
