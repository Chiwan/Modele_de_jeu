package testQuestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random; 
import java.util.Scanner;
import java.io . * ; 

public class GestionQuestion {
	
	//Permet de choisir une question aléatoirement
	private Random randomizer = new Random();
	
	// Contient toutes les questions du jeu
	private ArrayList<Question> listeQuestion;
	
	public GestionQuestion(){		
		listeQuestion=new ArrayList<Question>();
	}
	
	/**
	 * Chaque fichier est lu ligne par ligne, chaque fichier correspond à une question
	 * @param filePath
	 * @throws Exception
	 */
	private void lireFichier(File filePath) throws Exception{
		Scanner scanner=new Scanner(filePath);
		Question q = new Question();
		for(int i=0;i<9 && scanner.hasNextLine();i++){
				String line = scanner.nextLine();
				q.setQuestionReponse(i, line);			
		}
		listeQuestion.add(q);
		scanner.close();
	}
	
	
	/**
	 * Lis tous les fichiers qui sont dans le dossier question
	 */
	public void listerRepertoire(){
		String path = "ressources\\question";
		File repertoire= new File(path);
		File[] listeFichier;
		int i;
		
		listeFichier=repertoire.listFiles();
		
		for(i=0;i<listeFichier.length;i++){
				try {
					lireFichier(listeFichier[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	/**
	 * Permet de récupérer la liste des questions
	 * @return
	 */
	public ArrayList<Question> getListeQuestion(){
		return listeQuestion;
	}
	 public static void main(String args[]){
	        GestionQuestion question = new GestionQuestion();	        
	        question.listerRepertoire();
	        System.out.println(question.getListeQuestion().get(0).afficherQuestion());
	        System.out.println(question.getListeQuestion().get(0).afficherBonneReponse());
	        

	 }
}
