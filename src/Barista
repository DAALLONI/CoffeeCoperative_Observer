public class Barista implements Observer {

    private String nombre;
    private String identificacion;

    public Barista(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    @Override
    public void update(MicroLote lote) {

        System.out.println("================================");
        System.out.println("Nueva disponibilidad de café");
        System.out.println("================================");

        System.out.println("Barista: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Varietal: " + lote.getVarietal());
        System.out.println("Notas de cata: " + lote.getNotasCata());
        System.out.println("Origen: " + lote.getLugarOrigen());
        System.out.println("Altura: " + lote.getAlturaCultivo() + " msnm");
        System.out.println("Productor: " + lote.getProductor());
        System.out.println("Cantidad disponible: "
                + lote.getCantidadLibras() + " libras");

        System.out.println();
    }
}