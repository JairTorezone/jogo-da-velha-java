package br.com.sotfblue.tictactoe.core;

import br.com.sotfblue.tictactoe.Constants;
import br.com.sotfblue.tictactoe.ui.UI;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();

		board.print();
		
		//UI.readInput("Nome do Jogador:");
	}
}
