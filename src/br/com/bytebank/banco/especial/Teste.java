package br.com.bytebank.banco.especial;

public class Teste {

	public static void main(String[] args) {
		 System.out.println("\u001b[3mTítulo: \u001b[m\u001b[1m"+ "title"+ "\u001b[m");
         System.out.println("\u001b[3mPoster: \u001b[m\u001b[1m"+ "image"+ "\u001b[m");
         System.out.println("\u001b[45m\u001b[3mClassificação: \u001b[m\u001b[45m\u001b[1m"+ "imDbRating"+ " \u001b[m");
         int classificacao = 8;
         String stars = "";            
         for(int i = 0; i<classificacao; i++) {
             stars = stars + "\u2B50";
         }
         System.out.println(stars);
         System.out.println();
	}
}
