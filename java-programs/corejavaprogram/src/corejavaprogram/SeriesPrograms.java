
package corejavaprogram;
/**
 * @author Ankush.Patel
 * 
 * This class print series of given number. 
 * number =5 
 * Output 
 * 	1
	3 2 
	4 5 6 
	10 9 8 7 
	11 12 13 14 15 
 *
 */
public class SeriesPrograms {
	private static int n = 1;

	public static void main(String[] args) {
		int no = 5;

		System.out.println(1);
		for (int i = 2; i <= no; i++) {
			if (i % 2 == 0)
				AddEven(i);
			else {
				AddOdd(i);
			}
			System.out.println();
		}
	}

	public static void AddOdd(int num) {
		for (int i = n; i <= num + n-1; i++) {
			System.out.print(i + 1+" ");
		}
		n=num + n;
	}

	public static void AddEven(int num) {
		int temp=n;
		n = n+num;
		for (int i = n; i >temp ; i--) {
			System.out.print(i+" ");
		}
	}
	
}
