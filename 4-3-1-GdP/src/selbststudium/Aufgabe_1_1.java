package selbststudium;

import java.util.Scanner;

public class Aufgabe_1_1 {
	/**Aufgabe 1.1
	 * Die Cäsar-Verschlüsselung ist ein Verschiebechiffre, d.h. Wörter werden verschlüsselt,
	 * indem die einzelnen Buchstaben um eine bestimmte Anzahl an Zeichen verschoben wer-
	 * den. Die Anzahl der Zeichen, die man bei der Verschiebung verwendet, nennt man den
	 * Schlüssel k .
	 * Mit dem Schlüssel k = 3 ergibt sich beispielsweise:
	 * KLARTEXT:   A B C D E F G H I J K L M N O P Q R S T U V W X
	 * GEHEIMTEXT: D E F G H I J K L M N O P Q R S T U V W X A B C
	 * 
	 * So ergibt das Klartextwort HALLO nach der Verschlüsselung den Geheimtext KDOOR.
	 * Die Verschlüsselung ergibt sich also durch Verschiebung der Buchstaben um k Zeichen
	 * nach rechts. Beim Entschlüsseln werden die Zeichen entsprechend um k Stellen nach
	 * links geschoben.
	 * a) Schreiben Sie eine Methode String encrypt(String text, int k), mit der sich Zeichen-
	 * ketten verschlüsseln lassen. Rückgabewert ist die verschlüsselte Zeichenkette.
	 * b) Schreiben Sie eine Methode String decrypt(String text, int k), mit der sich Zeichen-
	 * ketten entschlüsseln lassen. Rückgabewert ist die entschlüsselte Zeichenkette.
	 * c) Schreiben Sie ein Programm, bei dem der Nutzer eine Zeichenkette und einen Schlüssel
	 * eingeben kann. Das Programm liefert dann die verschlüsselte Zeichenkette.
	 */
	public static char[] ABC = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(" Übung 5 - Aufgabe 5\n"
				+ "Cäsar-Verschlüssellung\n");
		
		while (true) {
			System.out.print("Was möchten Sie machen, ver- oder entschlüsseln? Oder das Programm beenden? [ver,ent oder ende]");
		String task = s.nextLine();
		System.out.print("\n");
		task = task.toLowerCase();
			if (task.equals("ende")) {
				//Beende das Programm
				System.exit(0);
			} else if (task.equals("ver")) {
				System.out.print("Der zu verschlüsselnde Text: ");
				String text = s.nextLine();
				System.out.print("Die Verschiebung [int]: ");
				int k = s.nextInt();
				System.out.print("Der verschlüsselte Text lautet: \n" + encrypt(text, k) + "\n");
			} else if (task.equals("ent")) {
				System.out.print("Der zu entschlüsselnde Text: ");
				String text = s.nextLine();
				System.out.print("Die Verschiebung [int]: ");
				int k = s.nextInt();
				System.out.print("Der entschlüsselte Text lautet: \n" + decrypt(text, k) + "\n");
			} else {
				System.out.println("Das war keine gültuge Auswahl!");
			}
		}
	}
	
	/**
	 * Verschlüsselt den Text
	 * @param text
	 * @param k
	 * @return
	 */
	public static String encrypt (String text, int k) {
		text = text.toLowerCase();
		//Überarbeite den Text
		text = text.replace("ä", "ae");	//Ersetetzt ä durch ae
		text = text.replace("ö", "oe"); //Ersetetzt ö durch oe
		text = text.replace("ü", "ue"); //Ersetetzt ü durch ue
		text = text.replace("ß", "ss"); //Ersetetzt ß durch ss
		
		//Rückgabe String
		String ret = "";
		for (int i = 0; i<text.length(); i++) {
			for (int o = 0; o<26; o++) {
				if (text.charAt(i)==ABC[o]) {
					int n = (o + k) % 26;
					ret = ret + ABC[(n)];
					break;
				}
			}
		}
		return ret;
	}
	
	/**
	 * Entschlüsselt den Text
	 * @param text
	 * @param k
	 * @return
	 */
	public static String decrypt (String text, int k) {
		//Überarbeite den Text
		text = text.toLowerCase();
		
		//Rückgabe String
		String ret = "";
		for (int i = 0; i<text.length(); i++) {
			for (int o = 0; o<26; o++) {
				if (text.charAt(i)==ABC[o]) {
					int n = o - k;
					if (n < 0) {
						n = 26 + n;
					}
					ret = ret + ABC[(n)];
					break;
				}
			}
		}
		return ret;
	}
}
