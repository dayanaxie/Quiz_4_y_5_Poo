package Quiz4y5;
import java.util.ArrayList;


public class Batman extends Superhero{
	private Tool  weapon = new Tool();
	private ArrayList<String> batmanSkills;
	private ArrayList<String> batmanCharacteristics;
	Batman() {
		super();
		batmanSkills = new ArrayList<String>();
		batmanSkills.add("agil");
		batmanSkills.add("inteligente");
		batmanCharacteristics = new ArrayList<String>();
		batmanCharacteristics.add("alto");
		batmanCharacteristics.add("fuerte");
		this.setName("Batman");
		this.setSpecie("humano");
		this.setCharacteristics(batmanSkills);
		weapon.setWeaponName("Batarang");
		
		
	}
	public String getWeapon() {
		return weapon.getWeaponName();
	}

	public ArrayList<String> getBatmanSkills() {
		return batmanSkills;
	}
	public void setBatmanSkills(ArrayList<String> batmanSkills) {
		this.batmanSkills = batmanSkills;
	}
	public ArrayList<String> getBatmanCharacteristics() {
		return batmanCharacteristics;
	}
	public void setBatmanCharacteristics(ArrayList<String> batmanCharacteristics) {
		this.batmanCharacteristics = batmanCharacteristics;
	}
	

}
