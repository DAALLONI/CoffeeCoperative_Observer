public class MicroLote {

    private String varietal;
    private String notasCata;
    private String lugarOrigen;
    private int alturaCultivo;
    private String productor;
    private double cantidadLibras;

    public MicroLote(
            String varietal,
            String notasCata,
            String lugarOrigen,
            int alturaCultivo,
            String productor,
            double cantidadLibras) {

        this.varietal = varietal;
        this.notasCata = notasCata;
        this.lugarOrigen = lugarOrigen;
        this.alturaCultivo = alturaCultivo;
        this.productor = productor;
        this.cantidadLibras = cantidadLibras;
    }

    public String getVarietal() {
        return varietal;
    }

    public String getNotasCata() {
        return notasCata;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public int getAlturaCultivo() {
        return alturaCultivo;
    }

    public String getProductor() {
        return productor;
    }

    public double getCantidadLibras() {
        return cantidadLibras;
    }
}