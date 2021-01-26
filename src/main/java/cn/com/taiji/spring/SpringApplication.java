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
        context.refresh();
        for ( String beanName:context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

//        CollectionUtils.arrayToList(context.getBeanDefinitionCount()).forEach(item-> System.out.println(item));

        System.out.println("======================");
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}
