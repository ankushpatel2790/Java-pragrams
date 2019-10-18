package corejavaprogram;

import java.util.Arrays;

/**
 * Write a Java program to remove duplicate elements from an array.
 * 
 * @author Ankush.Patel 
 * Example :- Original Array : 10 22 10 20 11 22 
 * Array with unique values : 10 22 11 20
 * Original Array : 0, 22, 10,10, 20 ,11, 10,20,22,22,22,22,22,10,10,20,20
 * Array with unique values 10 22 20 11
 */
public class RemoveDuplicateElement {
public static void main(String[] args) {
	int data[]={10, 22, 10,10, 20 ,11, 10,20,22,22,22,22,22,10,10,20,20};
	int[] dd=removeDuplicateEle(data);
	for(int i:dd)
	System.out.println(i);
}

public static int[] removeDuplicateEle(int ...data){
   int length=data.length;
   
   for(int i=0;i<length;i++){
	   for(int j=i+1;j<length && length!=j;){
		   if(data[i]==data[j]){
			   
			   if(data[j]==data[length-1]){
			   length--;
			   continue;
			   }
			   else
			   {
				   data[j]=data[length-1];
				   length--;
			   }
			   
			   
		   }
		   j++;
		   	   }
   }
   int mydata[]=Arrays.copyOf(data, length);
	return mydata;
}
}