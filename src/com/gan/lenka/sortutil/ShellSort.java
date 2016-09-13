package com.gan.lenka.sortutil;

/**
 * 希尔排序：把记录按步长 gap 分组，对每组记录采用直接插入排序方法进行排序。 随着步长逐渐减小，所分成的组包含的记录越来越多，当步长的值减小到 1
 * 时，整 个数据合成为一组，构成一组有序记录，则完成排序。
 * 
 * 注意：希尔排序是不稳定的排序
 * 
 * @author ganwenjun
 *
 */
public class ShellSort {

	public static void sort(int[] array) {

		if (array == null || array.length <= 1) {
			return;
		}

		int gap = array.length / 2;

		while (1 <= gap) {

			System.out.println("gap-->" + gap);

			// 把距离为 gap 的元素编为一个组，扫描所有组
			for (int i = gap; i < array.length; i++) {
				int j = 0;
				int temp = array[i];
				
				// 对距离为 gap 的元素组进行排序
				for (j = i - gap; j >= 0 && temp < array[j]; j = j - gap) {

					array[j + gap] = array[j];

				}
				array[j + gap] = temp;
			}

			for (int a : array) {
				System.out.print(a + ",");
			}
			System.out.println("");
			gap = gap / 2; // 减小增量

		}
	}

}
