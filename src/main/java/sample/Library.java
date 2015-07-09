package sample;

import sample.aspects.AroundTest;

public class Library {
    @AroundTest
    public void sampleAroundAspect() {
        System.out.println("running");
    }
}
