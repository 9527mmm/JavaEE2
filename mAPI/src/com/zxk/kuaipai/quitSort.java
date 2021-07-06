package com.zxk.kuaipai;

import java.util.Arrays;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 20:22
 * @Description: TODO
 * @GitHup: 957kk
 */
public class quitSort {
    public static void main(String[] args) {
        int[] arr = {47, 431, 54, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7};

        //left为起始下标，right为最后下标
        quiteSort(arr, 0, arr.length - 1);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 快排算法
     * @Date: 21:25 2021/6/24 0024
     * @Param: int[] arr, int left, int right
     * @return:
     */
    private static void quiteSort(int[] arr, int left, int right) {
        if (right < left) {
            return;
        }
        /**
         * 所记录的起始下标
         */
        int left0 = left;
        /**
         * 所记录的最后下标
         */

        int right0 = right;
        /**
         * base，基值
         */
        int base = arr[left0];

        /**
         * 快排逻辑代码
         */
        while (left != right) {

            while (arr[right] >= base && left < right) {
                right--;
            }
            while (arr[left] <= base && left < right) {
                left++;
            }
            /**
             * 交换值
             */
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        /**
         * 基准数归位
         */
        int temp = arr[left];      /* {47, 431, 54, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7};*/
        arr[left] = arr[left0];
        arr[left0] = temp;
        /**
         *快排记录
         */
        quiteSort(arr, left0, left - 1);
        quiteSort(arr, left + 1, right0);
    }
}
