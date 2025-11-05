public class Main {
    public static void main(String[] args) {

        Logistica zonaTransporteUno = new LogisticaTerrestre();
        zonaTransporteUno.planEntrega("Medellin", "ITV-342");

        Logistica zonaTransporteDos = new LogisticaMaritima();
        zonaTransporteDos.planEntrega("Miami", "MR-6015-BAR");

    }
}
