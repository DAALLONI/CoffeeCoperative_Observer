public class Main {

    public static void main(String[] args) {

        // Crear la cooperativa
        CooperativaCafe cooperativa =
                new CooperativaCafe();

        // Crear baristas
        Barista barista1 =
                new Barista("Carlos", "001");

        Barista barista2 =
                new Barista("Laura", "002");

        Barista barista3 =
                new Barista("Andrés", "003");

        // Suscribir baristas
        cooperativa.registerObserver(barista1);
        cooperativa.registerObserver(barista2);
        cooperativa.registerObserver(barista3);

        // Crear un nuevo microlote
        MicroLote lote1 =
                new MicroLote(
                        "Bourbon Rosado",
                        "Frutos rojos, mora, cereza, "
                        + "caramelo, acidez media alta "
                        + "y residual prolongado a cacao",
                        "Acevedo, Huila",
                        1250,
                        "Juan Pérez",
                        45);

        // Registrar el lote
        cooperativa.registrarLote(lote1);

        // Eliminar una suscripción
        cooperativa.removeObserver(barista2);

        System.out.println(
                "===== NUEVO LOTE =====");

        // Crear otro lote
        MicroLote lote2 =
                new MicroLote(
                        "Geisha",
                        "Jazmín, durazno, miel y cítricos",
                        "Génova, Quindío",
                        1800,
                        "María Rodríguez",
                        30);

        // Registrar segundo lote
        cooperativa.registrarLote(lote2);
    }
}