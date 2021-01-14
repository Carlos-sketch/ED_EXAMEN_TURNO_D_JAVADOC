import java.util.*;

/*
* Ej práctico examen EVAL 1 ED
* 
* @author CARLOS SERRA DNI 33470512S
* @version 1.0
*/

public class AnalistaED_33470512S {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /* @param AnalistaED_33470512S
        @param CARLOS SERRA
        @param 33470512S
    */

    public AnalistaED_33470512S(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /* Calcula el salario bruto mensual en función del salario base por hora y las horas extras.
        El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
        
        @param horasExtra número de horas extra dedicadas redondeado a la baja (entero)
        @return devuelve el salario bruto mensual en euros con dos decimales
    */

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA        
        AnalistaED_33470512S emp = new AnalistaED_33470512S("CARLOS SERRA", "33470512-S");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto 
		+ " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }

}
