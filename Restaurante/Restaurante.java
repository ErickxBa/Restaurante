public class Restaurante {

    public String venderAlmuerzo(Almuerzo almuerzo, Cliente cliente) {
        String recibo =
                "****************FACTURA*****************\n" + cliente + ": " + almuerzo + "\t";
        recibo += String.format("%.2f", almuerzo.obtenerCobro(cliente));
        return recibo;
    }
}
