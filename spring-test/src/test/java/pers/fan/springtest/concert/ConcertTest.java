package pers.fan.springtest.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.fan.springtest.config.JavaConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class ConcertTest {

    @Autowired
    private Performance pf;

    @Test
    public void perform(){
        pf.perform();
        System.out.println("--------------------------------------");
        pf.onStage();
        System.out.println("--------------------------------------");
        pf.say("干啥呢？干啥呢？");

        System.out.println("--------------------------------------");
        Encoreable encoreable = (Encoreable)pf;
        encoreable.sayFuck();


    }




}