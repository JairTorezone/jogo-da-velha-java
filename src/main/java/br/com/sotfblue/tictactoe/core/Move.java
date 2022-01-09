package br.com.sotfblue.tictactoe.core;

public class Move {

	private int i;
	private int j;
	
	public Move(String moverStr) {
		String[] filds = moverStr.split(",");
		
		this.i = Integer.parseInt(filds[0]);
		this.j = Integer.parseInt(filds[1]);
		
		//TODO: validar se a estrutura do moveStr 
	}
	
	//GETTS
	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	
}
