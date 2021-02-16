package com;
import java.util.*;
public class SecondSmallest{
	public static void main(String[] args) {
		int[] ar = {4,3,5,1,2};
		System.out.println(getSecondSmallest(ar));
	}

	static int getSecondSmallest(int[] ar) {
		Arrays.sort(ar);
		return ar[1];
	}
}
