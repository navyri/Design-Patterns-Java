public abstract class Logistica {

    public abstract MediosTransporte crearTransporte(String placa);

    public void planEntrega(String destino, String placa){
        MediosTransporte transporte = crearTransporte(placa);
        transporte.entregarMercancia(destino);
    }

}