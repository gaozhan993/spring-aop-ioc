package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

public class SpringApplication {
    public static void main(String[] args) {
        //配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
        //注解
//        ApplicationContext context = new AnnotationConfigApplicationContext("cn.com.taiji.spring");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);

//        未加Compton注解需要 add 加入到context
//        context.addApplicationListener(new ApplicationStartedListener());

        context.refresh();
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));

//        System.out.println("======================");

//        UserService userService = context.getBean(UserService.class);
//        UserService userService1 = context.getBean(UserService.class);
//        System.out.println(userService==userService1);

//         UserService userService2 = (UserService) context.getBean(UserService.class);
//         userService2.save();


        UserService userService = (UserService) context.getBean("userService");
        userService.save();

//          UserDao userDao = context.getBean(UserDao.class);
//          userDao.save();


    }
}
