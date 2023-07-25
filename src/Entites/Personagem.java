package Entites;

public class Personagem {
	private String name; 
	private int ataque; 
	private int defesa;
	
	public Personagem(String name, int ataque, int defesa) {

		this.name = name;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	} 
	
	
	public void exibirInformaçoes() {
		System.out.println("Nome: " + name);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defesa: " + defesa);
	}
	
	
	
}
