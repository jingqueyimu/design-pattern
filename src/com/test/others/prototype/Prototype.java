package com.test.others.prototype;

/**
 * 原型类（实现Cloneable接口）
 */
public class Prototype implements Cloneable {

    public String type;
    
    public Prototype(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 实现clone方法
     */
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prototype [type=" + type + "]";
    }
}
