# Übungsblatt  9
## Aufgabe 1
Implementieren Sie ein Programm, bei dem der Nutzer eine beliebige natürliche Zahl eingeben kann. Diese Zahl soll vom Programm dann in binärer, in oktaler und in hexadezimaler Darstellung ausgegeben werden.
Hinweis: Schauen Sie sich die Dokumentation einer bestimmten Wrapper-Klasse genauer an.

## Aufgabe 2
Addieren Sie in einer Schleife die Zahlen von 1 bis `Integer.MAX_VALUE`. Worauf müssen Sie beim Vergleich der Schleifenvariable mit `Integer.MAX_VALUE` achten?

**a)** Speichern Sie das Ergebnis in einer Variable des elementaren Datentyps `long` und messen Sie die Laufzeit.

**b)** Ändern Sie den elementaren Datentyp `long` in die Wrapper-Klasse `Long` und messen Sie erneut.

Hinweis:  Überlegen Sie sich, wie Sie die Laufzeit eines Programmes messen könnten. Die Klasse System kann Ihnen dabei helfen. Wenn das Programm nach wenigen Sekunden noch nicht beendet ist, dann haben Sie einen Fehler in Ihrer Schleife.

## Aufgabe 3
Erstellen Sie eine Klasse `Artikel`, die die Instanzvariablen `id`, `preis` und `menge` enthalten soll. Hierzu sind ein Konstruktor und die jeweiligen get/set-Methoden zu definieren.

Erstellen Sie eine weitere Klasse `Warenkorb`, die mit Hilfe eines Vector-Objekts Artikel Objekte aufnehmen können soll.
Implementieren Sie die folgenden Methoden:

• `public void add(Artikel artikel)`
– fügt ein Artikel-Objekt in den Warenkorb ein.

• `public double bestellwert()`
– liefert den Bestellwert (`preis` * `menge`) aller Artikel im Warenkorb.