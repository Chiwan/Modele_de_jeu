package testQuestion;

import java.util.ArrayList;

public class Question {
	
	/**
	 * 
	 */
	private String[] questionReponse;
	/**
	 * L'objet question est constitu� d'un tableau de 9 String.
	 * La premiere ligne correspond � la question
	 * La deuxieme ligne correspond � la bonne r�ponse
	 * Le reste sont des questions al�atoires.
	 */
	public Question(){
		questionReponse = new String[9];
	}
	/**
	 * La bonne r�ponse doit se situe en deuxieme ligne dans une fichier .txt
	 * @return
	 */
	public String afficherBonneReponse(){
		return questionReponse[1];
	}
	
	/**
	 * la question se trouve � la premiere ligne du fichier .txt
	 * @return
	 */
	public String afficherQuestion(){
		return questionReponse[0];
	}
	
	/**
	 * Permet de r�cup�rer la question et les r�ponses
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
