package bolt_14;

public class ConversorTemperaturas {

    private final float temp = 80;

    public float centigradosAFharenheit(float grados) throws TemperaturaErradaExcepcion {
        if (grados < temp) {
            throw new TemperaturaErradaExcepcion("A temperatura en grados centigrados non pode ser menor que 80ºC");
        }
        float Fharenheit = (9f / 5f * grados + 32.4f);
        System.out.println(Fharenheit);
        return Fharenheit;
    }

    public void centigradosAReamur(float grados) throws TemperaturaErradaExcepcion {
        if (grados < temp) {
            throw new TemperaturaErradaExcepcion("A temperatura en grados centigrados non pode ser menor que 80ºC");
        }
        float Reamur = (4f / 5f * grados);
        System.out.println(Reamur);
    }
}
