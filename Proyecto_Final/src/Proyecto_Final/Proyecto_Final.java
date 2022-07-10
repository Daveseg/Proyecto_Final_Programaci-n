/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_Final;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Proyecto_Final {

    /**
     * @param args the command line arguments
     */
    public static void Informacion_General(){
        JOptionPane.showMessageDialog(null, "Bienvenido(a) a Battle Ship.\n\n"
                + "Para jugar tome en cuenta la "
                + "siguiente información:\n"
                + "- Jugará contra la CPU\n"
                + "- Podrá colocar 6 distintas naves en las cuales esta "
                + "distribuido de la siguiente forma:\n"
                + "\t1 Nave Almirate con 4 puntos de vida\n"
                + "\t2 Nave Capitán con 3 puntos de vida\n"
                + "\t3 Nave Teniente con 1 punto de vida\n");
    }
    
    public static void Menu_Si_No(){
        int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("¿Desea "
                + "iniciar el juego?\n"
                + "1. Si\n"
                + "2. No\n"));
        
        if (opcion_menu == 2){
            JOptionPane.showMessageDialog(null, "A continuación saldrá del "
                    + "juego. \n Le esperamos pronto.");
            System.exit(opcion_menu);
        }
    }
    
    public static int Menu_Principal(){
        int opcion_menu = Integer.parseInt(JOptionPane.showInputDialog("Por"
                + " favor seleccione una de las siguientes opciones:\n\n"
                + "\t - 1. Atacar\n"
                + "\t - 2. Ver tablero de ataque\n"
                + "\t - 3. Ver tablero propio\n"
                + "\t - 4. Hacer trampa\n"));
        
        return opcion_menu;
    }
    
    public static void main(String[] args) {
        int invalid_counter = 0;
        
        Informacion_General();
        
        Menu_Si_No();
              
        String player_1 = JOptionPane.showInputDialog("Por favor indique el "
                + "nombre del jugador:");
        
        String player_CPU = JOptionPane.showInputDialog("Por favor indique el "
                + "nombre para el jugador CPU:");
        
        int opcion_menu = Menu_Principal();
        
        while (opcion_menu != 1 && opcion_menu != 2 && opcion_menu != 3 && 
                opcion_menu != 4){
            if (invalid_counter == 2){
                JOptionPane.showMessageDialog(null, "Ha ingresado una "
                        + "opción inválida en 3 ocasiones.\n "
                        + "A continuación saldrá del sistema.");
                System.exit(opcion_menu);
            }
            else{
                JOptionPane.showMessageDialog(null, "Ha ingresado una opción "
                        + "inválida.\n"
                        + "Por favor intente nuevamente.");
                invalid_counter += 1;
                opcion_menu = Menu_Principal();
            }
        }
        System.out.println(opcion_menu);
    } 
}