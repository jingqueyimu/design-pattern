package com.test.composite;


/**
 * 组合
 */
public class Composite extends Component {

    private String name;
    
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
