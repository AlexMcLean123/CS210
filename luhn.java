import java.util.Scanner;
public class luhn {
public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	System.out.println(calculate(s));
}

public static String calculate(String card){
	if(card == null)
		return null;
	//making into array
	String digit;
	int [] digits = new int[card.length()];
	for(int i =0; i<card.length(); i++){
		digits[i]=Character.getNumericValue(card.charAt(i));
	}

	for(int i =digits.length-1; i>=0; i-=2){
		digits[i]=digits[i]*2;
		if(digits[i]>=10){
			digits[i]=digits[i]-9;
		}
	}
	int sum=0;
	for(int i =0; i<digits.length; i++){
		sum+= digits[i];
	}
	sum=sum*9;
	digit = sum+"";
	return digit.substring(digit.length()-1);

}
}
