# Übungsblatt 7

## Aufgabe 1

Erstellen Sie eine Klasse `Figur` mit den abstrakten Methoden:

* `abstract void zeichne()`
* `abstract double getFlaeche()`

Die Klassen `Kreis` und `Rechteck` sind von Figur abgeleitet und implementieren die beiden Methoden. Schreiben Sie ein Testprogramm, das die beiden Methoden für verschiedene Figuren testet.
Hinweis: Die Methode zeichne soll auf der Konsole nur die Eigenschaften des Objekts (also Breite und Höhe bzw. Radius) und den Flächeninhalt ausgeben.

## Aufgabe 2
Ein Obstlager kann verschiedene Obstsorten (Apfel, Birne, Orange) aufnehmen. Die abstrakte Klasse `Obst` soll die folgenden abstrakten Methoden enthalten:

* `abstract String getName()`
* `abstract String getFarbe()`

Die Klassen `Apfel`, `Birne` und `Orange` sind von `Obst` abgeleitet. Die Klasse `Obstlager` enthält ein Array vom Typ `Obst`. Die Methode `print()` dieser Klasse soll für alle Obstsorten im Lager die Methoden `getName()` und `getFarbe()` aufrufen und das Ergebnis ausgeben.

## Aufgabe 3
Eine Liste ganzer Zahlen größer oder gleich 0 soll als Interface `IntegerList` implementiert
werden. Dazu sollen die folgenden abstrakten Methoden verwendet werden:

* `int getLength()`
	– liefert die Länge der gesamten Liste
* `void insertLast(int value)`
	– fügt value am Ende der Liste an
* `int getFirst()`
	– liefert das erste Element der Liste
* `void deleteFirst()`
	– löscht das erste Element der Liste
* `boolean search(int value)`
	– prüft, ob value in der Liste vorkommt.

Implementieren Sie dieses Interface mithilfe eines Arrays in der Klasse `ArrayIntegerList`
und testen Sie alle Methoden.

## Aufgabe 4
Erweitern Sie die Klasse `Figur` aus  Übungsblatt 7a Aufgabe 1 um die Schnittstelle
`Comparable<Figur>` so dass die Objekte nach Größe der Fläche sortiert werden können.