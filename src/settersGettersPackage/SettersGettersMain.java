package settersGettersPackage;

public class SettersGettersMain {

	public static void main(String[] args) {
		SettersGetters hausGetSet = new SettersGetters(2, 4);
		
		System.out.printf("Schlafzimmer %d %n",hausGetSet.getBedrooms());
		System.out.printf("Tur %d ",hausGetSet.getDoors());

	}

}
