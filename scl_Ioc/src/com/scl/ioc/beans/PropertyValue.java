package com.scl.ioc.beans;

/**
 * 一个bean的依赖或者属性，通过键值对来记录
 *
 * Created by shengchenglong on 2017/9/28.
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
