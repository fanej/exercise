package pers.fan.springtest.concert;

import org.springframework.stereotype.Component;

/**
 * @ClassName: ConcertZhou
 * @Description: TODO
 * @Author: fanenjie
 * @Date: 2019/07/09
 * @Version: V1.0
 **/
@Component
public class ConcertZhou implements Performance {
    public void perform() {
        System.out.println("周杰伦的个人演唱会，演唱“哥练的胸肌，如果你还想靠······”");
//        throw new RuntimeException("演出设备出问题！！！");
    }

    public void onStage() {
        System.out.println("周杰伦出场了！！！！");
    }

    public void say(String str) {
        System.out.println("周杰伦对观众说："+str);
    }
}
