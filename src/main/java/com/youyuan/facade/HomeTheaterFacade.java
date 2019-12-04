package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 家庭影院外观
 * @date 2019/12/2 17:23
 */
public class HomeTheaterFacade {
    /**
     * dvd
     */
    private DVDPlayer dvdPlayer;
    /**
     * 爆米花
     */
    private Popcorn popcorn;
    /**
     * 投影仪
     */
    private Projector projector;
    /**
     * 屏幕
     */
    private Screen screen;
    /**
     * 音响
     */
    private Stereo stereo;
    /**
     * 灯光
     */
    private TheaterLights theaterLights;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLights = TheaterLights.getInstance();
    }

    /**
     * 准备
     */
    public void ready() {
        theaterLights.on();
        screen.down();
        stereo.on();
        projector.on();
        dvdPlayer.on();
        popcorn.on();
        popcorn.pop();
    }

    /**
     * 播放
     */
    public void play() {
        stereo.up();
        theaterLights.dim();
        dvdPlayer.play();
    }

    public void end() {
        theaterLights.bright();
        screen.up();
        stereo.off();
        projector.off();
        dvdPlayer.off();
    }
}
