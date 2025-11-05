public class ProcesarOrden {

    // ATRIBUTO
    private TipoDescuento tipoDescuento;

    // SETTER
    public void setTipoDescuento(TipoDescuento tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    // CONSTRUCTOR
    public ProcesarOrden(TipoDescuento tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public double procesar (double montoBase) {
        double procesarDescuento = tipoDescuento.aplicarDescuento(montoBase);
        double precioFinal = montoBase - procesarDescuento;
        System.out.println("- Monto: " + montoBase);
        System.out.println("- Descuento: " + procesarDescuento);
        System.out.println("- Precio Final: " + precioFinal);
        return precioFinal;
    }
}
