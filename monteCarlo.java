import java.util.Scanner;
public class monteCarlo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		double tosses = sc.nextDouble();
		int prob = sc.nextInt();
		monteCarlo(tosses,prob);
	}


public static void monteCarlo(double tosses, int prob)
{
		int successes = 0;
		double simulations = 100000;

		for(int i = 0; i < simulations; i++)
		{
			int count = 0;
			for(int j = 0; j < tosses; j++)
			{
				if((Math.random()*100) <= prob)
					count++;
			}
			if(count > tosses/2)
				successes++;
		}
		int result = (int)(Math.round((successes/simulations)*100));

		System.out.println(result);
}

}