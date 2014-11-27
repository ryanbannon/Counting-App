public class Counting{
	private String sentence;
	private int vowels;
	private int consonants;
	private int spaces;

	//constructor
	public Counting(){
		String sentence = "";
		int vowels = 0;
		int consonants = 0;
 		int spaces = 0;
		}
	//set
	public void setSentence(String sentence){
		this.sentence = sentence;
	}
	//compute
	public void compute(){
		for(int i = 0;i < sentence.length();i = i+1){
			if(sentence.charAt(i)=='a')||(sentence.charAt(i)=='e')||(sentence.charAt(i)=='i')||(sentence.charAt(i)=='o')||(sentence.charAt(i)=='u'){
				vowels = vowels + 1;
			}
			else if(sentence.charAt(i)==' '){
			spaces = spaces + 1;
			}
	}

	//return
	public int getVowels(){
		return vowels;
	}
	public int getSpaces(){
		return spaces;
	}
}