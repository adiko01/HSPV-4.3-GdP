package beispiele.Kontrollstrukturen;

public class Beispiel_switch_02 {

	public static void main(String[] args) {
		
		String input = new javax.swing.JOptionPane().showInputDialog("Was ist Ihr Lieblingsessen?");
		
		switch (input.toLowerCase())
		{
			case "kekse":
				System.out.println ("Ich mag Kekse auch.");
				break;
			
			case "kuchen":
				System.out.println ("Ich mag Kuchen.");
				break;
				
			case "schokolade":
			case "lakritze":
				System.out.println("Hm. Lecker.");
				break;
				
			default:
				System.out.println ("Kann man das essen?");
		}

	}

}

