
public class Example2 {

	public static void main(String[] args) {
		// interview question
		int arr[] = {56,98,76,78,12};
		System.out.println("The Element of array are :");
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		int max = arr[0];
		for (int i = 1 ; i< arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		int max2 = arr[0];
		for (int i = 1 ; i< arr.length;i++) {
			if (max2 < arr[i] && arr[i] != max) {
				max2 = arr[i];
			} 
		}
		System.out.println(max2);
		int max3 = arr[0];
		for (int i = 1 ; i< arr.length;i++) {
			if (max3 < arr[i] && arr[i] != max && arr[i]!= max2) {
				max3 = arr[i];
			}
		}
		System.out.println(max3);
	}

}
