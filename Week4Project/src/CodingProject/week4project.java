package CodingProject;

import java.io.PrintStream;

public class week4project {

	public static void main(String[] args) {
		//1. a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		//1.b 
		int[] ages2 = {6, 8, 11, 14, 9, 1, 22, 10, 8};
		int result2 = ages2[ages2.length -1] - ages2[0];
		System.out.println(result2);
		
		//the same code: int result = ages[ages.length - 1] - ages[0] and 
		//int result2 = [ages2[ages.length - 1] - ages2[0] calculated two different
		//arrays with different index lengths and values, but executed the same task
		//without having to be altered (except for the name)
		
		//1.c
		int sum = 0;
		//enhanced for lool code below reads : for each int called age in our ages2 array
		for (int age : ages2) {
			sum += age;
		}
		//I used a float and turned sum which was an int to a double
		double average =(double) sum / ages2.length;
		System.out.println(average);
		
	
		//2.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//2.a  Using for loop to calculate the average number of letters
			int letters = 0;
		//enhanced for loop read for every string called name in the names string
			for (String name : names) {
				letters += name.length();
			}
			double averageLetters = (double) letters / names.length;
			System.out.println(averageLetters);
		
		//2.b  Loop to concat
		StringBuilder concatNames = new StringBuilder();
		for (String name : names) {
			concatNames.append(name).append(" ");
		}
		System.out.println(concatNames.toString());
		
		//3. Using ".length - 1" is one way to access the last element of an array.
		// You can also use the index of the length if the size of the array is known.
		
		//4. Access to the first element of an array can be done by using the index value [0]
		
		//5. Create a new array of int 
		int[] nameLengths = new int[names.length];
		// Loop to iterate over array and add the length of each name to the array
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//6. 
		int sum2 = 0;
		for (int length : nameLengths) {
			sum2 += length;
		}
		System.out.println(sum2);
	
		//7. call to method
		int n = 4;
		String word = "hello";
		String result3 = concatWord(word, n);
		System.out.println(result3);
	
		//8. call to method
		String firstName = "Uncle";
		String lastName = "Ben";
		String fullName = getFullName(firstName, lastName);
		System.out.println(fullName);
	
		//9. calling to the methods
		int[] testArray = {15, 56, 2, 3, 40};
		boolean results = isSumGreaterThan100(testArray);
		System.out.println(results);
		
		//10. calling to method
		double[] elements = {1.3, 2.1, 3.0, 4.2};
		double averages = average2(elements);
		System.out.println(averages);
		
		//11. calling to method
		double[] array1 = {2.0, 5.7, 7.0};
		double [] array2 = {7.9, 1.1, 1.3};
		boolean answer = isFirstGreater(array1, array2);
		System.out.println(answer);
		
		//12. call to method
		boolean isHotOutside = true;
		double moneyInPocket = 12.75;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(buyDrink);
		
		//13. call to method
		double initialBalance = 600.00;
		double[] deposits = {1200.00, 450.00};
		double[] withdrawals = {1384.21, 300.00, 120.00};
		double finalBalance = accountBalance(initialBalance, deposits, withdrawals);
		System.out.println(finalBalance);
		
		
	}
	
	
	
	//7.concatenation method to achieve the task also used StringBuilder to easily append the new words to it
	public static String concatWord(String word, int n) {
			StringBuilder conWord = new StringBuilder();
			for (int i = 0; i < n; i ++) {
				conWord.append(word);
			}
			return conWord.toString();
	}
	
		//8. taking the first name and last name to get the full name **couldn't get it print out to the console. kept getting an error.
	public static String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
}
		//9. 
	public static boolean isSumGreaterThan100(int[] array) {
		int sum4 = 0;
		for (int num4 : array) {
			sum4 += num4;
			}
		return sum4 > 100;
		}
		
		//10. 
	
	public static double average2(double[] elements) {
		double sum5 = 0;
		for (double num5 : elements) {
			sum5 += num5;
			}			
		return sum5 / elements.length; 
		}
		
		
		//11.
	public static boolean isFirstGreater(double[] array1, double[] array2) {
		double average1 = findTheAverage(array1);
		double average2 = findTheAverage(array2);
		return average1 > average2;
	}
	public static double findTheAverage(double[] array) {
		double sum6 = 0;
		for (double num6 : array) {
			sum6 += num6;
		}
		return sum6 / array.length;
	}
	
		//12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
		//13. Custom banking method lol
	public static double accountBalance(double initialBalance, double[] deposits, double[] withdrawals) {
		double totalDeposits = 0;
		for (double deposit : deposits) {
			totalDeposits += deposit;
		}
		//subtracting withdrawls
		double totalWithdrawals = 0;
		for (double withdrawal : withdrawals) {
			totalWithdrawals += withdrawal;
		}
		//this one will find the total balance taking into account everything
		double finalBalance = initialBalance + totalDeposits - totalWithdrawals;
		return finalBalance;
	}	

	
}
	
		
		
		
	
