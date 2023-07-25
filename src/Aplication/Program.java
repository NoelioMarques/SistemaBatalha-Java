package Aplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Entites.Personagem;
import Entites.SimuladorDeCombate;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int N = 0;
		boolean entradaValida = false;
		
		System.out.println("Bem vindo ao Simulador de combate. \n");
		
		while(!entradaValida) {
		try {	
		System.out.println("Quantos Personagens voce quer cadastrar? ");
		N = read.nextInt();
		if(N<=0) {
			System.out.println("Por favor, digite um numero positivo.");
		}else {
			entradaValida = true;
		}
		} catch(InputMismatchException e) {
			System.out.println("Entrada Invalida, por favor digite um numero inteiro.");
			read.nextLine();
		}
		}
		read.nextLine();
				
		//Lista para armazenar personagens 
		ArrayList<Personagem> list = new ArrayList<>() ; 

		//Cadastro dos personagens 
		
		for (int i = 1; i <= N ; i++) {
			System.out.println("Nome do Personagem: ");
			String nome = read.nextLine();
			System.out.println("Ataque: ");
			int ataque = read.nextInt();
			System.out.println("Defesa: ");
			int defesa = read.nextInt();
			read.nextLine();
			
			Personagem personagem = new Personagem(nome, ataque, defesa);
			list.add(personagem);
		}
		
		// Exibir informações dos personagens
		
		for (Personagem personagem : list) {
			personagem.exibirInformaçoes();
		}
		
		// Perguntar ao usuario quais personagens vao batalhar
		
		System.out.println("Digite o nome do personagem que vai lutar: ");
		String nomePersonagem1 = read.nextLine();
		System.out.println("Digite o nome do  outro personagem que vai lutar: ");
		String nomePersonagem2 = read.nextLine();
		
		//Busca pelos personagens selecionados
		
		Personagem personagem1 = null;
		Personagem personagem2 = null;
		
		for(Personagem personagem : list) {
			if(personagem.getName().equalsIgnoreCase(nomePersonagem1)) {
				personagem1 = personagem;
			}
			if(personagem.getName().equalsIgnoreCase(nomePersonagem2)) {
				personagem2 = personagem;
			}
		}
		
		if(personagem1 != null && personagem2 != null){
			SimuladorDeCombate.simularCombate(personagem1, personagem2);
		} else {
			System.out.println("Personagens nao encontrados");
		}
		read.close();
	}

}