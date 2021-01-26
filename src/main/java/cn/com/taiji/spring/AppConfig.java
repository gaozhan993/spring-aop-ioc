package cn.com.taiji.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//@Import({UserDaoConfig.class,UserServiceConfig.class})
@Configuration
@ComponentScan("cn.com.taiji.spring")
public class AppConfig{

//    @Bean
//    public UserService userService(){
//        return  new UserService();
//    }
//    @Bean
//    public UserDao userDao(){
//        return new UserDao();
//    }

}
