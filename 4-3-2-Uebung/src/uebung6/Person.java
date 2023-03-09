package uebung6;

import java.util.Date;

public class Person {
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
	
	String vorname;
	String nachname;
	Date geborenAm = new Date();
	
	
}
