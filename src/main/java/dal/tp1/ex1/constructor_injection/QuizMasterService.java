package dal.tp1.ex1.constructor_injection;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizMasterService {
	private final JFrame frame;
	private JRadioButton [] radioButtons;
	private final QuizMaster quizMaster;

	public QuizMasterService() {
		FileSystemXmlApplicationContext appContext = new FileSystemXmlApplicationContext(new String[] { "src/main/resources/constructorBeans.xml" });
		quizMaster = (QuizMaster) appContext.getBean("quizMasterBean");

		this.frame = new JFrame();
		radioButtons = new JRadioButton [4];
		frame.setSize( 450, 200 );
		this.frame.setTitle(quizMaster.getType());

		// Closing the window
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) { QuizMasterService.this.terminate(); }
		});

		// Central Panel
		JPanel centralPanel = new JPanel(new BorderLayout());
		frame.add(centralPanel);

		ActionListener listener = e -> {
			AbstractButton aButton = (AbstractButton) e.getSource();
			String message = aButton.getText();

			if(message.equals(quizMaster.getChoice(quizMaster.getResponse())))
				JOptionPane.showMessageDialog(frame, "Bonne réponse" );

			else
				JOptionPane.showMessageDialog(frame, "Mauvaise réponse" );
		};

		JPanel panneauQuestion = new JPanel( new FlowLayout( FlowLayout.LEADING ) );
		panneauQuestion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		JLabel monlabel = new JLabel(quizMaster.getQuestion());
		panneauQuestion.add(monlabel);
		centralPanel.add( panneauQuestion, BorderLayout.NORTH );
		JPanel panneauChoix = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
		ButtonGroup groupe = new ButtonGroup ();

		for(int i = 0; i < 4; i++) {
			radioButtons[i] = new JRadioButton (quizMaster.getChoice(i));
			groupe.add(radioButtons[i]);
			panneauChoix.add(radioButtons[i]);
			radioButtons[i].addActionListener(listener);
		}

		centralPanel.add( panneauChoix, BorderLayout.CENTER);
		frame.setVisible( true );
	}

	private void terminate() {
		this.frame.dispose();
		System.exit(0);
	}
}
