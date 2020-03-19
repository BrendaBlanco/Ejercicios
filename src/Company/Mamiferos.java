package Company;

public class Mamiferos extends AnimalesVertebrados implements caracteristicasMamifero {
    
	@Override
    public String wholam(){
        return " Soy mamifero " + especie;
    }
	
	//Constructor 
	public Mamiferos(String _especie) {
		especie = _especie;
	}
	
	public void Correr() {
		 System.out.println("Comiendo.......");
		
	}

}