import java.lang.Math;

public class CompraFlota {
    private int Tiempo;
    private double Capital;
    private double Interes;

    public String compararCompra(int pTiempo, double pCapital, double pInteres) {
        double πππ‘ππππ ππππππ = pCapital * pInteres * pTiempo;
        double πππ‘ππππ πΆππππ’ππ π‘π = pCapital * ((Math.pow(1 + pInteres, pTiempo) - 1));
        double respuesta = πππ‘ππππ πΆππππ’ππ π‘π - πππ‘ππππ ππππππ;

        if (pInteres == 0) {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        } else {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interΓ©s Compuesto y evaluarlo a una tasa de interΓ©s Simple, asciende a la cifra de: $"
                    + respuesta;
        }
    }
}
