package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import common.IService;
import common.User;

/**
 * author feiyang
 * create at 2018/9/12 14:52
 * description： 测试静态代理
 */
public class TestDynamicProxy {
    public static void main(String[] args) {

        IService userService = new User();

        IService proxyLaoWang = (IService) Proxy.newProxyInstance(userService.getClass()
                        .getClassLoader(),
                userService.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws
                            Throwable {
                        //代理对象当调用目标接口方法的时候，会先回调InvocationHandler接口的实现方法invoke。

                        //调用userService的某个方法,并传入参数   并获取返回值
                        long currentTimeMillis = System.currentTimeMillis();
                        Object returnValue = method.invoke(userService, args);
                        long calledTime = System.currentTimeMillis();
                        long invokeTime = calledTime - currentTimeMillis;
                        System.out.println("执行时间" + invokeTime);
                        return returnValue;
                    }
                });
        proxyLaoWang.findGirls("Paney", 20);
        proxyLaoWang.byPhone("IPhoneX");
    }
}
