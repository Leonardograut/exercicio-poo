
public class SmartTv {

	boolean ligada =false;
	int canal = 1;
	int volume = 25;
	
	
	
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		
	}
	
	
	public void AumentarCanal() {
		canal ++;
	}
	
	

	public void DiminuirCanal() {
		canal --;
	}
	
	
	
	public void aumentarVolume() {
		
		
		volume++;
		
		System.out.println(" Aumentando o Volume da SmartTv " + volume);
		
		
	}
	
	
	public void diminuirVolume() {
		volume--;
		 
		System.out.println(" Diminuir o  Volume da SmartTv " + volume);
	}
	
	
	
	
	public void ligar () {
		
		 ligada = true;
	}
	
	public void desligar() {
		ligada =false;
	}
	
	
}
