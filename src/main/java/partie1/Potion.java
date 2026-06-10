package partie1;

public interface Potion {
    int getPV();
    String getEffets();
}
class PotionDeBase implements Potion {
    public int getPV() { return 50; }
    public String getEffets() { return "Soin de base"; }
}
abstract class PotionDecorator implements Potion {
    protected Potion potionWrappee;
    public PotionDecorator(Potion p) { this.potionWrappee = p; }
    public int getPV() { return potionWrappee.getPV(); }
    public String getEffets() { return potionWrappee.getEffets(); }
}
class AvecAntidote extends PotionDecorator {
    public AvecAntidote(Potion p) { super(p); }
    public int getPV() { return super.getPV(); }
    public String getEffets() { return super.getEffets() + ", Antidote"; }
}
class AvecMana extends PotionDecorator {
    public AvecMana(Potion p) { super(p); }
    public int getPV() { return super.getPV() + 30; }
    public String getEffets() { return super.getEffets() + ", Restauration de mana"; }
}