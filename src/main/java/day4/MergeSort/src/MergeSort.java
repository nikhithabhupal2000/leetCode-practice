import java.util.*;

public class MergeSort {
	
	public static int[] merge(int[] a, int[] b) {
		int len = a.length + b.length;
		int[] arr = new int[len];
		int i = 0; int j = 0;
		int k = 0;
		while((i < a.length) &&(j < b.length)) {
			if(a[i] < b[j]) {
				arr[k ++] = a[i ++];
			}
			else {
				arr[k ++] = b[j ++];
			}
		}
		if(i < a.length) {
			arr[k ++] = a[i ++];
		}
		if(j < b.length) {
			arr[k ++] = b[j ++];
		}
		return arr;
	}
	
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		if(high == low) {
			return arr;
		}
	int mid = (high + low) / 2;
	int[] arr1 = Arrays.copyOfRange(arr, low, mid + 1);
	int[] arr2 = Arrays.copyOfRange(arr, mid + 1, high + 1);
	System.out.println("array1");
	for(int i = 0; i < arr1.length; i ++) {
		System.out.print(arr1[i]);
		System.out.println("   ");
	}
	System.out.println("array2");
	for(int i = 0; i < arr2.length; i ++) {
		System.out.print(arr2[i]);
		System.out.println("   ");
	}
	System.out.println("");
	arr1 = MergeSort.mergeSort(arr1,0,arr1.length - 1);
	arr2 = MergeSort.mergeSort(arr2,0,arr2.length - 1);
	arr = MergeSort.merge(arr1, arr2);
	return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		int len = ip.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < len; i ++) {
			arr[i] = ip.nextInt();
		}
		arr = MergeSort.mergeSort(arr,0,len - 1);
		for(int i = 0; i < len; i ++) {
			System.out.println(arr[i]);
		}

	}

}
