package program;

import java.util.Scanner;

public class ListaString {

	public static void main(String[] args) {
		
//		EXERCICIO 4
		
		String palavra = "abAcaxI";
	    String palavraCodificada = "";
	    palavraCodificada = palavra.toLowerCase().replace("a", "1");
	    palavraCodificada = palavraCodificada.replace("e", "2");
	    palavraCodificada = palavraCodificada.replace("i", "3");
	    palavraCodificada = palavraCodificada.replace("o", "4");
	    palavraCodificada = palavraCodificada.replace("u", "5");
	    
	    System.out.println(palavraCodificada);
		
		

	
//		EXERCÍCIO 5
	
	    Scanner sc = new Scanner(System.in);
	    String texto = "";
	    System.out.println("Entre com um texto: ");
	    texto = sc.nextLine();
	    String novoTexto = texto;
	    novoTexto = novoTexto.toLowerCase().replace("a", "");	    novoTexto = 		novoTexto.replace("e", "");
	    novoTexto = novoTexto.replace("i", "");
	    novoTexto = novoTexto.replace("o", "");
	    novoTexto = novoTexto.replace("u", "");
	
	    System.out.println(novoTexto);
	    
	    
	    
//	    Exercício 7
		
//		Scanner ja isntanciado
		
	    String[] palavra1 = {"a","b","a","c","a","x","i"};
	    String[] palavraSecreta = {"*","*","*","*","*","*","*"};
	    int tentativas = 0;
	    Boolean ganhou = false;
	    String comparaPalavra = "";
	    System.out.print("Palavra Secreta: ");
	    for (String letraPalavraSecreta : palavraSecreta) {
	    	System.out.print(letraPalavraSecreta);
	    } System.out.println("");
	    while (tentativas < 8 && ganhou.equals(false)) {
	    	if (palavraSecreta.equals(palavra1)) {
		    	ganhou = true;
		    	System.out.println("VOCÊ GANHOU!!!");
		    }
		    System.out.println("Tentativas :" + tentativas);
		    System.out.println("digite uma letra: ");
		    String letra = sc.next();
		    tentativas -= 1;
		    for (int j = 0; j < palavra1.length; j++) {
		    	if (palavra1[j].equalsIgnoreCase(letra)) {
		    		palavraSecreta[j] = palavraSecreta[j].replace("*", letra);
		    	}
		    } 
		    System.out.print("Palavra Secreta: ");
		    for (String letraPalavraSecreta : palavraSecreta) {
		    	System.out.print(letraPalavraSecreta);
		    } 
		    System.out.println("");
		    
		    for (String letraPalavraSecreta : palavraSecreta) {
		    	comparaPalavra += letraPalavraSecreta;
		    }
		    
		    if (comparaPalavra.equals("abacaxi")) {
		    	ganhou = true;
		    } else {
		    	ganhou = false;
		    }
		    
		    comparaPalavra = "";
		    
		}
	    
	    
	    
	    if (ganhou.equals(false)) {
			  System.out.println("VOCÊ PERDEU!!!");
	    }
	    if (ganhou.equals(true)) {
	    	ganhou = true;
	    	System.out.println("VOCÊ GANHOU!!!");
	   
	    }
	  sc.close();
	}
}
