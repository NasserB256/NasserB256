package motivation;
import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String color;
		String cub;
		int score = 0;
		
		System.out.println("Hello Baby, What's your name ?");
		name = sc.nextLine();
		
		System.out.println("How old are you ?");
		age = sc.nextInt();
		
		if(age >=18) {
			
			System.out.println("Sorry " + name + ", you are not eligible to chat with me.....you are old");
		}else {
			System.out.println("Ouky, ...lets proceed.....!");
			
			System.out.println("What is the young one of a lion ?");
			cub = sc.nextLine();
			
			System.out.println("Whats your favorite color ?");
			color = sc.nextLine();
			
			if(color.equals("orange")) {
				System.out.println("You gat that right !!");
				score++;
				
			}else {
				System.out.println("You fail");
			}
			
			if(cub.equals("cub")) {
				System.out.println("You gat that right !!");
				score++;
			}else {
				System.out.println("You fail");
			}
			
			System.out.println("Hello " + name + ", you have passed with a score of " + score + "/2" );
		}
			
	}

}
