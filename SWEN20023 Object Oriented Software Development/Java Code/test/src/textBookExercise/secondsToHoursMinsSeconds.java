package textBookExercise;
import java.util.Scanner;

public class secondsToHoursMinsSeconds {
	public static void main(String[] args){
		int secondsInput, hours, mins, seconds;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter number of seconds: ");
		secondsInput = reader.nextInt();
		reader.close();
		
		hours = secondsInput / 3600;
		if (secondsInput >= 3600){
			secondsInput -= (3600 * hours);
		}
		
		mins = secondsInput / 60;
		
		if (secondsInput >= 60){
			secondsInput -= (mins * 60);
		}
		
		seconds =  secondsInput;
		System.out.println("Hours: " + hours + " Minutes: " + mins + " Seconds: " + seconds);
	}
}
