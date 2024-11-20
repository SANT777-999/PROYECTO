package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new ReporteConcreteBuilder());

        Reporte reporteVentas = director.crearReporte();
        System.out.println(reporteVentas);

        director.setBuilder(new BoletinBuilder());
        Boletin boletin = director.crearBoletin();
        System.out.println(boletin);
    }
}


