import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent= new Scanner(System.in);
        Locale.setDefault(Locale.US);

		 double nota = ent.nextDouble();
		  int notas=(int)nota;
		  int [] notasVal = new int [6];
		  int [] valoresNotas = {100,50,20,10,5,2};
		 
		  int moedas = (int) ((nota - notas) * 100);
	      int [] moedasVal = new int [6];
		  int [] valoresMoedas = {1,50,25,10,5,1};
		  
		  System.out.println("NOTAS:");
		  for(int i=0;i<notasVal.length;i++) {
			  notasVal[i]= notas/valoresNotas [i];
			  notas-=notasVal[i]*valoresNotas [i];
			  System.out.printf("%d moeda(s) de R$ %.2f%n", notasVal[i], (double)valoresNotas[i]);
		  }
		  
		  moedasVal[0]=notas;
		  notas-=moedasVal[0]*valoresMoedas[0];
		  System.out.println("MOEDAS:");
		  System.out.printf("%d moeda(s) de R$ %.2f%n", moedasVal[0], (double)valoresMoedas[0]);
		  for(int i=1;i<moedasVal.length-1;i++) {
			  moedasVal[i]= moedas/valoresMoedas[i];
			  moedas-=moedasVal[i]*valoresMoedas[i];
			  System.out.printf("%d moeda(s) de R$ %.2f%n", moedasVal[i], (double)valoresMoedas[i]/100);
		  }
		  moedasVal[5]=moedas;
		  System.out.printf("%d moeda(s) de R$ %.2f%n", moedasVal[5], (double)valoresMoedas[5]/100);

	}

}
