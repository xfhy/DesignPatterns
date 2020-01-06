package com.xfhy.chain;

/**
 * @author : xfhy
 * Create time : 2020/1/6 22:58
 * Description : 总监
 */
class MajorManager extends Manager {

    @Override
    void requestApplications(Request request) {
        if ("请假".equals(request.requestType) && request.number <= 5) {
            System.out.println("我是总监,你这个请假,直接批准");
        } else {
            if (superior != null) {
                //给下一个处理
                superior.requestApplications(request);
            }
        }
    }
}
