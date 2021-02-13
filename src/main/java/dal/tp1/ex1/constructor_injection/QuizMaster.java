package dal.tp1.ex1.constructor_injection;

public interface QuizMaster {
	String getQuestion();
	String getChoice(int index);
	int getResponse();
	String getType();
}
