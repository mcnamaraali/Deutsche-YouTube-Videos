package settersGettersPackage;

public class SettersGettersMain {

	public static void main(String[] args) {
		SettersGetters hausGetSet = new SettersGetters(2, 4);
		SettersGetters hausGetSet2 = new SettersGetters(3, 5);
		
		System.out.printf("Schlafzimmer %d %n",hausGetSet.getBedrooms());
		System.out.printf("Schlafzimmer %d %n",hausGetSet2.getBedrooms());
		System.out.printf("Tur %d ",hausGetSet.getDoors());
		System.out.printf("Tur %d ",hausGetSet2.getDoors());

	}

}
