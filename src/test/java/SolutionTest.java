import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {
    @Test
    public void countBitsTest1() {
        int n = 2;
        int[] expected = {0, 1, 1};
        int[] actual = new Solution().countBits(n);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countBitsTest2() {
        int n = 5;
        int[] expected = {0, 1, 1, 2, 1, 2};
        int[] actual = new Solution().countBits(n);

        Assert.assertArrayEquals(expected, actual);
    }
}
