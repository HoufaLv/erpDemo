package com.lv.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by houfalv on 2018/7/9.
 * 本地缓存设计
 */
public class TokenCache {

    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);

    public static final String TOKEN_PREFIX = "token_";

    private static LoadingCache<String, String> localCache = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(1000).expireAfterAccess(12, TimeUnit.HOURS).build(new CacheLoader<String, String>() {
        //默认的数据加载实现，当调用get取值的时候，如果key 没有对应的值，就调用这个方式
        @Override
        public String load(String s) throws Exception {
            return "null";
        }
    });

    /**
     * 设置缓存
     *
     * @param key
     */
    public static void setKey(String key, String value) {
        localCache.put(key, value);
    }

    /**
     * 获取缓存
     *
     * @param key
     */
    public static String getKey(String key) {
        String value = null;
        try {
            value = localCache.get(key);
            if ("null".equals(value)) {
                return null;
            }
            return value;
        } catch (ExecutionException e) {
            e.printStackTrace();
            logger.error("local cache error", e);
        }
        return null;
    }
}
