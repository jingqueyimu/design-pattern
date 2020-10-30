package com.test.others.responsibilitychain;

/**
 * 请求数据包
 */
public class Request {

    /**
     * 级别
     */
    private int level;
    
    /**
     * 数据
     */
    private String data;
    
    public Request(int level, String data) {
        this.level = level;
        this.data = data;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
