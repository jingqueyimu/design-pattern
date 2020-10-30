package com.test.proxy.image;

/**
 * 真正进行图片操作的真实图片类
 */
public class RealImage implements Image {

    String url;
    String description;
    
    public RealImage(String url,  String description) {
        this.url = url;
        this.description = description;
        load(url);
    }
    
    @Override
    public void paint() {
        System.out.println("Image is painted");
    }

    /**
     * 模拟加载图片
     */
    private void load(String url) {
        try {
            System.out.println("Loading image from: " + url);
            for (int i = 0; i < 10; i++) {
                System.out.print("===");
                Thread.sleep(200);
            }
            System.out.println("===>100%");
            System.out.println("Loading image is finished!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
