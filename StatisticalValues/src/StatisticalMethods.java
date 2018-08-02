/*
 * A multi-threaded program to implement statistical methods like 
 * average value, maximum value and minimum value of a given 
 * list of numbers.
 */
import java.util.Scanner;

public class StatisticalMethods implements Runnable{

	static Integer[] inputValues; 
	public static int averageVal;
	public static int maxValue;
	public static int minValue;
	public static int n;
	Thread t1,t2,t3;

	public void run() {
		/*
		 * run() method which is invoked when thread.start() is 
		 * called in the main()
		 */
		AverageValue avgVal = new AverageValue();
		t1 = new Thread(avgVal);
		t1.start();
		MaximunValue maxVal = new MaximunValue();
		t2 = new Thread(maxVal);
		t2.start();
		MinimumValue minVal = new MinimumValue();
		t3 = new Thread(minVal);
		t3.start();
	}

	public static void main(String[] args) throws InterruptedException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of list:");
		n = input.nextInt();
		inputValues = new Integer[n];
		System.out.println("Enter list of number:");
		for(int i = 0; i < n; i++){			
			inputValues[i] = input.nextInt();
		}
		StatisticalMethods statisticalMethods = new StatisticalMethods();
		Thread thread = new Thread(statisticalMethods);
		thread.start();
		thread.join();	
		System.out.println("AverageValue = "+averageVal);
		System.out.println("MaximumValue = "+maxValue);
		System.out.println("MinimumValue = "+minValue);

	}

	private class AverageValue implements Runnable{
		/*
		 * inner class thread that calculates the average value of given list of numbers 
		 */
		StatisticalMethods statisticalMethods = new StatisticalMethods();
		public int sum;

		public void run() {
			for(int i = 0; i < n; i++){
				sum += inputValues[i];
			}
			averageVal = sum/n;
		}

	}

	private class MinimumValue implements Runnable {
		/*
		 * inner class thread that gives the minimum value of given list of numbers
		 */
		StatisticalMethods statisticalMethods = new StatisticalMethods();
		public int min;

		public void run() {
			min = inputValues[0];
			for(int i = 0; i < n; i++){
				if(inputValues[i] < min){
					min = inputValues[i];
				}
			}
			minValue = min;
		}

	}

	private class MaximunValue implements Runnable {
		/*
		 * inner class thread that gives the maximum value of given list of numbers
		 */
		StatisticalMethods statisticalMethods = new StatisticalMethods();
		public int max;

		public void run() {
			max = inputValues[0];
			for(int i = 0; i < n; i++){
				if(inputValues[i] > max){
					max = inputValues[i];
				}
			}
			maxValue = max;
		}

	}

}
