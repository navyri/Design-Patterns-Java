public class SinDescuento implements TipoDescuento {

    @Override
    public double aplicarDescuento (double montoBase) {
        System.out.println("Sin descuento aplicable");
        return 0;
    }

}
