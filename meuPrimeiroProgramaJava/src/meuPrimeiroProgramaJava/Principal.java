/**
 Este programa mostra ao aluno:
 1) Que todo programa Java � constutituido dendo de um projeto java
 2) Todo programa Java deve ter uma classe com um m�todo main.
 3) Como exibir informa��es no terminal (console) do java.
 4) Como ler uma String do terminal ( console) do java.



 * 
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Principal { // Classe com os m�todos principais

	
	public static void main(String[] args) { 
		System.out.println("Ol� Amigo\nQual � o seu nome? ");
		// TODO Auto-generated method stub
		
		// Ler uma string do console usando a biblioteca Scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// exibir uma string usando printf.
		System.out.printf("Ol� %s!", nome);

	}

}
