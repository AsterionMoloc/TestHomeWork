package docs;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue; ...

public class JUnit5Annotations {

    @BeforeAll
    static void setup(){
        System.out.println("setup here");
    }

    @Test
    @DisplayName("Some Test")
    void someTest() {
        System.out.println("some test here");
        assertTrue(true);
    }

    @Test
    @DisplayName("Another Test")
    void anotherTest(){
        assertTrue(true);
    }

}
