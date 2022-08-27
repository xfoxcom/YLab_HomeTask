import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFirstWeek {
    @Test
    void testBubbleSort() {
        int[] array = new int[]{8,7,1,0,6,3};
        int[] array2 = new int[]{1,1,0,0,0,8,50,80};
        assertArrayEquals(new int[]{0,1,3,6,7,8}, Main.bubbleSort(array), "without duplicates");
        assertArrayEquals(new int[]{0,0,0,1,1,8,50,80}, Main.bubbleSort(array2), "with duplicates");
    }
    @Test
    void testFindMaxMin() {
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        assertEquals(9, Main.findMax(array), "Wrong max number");
        assertEquals(1, Main.findMin(array), "Wrong min number");
    }
}
