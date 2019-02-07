
public class MyUtils {

	public static void displayEvenNos() throws InterruptedException {

		int count = 0;

		while (true) {
			count += 2;
			System.out.println(count + "#" + Thread.currentThread().getName());

			Thread.sleep(800);
		}

	}

	public static void displayOddNos() throws InterruptedException {

		int count = 1;

		while (true) {
			count += 2;
			System.out.println(count + "#" + Thread.currentThread().getName());

			Thread.sleep(500);
		}

	}

}
