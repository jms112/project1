package com.kh.exam7;

import java.util.Arrays;
import java.util.Random;


public class PracArray1 {

	public static void ex1() {
		// 홀수배열 짝수배열 동적배열로 나누기
		int[] arr = {37, 92, 58, 46, 94, 29, 25, 58};
		int[] odd = new int[0];
		int[] even = new int[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				int[] evencopy = new int[even.length + 1];
				System.arraycopy(even, 0, evencopy, 0, even.length);
				even = evencopy;
				even[even.length - 1] = arr[i];
			}
			else {
				int[] oddcopy = new int[odd.length + 1];
				System.arraycopy(odd, 0, oddcopy, 0, odd.length);
				odd = oddcopy;
				odd[odd.length - 1] = arr[i];
			}
			
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
	}
	public static void ex2() {
		// 최대 최소값 배열만들기
		int[] arr = {37, 92, 58, 46, 94, 29, 25, 58};
		int[] minMax = new int[2];
		minMax[0] = arr[0];
		minMax[1] = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(minMax[0] > arr[i]) {
				minMax[0] = arr[i];
			}
			if(minMax[1] < arr[i]) {
				minMax[1] = arr[i];
			}
		}
		System.out.println(Arrays.toString(minMax));
	}
	public static void ex3() {
		// 중복빼고 배열 다시만들기
		int[] arr1 = {37, 92, 58, 46, 94, 29, 25, 58};
		int[] arr2 = new int[0];
		boolean isDuplicate = false;
		
		for(int i=0; i < arr1.length; i++){
			for(int j=0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				int[] arr2copy = new int[arr2.length + 1];
				System.arraycopy(arr2, 0, arr2copy, 0, arr2.length);
				arr2 = arr2copy;
				arr2[arr2.length - 1] = arr1[i];
				
				int[] arraycopy = new int[arr1.length +1];
				System.arraycopy(arr1, 0, arraycopy, 0, arr1.length);
				arr1 = arraycopy;
				arr1[arr1.length - 1] = arr1[i];
			}
			isDuplicate = false;
		}
		System.out.println(Arrays.toString(arr2));
	}
	public static void ex4() {
		int[] arr = {37, 92, 58, 46, 94, 29, 25, 58};
		int[][] arrEvenOdd = new int[2][8];
		int j =0;
		int k =0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				arrEvenOdd[0][j] = arr[i];	
				j++;
			}
			else {
				arrEvenOdd[1][k] = arr[i];	
				k++;
				}

	}
		}
		public static void ex5() {
			int[] arr = {37, 92, 58, 46, 94, 29, 25, 58};
			int[][] arrEvenOdd = new int[2][0];
			
			for(int i=0; i < arr.length; i++) {
				if(arr[i]%2 == 0) {
					int[] arrCopy1 = new int[arrEvenOdd[0].length + 1];
					System.arraycopy(arrEvenOdd[0], 0, arrCopy1, 0, arrEvenOdd[0].length);
					arrEvenOdd[0] = arrCopy1;
					arrEvenOdd[0][arrEvenOdd[0].length - 1] = arr[i];
				}
				else {
					int[] arrCopy2 = new int[arrEvenOdd[1].length + 1];
					System.arraycopy(arrEvenOdd[1], 0, arrCopy2, 0, arrEvenOdd[1].length);
					arrEvenOdd[1] = arrCopy2;
					arrEvenOdd[1][arrEvenOdd[1].length - 1] = arr[i];
				}
				
					}
	System.out.print(Arrays.deepToString(arrEvenOdd));
}
		public static void practice4() {
			// random 함수로 2차원배열 1~3행렬 값 삽입후 4행렬값 삽입 출력
			int[][] arr = new int[4][4];
			Random random = new Random();
			for(int i = 0; i<arr.length-1; i++) {
				for(int j=0; j<arr.length-1; j++)
				{
					arr[i][j] = random.nextInt(10)+1;
				}
			}
			for(int k = 0; k < arr.length; k++) {
				arr[3][k] = arr[0][k] + arr[1][k] + arr[2][k];
				arr[k][3] = arr[k][0] + arr[k][1] + arr[k][2];
			}
			for(int m=0; m<arr.length; m++) {
				for(int n=0; n<arr.length; n++) {
				System.out.print(arr[m][n] + "\t");
				}
				System.out.println();
			}
			//System.out.print(Arrays.deepToString(arr));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex1();
		//ex2();
		//ex3();
		practice4();
	}

}
