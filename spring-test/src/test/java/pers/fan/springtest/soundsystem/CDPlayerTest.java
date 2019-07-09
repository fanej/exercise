package pers.fan.springtest.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.fan.springtest.config.JavaConfig;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
@ActiveProfiles("song")
public class CDPlayerTest {

    @Autowired
    @Qualifier("shierlou")
    private CompactDisc cd1;

    @Autowired
    @Qualifier("shierlou")
    private CompactDisc cd2;

    @Autowired
    @Qualifier("jianghu")
    private CompactDisc cd3;

    @Autowired
    @Qualifier("jianghu")
    private CompactDisc cd4;


    @Test
    public void play() {
        System.out.println("默认模式Singleton测试：");
        System.out.println(cd1.equals(cd2));

        System.out.println("prototype 模式测试：");
        System.out.println(cd3.equals(cd4));
    }
}