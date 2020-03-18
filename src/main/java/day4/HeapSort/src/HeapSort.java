import java.util.*;
public class HeapSort {

	/**
	 * @param args
	 */
	
	public static int[] heapify(int[] arr, int index, int size) {
		int largest = index;
		int temp;
		int left = 2 * (index)+ 1;
		int right = left + 1;
		if(left < size) {
			if(right < size) {
				if(arr[left] > arr[right]) {
					temp = left;
				}
				else {
					temp = right;
				}
				if(arr[temp] > arr[index]) {
					largest = temp;
				}
			}
			else {
				if(arr[left] > arr[index]) {
					largest = left;
				}
			}
		}
		if(largest != index) {
			temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			arr = heapify(arr,largest, size);
			
		}
		return arr;
	}
	
	
	public static int[] heapSort(int[] arr) {
		for(int i = arr.length / 2 +  1; i >= 0; i --) {
			arr = heapify(arr,i,arr.length);
		}
		for(int i= 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
		for(int i = arr.length - 1; i >= 0; i --) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			arr = HeapSort.heapify(arr,0,i);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int len = ip.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < len; i ++) {
			System.out.println("Enter the element");
			arr[i] = ip.nextInt();
		}
		arr = HeapSort.heapSort(arr);
		for(int i= 0; i < len; i ++) {
			System.out.println(arr[i]);
		}
	}

}
