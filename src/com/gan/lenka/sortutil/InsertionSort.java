package com.gan.lenka.sortutil;

/**
 * 插入排序：每一趟将一个待排序的记录，按照其关键字的大小插入到有序队列的合适位置里，只到全部插入完成。 
 * @author ganwenjun
 *
 */
public class InsertionSort {
	
	public static void sort(int[] array) {
		
		if(array == null || array.length <= 1) {
			return;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j > 0 ; j--) {
				if(array[j] > array[j - 1]) {
					break;
				} else {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		
	}

}
