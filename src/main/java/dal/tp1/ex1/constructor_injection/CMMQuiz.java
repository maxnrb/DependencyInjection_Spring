package dal.tp1.ex1.constructor_injection;

public class CMMQuiz implements QuizMaster {
	private final String type;
	private final String question;
	private final String [] choices;
	private final int response;

    public CMMQuiz() {
		type = "Question sur CMM";
		question = "La méthode CMM (Capability Maturity Model) se divise en :";

		choices = new String [4];
    	choices[0] = "3 niveaux";
    	choices[1] = "4 niveaux";
    	choices[2] = "5 niveaux";
    	choices[3] = "6 niveaux";

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
