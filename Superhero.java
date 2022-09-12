package Quiz4y5;
import java.util.ArrayList;

public class Superhero implements SuperheroInterface{
	private String name;
	private String specie;
	private ArrayList<String> skills;
	private ArrayList<String> characteristics;
	
	Superhero(){
		name = "";
		specie = "";
		skills =  new ArrayList<String>();
		characteristics = new ArrayList<String>() ;
	}
	public void defend() {
		System.out.println("DEFENSA");
	}
	
	public void attack() {
		System.out.println("ATACANDO A VILLANO");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public ArrayList<String> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(ArrayList<String> characteristics) {
		this.characteristics = characteristics;
	}
	

	
}
