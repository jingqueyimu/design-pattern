package com.test.composite;

import java.util.List;

/**
 * 叶节点
 */
public class Leaf extends Component {

    private String name;
    
    public Leaf(String name) {
        this.name = name;
    }
    
    @Override
    public void addChild(Component component) {
        // 叶节点不能添加子节点，可以抛异常或者空实现
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeChild(Component component) {
        // 叶节点没有子节点可移除，可以抛异常或者空实现
        throw new UnsupportedOperationException();
    }
    
    @Override
    public List<Component> getChilds() {
        // 叶节点没有子节点，可以抛异常或者返回空集合
        throw new UnsupportedOperationException();
    }
    
    @Override
    public String getName() {
        return name;
    }
}
