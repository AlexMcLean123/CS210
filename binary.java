import java.util.Scanner;
public class binary{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
      	int [] data = new int [10];
      	for(int i =0; i<10; i++)
      	{
      	data[i]=10;
      	}
      	searcher(data,50);
    }
public static void searcher(int [] data, int num){
        boolean found = false;
        int low =0;
        int high = data.length-1;
        int middle = (low+high)/2;

        while(low<=high&&!found)
        {

            if(num>middle)
            {
                low = middle+1;
            }
            else if(num<middle)
            {
                high = middle-1;
            }
            else {
                System.out.println("The number is: " + num + "and was found in position" + middle);
                found = true;
            }
        }
    if(!found)
    {
        System.out.println(num + " was not found");
    }
    }
}
