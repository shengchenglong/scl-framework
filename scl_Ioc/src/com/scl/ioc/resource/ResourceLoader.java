package com.scl.ioc.resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取一般文件路径
 * 暂时只实现读取classpath下的文件
 *
 * Created by shengchenglong on 2017/9/28.
 */
public class ResourceLoader {

    /**
     * classpath路径下的文件路径前缀
     */
    private final String CLASSPATH_PREFIX = "classpath:";

    /**
     *
     * @param location 文件路径
     * @return  Resource的实现类
     */
    public Resource getResource(String location) {
        if (location.startsWith(CLASSPATH_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_PREFIX.length()));
        } else {
            return new ClassPathResource(location);
        }
    }
}
