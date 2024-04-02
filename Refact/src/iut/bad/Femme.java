package iut.bad;

public class Femme extends Humain {
private String nom;
	
	private String prenom;
	private int age;
	
	// Constructeur par défaut
    public Femme() {
        super();
    }

    // Constructeur avec paramètres
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
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
}
