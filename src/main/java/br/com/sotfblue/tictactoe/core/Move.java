package br.com.sotfblue.tictactoe.core;

public class Move {

	private int i;
	private int j;

	public Move(String moverStr) throws InvalidMoveException {
		try {
			String[] filds = moverStr.split(",");
			
			this.i = Integer.parseInt(filds[0]);
			this.j = Integer.parseInt(filds[1]);
			
		}catch (Exception e) {
			throw new InvalidMoveException("Jogada Inválida");
		}
	
		
		 
	}

	// GETTS
	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

}
