package com.gan.lenka.sortutil;

import org.junit.Test;

public class SortTest {
	
	@Test
	public void testFastSort() {
		int[] array = new int[]{32, 11, 4, 0, 65, 11, 78, 90, 3, 4};
		FastSort.sort(array);
		printSortResult(array);
	}
	
	@Test
	public void testInsertionSort() {
		int[] array = new int[]{32, 11, 4, 0, 65, 11, 78, 90, 3, 4};
		InsertionSort.sort(array);
		printSortResult(array);
	}
	
	@Test
	public void testShellSort() {
		int[] array = new int[]{32, 11, 4, 0, 65, 11, 78, 90, 3, 4};
		ShellSort.sort(array);
		printSortResult(array);
		
	}

	private void printSortResult(int[] array) {
		System.out.print("排序的结果-->");
		for(int i = 0; i < array.length; i++) {
			int a = array[i];
			
			if(i < array.length - 1) {
				System.out.print(a + ", ");
			} else if(i == array.length - 1){
				System.out.println(a + "\n");
			}
		}
	}

}
