package company;

class AnimalesVertebrados {
	
	protected String especie;
	
	 //Constructor
    public void AnimalesVertebrados(String especie){
        this.especie = especie;
    }
	
	//Get 
    public String getEspecie() {
        return this.especie;
    }
    
    //Set
    public void setEspecie(String especie) {
        especie = especie;
    }

   //Metodos
    public String wholam(){
        return this.especie;
    }
}
