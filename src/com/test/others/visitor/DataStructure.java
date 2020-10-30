package com.test.others.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据结构
 */
public class DataStructure {

    private List<Element> elements = new ArrayList<>();
    
    public void add(Element element) {
        elements.add(element);
    }
    
    public void remove(Element element) {
        elements.remove(element);
    }
    
    /**
     * 接受访问者访问
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
