import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {
    @Test

    void capitalizeString() {
        StringManipulator testObj = new CapitalizeStringManipulator();
        String name = "emily";
        String result = testObj.modify(name);
        assertEquals("EMILY", result);
    }
    @Test
    void capitalizeFirstLetterOnly_WITHANONYMOUS_CLASS() {
        //anonymous class:traditional way
        StringManipulator testObj = new CapitalizeStringManipulator() {
            @Override
            public String modify(String s) {
                String firstChar = s.substring(0,1).toUpperCase();
                String end = s.substring(1);
                return firstChar + end ;
            }
        };
        String name = "emily";
        String result = testObj.modify(name);
        assertEquals("Emily", result);
    }

    @Test
    void lowercaseAString_withLambda(){
        //StringManipulator testObj = String ::toLowercase; another way to use Java functional interface to do the same thing
        StringManipulator testObj = m -> m.toLowerCase();
        String name = "ALex";
        String result = testObj.modify(name);
        assertEquals("alex", result);

    }

    @Test
    void addition_withLambda() {
        IntMath math = (a, b) -> a + b;
        assertEquals(5,math.doMath(2,3));
    }

}
