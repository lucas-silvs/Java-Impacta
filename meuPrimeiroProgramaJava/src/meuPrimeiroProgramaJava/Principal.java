/**
 Este programa mostra ao aluno:
 1) Que todo programa Java é constutituido dendo de um projeto java
 2) Todo programa Java deve ter uma classe com um método main.
 3) Como exibir informações no terminal (console) do java.
 4) Como ler uma String do terminal ( console) do java.



 * 
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class Principal { // Classe com os métodos principais

	
	public static void main(String[] args) { 
		System.out.println("Olá Amigo\nQual é o seu nome? ");
		// TODO Auto-generated method stub
		
		// Ler uma string do console usando a biblioteca Scanner teste
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// exibir uma string usando printf teste 2.
		System.out.printf("Olá %s!", nome);

	}

}
