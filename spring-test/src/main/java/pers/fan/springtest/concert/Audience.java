package pers.fan.springtest.concert;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Audience
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/

@Component
@Aspect
public class Audience {

    @Before("execution(** pers.fan.springtest.concert.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("演出开始前，观众关掉手机！");
    }

    @Before("execution(** pers.fan.springtest.concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("演出开始前，观众们各坐各位！");
    }

    @AfterReturning("execution(** pers.fan.springtest.concert.Performance.perform(..))")
    public void applause() {
        System.out.println("演出后，观众们鼓掌！");
    }


    @AfterThrowing("execution(** pers.fan.springtest.concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("演出失败后，观众们要求退款！");
    }


    @Pointcut("execution(* pers.fan.springtest.concert.Performance.onStage(..))")
    public void onStage() {
    }

    @Around("onStage()")
    public void watchPerformer() {
        takeSeats();

        silenceCellPhones();

        onStage();

        System.out.println("哇哇哇！");

        applause();


    }


    @After("execution(* pers.fan.springtest.concert.Performance.say(String)) && args(str)")
    public void answer(String str){
        System.out.println("观众回应："+str);
    }


    @DeclareParents(value = "pers.fan.springtest.concert.Performance+", defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;

    public void newMethod(){
        System.out.println("这是一个通过切面所添加的方法！");
    }
}
