package 剑指offer二刷.offer04;

/**
 * @author ATSELI
 * @version 1.0
 * @date 2021/10/19 13:25
 * 一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 示例:
 * 现有矩阵 matrix 如下：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        int[][] test = {{1,2,3},{2,3,4}};
        System.out.println(test.length);
        System.out.println(test[1][2]);
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }
        int row = matrix.length;
        int vertical = matrix[0].length;
        int i = row - 1, j = 0;
        while (i >= 0 && j < vertical){
            if (target > matrix[i][j]){
                ++j;
            }else if (target < matrix[i][j]){
                --i;
            }else {
                return true;
            }
        }
        return false;
    }
}
