package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain() {
    }

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
 // 7 - Méthode pour afficher les détails de l'humain
    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
    
 // 8 - Méthode pour afficher les détails de l'humain
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
    
 // Méthode pour simuler l'action de manger
    public void manger() {
        System.out.println("L'humain " + nom + " " +prenom+ " est en train de manger.");
        
    }

    // Méthode pour simuler l'action de boire
    public void boire() {
        System.out.println("L'humain " + nom + " " +prenom+ "est en train de boire.");
       
    }
}


