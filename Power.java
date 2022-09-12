package Quiz4y5;

public class Power {
	private String power;
	private float damage;
	
	Power() {
		power = "";
		damage = 0.0f;
	}
	
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}

	public void putSuitOn() {
		System.out.println("NO TENGO TRAJE");
	}

}
