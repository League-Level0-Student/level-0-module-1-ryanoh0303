import javax.swing.JOptionPane;
public class TheRiddler {

	public static void main(String[] args) {
		int score=0;
		String answer=JOptionPane.showInputDialog("Who makes it, has no need of it.Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		if(answer.equals("a Coffin")) {
			score=score+1;
			JOptionPane.showMessageDialog(null, "Score is "+ score);
		}
		else {
			JOptionPane.showMessageDialog(null,"A coffin");
	
		}
		String answer2=JOptionPane.showInputDialog("Forward I am heavy, but backward I am not. What am I?");
		if(answer2.equals("Forward I am ton, backwards I am not.")) {
			score=score+1;
			JOptionPane.showMessageDialog(null, "Score is "+ score);
		}
		else {
			JOptionPane.showMessageDialog(null,"Forward I am ton, backwards I am not.");
			JOptionPane.showMessageDialog(null,"Final Score is "+ score);
	
		}

	}

}
