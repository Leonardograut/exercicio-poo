


		// Ela tenha as características: ligada (boolean), canal (int) e volume (int)
                // Nossa TV poderá ligar e desligar e assim mudar o estado ligada
                // Nossa TV  aumentará e diminuirá o volume sempre em +1 ou -1
                // Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente





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
