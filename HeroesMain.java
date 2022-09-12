package Quiz4y5;
import java.util.ArrayList;

public class HeroesMain {
	public static void main(String[] args) {
		Batman batman = new Batman();
		System.out.println("Mi nombre es " + batman.getName());
		System.out.println("Soy " + batman.getSpecie());	
		System.out.println("Mi arma es " + batman.getWeapon());	
		ArrayList<String> batmanSkill = new ArrayList<String>();
		batmanSkill = batman.getBatmanSkills();
		for(String skill : batmanSkill) {
			System.out.println("Soy " + skill);
		}
		batman.attack();
		
		System.out.println("----------------" );
		
		MoonKnight moonknight = new MoonKnight();
		System.out.println("Mi nombre es " + moonknight.getName());
		System.out.println("Soy " + moonknight.getSpecie());	
		moonknight.attack();
		moonknight.defend();

	}

}
