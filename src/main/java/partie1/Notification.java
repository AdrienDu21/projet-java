package partie1;

public abstract class Notification {
    protected CanalEnvoi canal;

    public Notification(CanalEnvoi canal) {
        this.canal = canal;
    }
    public abstract void notifier(String destinataire, String contenu);
}
interface CanalEnvoi {
    void envoyer(String destinataire, String message);
}
class CanalEmail implements CanalEnvoi {
    public void envoyer(String d, String m) { System.out.println("[EMAIL] -> " + d + "\n" + m); }
}
class CanalSMS implements CanalEnvoi {
    public void envoyer(String d, String m) { System.out.println("[SMS] -> " + d + "\n" + m); }
}
class NotificationUrgente extends Notification {
    public NotificationUrgente(CanalEnvoi c) { super(c); }
    public void notifier(String dest, String msg) { canal.envoyer(dest, "[URGENT] " + msg); }
}
class NotificationNormale extends Notification {
    public NotificationNormale(CanalEnvoi c) { super(c); }
    public void notifier(String dest, String msg) { canal.envoyer(dest, msg); }
}