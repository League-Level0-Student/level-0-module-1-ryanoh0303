import javax.swing.JOptionPane;
public class Unbirthday {

	public static void main(String[] args) {
		String month=JOptionPane.showInputDialog("What is the date of your birthday?");
	
		if(month.equals("2/December")) {
			System.out.println("Happy Birthday");
		}
		else {
			System.out.println("Merry Unbirthday");
		}
	}

}
