public class Barco implements MediosTransporte {

    private String placa;

    public Barco(String placa) {
        this.placa = placa;
    }

    @Override
    public void entregarMercancia(String destino){
        System.out.println("El barco con placa: " + placa + ", esta entregando por mar a destino: " + destino ) ;
    }

}
