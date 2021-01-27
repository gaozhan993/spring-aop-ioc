package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.util.CollectionUtils;


//@Import({UserDaoConfig.class,UserServiceConfig.class})
@Configuration
@EnableAspectJAutoProxy
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


    //使用注解实现监听类  任意config注解下
//    @EventListener
//    public void refreshListener(ContextRefreshedEvent event){
//        System.out.println(event.getTimestamp());
//        ApplicationContext context = event.getApplicationContext();
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));
//        System.out.println("································");
//    }

}
