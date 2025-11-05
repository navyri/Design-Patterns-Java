public class EmailNotification implements Suscriptor {

    // OBSERVADOR CONCRETO
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void recibirNotificacion(String canal, String tituloVideo) {
        System.out.println("SentTo: " + email + ". Notificar el nuevo video " + tituloVideo);
        System.out.println("Subjet: " + canal + " ha subido un video!");
    }
}
