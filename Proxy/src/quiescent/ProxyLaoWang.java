package quiescent;

import common.IService;

/**
 * author feiyang
 * create at 2018/9/12 14:51
 * description： 静态代理  老王
 */
public class ProxyLaoWang implements IService {

    private IService iService;

    public ProxyLaoWang(IService iService) {
        this.iService = iService;
    }

    @Override
    public void findGirls(String userName, int age) {
        iService.findGirls(userName, age);
    }

    @Override
    public void byPhone(String phone) {

    }
}
