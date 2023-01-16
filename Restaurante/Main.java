public class Main {
    public static void main(String[] args) {
        //El restaurante politécnico ofrece dos tipos de almuerzos: estudiantil y ejecutivo
        // Cada uno con precios distintos. El almuerzo estudiantil tiene un precio distinto
        // si el solicitante es un estudiante. El almuerzo puede incluir sopa o no
        Restaurante restaurante = new Restaurante();
        String recibo =
                restaurante.venderAlmuerzo(new AlmuerzoEstudiantil(false), new Estudiante("Henry"));
        String recibo2 =
                restaurante.venderAlmuerzo(new AlmuerzoEstudiantil(false), new ClienteRegular("Carlos"));
        String recibo3 =
                restaurante.venderAlmuerzo(new AlmuerzoEjecutivo(true), new ClienteRegular("Sebastian"));
        String recibo4 =
                restaurante.venderAlmuerzo(new AlmuerzoEjecutivo(false), new Estudiante("Miguel"));

        System.out.println(recibo);
        System.out.println(recibo2);
        System.out.println(recibo3);
        System.out.println(recibo4);
    }
}