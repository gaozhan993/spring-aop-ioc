package cn.com.taiji.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan("cn.com.taiji.spring")
public class ProxyUserServiceTest {

    @Test
    public void TestProxy(){

        ProxyUserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyDynamic(){
        DynamicProxyJDK proxy = new DynamicProxyJDK(new UserServiceImpl());
        UserService userService = (UserService) proxy.getProxy();
        userService.save();
    }

    @Test
    public void cglibProxyTest(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(new DynamicProxyCglib());
        UserDao userDao = (UserDao) enhancer.create();
        userDao.save();
    }

    @Test
    public void cglibProxyTest2(){
        DynamicProxyCglib proxy = new DynamicProxyCglib();
        UserDao userDao = (UserDao) proxy.getProxy(UserDao.class);
        userDao.save();
    }
}
