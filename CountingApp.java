import javax.swing.JOptionPane;
public class CountingApp{
	public static void main (String args[]){

	//variables
	String sentence;
	int vowels;
	int consonants;
	int spaces;

	Counting myCounting = new Counting;

	//input
	sentence = JOptionPane.showInputDialog(null,"Please enter a sentence");
	myCounting.setSentence(sentence);

	//process
	myCounting.compute();

	//get
	Counting = myCounting.getCounting();

	//output
	JOptionPane.showMessageDialog(null,"")

	}
}