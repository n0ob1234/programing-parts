package partsPackage;

import java.util.ArrayList;

public class Text {

	String text;

	public Text(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	

	
	
	public ArrayList<String> turnTextToTitle(    int jumpF, int oddLength, String oddWord ) {
		
		char [] split = text.toCharArray();
		ArrayList<String> filterdsplit = new ArrayList<String>();

		
		
		for(int i = 0; i<split.length;i++) {
			if (split[i] == '<') {
				System.out.println("pass 1");
				i+=jumpF;//skip the tag
				if(i>=split.length) {
					break;
				}
				
				if(split[i] == '<') {
					i=findNextGreaterThan(split, i);
					System.out.println("pass 2");
				}
				if(i>=split.length) {//check if the index is greater than the length of the text
					break;
				}
				System.out.println("pass 3");
				filterdsplit.add(  TitleFromChars(split, i));
				System.out.println("pass 4");
				i++;
			}
		}
		
		
			
		return filterdsplit;
	
			
				
		
	}

	// turns the characters into a string
	public String TitleFromChars(char[] characters, int i) {
		String finalString = "";
		while (characters[i] != '<') {
			
			finalString = finalString + characters[i];
			i++;
		}
		System.out.println("pass 5");
		return finalString;
	}

	public int findNextGreaterThan(char[] characters, int i) {
		while (characters[i] != '>') {
			System.out.println("pass 6");
			i++;
		}
		return i;
	}
	public int findNextLessThan(char[] characters, int i) {
		while (characters[i] != '<') {
			System.out.println("pass 7");
			i++;
		}
		return i;
	}
}
