package com.ma.jianzhiOffer.二维数组查找重复值;

/**
 * @author makangjin
 * @create 2019/12/11 - 16:37
 */
/*
*
* 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。

Consider the following matrix:
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

Given target = 5, return true.
Given target = 20, return false.
*
*
* */
public class LookInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                              {1,   4,  7, 11, 15},
                              {2,   5,  8, 12, 19},
                              {3,   6,  9, 16, 22},
                              {10, 13, 14, 17, 24},
                              {18, 21, 23, 26, 30}
                          };
        boolean b=LookInMatrix.find(77, matrix);
        System.out.println(""+b);
    }

    public static boolean find(int target,int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0;
        int c = cols -1;
        while (r < rows && c > -1){
            if (target == matrix[r][c]){
                return true;
            }
            else if (target < matrix[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}






/* 解题思路
        要求时间复杂度 O(M + N)，空间复杂度 O(1)。其中 M 为行数，N 为 列数。
        该二维数组中的一个数，小于它的数一定在其左边，大于它的数一定在其下边。因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间，当前元素的查找区间为左下角的所有元素。
*/