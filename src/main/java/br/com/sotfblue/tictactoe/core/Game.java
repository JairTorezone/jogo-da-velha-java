package br.com.sotfblue.tictactoe.core;

import br.com.sotfblue.tictactoe.Constants;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		System.out.println("Jogando...");
	}
}
