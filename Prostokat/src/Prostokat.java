public class Prostokat {

	Punkt lg, pd; // lewy górny i prawy dolny pkt prostokąta
	
	Prostokat(Punkt p1, Punkt p2) {
		
		lg = p1;
		pd = p2;
		
	}
	
	void wyswietl() {
		System.out.println("Wspolrzedne pierwszego wierzcholka to (" + lg.x + ", " + lg.y + ")");
		System.out.println("Wspolrzedne drugiego wierzcholka to (" + lg.x + ", " + pd.y + ")");
		System.out.println("Wspolrzedne trzeciego wierzcholka to (" + pd.x + ", " + pd.y + ")");
		System.out.println("Wspolrzedne czwartego wierzcholka to (" + pd.x + ", " + lg.y + ")");
	}
	
	void policz() {
		
		float p = Math.abs( pd.x - lg.x ) * Math.abs( pd.y - lg.y );
		
		System.out.println("\nPole prostokata wynosi: " + p + " jednostek kwadratowych");
	}
	
	boolean sprawdz(Punkt testowy) {
		if (lg.x <= testowy.x && pd.x >= testowy.x  && lg.y >= testowy.y && pd.y <= testowy.y) return true;
				
		return false;
		
	}
	/*
	Prostokat(int a, int b, int c, int d) {
		
		lg.x = a;
		lg.y = b;
		pd.x = c;
		pd.y = d;
		
	}
	*/
}
