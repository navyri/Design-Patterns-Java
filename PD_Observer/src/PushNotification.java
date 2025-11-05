public class PushNotification implements Suscriptor {

    // OBSERVADOR CONCRETO
    private String nombreUsuario; // deviceId

    public PushNotification(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void recibirNotificacion(String canal, String tituloVideo) {
        System.out.println("Ring Ring! " + nombreUsuario + ". " + canal + " ha subido un nuevo video!");
        System.out.println("Video: " + tituloVideo);
    }

}
