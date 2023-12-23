package minimoMaximo;

import java.util.Arrays;

public class MinMax {
	public static int min(int[] list) {
		return Arrays.stream(list).min().getAsInt();
	}

	public static int max(int[] list) {
		return Arrays.stream(list).max().getAsInt();
	}
	
	public static void main(String[] args) {
		int[] x = {-52, 56, 30, 29, -54, 0, -110};
		System.out.println(min(x));
		System.out.println(max(x));
	}
}
