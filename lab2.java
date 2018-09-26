import java.util.*;

public class lab2 {
    public static void main(String args[] ) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int avg= (num1+num2+num3)/3;

        int OneDiff = Math.abs(num1 - avg);
        int TwoDiff = Math.abs(num2 - avg);
        int ThreeDiff = Math.abs(num3 - avg);

        if (OneDiff > TwoDiff && OneDiff > ThreeDiff) {
            System.out.println(num1);
        }
        else if (TwoDiff > OneDiff && TwoDiff > ThreeDiff) {
            System.out.println(num2);
        }
        else if (ThreeDiff > TwoDiff && ThreeDiff > OneDiff) {
            System.out.println(num3);
        }
        else {
            System.out.println("NA");
        }
    }
}