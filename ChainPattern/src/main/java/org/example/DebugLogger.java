package org.example;

public class DebugLogger extends AbstractLogger{
    public DebugLogger(int debug) {
        this.level = debug;
    }

    @Override
    protected void write(String message) {
        System.out.println("file logger");
    }
}
