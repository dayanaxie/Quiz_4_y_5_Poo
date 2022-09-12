package Quiz4y5;

public class Tool {
	private String weaponName;
	private float damage;
	private enum state{
		BROKEN,
		ALMOST_BROKEN,
		NEW
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	};
}
