package com.xfhy.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : xfhy
 * Create time : 2020/1/7 22:41
 * Description : 网站工厂
 */
class WebSizeFactory {

    private Map<String, ConcreteWebSite> mWebSiteMap = new HashMap<>();

    public WebSite getWebSizeCategory(String key) {
        if (!mWebSiteMap.containsKey(key)) {
            mWebSiteMap.put(key, new ConcreteWebSite(key));
        }
        return mWebSiteMap.get(key);
    }

    public int getWebSiteCount() {
        return mWebSiteMap.size();
    }

}
