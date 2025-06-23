package leetcode.easy.lc9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionLC9Test {

    @Test
    void isPalindromeTest1() {
        SolutionLC9 solution = new SolutionLC9();
        boolean result = solution.isPalindrome(121);

        Assertions.assertTrue(result);
    }

    @Test
    void isPalindromeTest2() {
        SolutionLC9 solution = new SolutionLC9();
        boolean result = solution.isPalindrome(-121);

        Assertions.assertFalse(result);
    }

    @Test
    void isPalindromeTest3() {
        SolutionLC9 solution = new SolutionLC9();
        boolean result = solution.isPalindrome(10);

        Assertions.assertFalse(result);
    }

}
