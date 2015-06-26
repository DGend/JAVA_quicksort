import java.util.Date;
import java.util.Random;


public class main {
		
	public static void main(String[] args){
		int MAX = 11;
		Random r = new Random();
		r.setSeed(new Date().getTime());
		int[] arr = new int[MAX];	// 정렬할 배열
		
		System.out.println("Original ArrayList");
		for(int i=0; i<10; i++){
			arr[i] = (int) r.nextInt(100);
			
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(", ");
			}
		}
						
		Quicksort quick = new Quicksort();
		quick.sort(arr, 0, arr.length-1);
		
		System.out.println("\nSorted ArrayList");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(", ");
			}
		}
	}
}
