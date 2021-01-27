package cn.com.taiji.spring;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {

    @Transaction(propagate = "dao_save")
    public void save(){
        System.out.println("dao save");
    }
}
