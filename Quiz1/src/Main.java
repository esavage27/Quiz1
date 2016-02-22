import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//defining all variables
		double att, comp, yds, td, inter;
		double a, b, c, d, score;
		
		//asking user to input the information and storing it in variables created above
		System.out.println("Enter the number of passing attempts");
		att = input.nextDouble();
		
		System.out.println("Enter the number of completions");
		comp = input.nextDouble();
		
		System.out.println("Enter the number of passing yards");
		yds = input.nextDouble();
		
		System.out.println("Enter the number of touchdown passes");
		td = input.nextDouble();
		
		System.out.println("Enter the number of interceptions thrown");
		inter = input.nextDouble();
		
		//calculating the required numbers and the score
		a = ((comp/att)-.3)*5;
		b = ((yds/att)-3)*.25;
		c = ((td/att)*20);
		d = 2.375-((inter/att)*25);
		
		score = ((a+b+c+d)/6)*100;
		
		//rounding the score to 2 digits
		DecimalFormat df = new DecimalFormat("###.##");
		
		//printing the final rounded score in the console
		System.out.println("This quarterback's score is " + df.format(score));
		
		input.close();
	}

}
