package cn.rookiex.coon;


import cn.rookiex.codec.DataCodec;
import cn.rookiex.codec.StringCodec;
import cn.rookiex.core.Message;
import cn.rookiex.observer.observed.MsgInfo;
import lombok.NoArgsConstructor;

/**
 * @author rookieX 2022/12/14
 */
public class SimpleMessage implements Message, MsgInfo {

    private int messageId;

    private long createTime;

    private byte[] data;

    public static DataCodec dataCodec = new StringCodec();

    public SimpleMessage(int message, String msgStr){
        this.messageId = message;
        this.data = dataCodec.encode(msgStr);
        this.createTime = System.currentTimeMillis();
    }

    public SimpleMessage(){
        this.createTime = System.currentTimeMillis();
    }

    @Override
    public int getMsgId() {
        return messageId;
    }

    @Override
    public void setMsgId(int id) {
        this.messageId = id;
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public void setData(Object data) {
        this.data = dataCodec.encode(data);
    }

    @Override
    public <T> T parseData(Class<T> dataClass) {
        return dataCodec.decode(data, dataClass);
    }

    @Override
    public long getCreateTime() {
        return this.createTime;
    }

    @Override
    public void setCreateTime(long time) {
        this.createTime = time;
    }
}
