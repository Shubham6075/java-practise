package Placement_Course.Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] arr = {7, 8, 1, 3, 2};


		// is sorting me hum array ko 2 part me tod lete hain

		// 1st part h sorted array    // 2nd part hota h unsorted array

		// phir ek ek krke unsorted array k element ko sorted se compare krenge

		// aur jb tk iterate krenge jb tk array sort na ho jay


		//insertion sort
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > current) {
				//Keep swapping
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
