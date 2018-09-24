package jogoVelha.com;

import java.util.Scanner;

public class JogoVelha{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[][] jogoVelha = new char[3][3];
		
		System.out.println("jogador 1 = 'X'");
		System.out.println("jogador 2 = 'O'");
		
		boolean ganhou = false;
		boolean linhaValida = false, colunaValida = false;
		int jogada = 1, linha = 0, coluna = 0;
		char sinal;
		
		while(ganhou) {
			
			if(jogada % 2 == 1) {
				System.out.println("Vez do jogador 1, entre com a linha e coluno(1-3).");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2, entre com a linha e coluna(1-3).");
				sinal = 'O';
			}
			
			linhaValida = false;
			while(linhaValida) {
				System.out.println("Entre com a linha (1-3).");
				linha = scan.nextInt();
				
				if((linha < 1 || linha > 3) ) {
					linhaValida = true;
				}else {
					System.out.println("Linha invalida, tente novamente!");
					linhaValida = false;
				}
			}
			colunaValida = false;
			while(colunaValida) {
			
			System.out.println("Entre com a coluna (1-3).");
			coluna = scan.nextInt();
			
			if(coluna < 1 || coluna > 3) {
				colunaValida = true;
			}else {
				System.out.println("coluna invalida, tente novamente.");
				colunaValida = false;
			}
			}
			linha--;
			coluna--;
			if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posicao ja esta preenchida, jogue novamente.");
			    ganhou = false;
			}else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
				
				for(int i = 0; i<jogoVelha.length; i++) {
					for(int j = 0; j<jogoVelha[i].length; j++) {
						System.out.print(jogoVelha[i][j]+" | ");
					}
					System.out.println();
				}
			}
		}
	}

}
