# REPONSES.md - Projet Java Avancé B2

---

## Explications des tests
> Tous les tests passent.

---

## PARTIE 01 | Design Patterns

### § 1.A - Singleton - le serveur de jeu
**1. Pourquoi le mot-clé volatile est-il indispensable sur l'instance dans le Double-Checked Locking ?**
> Ça empeche le jvm de réorganiser la mémoire. sinon un thread pourrait utiliser l'objet avant qu'il soit totalement créer et faire crash le programme.

**2. Donne une alternative plus simple et tout aussi thread-safe en Java. Pourquoi est-elle préférable ?**
> Utiliser un enum . java devient (par miracle) plus lisible, et au moins il gere ça tous seul.

### § 1.F - State - le personnage et ses états
**3. Quelle est la différence entre le pattern State et un simple if/else sur un attribut enum ? Donne un avantage concret du State dans ce contexte.**
> trop de if/else ça rend le code pas tres beau (et illisible surtout). avec le State, chaque état a sa propre classe. L'avantage : si on rajoute un état, y'a pas besoin de s'inquieter que le code casse.
 
---

## - PARTIE 02 | Génériques, Lambdas & Streams

(voir code)