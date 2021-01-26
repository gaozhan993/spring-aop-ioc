package cn.com.taiji.spring;

import org.junit.Test;

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
}
