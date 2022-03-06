import java.util.Arrays;

public class DesafioIII {

	public static void main(String[] args) {
		String s= "ola mundo";
		String resultado= s.replaceAll("\\s", ""); 
		int tamanho= resultado.length(); 
		int resulRaiz= (int) Math.round(Math.sqrt(tamanho)) ;
		
		System.out.println("Texto sem espaço em branco: "+resultado);
		System.out.println("Tamanho do texto: "+tamanho);
		System.out.println(resulRaiz);
		
		int contador =0 ;
	
		while(contador < tamanho/resulRaiz +1) {
		for(int posicao=contador; posicao<tamanho; posicao= posicao+ resulRaiz) {
				System.out.print(resultado.charAt(posicao));
		}	
		contador++;
			System.out.print(" ");
		}

		
		
	}

}
