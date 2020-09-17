
public class Fase3 {

	public static void main(String[] args) {
		int bisesto = 1944;
		System.out.println("Anys de traspàs de 1948 a 1977");
		for(int i = 0; i < 8; i++){
			bisesto += 4;
			if (bisesto >= 1948 && bisesto < 1978) {
			System.out.println(bisesto);
			}
		}
		boolean any;
		String t = "El vostre any de naixement, és de traspàs";
		String f = "El vostre any de naixement, el 1977, no és de traspàs";
				if (any = false) {
					bisesto = 1977;
					System.out.println(any + " " + t);}
					else{
						System.out.println(any + " " +f);
				}
	}	
}
			
			
