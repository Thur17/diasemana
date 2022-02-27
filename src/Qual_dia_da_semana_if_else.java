import java.util.Scanner;

public class Qual_dia_da_semana_if_else {

	public static void main(String[] args) {
		
			//Qual dia da semana ? if else 
		
			Scanner sc = new Scanner (System.in);
			int x;
			System.out.println("Colocar dia de 1 a 7 para dias da semana:");
			x = sc.nextInt();
			      String dia;

			      if(x == 1) {
			    	  dia = "Domingo";
			      } else if (x == 2 ) {
			    	  dia = "Segunda";
			      } else if (x == 3 ) {
			    	  dia = "Terça";
			      } else if (x == 4 ) {
			    	  dia = "Quarta";
			      } else if (x == 5 ) {
			    	  dia = "Quinta ";
			      } else if (x == 6 ) {
			    	  dia = "Sexta";
			      } else if (x == 7 ) {
			    	  dia = "Sabado";
			      }else {
			    	  dia = "valor invalido";
			      }
			    	
			 System.out.println("dia da semana:" +  dia);
			      
			sc.close();
		}
}
