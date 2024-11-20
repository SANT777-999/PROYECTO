package Builder;

public class Director {
    private ReporteBuilder builder;

    public Director(ReporteBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ReporteBuilder builder) {
        this.builder = builder;
    }

    public Reporte crearReporte() {
        return builder
                .setTitulo("REPORTE")
                .setFecha("2024-11-19")
                .setAutor("Software")
                .setTipo("Reporte")
                .setContenido("Esto es un reporte")
                .agregarGrafico("Tipo", "Informacion")
                .agregarGrafico("Tipo", "Informacion")
                .build();
    }

    public Boletin crearBoletin() {
        if (builder instanceof BoletinBuilder) {
            return (Boletin) ((BoletinBuilder) builder)
                    .setTitulo("BOLETIN")
                    .setFecha("2024-11-19")
                    .setAutor("Software")
                    .setTipo("Boletin")
                    .setContenido("Esto es un boletin")
                    .agregarGrafico("Tipo", "Informacion")
                    .build();
        }
        throw new IllegalArgumentException("Builder no compatible con Boletin");
    }
}
