package bolt_14;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt_14 {

    public static void main(String[] args) {
        ConversorTemperaturas conv = new ConversorTemperaturas();
        try {
            System.out.println(conv.centigradosAFharenheit(80));
        } catch (TemperaturaErradaExcepcion e1) {
            System.out.println(e1.getMessage());
        }
        try {
            conv.centigradosAReamur(90);
        } catch (TemperaturaErradaExcepcion e2) {
            System.out.println(e2.getMessage());
        }
    }
}
