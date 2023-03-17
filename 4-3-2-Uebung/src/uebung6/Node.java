package uebung6;

public class Node {
	/** Aufgabe 3
	 * Entwickeln Sie eine Klasse Node, mit der Sie einen binären Baum in Java implementie-
	 * ren können, der Zeichenketten abspeichern kann. Gehen Sie wie folgt vor:
	 * a)  Überlegen Sie sich zunächst, welche Objektvariablen Sie umsetzen müssen. Der Inhalt
	 * eines Knotens soll in der Objektvariable content vom Typ String gespeichert werden.
	 * b) Schreiben Sie einen Konstruktor, mit dem ein neuer Knoten erzeugt werden kann.
	 * Als Parameter wird dabei der Inhaltsstring mit übergeben.
	 * c) Entwickeln Sie eine Getter-Methode für die Objektvariable content.
	 * d) Schreiben Sie eine Methode public Node addRecursive (Node current, String cn), mit
	 * der Sie dem Baum weitere Knoten hinzufügen können.
	 * e) Schreiben Sie eine Methode public boolean contains (String cn), mit der Sie prüfen
	 * können, ob ein Baum eine Zeichenkette enthält.
	 * f) Erweitern Sie die Klasse Node um eine Methode public Node deleteRecursive(Node
	 * current, String cn), mit der ein Knoten aus dem Baum gelöscht werden kann.
	 * g) Schreiben Sie eine Methode void printTree(), mit der Sie den Baum rekursiv ausgeben
	 * können. Durchlaufen Sie den Baum dabei inOrder.
	 */
	
	/* Inhalt des Knotens (Teilaufgabe a) */
	private String content;
	/* Linker untereintrag im Baum (Teilaufgabe a) */
	private Node left;
	/* Rechter untereintrag im Baum (Teilaufgabe a) */
	private Node right;

	/* Konstruktor (Teilaufgabe b) */
	public Node(String content) {
		this.content = content;
		left = null;
		right = null;
	}
	
	/* Getter für Content (Teilaufgabe c) */
	public String getContent () {
		return this.content;
	}
	
	/** Funktion zum hinzufügen eines Nodes
	 * (Teilaufgabe d)
	 * @param current Der {@code Node} an den angehangen werden soll
	 * @param cn Der Content des {@code Node}s
	 */
	public Node addRecursive(Node current, String cn) {
		/* Überprüfe, ob der übergebene Node null ist */
		if (current == null) {
            return new Node(cn);
        }
        
        /* Vergleiche den Inhalt von Current und cn als Strings mit der Methode compareTo 
		 * 
		 * Mögliche Ergebnisse
		 * 
		 * Wert <0   
		 * Wert >0
		 * Wert =0  Nur wenn die Strings gleich sind
		 * 
		 * */
        if (cn.compareTo(current.getContent()) < 0) {
            current.left = addRecursive(current.left, cn);
        } else if (cn.compareTo(current.getContent()) > 0) {
            current.right = addRecursive(current.right, cn);
        } else {
            /* Der angegebene Node enthält den gleichen content wie in cn übergeben wurde */
            return current;
        }
        // I know: es ist überflüssig, aber eclipse nervt sonst.
		return current;
    }
	
	/** Überprüfe ob ein String bereits im Baum steht
	 *  (Teilaufgabe e)
	 * @param cn Der zuprüfende String
	 * @return {@code true}, wenn der String {@code cn} im Baum vorhanden ist, ansonsten {@code true}
	 */
    public boolean contains(String cn) {
        Node current = this;
        while (current != null) {
            if (cn.compareTo(current.getContent()) < 0) {
                current = current.left;
            } else if (cn.compareTo(current.getContent()) > 0) {
                current = current.right;
            } else {
                /* String gefunden */
                return true;
            }
        }
        /* String nicht gefunden */
        return false;
    }
    
    /** Löscht einen Node aus dem Baum
     * (Teilaufgabe f)
     * @param current Der oberste {@code Node} unter dem gesucht werden soll
     * @param cn Der Content der gelöscht werden soll
     * @return Obersten {@code Node} entspricht {@code current}
     */
    public Node deleteRecursive(Node current, String cn) {
        /* Überpfrüfe, ob gültiger Node übergeben wurde */
    	if (current == null) {
            return null;
        }
        
    	/* Aufruf von contains(cn) zur überprüfung, ob der String cn überhaupt im Node gespeichert wurde. */
    	if(!current.contains(cn)) {
    		return null;
    	}
    	
        if (cn.equals(current.getContent())) {
        	/* Der zulöschende Node entsprciht dem Übergabeparameter */
        	if (current.left == null && current.right == null) {
                /* Der zulöschende Node ist ein "Blatt" und hat keine untereinträge */
                return null;
            } else if (current.left == null) {
                /* Der Node hat nur einen rechten Untereintrag */
                return current.right;
            } else if (current.right == null) {
                /* Der Node hat nur einen linken Untereintrag */
                return current.left;
            } else {
                /* Der Node hat sowohl einen rechten, als auch einen linken Eintrag
                 * Daher muss ein geeigneter Nachfolger für den aktuellen Node her,
                 * der beste Nachfolger ist der kleinste Node auf der rechten Seite,
                 * da dieser größer ist als der linke Node des aktuellen Nodes und
                 * kleiner als der rechte Node des aktuellen Nodes.
                 */
            	Node node = current.right;
            	while (node.left != null) {
                    node = node.left;
                }
                current.content = node.content;
                
                /* Lösche den nun "beförderten" Knoten */
                current.right = deleteRecursive(current.right, node.content);
                
                /* Gebe den Baum wieder zurück */
                return current;
            }
        } else if (cn.compareTo(current.getContent()) < 0) {
        	/* Der übergebene Node ist nicht der gesuchte.
        	 * Daher Überprüft das else if, ob der String cn kleiner als der String des Nodes ist
        	 * Wenn true, dann rekusiver aufruft der ;ethode mit dem linken Node
        	 */
            current.left = deleteRecursive(current.left, cn);
            return current;
        } else {
        	/* Der übergebene Node ist nicht der gesuchte.
        	 * Daher ÜberprüftDa die Überprüfung im vorhergenenden else if ergeben hat, dass der String cn
        	 * nicht im linken teil des Baumes liegt, muss er im rechten liegen.
        	 * Daher reuksiver Aufruf der Methode mit dem rechten Node
        	 */
            current.right = deleteRecursive(current.right, cn);
            return current;
        }
    }
    
    /** Druckt den Baum in die Konsole
     *  (Teilaufgabe g)
     */
    public void printTree() {
    	if (left != null) {
            left.printTree();
        }
        System.out.println(content);
        if (right != null) {
            right.printTree();
        }
    }
}
