package sample;

import lombok.Data;
import sample.aspects.AroundTest;

@Data
public class Library {
    @AroundTest
    public Object sampleAroundAspect() {
        System.out.println("running");

        return null;
    }

    private String field;
}
