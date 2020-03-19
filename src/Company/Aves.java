package Company;

public class Aves extends AnimalesVertebrados implements caracteristicaAves  {

	@Override
    public String wholam(){
        return " Soy un ave " + especie;
    }
	
	public Aves(String _especie) {
		especie = _especie;
	}
	
	public void volar() {
		System.out.println("Estoy volando.......");
		
	}
	
}
