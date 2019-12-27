package com.xfhy.factory.abstractfactory.plus;

/**
 * Created by xfhy on 2019/12/27 14:09
 * Description :
 */
class DataAccess {

    /**
     * 可配置  用于切换数据库   下面用反射即可取到对应的类
     */
        private final static String DB = "Access";
//    private final static String DB = "Sqlserver";

    public static IControlUser createUser() {
        return (IControlUser) createInstance("ControlUser");
    }

    public static IDepartment createDepartment() {
        return (IDepartment) createInstance("Department");
    }

    public static Object createInstance(String suffix) {
        Object result = null;
        try {
            Class<?> aClass = Class.forName("com.xfhy.factory.abstractfactory.plus." + DB + suffix);
            result = aClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return result;
    }

}
