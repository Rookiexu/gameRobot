package cn.rookiex.event.login;

import cn.rookiex.event.RespEvent;
import cn.rookiex.robot.RobotContext;

/**
 * @author rookieX 2022/12/6
 */
public class RespLogin implements RespEvent {
    @Override
    public int eventId() {
        return 0;
    }

    @Override
    public void dealResp(RobotContext robotContext) {

    }
}
