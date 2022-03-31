import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class Test1 {

    @BeforeEach
    public void beforeTests() {
        System.out.println("Testet måste gå igenom");

    }
    @Test
    public void checkString() {
        Assertions.assertEquals("Jag heter Kalle och är 27 år", Lab1.hello());
    }

    @Test
    public void checkSortedNumbers() {
        int[] sorted = {2, 4, 5, 8};
        Lab2 lab2 = new Lab2();
        Assertions.assertArrayEquals(sorted, Lab2.sortListNumbers());
    }

    @Test
    public void testTreeIntegrity() {
        double windMps = 20;
        Assertions.assertTrue(Lab3.willTreeFall(windMps));
    }
}

