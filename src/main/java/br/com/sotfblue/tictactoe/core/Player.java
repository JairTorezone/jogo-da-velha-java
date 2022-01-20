package br.com.sotfblue.tictactoe.core;

import br.com.sotfblue.tictactoe.ui.UI;

public class Player {

	private String name;
	private Board board;
	private char symbol;

	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}

	private Move inputMovel() throws InvalidMoveException {
		String moveStr = UI.readInput("Jogador '" + name + "' =>");
		return new Move(moveStr);
	}
	
	public boolean play() throws InvalidMoveException {
		Move move = inputMovel();
		return board.play(this, move);
	}
	//GETTS
	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}

	public char getSymbol() {
		return symbol;
	}
	
}
