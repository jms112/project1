package com.kh.exam7;

import java.util.Arrays;

public class ArrayData1 {

	public static void sample1() {
		/*
		 * 2�� �迭
		 *        �迭���� ��Ұ� �迭�� �����Ǿ� �ִ°��� ���Ѵ�.(ǥ, ���̺�� ���� ����)
		 * */
		int[][] arr = new int[3][4];
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i + j;
			}
			System.out.println(Arrays.toString(arr[i]));
			
		}
		System.out.println(arr);
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		System.out.println(arr[2]);
		
	}
	
	public static void sample2() {
		int[][] arr = new int[][] { {1,2,3}, {4,5,6}, {7,8,9}};
	}
	
	public static void sample3() {
		//2�� �迭 ����
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] arrCopy = new int[arr.length][];
		
		for(int i=0; i<arr.length; i++) {
			arrCopy[i] = arr[i].clone();
		}
		// Arrays.deepToString(�迭�̸�) -> 2�����迭 ��ü ���
	}
	
	public static void sample4() {
		// 2�� �迭 ���� �迭 ũ�⸦ �ø���
		int[][] arr = new int[][] { {1,2,3}, {4,5,6}, {7,8,9}};
		int[] arrCopy = new int[arr[1].length + 1];
		System.arraycopy(arr[1], 0, arrCopy, 0, arr[1].length);
		arr[1] = arrCopy;
		arr[1][arr[1].length - 1] = 66;
		System.out.print(Arrays.deepToString(arr));
	}
	
	public static void sample5() {
		// 2�� �迭�� ũ�⸦ �ø���
		int[][] arr = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] arrCopy = new int[arr[1].length + 1][];
		for(int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i].clone();
		}
		
		arr = arrCopy;
		arr[arr.length - 1] = new int[3];
		
		System.out.print(Arrays.deepToString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sample1();
		//sample4();
		sample5();
	}

}
