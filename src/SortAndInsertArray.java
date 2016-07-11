import java.util.Arrays;
import java.util.Scanner;

public class SortAndInsertArray {
	public static void main(String[] args) {
		int cnt, j, num;
		System.out.println("Please enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();
		int myArr[] = new int[cnt];
		int newArr[] = new int[cnt+1];
		System.out.println("Please enter the values for the array: ");
		for (int i=0; i<cnt; i++){
			j = i+1;
			System.out.println("Value " + j + ": ");
			myArr[i] = sc.nextInt();
		}//for ends
		System.out.println();
		System.out.println("The array is: ");
		for (int i = 0; i<cnt; i++) {
			System.out.println(myArr[i]);
		}
		System.out.println();
		System.out.println("Please enter the number to be inserted: ");
		num = sc.nextInt();
		
		newArr[cnt] = num;
		System.arraycopy(myArr, 0, newArr, 0, cnt);
		
		System.out.println();
		System.out.println("Array after the addition of new element is:");
		//new array
		for (int i=0; i<=cnt; i++){
			j = i+1;
			System.out.println("Value " + j + ": " + newArr[i]);
		}//for ends
		
		//sorted array
		Arrays.sort(newArr);
		System.out.println();
		System.out.println("Sorted Array:");
		for (int i=0; i<=cnt; i++){
			j = i+1;
			System.out.println("Value " + j + ": " + newArr[i]);
		}//for ends
	}

}
