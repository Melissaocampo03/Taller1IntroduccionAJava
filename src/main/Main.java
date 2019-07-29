package main;
import entidades.Mensajes;
import entidades.alumnos.Alumnos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args) {

        DecimalFormatSymbols simbolo= new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("##.##",simbolo);

        Alumnos alumno= new Alumnos();

        String notaseguimiento = JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOTA_SEGUIMIENTO.getMensaje());
        String notaparcial = JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOTA_PARCIAL.getMensaje());
        String notaexamen = JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOTA_EXAMEN.getMensaje());

        alumno.setNotaSeguimiento(Double.parseDouble(notaseguimiento));
        alumno.setNotaParcial(Double.parseDouble(notaparcial));
        alumno.setNotaExamen(Double.parseDouble(notaexamen));

        if (alumno.calificacionfinal() >= 4 && alumno.calificacionfinal() <=5){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+formateador.format(alumno.calificacionfinal())+Mensajes.MENSAJE_NOTA_4_A_5.getMensaje());
        }
        else if (alumno.calificacionfinal() >= 3 && alumno.calificacionfinal() <=3.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+formateador.format(alumno.calificacionfinal())+Mensajes.MENSAJE_NOTA_3_A_39.getMensaje());
        }
        else if (alumno.calificacionfinal() >= 2 && alumno.calificacionfinal() <=2.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+formateador.format(alumno.calificacionfinal())+Mensajes.MENSAJE_NOTA_2_A_29.getMensaje());
        }
        else if (alumno.calificacionfinal() >= 1 && alumno.calificacionfinal() <=1.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+formateador.format(alumno.calificacionfinal())+Mensajes.MENSAJE_NOTA_1_A_19.getMensaje());
        }
       else if (alumno.calificacionfinal() >= 0 && alumno.calificacionfinal() <=0.9){
            JOptionPane.showMessageDialog(null,Mensajes.MENSAJE_FINAL.getMensaje()+formateador.format(alumno.calificacionfinal())+Mensajes.MENSAJE_NOTA_0_A_09.getMensaje());
        }


    }
}
