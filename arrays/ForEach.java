package arrays;

public class ForEach {

	public static void main(String[] args) {

		/*SINTAXE: 
			
			for(TIpo apelido : coleção) {
				comandos
			}*/
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"} ;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		for(String apelido : vect) {
			System.out.println(apelido);
		}
	}

}
