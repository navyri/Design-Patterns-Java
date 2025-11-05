public class LogisticaTerrestre extends Logistica {

    @Override
    public MediosTransporte crearTransporte(String placa){
        return new Camion(placa);
    }

}
