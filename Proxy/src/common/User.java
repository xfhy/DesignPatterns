package common;

/**
 * author feiyang
 * create at 2018/9/12 14:49
 * description：
 */
public class User implements IService {
    @Override
    public void findGirls(String userName, int age) {
        System.out.println("老王帮我找到女朋友 " + userName + "   她的年龄:" + age);
    }

    @Override
    public void byPhone(String phone) {
        System.out.println("老王帮我买了个手机 " + phone);
    }
}
