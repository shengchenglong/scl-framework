package com.scl.ioc.xml;

/**
 * BeanDefinition的读取借口
 *
 * Created by shengchenglong on 2017/9/28.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String locations) throws Exception;

}
