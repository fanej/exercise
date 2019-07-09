package pers.fan.springtest.soundsystem.cd;

import pers.fan.springtest.soundsystem.CompactDisc;

/**
 * @ClassName: BlankDisc
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing "+ title + " by "+artist);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
