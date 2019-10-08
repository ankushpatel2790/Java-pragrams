package corejavaprogram;
/**
 * Move all zero's to front/back of give array.
 * @author Ankush.Patel
 *
 */
public class MoveAllZeros {
	public static void main(String[] args) {
		//move value should be Front or Back it's not case sensitive.
	String move="Front";
	int arr[]={0,1,0,3,0,4,0,9,5,5,0,0,0};
	System.out.println(arr.length);
	if("Back".equalsIgnoreCase(move))
	moveAllZeroToBack(arr);
	else
	moveAllZeroToFront(arr);
	for(int i:arr){
		System.out.print(i+" ");
	}
	}
	/**
	 * move zeros to back of array.
	 * @param arr
	 * @return
	 */
	public static int[] moveAllZeroToBack(int ...arr){
		int front=0;
		int rear=arr.length-1;
		while(front<rear){
			if(arr[rear]==0){
				rear--;
				continue;
			}
			if(arr[front]==0){
				swap(front,rear,arr);
				rear--;
			}
			front++;
		}
		return arr;
	}
	
	/**
	 * swap values in array.
	 * @param f
	 * @param r
	 * @param arr
	 */
	public static void swap (int f,int r,int ...arr){
		int temp=arr[r];
		arr[r]=arr[f];
		arr[f]=temp;
	}
	
	/**
	 * move zeros to front of array.
	 * @param arr
	 * @return
	 */
	public static int[] moveAllZeroToFront(int ...arr){
		int front=0;
		int rear=arr.length-1;
		while(front<rear){
			if(arr[front]==0){
				front++;
				continue;
			}
			if(arr[rear]==0){
				swap(rear,front,arr);
				front++;
			}
			rear--;
		}
		return arr;
	}
	
	
}
