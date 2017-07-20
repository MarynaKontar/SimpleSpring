package com.app;

/**
 * Created by User on 19.07.2017.
 */
public class XMLProcessor implements Processor{

    private String title;

    public XMLProcessor() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("XML processor: " + title);
    }

    public XMLProcessor(String title) {
        this.title = title;


    }
}
