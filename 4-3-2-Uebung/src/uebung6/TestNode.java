package uebung6;

public class TestNode {
	/** Aufgabe 3
	 * h) Schreiben Sie jeweils einige Testzeilen in das Hauptprogramm, um die einzelnen Auf-
	 * gabenteile mit einem Baum Ihrer Wahl auszuprobieren.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Node root = new Node("banana");
        root.addRecursive(root, "apple");
        root.addRecursive(root, "cherry");
        root.addRecursive(root, "date");
        
        System.out.println(root.contains("apple"));  // true
        System.out.println(root.contains("fig"));    // false
        System.out.println("\n");
        
        root.printTree();
        // Ausgabe:
        // apple
        // banana
        // cherry
        // date
        System.out.println("\n");
        
        root = root.deleteRecursive(root, "banana");
        root.printTree();
    }
}