/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ClasePersona;
import Modelo.GestionesPersonas;



/**
 *
 * @author USER
 */
public class Controlador {
     public void listarPerosnas() {
            try {
                  String msm = "";
            ClasePersona[] producto = new ClasePersona[5];
            producto = GestionesPersonas.listarPersonas();
            if (producto != null) {
                String lista = "";
               for (int i = 0; i < producto.length; i++) {
                    if (producto[i] != null) {
                        lista = lista + "id:" + producto[i].getedad() + "\n"
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            lista.mostrarDatos(msm);
            } catch (Exception e) {
                System.out.println("Error Controlador-ListaPersonas");
            }

          
        }
   
    }


    
    

