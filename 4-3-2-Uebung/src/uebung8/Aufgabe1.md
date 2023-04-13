# Übungsblatt 8 - Aufgabe 1
**a)** Welche Ausnahmen müssen abgefangen werden, wenn der folgende Code-Schnipsel
 übersetzt werden soll. Nutzen Sie zur Lösung der Aufgabe die Javadoc-Dokumentation.
 
```
Clip clip = AudioSystem.getClip();
clip.open(AudioSystem.getAudioInputStream (new File("audio.wav")));
clip.start();
TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength()+50);
clip.close();
```

Geworfen werden für diese Schnipsel:
* InterruptedException
* IOException
* LineUnavailableException
* UnsupportedAudioFileException


**b)** Kann/Sollte man Ausnahmen zusammenfassen?

Um das "kann" zu beantworten: Ja es ist möglich. Dazu sähe der `catch` so aus

````
catch (InterruptedException | IOException | LineUnavailableException | UnsupportedAudioFileException e) {

}

```

Bei der Beantwortung des "sollte" ist es wichtig das Ziel des Programmes zu beachten. Unterumständen muss auf manch einen Fehler anders reagiert werden andere sollten zusammen gefasst werden, um unnötige Code doppelungen zuvermeiden. Im oberen Beispiel sollten die `IOException` und die `UnsupportedAudioFileException` zusammengelegt werden, da diese in der Auswirkung gleiche Probleme behandeln.