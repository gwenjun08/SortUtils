package com.gan.lenka.sortutil;


/**
 * 
 * @author ganwenjun
 * 
 * 快速排序：通过一趟排序将要排序的数据分割成独立的两部分：分割点左边都是比它小的数，右边都是比它大的数。
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *
 */
public class FastSort {

	public static void sort(int[] array) {
		
		fastSort(array, 0, array.length - 1);
	}
	
	/**
	 * 获得基数的中间位置，这个位置将要排列的数组分成两部分，
	 * 一个部分的数值都比基数小，一个部分比基数大。
	 * @param array 需要排列的数组
	 * @param low 数组的低位
	 * @param hight 数组的高位
	 * @return 中间位置
	 */
	private static int getMiddle(int[] array, int low, int hight) {
		int middle = hight;
		
		
		while(low < hight) {
			while(low < hight && array[low] <= array[middle]) {
				low++;
			}
			
			if(low < hight) {
				int temp = array[middle];
				array[middle] = array[low];
				array[low] = temp;
				middle = low;
			}
			
			while(low < hight && array[hight] >= array[middle]) {
				hight--;
			}
			
			if(low < hight) {
				int temp = array[middle];
				array[middle] = array[hight];
				array[hight] = temp;
				middle = hight;
			}
		}
		
		return middle;
	}
	
	/**
	 * 通过递归的方法，将要排列的数组分成各个的小部分，知道排序结束
	 * @param array
	 * @param low
	 * @param hight
	 */
	private static void fastSort(int[] array, int low, int hight) {
		
		if(low < hight) {
			int middle = getMiddle(array, 0, hight);
			
			fastSort(array, 0, middle - 1);
			fastSort(array, middle, hight);
		}
	}
	
}
