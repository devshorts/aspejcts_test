package sample;


import org.junit.Test;

public class LibraryTest {
    @Test
    public void test() {
        Library library = new Library();

        library.sampleAroundAspect();

        library.setField("test");
    }
}
