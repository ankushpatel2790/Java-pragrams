package corejavaprogram;
/**
 * This class reverse any given string with two character.
 * Example: 
 * input aabbccddee
 * output eeddccbbaa
 * @author Ankush.Patel
 *
 */
public class ReverseTwoCharacter {
	public static void main(String[] args) {
		String s = "aabbccddee";
		System.out.println(s);
		System.out.println(reverse(s));
		
	}
	
	public static String reverse(String s){
		String temp="";
		int length=s.length();
		int i=length;
		String[] arr=s.split("");
		while(i>0){
			i=i-1;
			temp+=arr[i];
			if(i>0)
				temp+=arr[i-1];
			i=length-temp.length();
		}
		
		
		return temp;
	}

}
