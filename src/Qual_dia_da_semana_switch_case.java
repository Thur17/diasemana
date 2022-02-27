import java.util.Scanner;

public class Qual_dia_da_semana_switch_case {

	public static void main(String[] args) {
		//dia da semana - switch case 
		Scanner sc = new Scanner (System.in);
		int x;
		System.out.println("Colocar dia de 1 a 7 para dias da semana:");
		x = sc.nextInt();
		      String dia;

		      switch (x) {
		      case 1:
		    	  dia = "Domingo";
		    	  break;
		     case 2:
			     dia = "Segunda";
			     break;
		     case 3:
			     dia = "Terça";
			     break;
		     case 4:
			     dia = "Quarta";
			     break;    
		     case 5:
			     dia = "quinta";
			     break;    
		     case 6:
			     dia = "Sexta";
			     break;     
		     case 7:
			     dia = "Sabado";
			     break;    
			     
			 default:    
			     dia = "valor invalido";
			     break;
		      }
		
		 System.out.println("dia da semana:" + dia);
		sc.close();      
		
	}
}