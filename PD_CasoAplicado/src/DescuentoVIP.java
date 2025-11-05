public class DescuentoVIP implements TipoDescuento {

    @Override
    public double aplicarDescuento (double montoBase) {
        System.out.println("Aplicando descuento VIP");
        return montoBase * 0.15;
    }

}
