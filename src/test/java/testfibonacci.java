import org.example.Main;
import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {
    int[] solucion = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
    @Test
    void testFibo() {
        int[] correcion = Main.generateFibonacciSeries( 10);
        assertArrayEquals(solucion, correcion);
    }
}

