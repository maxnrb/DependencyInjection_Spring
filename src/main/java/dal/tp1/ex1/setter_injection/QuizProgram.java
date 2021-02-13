package dal.tp1.ex1.setter_injection;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class QuizProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(new String[] { "src/main/resources/setterBeans.xml" });
		applicationContext.getBean("quizMasterSetterBean");
	}
}