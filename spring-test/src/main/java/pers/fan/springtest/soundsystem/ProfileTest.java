package pers.fan.springtest.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pers.fan.springtest.soundsystem.cd.ShiErLou;

/**
 * @ClassName: ProfileTest
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/
@Configuration
@Profile("song")
public class ProfileTest {

    @Bean("shierlou")
    public CompactDisc shiErLou(){
        return new ShiErLou();
    }
}
