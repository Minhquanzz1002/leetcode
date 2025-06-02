package leetcode.easy.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testTwoSum1() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = solution.twoSum(nums, 9);

        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwoSum2() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[]{3, 2, 4};
        int[] result = solution.twoSum(nums, 6);

        Assertions.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testTwoSum3() {
        TwoSum solution = new TwoSum();
        int[] nums = new int[]{3, 3};
        int[] result = solution.twoSum(nums, 6);

        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }
}
