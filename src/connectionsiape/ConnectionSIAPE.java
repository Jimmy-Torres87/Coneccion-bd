/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectionsiape;

/**
 *
 * @author Jimmyto
 */

public class ConnectionSIAPE {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dbConnection dbc = new dbConnection();
        //dbc.conectar();
        
        CRUD operaciones = new CRUD();
        //operaciones.insertarDato(2, "Instructor", "Permisos entrenamiento de perros");
        operaciones.leerDatos();
        //operaciones.actualizarDato(2, "Medico Veterinario", "Permisos veterinarios ejemplares caninos");
        //operaciones.eliminarDato(1);
    }
    
}
