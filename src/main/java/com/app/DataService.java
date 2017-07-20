package com.app;

/**
 * Created by User on 19.07.2017.
 */
public class DataService {
    private Processor processor;

    public DataService() {
    }

    public DataService(Processor processor) {
        this.processor = processor;
    }

    public void makeAction(){
        long start = System.currentTimeMillis();
        processor.process();
        long time = start - System.currentTimeMillis();
        System.out.println("time = " + time);
    }
}
