package com.scl.ioc.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储依赖、属性
 * <p>
 * Created by shengchenglong on 2017/9/28.
 */
public class PropertyValues {

    /**
     * 属性、依赖 键值对
     */
    private List<PropertyValue> propertyValuelist = new ArrayList<PropertyValue>();

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValuelist.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValuelist() {
        return this.propertyValuelist;
    }

}
