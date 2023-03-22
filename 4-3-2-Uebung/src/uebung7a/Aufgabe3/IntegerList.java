package uebung7a.Aufgabe3;

import java.util.ArrayList;

public class IntegerList {
	ArrayList<Integer> Liste;
	
	IntegerList(){
		Liste = new ArrayList<Integer>();
	}
	
	/**
	 * @return Länge der Liste
	 */
	int getLength() {
		return Liste.size();
	}
	
	/**
	 * 
	 * @param value Fügt {@code value} der Liste am ende hinzu
	 */
	void insertLast(int value) {
		Liste.add(value);
	}
	
	/**
	 * @return Ersten Wert der Liste
	 */
	int getFirst() {
		return Liste.get(0);
	}
	
	/**
	 * Löscht das erste Element der Liste
	 */
	void deleteFirst() {
		Liste.remove(0);
	}
	
	/**
	 * Durchsucht die Liste, ob ein Wert in dieser enthalten ist
	 * @param value Wert nach dem Gesucht werden soll
	 * @return {@code true} wenn enthalten, {@code false} wenn nicht
	 */
	boolean search(int value) {
		for (int i = 0 ; i < getLength() ; i++) {
			if (Liste.get(i) == value) {
				return true;
			}
		}
		return false;
	}
}
