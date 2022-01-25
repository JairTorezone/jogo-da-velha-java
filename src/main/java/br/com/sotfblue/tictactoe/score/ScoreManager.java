package br.com.sotfblue.tictactoe.score;

import java.io.IOException;

import br.com.sotfblue.tictactoe.core.Player;

public interface ScoreManager {

	Integer getScore(Player player);
	
	void saveScore(Player player) throws IOException;
}
