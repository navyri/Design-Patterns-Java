public class Camion implements MediosTransporte {

    private String placa;

    public Camion(String placa) {
        this.placa = placa;
    }

    @Override
    public void entregarMercancia(String destino){
        System.out.println("El camion con placa: " + placa + ", esta entregando por tierra a destino: " + destino ) ;
    }
}
