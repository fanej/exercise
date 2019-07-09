package pers.fan.springtest.soundsystem.cd;

import pers.fan.springtest.soundsystem.CompactDisc;

/**
 * @ClassName: ShiErLou
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/

public class ShiErLou implements CompactDisc {
    private String title = "十二楼";
    private String artist = "莫文蔚";
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
