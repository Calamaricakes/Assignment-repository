package textBookExercise;

public class caffeineDeath {
	final static double caffeineCola = 34.0/1000;
	final static double caffeineCoffee = 160.0/1000;
	final static double fatalCaffeine = 10;
	
	public static void main(String[] args){
		System.out.println(caffeineCoffee);
		System.out.println("Number of Cola: " + fatalCaffeine/caffeineCola + " Number of Coffees: " + fatalCaffeine/caffeineCoffee);
		System.out.print("$");
		System.out.printf("%.2f", caffeineCoffee);
	}
}
