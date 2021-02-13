package dal.tp1.ex1.setter_injection;

public class UMLQuiz implements QuizMaster {
	private final String type;
	private final String question;
    private final String [] choices;
    private final int response;

    public UMLQuiz() {
    	type="Question sur UML";
		question = "Parmi les diagrammes suivants, lequel a été introduit dans UML2 ?";

		choices = new String [4];
    	choices[0] = "Diagramme d'Activité";
    	choices[1] = "Diagramme de Classes";
    	choices[2] = "Diagramme de Temps";
    	choices[3] = "Diagramme des cas d'Utilisation";

    	response = 2;
     }

	@Override
	public String getChoice(int index) {
		// TODO Auto-generated method stub
		return choices[index];
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

	@Override
	public int getResponse() {
		// TODO Auto-generated method stub
		return (response);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
}
