package corejavaprogram;

/**
 * 
 * @author Ankush.Patel
 * 
 * Given an array A[] and a number x, check for pair in A[] with sum as x.
 * Example :
	Let Array be {1, 4, 45, 6, 10, -8} and sum to find be 16

	Sort the array
	A = {-8, 1, 4, 6, 10, 45}
 */
public class TargetNumberIndex {
public static void main(String[] args) {
	int []a={3,1,4,13,5,7,10};
	int target=13;
	System.out.println(findPosition(target, a));
System.out.println(findPositionOfTarget(target,a));

}

/**
 *  Find sum of two number which is equivalent to target number.
 * Time Complexity O(n2)
 * @param target
 * @param data
 * @return
 */
public static  String  findPosition(int target,int ...data){

	for(int i=0;i<data.length;i++){
		for(int j=0;j<data.length;j++){
			if(data[i]+data[j]==target){
				return i+"  "+j;
			}
		}
	}
	return "0";
	
}

/**
 *  Find sum of two number which is equivelent to target number.
 *  complexity O(n).
 * @param target
 * @param data
 * @return
 */
public static String findPositionOfTarget(int target,int ...data){

	int first=0,last=data.length-1;
	while(first<last){
		if(data[first]>=target){
			 first++;
			 continue;
		}else if(data[last]>=target){
			last--;
		continue;
		}
		if(data[first]+data[last]==target){
			return first+" "+last;
		}
		
		else{
			first++;
		}
		if(first+1==last){
			first=0;
			last--;
	}
	}
	return "Na";
}


}
