public class DescuentoPorVolumen implements TipoDescuento {

    private static final double montoMinimo = 500.00;

    @Override
    public double aplicarDescuento (double montoBase) {
        if(montoBase >= montoMinimo) {
            System.out.println("Aplicando descuento por compras mayores a $500.00");
            return montoBase * 0.1;
        } else {
            System.out.println("Cantidad no suficiente para aplicar descuento");
            return 0;
        }
    }

}
