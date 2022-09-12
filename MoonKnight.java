package Quiz4y5;


import java.util.ArrayList;

	public class MoonKnight extends Superhero {
		private LunarPower power = new LunarPower();
		private ArrayList<String> MoonKnightSkills;
		
		public ArrayList<String> getMoonKnightSkills() {
			return MoonKnightSkills;
		}


		public ArrayList<String> getMoonKnightCharacteristics() {
			return MoonKnightCharacteristics;
		}


		public String getPower() {
			return power.getPower();
		}

		private ArrayList<String> MoonKnightCharacteristics;
		
		MoonKnight() {
			super();
			MoonKnightSkills = new ArrayList<String>();
			MoonKnightSkills.add("inteligente");
			MoonKnightCharacteristics = new ArrayList<String>();
			MoonKnightCharacteristics.add("multiples personalidades");
			this.setName("MoonKnight");
			this.setSpecie("humano");
			this.setCharacteristics(MoonKnightSkills);
			power.setPower("Call Marc");
			power.putSuitOn();		
	}

}
