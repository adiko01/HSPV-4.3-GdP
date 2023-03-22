# Übungsblatt 7b

## Aufgabe 1
Erweitern Sie die Klasse `Figur` aus  Übungsblatt 7a Aufgabe 1 um die Schnittstelle
`Comparable<Figur>` so dass die Objekte nach Größe der Fläche sortiert werden können.

Testen Sie.

## Aufgabe 2
Implementieren Sie das folgende UML-Diagramm. Erstellen Sie außerdem eine Klasse
`HiWi`, die das Interface `StudHilfskraft` implementiert.

```
 | - - - - - - - - - - - - - - - |          | - - - - - - - - - - - - - - - |
 |             Film              |          |           Person              |
 | - - - - - - - - - - - - - - - |          | - - - - - - - - - - - - - - - |	
 |                               |          |                               |
 | - title: String               |          | - vorname: String             |
 | - premiere: java.util.Date    |          | - nachname: String            |
 | - regisseur: Person           |          | - geborenAm: java.util.Date   |
 | - - - - - - - - - - - - - - - |          | - - - - - - - - - - - - - - - |	
 |                               |          |                               |
 | + abspielen()                 |          |                               |
 | + getTitle(): String          |          |                               |
 |                               |          |                               |
 | - - - - - - - - - - - - - - - |          | - - - - - - - - - - - - - - - |
 ```
 