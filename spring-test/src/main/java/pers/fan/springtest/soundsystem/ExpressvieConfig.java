package pers.fan.springtest.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import pers.fan.springtest.soundsystem.cd.BlankDisc;

/**
 * @ClassName: ExpressvieConfig
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/
@Configuration
@PropertySource("classpath:test.properties")
public class ExpressvieConfig {

    @Autowired
    private Environment env;

    @Bean("test01")
    public BlankDisc disc(){
        return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }
}
