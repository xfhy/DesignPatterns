package quiescent;

import common.User;

/**
 * author feiyang
 * create at 2018/9/12 14:52
 * description： 测试静态代理
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        User user = new User();
        ProxyLaoWang proxyLaoWang = new ProxyLaoWang(user);
        proxyLaoWang.findGirls("Paney", 18);
    }
}
