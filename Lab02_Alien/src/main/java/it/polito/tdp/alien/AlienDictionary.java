package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	TreeMap<String, WordEnhanced> dictionary;

	public AlienDictionary() {
		dictionary = new TreeMap<String, WordEnhanced>();
	}
	
	public void addWord(String alienWord, String translation) {
		if(dictionary.get(alienWord) == null) {
			WordEnhanced we = new WordEnhanced(alienWord);
			we.translations.add(translation);
			dictionary.put(alienWord, we);
		}
		if(dictionary.get(alienWord) != null)
			dictionary.get(alienWord).translations.add(translation);
	}
	
	public String translateWord (String alienWord) {
		if(dictionary.containsKey(alienWord)) {
			String s = "";
			for(String ss: dictionary.get(alienWord).translations)
				s += ss+"\n";
			return s.substring(0, s.length()-1);
		}
		else return "Parola sconosciuta";
	}
	

}
