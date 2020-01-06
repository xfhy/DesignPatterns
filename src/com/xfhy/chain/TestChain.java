package com.xfhy.chain;

/**
 * @author : xfhy
 * Create time : 2020/1/6 23:02
 * Description :
 */
class TestChain {

    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager();
        MajorManager majorManager = new MajorManager();
        GeneralManager generalManager = new GeneralManager();
        commonManager.setSuperior(majorManager);
        majorManager.setSuperior(generalManager);

        Request request = new Request();
        request.requestType = "请假";
        request.requestContent = "小菜请假";
        request.number = 1;
        commonManager.requestApplications(request);

        Request request2 = new Request();
        request2.requestType = "请假";
        request2.requestContent = "小菜请假";
        request2.number = 4;
        commonManager.requestApplications(request2);


        Request request3 = new Request();
        request3.requestType = "加薪";
        request3.requestContent = "小菜请求加薪";
        request3.number = 400;
        commonManager.requestApplications(request3);

        Request request4 = new Request();
        request4.requestType = "加薪";
        request4.requestContent = "小菜请求加薪";
        request4.number = 600;
        commonManager.requestApplications(request4);
    }

}
