import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numListDesordenada= new ArrayList<>();
		List<Integer> numParesList= new ArrayList<>();
		List<Integer> numImparesList= new ArrayList<>();
		List<Integer> numListOrdenada= new ArrayList<>();


        try {
            try (BufferedReader br = new BufferedReader(new FileReader(new File("file.txt")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    numListDesordenada.add(Integer.parseInt(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
         }
        
        for(int index : numListDesordenada) {
        	if(index % 2 == 0) numParesList.add(index);
        	else numImparesList.add(index);
        }
       Collections.sort(numParesList);
       Collections.sort(numImparesList, Collections.reverseOrder());
       numListOrdenada.addAll(numParesList);
       numListOrdenada.addAll(numImparesList);
       numListOrdenada.stream().forEach(System.out::println);
	}

}
