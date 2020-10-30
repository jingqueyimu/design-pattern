package com.test.others.visitor;

/**
 * 元素接口
 */
public interface Element {

    /**
     * 接受访问者访问
     */
    public void accept(Visitor visitor);
}
