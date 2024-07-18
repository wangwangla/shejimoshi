package org.example;

import static java.lang.Thread.sleep;

public class ServiceAmbassador implements RemoteServiceInterface{
    private static final int RETEIES = 3;
    private static final int DELAY_MS = 3000;

    public ServiceAmbassador(){

    }

    @Override
    public long doRemoteFunction(int value) {
        return safeCall(value);
    }

    private long checkLatency(int value){
        long startTime = System.currentTimeMillis();
        long result = RemoteService.getRemoteService().doRemoteFunction(value);
        long timeTaken = System.currentTimeMillis() - startTime;
        return result;
    }

    private long safeCall(int value){
        long retries = 0;
        long result = RemoteServiceStatus.FAILURE.getRemoteServiceStatusValue();

        for (int i=0;i<RETEIES;i++){
            if (retries >= RETEIES){
                return RemoteServiceStatus.FAILURE.getRemoteServiceStatusValue();
            }
            if ((result = checkLatency(value)) == RemoteServiceStatus.FAILURE.getRemoteServiceStatusValue()){
                retries++;
                try {
                    sleep(DELAY_MS);
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }
            }else {
                break;
            }
        }
        return result;
    }
}
