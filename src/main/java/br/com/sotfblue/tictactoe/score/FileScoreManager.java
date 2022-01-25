package br.com.sotfblue.tictactoe.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import br.com.sotfblue.tictactoe.core.Player;

public class FileScoreManager implements ScoreManager{
	
	private static final Path SCORE_FILE = Path.of("score.txt");
	private Map<String, Integer> scoreMap = new HashMap<>();
	
	public FileScoreManager() throws IOException {
		setup();
	}
	
	public void setup() throws IOException {
		if(!Files.exists(SCORE_FILE)) {
			Files.createFile(SCORE_FILE);
		}
		
		try(BufferedReader reader = Files.newBufferedReader(SCORE_FILE)){
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] fildes = line.split("\\|");
				
				scoreMap.put(fildes[0], Integer.parseInt(fildes[1]));
			}
		}
	}

	@Override
	public Integer getScore(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveScore(Player player) {
		// TODO Auto-generated method stub
		
	}



}
