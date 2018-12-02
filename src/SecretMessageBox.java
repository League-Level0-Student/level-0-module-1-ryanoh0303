import javax.swing.JOptionPane;
public class SecretMessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="1234abc";
		String userinput=JOptionPane.showInputDialog("What is the password?");
		if(userinput.equals(password)) {
			JOptionPane.showMessageDialog(null,"Secret Message");
		}
		else {
		    JOptionPane.showMessageDialog(null,"INTRUDER");
		}

	}

}
