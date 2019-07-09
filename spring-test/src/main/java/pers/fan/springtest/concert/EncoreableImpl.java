package pers.fan.springtest.concert;

import org.springframework.stereotype.Component;

/**
 * @ClassName: EncoreableImpl
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/

@Component
public class EncoreableImpl implements Encoreable {
    public void sayFuck() {
        System.out.println("这是一个通过切面所添加的方法！");
        System.out.println("fuck!!!!!!!!!!!");
    }
}
