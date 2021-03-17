package it.polito.tdp.alien;

import java.util.LinkedList;

public class WordEnhanced {
	private String alienWord;
	LinkedList<String> translations;
	
	public WordEnhanced(String alienWord) {
		this.alienWord = alienWord;
		translations = new LinkedList<String>();
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public LinkedList<String> getTranslation() {
		return translations;
	}


}
