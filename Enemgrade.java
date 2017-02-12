/**
 * EnemGradeCalculator(A calculator that finds your average grade in the exam)
 * @author (Tetration) Rafael A Oliveira
 * @version 0.1
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Enemgrade{
	public static void main(String[] args) {
		System.out.println("Somador de Nota do Enem\n"+
			"Descubra sua nota geral do ENEM sem ter trabalheira!");
		averagegrade();//Calls for calculator method
	}
	/*
	Method responsible for calculating the grade of the user´s ENEM
	*/
	public static void averagegrade(){
		Scanner in=new Scanner(System.in);
		double notas[]=new double[5];
		double pesos[]=new {1,1,1,1,1};
		int tf=0;
		String notasname[]={"Ciencas da Natureza e suas Tecnologias","Ciências Humanas e suas Tecnologias","Linguagens, Códigos e suas Tecnologias","Matemática e suas Tecnologias","Redacao"};
		System.out.println("Calculador de Media do Enem");
		

		try{
			System.out.println("Deseja acrescentar um peso pra cada matéria ou calcular sem peso?\n"+
			"(1-sim 0-nao)\n"+
			"(se você não colocar o peso de cada matéria, será considerado que todas tem peso 1)");
			/*
			Enem grade with weight of each grade not implemented yet
			*/
			tf=in.nextInt();
				if (tf==1) {
					for (int a=0;a<5 ;a++ ) {
						System.out.println("Digite o peso que"+ notasname[a]+" tem:\n");
						pesos[a]=in.nextDouble();
				}
			
			}



		}catch(InputMismatchException inputmismatchexception){
			System.out.println("Erro!! Tente inserir novamente!");
			in.nextline();
		}

		
		/*
		Prompts the user to write his grades until it reaches the end of the array
		*/
		for (int a=0;a<5;a++ ) {
			//If its the first time writing data on the array it will say "type first..." otherwise it will give the user
			// the same message until the array is over.
			if (a!=0) {
				System.out.println("Agora digite sua nota de " + notasname[a] );
			}else{
				System.out.println("Primeiro digite sua nota de " + notasname[0] );
			}
			notas[a]=in.nextDouble();

			
		}
			//Makes the final average sum of the grade(without calculating a custom weight) and then prints it in the user screen
			double geralsimples=(notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;
			System.out.println("Sua nota geral simples foi de: " + geralsimples);

	}
}