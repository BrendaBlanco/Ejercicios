package company;

public class Aves extends AnimalesVertebrados implements CaracteristicaAves  {

	@Override
    public String wholam(){
        return " Soy un ave " + especie;
    }
	
	public Aves(String especie) {
		this.especie = especie;
		
	}
	
	public void volar() {
		System.out.println("Estoy volando.......");
		
	}
	
}
