
public class Usuario {

	public static void main(String[] args) {
		
		
		
		SmartTv smart = new SmartTv();
		
		
		smart.diminuirVolume();
		smart.diminuirVolume();
		smart.aumentarVolume();
		
		
		System.out.println(" Canal Atual "+smart.canal);
		
		
		smart.mudarCanal(15);
		
		System.out.println(" Canal Atual " + smart.canal);
		
		System.out.println(" Volume Atual : " +smart.volume );
		
		
		
		System.out.println(" Tv Ligada ? " +smart.ligada);
		
		System.out.println(" Volume Atual : " +smart.volume);
		
		
		
		
		
		

	}

}
