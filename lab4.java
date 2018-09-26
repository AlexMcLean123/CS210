import java.util.Scanner;

public class Solution {

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i = 0;
      while(true){
          if(isPrime(n-i)){System.out.println(n-i);break;} //will print smaller one first
          if(isPrime(n+i)){System.out.println(n+i);break;}
          i++;
      }
    }
}