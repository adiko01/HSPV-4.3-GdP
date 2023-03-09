package uebung6;

import java.util.Date;

public class Film {
	/** 
	 * Aufgabe 2
	 * Setzen Sie das folgende Klassendiagramm in Java-Quellcode um.
	 * | - - - - - - - - - - - - - - - |			| - - - - - - - - - - - - - - - |	
	 * |			Film				 |			|			Person				|
	 * | - - - - - - - - - - - - - - - |			| - - - - - - - - - - - - - - - |	
	 * |								 |			|								|
	 * | - title: String				 |			| - vorname: String				|
	 * | - premiere: java.util.Date    |			| - nachname: String			|
	 * | - regisseur: Person			 |			| - geborenAm: java.util.Date	|
	 * | - - - - - - - - - - - - - - - |			| - - - - - - - - - - - - - - - |	
	 * |								 |			|								|
	 * | + abspielen()				 |			|								|
	 * | + getTitle()					 |			|								|
	 * |								 |			|								|
	 * | - - - - - - - - - - - - - - - |			| - - - - - - - - - - - - - - - |
	 */
	
	String title;
	Date premiere = new Date();
	Person regisseur = new Person();
	
	void abspielen() {
		//Nothing happens
	}
	String getTitle () {
		return title;
	}
}
