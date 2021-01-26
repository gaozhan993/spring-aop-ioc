package cn.com.taiji.spring;

public class ProxyUserService implements UserService{

    private UserService userService;

    public ProxyUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void save() {
        System.out.println("before");
        userService.save();
        System.out.println("after");
    }
}
