package com.xfhy.chain;

/**
 * @author : xfhy
 * Create time : 2020/1/6 22:58
 * Description : 总经理
 */
class GeneralManager extends Manager {

    @Override
    void requestApplications(Request request) {
        if ("请假".equals(request.requestType)) {
            System.out.println("我是总经理,你这个请假,直接批准");
        } else if ("加薪".equals(request.requestType) && request.number <= 500) {
            System.out.println("我是总经理,你这个加薪,直接批准");
        } else if ("加薪".equals(request.requestType) && request.number > 500) {
            System.out.println("我是总经理,你这个加薪,我考虑考虑");
        }
    }
}
