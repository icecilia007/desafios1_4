import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int contaPares(int k, int[] arr) {
        // Ordena o array para facilitar a busca
        Arrays.sort(arr);

        int count = 0;
        int i = 0;
        int j = 1;

        // Percorre o array com dois ponteiros
        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            // Se a diferença for igual ao valor alvo, incrementa o contador
            if (diff == k) {
                count++;
                j++;
            }
            // Se a diferença for menor que o valor alvo, avança o ponteiro j
            else if (diff < k) {
                j++;
            }
            // Se a diferença for maior que o valor alvo, avança o ponteiro i
            else {
                i++;
            }
            // Garante que i < j para evitar casos duplicados
            if (i == j) {
                j++;
            }
        }

        return count;
    }

	public static void main(String[] args) {
	
		Scanner ent= new Scanner(System.in);
		  int n=ent.nextInt();
		  int k=ent.nextInt();
		  
	        Random random = new Random();
	      int[] arr = new int [n];
	      for (int i = 0; i < n; i++) {
	    	  arr[i] = random.nextInt(n); 
	    	  }

	        // Imprime o vetor gerado
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	      int pairsCount = contaPares(k, arr);
	      System.out.println(pairsCount);
	      ent.close();
	}

}
