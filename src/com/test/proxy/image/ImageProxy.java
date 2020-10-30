package com.test.proxy.image;

/**
 * 图片代理
 */
public class ImageProxy implements Image {
    
    RealImage realImage;
    String imageUrl;
    /**
     * 是否已加载图片
     */
    boolean hasLoaded = false;
    
    public ImageProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void paint() {
        if (realImage != null) {
            // 有图片，则直接绘图
            realImage.paint();
        } else {
            // 没有图片，则先显示加载中的信息，再去加载并绘制图片
            System.out.println("Loading CD cover, please wait...");
            loadAndPaint();
        }
    }
    
    /**
     * 加载并绘制图片
     */
    private void loadAndPaint() {
        if (hasLoaded) {
            return;
        }
        hasLoaded = true;
        // 加载图片是一个比较耗时的操作，为了避免程序阻塞，采用异步处理
        new Thread(new Runnable() {
            @Override
            public void run() {
                realImage = new RealImage(imageUrl, "CD Cover");
                // 加载完后，再进行绘图
                realImage.paint();
            }
        }).start();
    }
}
