# Projekt nach GitHub hochladen

## Neues Repository erstellen
1. Rechtsklick auf das Projekt
2. Wähle im Kontextmenü `Team` -> `Share Project ...`
3. Wähle im Dialog `Create`
4. Wähle den Speicherort des Repos und benenne es bestätige mit `Finish`
5. Bestätige nun erneut mit `Finish`

Das git-Repo ist nun angelegt.

## Öffne die GIT Perpektive
1. Über `Window` -> `Perspective` -> `Open Perspective` -> `Other` wird der Dialog zum öffnen von Perspektiven geöffnet.
2. Wähle nun zum öffnen die Perspektive `Git`

## Speichere änderrungen in Git 
1. Öffne die GIT Perpektive
2. Wähle im unteren Teil des Fensters `Git Staging`

Im Bereich `Unstaged Files` sind die noch nicht vorgemerkten Änderrungen.
Im Bereich `Staged Files` sind die noch nicht vorgemerkten Änderrungen.
Im Bereich `Commit Message` wird ein Kommentar zum Commit hinterlassen.

Mit einem `Commit` werden diese `Staged Files` in git gesichert und versioniert.

`Commit and Push` arbeitet wie `Commit`, allerdings wird die Änderrung auch an die Remotes (z.B. Github) gesendet.

##Verknüpfen mit GitHub
1. Öffne die GIT Perpektive
2. Mache einen ersten Commit
3. In der rechten Seiten Leiste wird nun das Repo erweitert.
4. Nun wird ein Rechtsklick auf `Remote` gemacht und `Create Remote ...` ausgewählt.
5. Der Standard Remote Name ist `origin` (Kann bei bedarf und Wunsch geändert werden) mit `Create` wird der neue Remote angelegt.
6. In der Zeile `URI:` wird auf `Change ...` geckickt.
7. Nun muss auf Github ein neues Repo angelegt werden und die https Adresse von diesem in dem Feld `URI` eingefügt werden.
8. Die Felder `Host`, `Repository Path` und `Protocol` werden automatisch ausgefüllt.
9. Als `User` wird der GitHub Username eingegeben.
10. Als `Password` wird ein GitHub `Personal Access Tokten` eingetragen. 
11. Speichere das Password im Secure Storage (Checkbox unter dem Passwort).
12. Bestätige mit `Finish`.
13. Speichere mit `Save and Push`.