# Übung 6
## Aufgabe 1
Erstellen Sie einen typsicheren Aufzählungstypen `Colors` mit den Elementen `ROT`,
`GRÜN` und `BLAU`.

## Aufgabe 2
Setzen Sie das folgende Klassendiagramm in Java-Quellcode um.

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
 | + getTitle()                  |          |                               |
 |                               |          |                               |
 | - - - - - - - - - - - - - - - |          | - - - - - - - - - - - - - - - |
 ```
 
## Aufgabe 3
Teilaufgaben a-g siehe Klasse `Node`
Teilaufgabe h siehe Klasse `TestNode`