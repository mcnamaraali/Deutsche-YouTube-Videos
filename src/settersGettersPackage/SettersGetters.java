package settersGettersPackage;

public class SettersGetters {
	private int doors;
	private int bedrooms;
	
	public SettersGetters(int doors, int bedrooms) {
		this.doors = doors;
		this.bedrooms = bedrooms;
	}
	public SettersGetters( int bedrooms) {
		this.bedrooms = bedrooms;
	}
	
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	
	
}