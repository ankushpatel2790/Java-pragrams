package corejavaprogram;
/**
 * Maximum consecutive one's (or zeros) in a binary array
 * @author Ankush.Patel
 *
 */
public class MaxConsecutive {
public static void main(String[] args) {
	int arr[]={1,0,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0};
	int value=1;
	System.out.println("Max Count is :"+findMaxCount(value,arr));
}


/**
 * 
 * @param value should be 1 or 0.
 * @param data array should contain only binary data.
 * example {1,0,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0}.
 * @return
 */
public static int findMaxCount(int value,int ...data){
	int max=0,count=0;
	for(int i=0;i<data.length;i++){
		if(data[i]==value){
			count++;
			continue;
		}
		if(max<count){
			max=count;
		}
		count=0;
	}
	if(max<count){
		max=count;
	}
	return max;
}
}
