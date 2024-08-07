package org.example;

public enum RemoteServiceStatus {
    FAILURE(-1);
    private final long remoteServiceStatusValue;
    RemoteServiceStatus(long remoteServiceStatusValue){
        this.remoteServiceStatusValue = remoteServiceStatusValue;
    }
    public long getRemoteServiceStatusValue() {
        return remoteServiceStatusValue;
    }
}
