package org.meizhuo.rpc.server;

/**
 * Created by wephone on 17-12-27.
 */
public class RPCResponse {

    //每个请求对应的唯一ID
    private String requestID;
    private Object result;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
