# 📌 Rapport sur l'Injection de Dépendances en Java avec Spring

## 📖 Introduction
Ce projet illustre l'injection de dépendances en Java en utilisant différentes méthodes :
- Instanciation statique
- Instanciation dynamique
- Spring (XML & Annotations)

---

## 🏗️ Structure du projet
Le projet est structuré en plusieurs packages :
- `dao` : Contient l'interface `IDao` et son implémentation.
- `metier` : Contient l'interface `IMetier` et son implémentation.
- `pres` : Contient les classes de test et de présentation.
- `config` : Contient les fichiers de configuration Spring.

---

## 📌 1. Création de l'interface **IDao**
Définition de l'interface `IDao` avec une méthode `getData()` qui permet d'accéder aux données.

---

## 📌 2. Implémentation de l'interface **IDao**
Création de `DaoImpl`, une classe qui implémente `IDao` et fournit une implémentation de la méthode `getData()`.

---

## 📌 3. Création de l'interface **IMetier**
Définition de l'interface `IMetier` avec une méthode `calcul()` qui effectue un calcul basé sur les données de `IDao`.

---

## 📌 4. Implémentation de l'interface **IMetier** avec couplage faible
Création de `MetierImpl` qui implémente `IMetier`. Cette classe utilise `IDao` en tant que dépendance, permettant un couplage faible.

---

## 📌 5. Injection des dépendances

### a) Par instanciation statique
Création manuelle des instances dans la classe principale, entraînant un couplage fort.

### b) Par instanciation dynamique
Utilisation de la réflexion Java pour instancier les classes dynamiquement à partir d'un fichier de configuration.

### c) Injection avec Spring
#### Version XML
Déclaration des beans dans `applicationContext.xml` et injection des dépendances via XML.

#### Version Annotations
Utilisation des annotations `@Component` et `@Autowired` pour gérer l'injection de dépendances automatiquement avec Spring.

---


