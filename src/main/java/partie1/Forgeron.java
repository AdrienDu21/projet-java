package partie1;

public abstract class Forgeron {
    public abstract Arme forger();

    public final String presenterArme() {
        Arme a = forger();
        return "Voici : " + a.nom() + " qui fait " + a.degats() + " degats.";
    }
}
class ForgeronEpee extends Forgeron {
    public Arme forger() { return new Epee(); }
}
class ForgeronArc extends Forgeron {
    public Arme forger() { return new Arc(); }
}
class Epee implements Arme {
    public String nom() { return "Epee"; }
    public int degats() { return 80; }
}
class Arc implements Arme {
    public String nom() { return "Arc"; }
    public int degats() { return 60; }
}