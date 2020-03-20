package company;

public class Mamiferos extends AnimalesVertebrados implements CaracteristicasMamifero {
    
	@Override
    public String wholam(){
        return " Soy mamifero " + especie;
    }
	
	//Constructor 
	public Mamiferos(String especie) {
		this.especie = especie;
	}
	
	public void Correr() {
		 System.out.println("Comiendo.......");
		
	}

}