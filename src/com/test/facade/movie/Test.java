package com.test.facade.movie;

public class Test {
    
    public static void main(String[] args) {
        // 子系统组件
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        // 家庭影院外观
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);
        // 看电影
        homeTheater.watchMovie("Raiders of the Lost Ark");
        // 看完电影
        homeTheater.endMovie();
    }
}
