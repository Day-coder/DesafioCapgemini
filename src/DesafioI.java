import java.util.Arrays;

public class DesafioI {

	public static void main(String[] args) {
		int[] array= new int[] {9,2,1,4,6};
		
		Arrays.parallelSort(array);
		if (array.length%2==1) {
			int metadeDoArray= array.length/2;
			int mediana= array[metadeDoArray];
			System.out.println ("Mediana " + mediana);
		}
		else if (array.length%2==0) {
			float metadeDoArray= ((array.length/2) + (array.length/2)+1);
			float mediana= metadeDoArray/2;
			System.out.println ("Mediana " + mediana);
		}
	}
}
