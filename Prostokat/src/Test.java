import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Punkt lg = new Punkt(1,6);
		Punkt pd = new Punkt(5,2);
		
		Prostokat marian = new Prostokat(lg, pd);
		
		marian.wyswietl();
		marian.policz();
		
		Punkt testowy = new Punkt(1, 2);
		if (marian.sprawdz(testowy)) System.out.println("Punkt nalezy do prostokata");
		else System.out.println("Punkt nie nalezy do prostokata");
	}

}
