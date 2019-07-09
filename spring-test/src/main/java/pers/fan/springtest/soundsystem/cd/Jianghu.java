package pers.fan.springtest.soundsystem.cd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.WebApplicationContext;
import pers.fan.springtest.soundsystem.CompactDisc;

/**
 * @ClassName: Jianghu
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("jianghu")
public class Jianghu implements CompactDisc {
    private String title = "江湖";
    private String artist = "周华健";

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
