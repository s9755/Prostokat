
public class Punkt {

	int x, y;
	
	
	Punkt(int x1, int y1) {
		x = x1;
		y = y1;
		
		System.out.println("Utworzono nowy punkt na bazie innego punktu");
	}

	  void wyswietl() {
		
		System.out.println("Wspolrzedne punktu to (" + x + ", " + y + ")");
		
	}
	  
}
