import java.util.ArrayList;
import java.util.List;


public class CanalYoutube {

    // Sujeto
    private List<Suscriptor> rativoris = new ArrayList<>();
    private String nombreCanal;

    // Constructor
    public CanalYoutube(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    // Metodos
    public void suscribir(Suscriptor s) {
        rativoris.add(s);
        System.out.println("Se añadio un nuevo sub");
    }

    public void desuscribir(Suscriptor s) {
        rativoris.remove(s);
        System.out.println("Se añadio un nuevo sub");
    }

    public void subirVideo(String video) {
        System.out.println("Se ha subido un nuevo video en el canal " + nombreCanal);
        this.notificarSuscriptores(video);
    }

    private void notificarSuscriptores(String video){
        for (Suscriptor s: rativoris) {
            s.recibirNotificacion(nombreCanal, video);
        }
    }

}
