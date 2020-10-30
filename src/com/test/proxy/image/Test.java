package com.test.proxy.image;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        // 图片代理
        ImageProxy imageProxy = new ImageProxy("https://www.jingqueyimu.com/images/xxx.jpg");
        // 使用图片代理进行绘图
        System.out.println("首次绘图：");
        imageProxy.paint();
        Thread.sleep(3000);
        System.out.println("再次绘图：");
        imageProxy.paint();
    }
}
