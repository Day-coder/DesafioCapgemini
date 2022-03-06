import java.util.Arrays;

public class DesafioII {

	public static void main(String[] args) {
		int[] n= new int[] {1,5,3,4,2};
		int x=2;
		int total=0;
		
		Arrays.parallelSort(n);
		int tamanhoDoArray= n.length;
		
		for (int i=tamanhoDoArray;i>0; i--) {
			System.out.println ("Dados do Array "+ n[i-1]);
			for (int j=0; j<i; j++) {
				if(n[i-1]- n[j]==x) {
					total++;
				}
			}
			
		}
		System.out.println ("quantidades de repetições "+ total);
	}

}
