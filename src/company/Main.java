package company;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
				
        ArrayList<AnimalesVertebrados> listAnimales = new ArrayList<>();	
        
        listAnimales.add(new Peces("Bagre"));
        listAnimales.add(new Aves("Paloma"));
        listAnimales.add(new Mamiferos("Perro"));
        
        for (AnimalesVertebrados c : listAnimales) {
            System.out.println(c.wholam());
        }

	}

}
