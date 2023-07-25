package Entites;

public class SimuladorDeCombate {
	//Metodo para simular combate
	
	public static void simularCombate(Personagem personagem1, Personagem personagem2) {
		int poderPersongame1 = personagem1.getAtaque() - personagem2.getDefesa();
		int poderPersonagem2 = personagem2.getAtaque() - personagem1.getDefesa();
		
		if(poderPersongame1 > poderPersonagem2) {
			System.out.println("O Vencedor do combate foi: " + personagem1.getName());
		} else if(poderPersonagem2 > poderPersongame1) {
			System.out.println("O Vencedor do combate foi: " + personagem2.getName());
		} else { System.out.println("O Combate terminou empatado.");	
		}
	}
}
