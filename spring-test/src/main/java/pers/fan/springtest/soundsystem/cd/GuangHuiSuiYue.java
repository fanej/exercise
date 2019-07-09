package pers.fan.springtest.soundsystem.cd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pers.fan.springtest.soundsystem.CompactDisc;

/**
 * @ClassName: GuangHuiSuiYue
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/
@Component
@Qualifier("guanghuisuiyue")
public class GuangHuiSuiYue implements CompactDisc {
    private String title = "光辉岁月";
    private String artist = "Beyond";
    public void play() {
        System.out.println("Playing "+ title + " by "+artist);
    }
}
