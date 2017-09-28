package com.scl.ioc.resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取classpath下文件的resource实现类
 * <p>
 * Created by shengchenglong on 2017/9/28.
 */
public class ClassPathResource implements Resource {

    private String path;

    private ClassLoader classLoader;

    /**
     * 构造方法
     * <p>使用当前线程的上下文类加载器</p>
     * @param path 包含文件名的路径
     */
    public ClassPathResource(String path) {
        this(path, (ClassLoader) null);
    }

    /**
     * 构造方法
     * @param path 包含文件名的路径
     * @param classLoader 类加载器
     */
    public ClassPathResource(String path, ClassLoader classLoader) {
        this.path = path;
        this.classLoader = (classLoader == null ? Thread.currentThread().getContextClassLoader() : classLoader);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return classLoader.getResourceAsStream(path);
    }
}
