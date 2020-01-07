package com.xfhy.flyweight;

/**
 * @author : xfhy
 * Create time : 2020/1/7 22:44
 * Description :
 */
class TestFlyWeight {

    public static void main(String[] args) {
        WebSizeFactory webSizeFactory = new WebSizeFactory();

        //这里的user实例是外部的数据  WebSite是内部数据->共享

        WebSite fx = webSizeFactory.getWebSizeCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = webSizeFactory.getWebSizeCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = webSizeFactory.getWebSizeCategory("产品展示");
        fz.use(new User("zz"));

        WebSite fl = webSizeFactory.getWebSizeCategory("博客");
        fl.use(new User("老顽童"));

        WebSite fm = webSizeFactory.getWebSizeCategory("博客");
        fm.use(new User("桃谷六仙"));

        WebSite fn = webSizeFactory.getWebSizeCategory("博客");
        fn.use(new User("蓝海二审"));

        /*
        *   网站分类: 产品展示  用户:小菜
            网站分类: 产品展示  用户:大鸟
            网站分类: 产品展示  用户:zz
            网站分类: 博客  用户:老顽童
            网站分类: 博客  用户:桃谷六仙
            网站分类: 博客  用户:蓝海二审
            得到网站分类总数: 2
        * */

        System.out.println("得到网站分类总数: " + webSizeFactory.getWebSiteCount());
    }

}
