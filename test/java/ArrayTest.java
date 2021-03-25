import lesson6.Array;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    public static Array array;

    @BeforeAll
    public static void init(){
        array = new Array();
    }

    @Test
    public void getBeforeQuadrupleTest(){
        assertThrows(IllegalArgumentException.class, () -> array.getBeforeQuadruple(new int [] {}));
        assertEquals(Arrays.toString(new int[] {1}), Arrays.toString(array.getBeforeQuadruple(new int [] {1, 2, 3, 4, 1})));
        assertNull(array.getBeforeQuadruple(new int [] {3, 4, 14, 1, 4}));
        assertThrows(RuntimeException.class, () -> array.getBeforeQuadruple(new int [] {11, 2, 3, 44, 2, 3, 14, 44, 5}));
    }

    @Test
    public void checkArrayForElementsTest(){
        assertFalse(array.checkArrayForElements(new int [] {}));
        assertTrue(array.checkArrayForElements(new int [] {1, 2, 3, 4, 1}));
        assertTrue(array.checkArrayForElements(new int [] {3, 4, 14, 1, 4}));
        assertTrue(array.checkArrayForElements(new int [] {11, 2, 3, 44, 2, 3, 14, 44, 5}));
    }
}
