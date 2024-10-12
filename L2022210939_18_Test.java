import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName: L2022210939_18_Test
 * <p>
 * Package: PACKAGE_NAME
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/9/29-14:28
 * @Version: v1.0
 */
class L2022210939_18_Test {

    /**
     * 等价类划分：
     * 有效输入：包含正整数、负整数和零的数组。
     * 输入数组包含零的情况，确保返回的结果正确处理了零的影响
     *
     * 边界值分析： 边界情况：数组为null以及数组长度为 0、1、2 和大于 2 的情况。
     * 输入数组的长度为 1 时，期望返回一个包含 1 的数组
     * 输入数组的长度为 2 时，期望返回一个包含两个元素的数组，分别为另一个元素的值
     */

    private final Solution18 solution = new Solution18();

    /**
     * 测试目的：测试有效输入，包括正整数。
     * 用到的测试用例：
     * 输入: [1, 2, 3, 4]
     * 输出: [24, 12, 8, 6]
     */
    @Test
    void testProductExceptSelf_ValidInput() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试有效输入，包括负整数。
     * 用到的测试用例：
     * 输入: [-1, -4, 2, -3, 3]
     * 输出: [72, 18, -36, 24, -24]
     */
    @Test
    void testProductExceptSelf_Negative() {
        int[] nums = {-1, -4, 2, -3, 3};
        int[] expected = {72, 18, -36, 24, -24};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试有效输入，包括零。
     * 用到的测试用例：
     * 输入: [2, 1, 0, 5, 3]
     * 输出: [0, 0, -30, 0, 0]
     */
    @Test
    void testProductExceptSelf_Zero() {
        int[] nums = {2, 1, 0, -5, 3};
        int[] expected = {0, 0, -30, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试边界情况，数组为null。
     * 用到的测试用例：
     * 输入: null
     * 输出: null
     */
    @Test
    void testProductExceptSelf_Null() {
        assertArrayEquals(null, solution.productExceptSelf(null));
    }

    /**
     * 测试目的：测试边界情况，数组长度为 0。
     * 用到的测试用例：
     * 输入: []
     * 输出: []
     */
    @Test
    void testProductExceptSelf_ZeroElements() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试边界情况，数组长度为 1。
     * 用到的测试用例：
     * 输入: [5]
     * 输出: [1]
     */
    @Test
    void testProductExceptSelf_SingleElement() {
        int[] nums = {5};
        int[] expected = {1};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试边界情况，数组长度为 2。
     * 用到的测试用例：
     * 输入: [2, 3]
     * 输出: [3, 2]
     */
    @Test
    void testProductExceptSelf_TwoElements() {
        int[] nums = {2, 3};
        int[] expected = {3, 2};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试边界情况，数组包含多个零。
     * 用到的测试用例：
     * 输入: [0, 0, 0]
     * 输出: [0, 0, 0]
     */
    @Test
    void testProductExceptSelf_MultipleZeros() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    /**
     * 测试目的：测试边界情况，数组包含一个零。
     * 用到的测试用例：
     * 输入: [1, 0, 3, 4]
     * 输出: [0, 12, 0, 0]
     */
    @Test
    void testProductExceptSelf_OneZero() {
        int[] nums = {1, 0, 3, 4};
        int[] expected = {0, 12, 0, 0};
        assertArrayEquals(expected, solution.productExceptSelf(nums));
    }
}