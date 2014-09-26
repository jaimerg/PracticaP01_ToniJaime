import java.util.ArrayList;
import java.util.Collections;


public class Comparador {

	public static void main(String[] args) {
		Coche c1 = new Coche("1234-ASD", 1900, 100);
		Coche c2 = new Coche("5678-FGH", 1500, 200);
		Coche c3 = new Coche("9012-JKL", 900, 50);
		
		ArrayList<Coche> list =new ArrayList<Coche>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.shuffle(list);
		
		System.out.println("Vamos a mostrar la lista desordenada");
		System.out.println(list);
		
		Collections.sort(list, new ComparadorCochePorCilindrada());
		System.out.println("Mostramos ordenada por cilindrada");
		System.out.println(list);
	}
}
