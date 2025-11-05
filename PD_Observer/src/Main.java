public class Main {
    public static void main(String[] args) {

        CanalYoutube objCanal = new CanalYoutube("Vegeta666");
        Suscriptor movil = new PushNotification("AyaneMovil");
        Suscriptor email = new EmailNotification("ayanene@gmail.com");
        Suscriptor dispositivoCasa = new PushNotification("TV Sala");
        Suscriptor otro = new PushNotification("Celular Hermano");

        objCanal.suscribir(email);

        objCanal.subirVideo("Solo casa con obsidiana");

        objCanal.desuscribir(movil);
        objCanal.desuscribir(dispositivoCasa);
        objCanal.desuscribir(otro);

        objCanal.subirVideo("Como invocar a JeroBrain");

    }
}
