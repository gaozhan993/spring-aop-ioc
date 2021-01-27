package cn.com.taiji.spring;

public interface UserService {

//    @Transaction(propagate = "i_Service_Save")
    @Transaction(propagate = "service_save")
    public void save();
}
