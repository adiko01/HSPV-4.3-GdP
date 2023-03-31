# Übungsblatt  8
## Aufgabe 1
**a)** Welche Ausnahmen müssen abgefangen werden, wenn der folgende Code-Schnipsel
 übersetzt werden soll. Nutzen Sie zur Lösung der Aufgabe die Javadoc-Dokumentation.
 
```
Clip clip = AudioSystem.getClip();
clip.open(AudioSystem.getAudioInputStream (new File("audio.wav")));
clip.start();
TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength()+50);
clip.close();
```

**b)** Kann/Sollte man Ausnahmen zusammenfassen?

## Aufgabe 2
Eine Datei lässt sich in Java mit folgendem Quellcode einlesen:

```
String filename = ....
List<String> lines = Files.readAllLines(Paths.get(filename));
```

Erstellen Sie in Ihrem Projektordner eine eigene Datei, die aus mehreren Zeilen mit
jeweils einem Wort besteht.
Schreiben Sie ein Programm, das ermittelt, welches Wort in der Datei das längste ist.
Welche Ausnahmen müssen Sie dabei berücksichtigen?

## Aufgabe 3
Schreiben Sie ein Programm, das analog zu Aufgabe 2 eine Datei ein eine String-Liste
einliest. Die Datei soll aber in diesem Fall pro Zeile eine Zahl beinhalten.
Konvertieren Sie die eingelesenen Zeilen so, dass die Zahlen in ein Double-Array ein-
gelesen werden. Achten Sie auf Ausnahmen derart, dass bei fehlerhaften Einträgen das
Programm nicht abbricht, sondern die entsprechende Zeile ignoriert und die fehlerhafte
Zeile auf der Konsole ausgegeben wird.

## Aufgabe 4
**a)** Schreiben Sie eine Klasse `Person`, die die Attribute `vorname`, `nachname` und `alter` umfasst. Sofern ein Objekt dieser Klasse erzeugt wird, soll eine `IllegalArgumentException` ausgelöst werden, falls der Nachname leer ist oder das Alter kleiner als 0 oder größer als 150 gesetzt wird. Testen Sie mit einem entsprechenden Hauptprogramm.

**b)** Erstellen Sie eine eigene Ausnahmeklasse `PersonException` und passen Sie die Klasse
so an, dass in den oben genannten Fällen eine PersonException ausgelöst wird.