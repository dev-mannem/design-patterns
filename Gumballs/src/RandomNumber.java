import java.util.Random;


public class RandomNumber {
	public static void main(String[]args)
	{
		Random r=new Random();
		int ri=r.nextInt(10);
		System.out.println("random number"+ri);
	}

}
