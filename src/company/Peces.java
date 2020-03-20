package company;

public class Peces extends AnimalesVertebrados implements CaracteristicasPez{
	
	@Override
    public String wholam(){
        return " Soy un pez " + especie ;
    }
	
	public Peces(String especie) {
		this.especie = especie;
	}
	
	public void Nadar() {
		System.out.println("Respirando debajo del agua.......");
		
	}
	
}


