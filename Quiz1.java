/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Indique la cantidad de empleados:");
        int oo = Integer.parseInt(valor);

        double montoFinal = 0.0;

        for (int i = 1; i <= oo; i++) {
            String salario1 = JOptionPane.showInputDialog("Idique el salario del Trabajador " + i + ":");
            double salario2 = Double.parseDouble(salario1);

            double enfermedad_maternidad = salario2 * 0.0925;
            double invalidez_vejez_muerte = salario2 * 0.0508;

            montoFinal += enfermedad_maternidad + invalidez_vejez_muerte;
        }

        JOptionPane.showMessageDialog(null, "La empresa deberá pagar a la CCSS el monto de ₡" +montoFinal+ " por concepto de Seguro de Enfermedad y Maternidad y Invalidez Vejez Muerte.");
    }
    
}
