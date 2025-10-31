import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random() * 100);
		System.out.println((int)(Math.random() * 100));
		System.out.println((int)((Math.random() * 45) + 1));

		Random rand = new Random();
		int tmpInt = rand.nextInt(45) + 1;
		System.out.println(tmpInt);
	}

}
