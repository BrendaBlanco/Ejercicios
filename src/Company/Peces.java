package Company;

public class Peces extends AnimalesVertebrados implements caracteristicasPez{
	
	@Override
    public String wholam(){
        return " Soy un pez " + especie ;
    }
	
	public Peces(String _especie) {
		especie = _especie;
	}
	
	public void Nadar() {
		System.out.println("Respirando debajo del agua.......");
		
	}
	
}


