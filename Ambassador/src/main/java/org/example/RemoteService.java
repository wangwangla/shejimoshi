package org.example;

import org.example.util.RandomProvider;

import static java.lang.Thread.sleep;

public class RemoteService implements RemoteServiceInterface {
    private static final int THRESHOLD = 200;
    private static RemoteService service;
    private final RandomProvider randomProvider;

    private RemoteService(){
        this(Math::random);
    }

    public RemoteService(RandomProvider randomProvider){
        this.randomProvider = randomProvider;
    }
    public static synchronized RemoteService getRemoteService(){
        if (service == null){
            service = new RemoteService();
        }
        return service;
    }
    @Override
    public long doRemoteFunction(int value) {
        long waitTime = (long) Math.floor(randomProvider.random() * 1000);
        try {
            sleep(waitTime);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        return waitTime <= THRESHOLD ? value * 10 : RemoteServiceStatus.FAILURE.getRemoteServiceStatusValue();
    }
}
