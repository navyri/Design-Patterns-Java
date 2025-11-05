public class LogisticaMaritima extends Logistica {

    @Override
    public MediosTransporte crearTransporte(String placa){
        return new Barco(placa);
    }

}
