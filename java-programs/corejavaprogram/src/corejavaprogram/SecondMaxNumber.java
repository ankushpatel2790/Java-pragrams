package corejavaprogram;
/**
 * Find Second highest element from an array.
 * @author Ankush.Patel
 *
 */
public class SecondMaxNumber {
public static void main(String[] args) {
	int[] arr={10,25,19,18,6,7,31};
	System.out.println(findSecondMax(arr));
}


/**
 * this method find second highest element from array
 * @param data array should contain integer value.
 * E.p 10,25,19,18,6,7,31
 * @return
 */
public static int findSecondMax(int ...data){
	int min=0,max=0;
	if(data[0]>data[1]){
		max=data[0];
	}else
		max=data[1];
	for(int i=2;i<data.length;i++){
		if(data[i]>min && min<max){
			min=data[i];
		}
		if(data[i]>max){
			min=max;
			max=data[i];
		}
	}
	return min;
}
}
