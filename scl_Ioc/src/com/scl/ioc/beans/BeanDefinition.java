package com.scl.ioc.beans;

/**
 * 定义Bean的数据结构
 * 我们不直接存储bean对象，而是存储bean的数据结构，这样可以在需要的时间根据bean的数据结构创建bean
 *
 * Created by shengchenglong on 2017/9/28.
 */
public class BeanDefinition {

    // bean的名称
    private String name;

    // bean的class对象
    private Class classs;

    // bean的class包路径
    private String className;

    // bean的依赖属性
    private PropertyValues propertyValues = new PropertyValues();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getClasss() {
        return classs;
    }

    public void setClasss(Class classs) {
        this.classs = classs;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
