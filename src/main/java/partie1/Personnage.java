package partie1;

public class Personnage {
    private final String nom;
    private final String classe;
    private int pv;
    private int mana;
    private String arme;
    private boolean estElite;

    private Personnage(Builder b) {
        this.nom = b.nom;
        this.classe = b.classe;
        this.pv = b.pv;
        this.mana = b.mana;
        this.arme = b.arme;
        this.estElite = b.estElite;
    }

    public static class Builder {
        private String nom;
        private String classe;
        private int pv = 100;
        private int mana = 50;
        private String arme = "Poings";
        private boolean estElite = false;

        public Builder(String nom, String classe) {
            this.nom = nom;
            this.classe = classe;
        }

        public Builder pv(int pv) { this.pv = pv; return this; }
        public Builder mana(int mana) { this.mana = mana; return this; }
        public Builder arme(String arme) { this.arme = arme; return this; }
        public Builder estElite(boolean elite) { this.estElite = elite; return this; }

        public Personnage build() {
            if (nom == null || nom.isEmpty() || classe == null || classe.isEmpty()) {
                throw IllegalArgumentException("Le nom et la classe sont obligatoires !!");
            }
            return new Personnage(this);
        }
    }

    @Override
    public String toString() {
        return nom + " (" + classe + ") - PV: " + pv + " | Arme: " + arme;
    }
}