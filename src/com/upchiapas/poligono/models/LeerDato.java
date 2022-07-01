package com.upchiapas.poligono.models;

import javax.swing.*;
import java.util.Scanner;

public class LeerDato {
    public void lectura(){
        Scanner scanner=new Scanner(System.in);
        Punto punto1=new Punto(0,0);
        Operacion proces=new Operacion();
        proces.definirP();
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(null,"_______________"+
                    "\n|----Menu-----|\n"+"|-1_Trasladar-|\n"+"|-2_Escalar---|\n"+"|_____________|");
            opcion = Integer.parseInt(entrada);
            switch (opcion) {
                case 1:
                    entrada=JOptionPane.showInputDialog(null,"Introduzca el valor de x para trasladar");
                    punto1.setX(Float.parseFloat(entrada));
                    entrada =JOptionPane.showInputDialog(null,"Introduzca el valor de y para trasladar");
                    punto1.setY(Float.parseFloat(entrada));
                    proces.trasladar(punto1);
                    break;
                case 2:
                    entrada=JOptionPane.showInputDialog(null,"Introduzca el valor de x para escalar");
                    punto1.setX(Float.parseFloat(entrada));
                    entrada =JOptionPane.showInputDialog(null,"Introduzca el valor de y para escalar");
                    punto1.setY(Float.parseFloat(entrada));
                    proces.escalar(punto1);
                    break;
                default:
                    JOptionPane.showInputDialog(null,"Error, elija de nuevo otra opcion por favor");
                    break;
            }
        }while (opcion!=1&&opcion!=2);
    }
}
