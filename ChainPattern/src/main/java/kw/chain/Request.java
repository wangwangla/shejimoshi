package kw.chain;

import java.util.Objects;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;
    public Request(final RequestType requestType,final String requestDescription){
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public void markHandled(){
        this.handled = true;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
