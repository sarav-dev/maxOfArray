import java.util.*;

public class maxOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
		int N = sc.nextInt();
		int arr[];
		arr = new int[N];
		int max = arr[0];
        System.out.println("Enter array values: ");
        
		for(int i=0; i<N ; i++){
            // updating the value present in arr[i];
			arr[i] = sc.nextInt();
		}		
        
		for (int i=0; i<N; i++) {
            if ( arr[i] > max) {
                max = arr[i];
			}
		}
        System.out.println("Max value is: ");
        System.out.println(max);
        sc.close();
	}
}