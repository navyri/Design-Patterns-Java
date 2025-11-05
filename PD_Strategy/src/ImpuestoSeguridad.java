public class ImpuestoSeguridad implements Impuesto {

    // ESTRATEGIA CONCRETA
    @Override
    public double calcularImpuesto(double montoBase){
        return montoBase * 0.1;
    }

}
