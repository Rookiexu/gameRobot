package cn.rookiex.event.item;

import cn.rookiex.event.ReqEvent;
import cn.rookiex.robot.RobotContext;

/**
 * @author rookieX 2022/12/6
 */
public class ReqItem implements ReqEvent {

    @Override
    public int eventId() {
        return 0;
    }

    @Override
    public void dealReq(RobotContext robotContext) {

    }
}
