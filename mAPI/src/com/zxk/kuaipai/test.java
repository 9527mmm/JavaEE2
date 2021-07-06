package com.zxk.kuaipai;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 20:22
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test {
    public static void main(String[] args) {
        int[] arr = {431, 54, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7};

        int abb[]=quiteSort(arr, 0, arr.length - 1);

       for (int i = 0; i < abb.length; i++) {
            System.out.println(abb[i]);
        }
    }

    private static int[] quiteSort(int[] arr, int left, int right) {
        int left0 = left;
        int right0 = right;
        int base = arr[left0];
        while (left != right) {

            while (arr[right] >= base && left < right) {
                right--;
            }
            while (arr[left] <= base && left < right) {
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp=arr[left];
        arr[left]=arr[left0];
        arr[left0]=temp;
        return arr;

    }


}
