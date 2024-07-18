package org.example;

public class Client {
    private final ServiceAmbassador serviceAmbassador = new ServiceAmbassador();

    public long useService(int value){
        long result = serviceAmbassador.doRemoteFunction(value);
        return result;
    }
}
