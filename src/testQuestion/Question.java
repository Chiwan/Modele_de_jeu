package testQuestion;

import java.util.ArrayList;

public class Question {
	
	/**
	 * 
	 */
	private String[] questionReponse;
	/**
	 * L'objet question est constitué d'un tableau de 9 String.
	 * La premiere ligne correspond à la question
	 * La deuxieme ligne correspond à la bonne réponse
	 * Le reste sont des questions aléatoires.
	 */
	public Question(){
		questionReponse = new String[9];
	}
	/**
	 * La bonne réponse doit se situe en deuxieme ligne dans une fichier .txt
	 * @return
	 */
	public String afficherBonneReponse(){
		return questionReponse[1];
	}
	
	/**
	 * la question se trouve à la premiere ligne du fichier .txt
	 * @return
	 */
	public String afficherQuestion(){
		return questionReponse[0];
	}
	
	/**
	 * Permet de récupérer la question et les réponses
	 * @return
	 */
	public String[] getQuestionReponse(){
		return questionReponse;
	}
	
	/**
	 * Permet de rentrer les valeurs dans le tableau de String
	 * @param i
	 * @param s
	 */
	public void setQuestionReponse(int i, String s){
		questionReponse[i]=s;
	}
}
