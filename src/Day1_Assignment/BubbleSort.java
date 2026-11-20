package Day1_Assignment;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {42,17,35,8,36};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}
	/*public static void bubble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1]<arr[j])
					arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
			}
		}
	}*/
	
	
	//Optimized Method
	public static void bubble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
					swap=true;
				}
				
			}
			if(swap==false)
				break;
		}
	}

}
