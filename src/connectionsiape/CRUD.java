/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionsiape;
import java.sql.*;
/**
 *
 * @author Jimmyto
 */
public class CRUD {
    public void insertarDato(int id, String Tipo, String Descripcion){
        String query = "INSERT INTO tipos_usuarios(id, Tipo, Descripcion) values (?,?,?)";
        try{
            Connection con=dbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, Tipo);
            ps.setString(3, Descripcion);
            
            ps.executeUpdate();
            System.out.println("Dato insertado con exito");
            
        }catch(SQLException ex){
            System.out.println("Error al insertar dato");
            ex.printStackTrace();
        }
    }
    
    public void leerDatos(){
        String query = "SELECT * FROM tipos_usuarios";
        try{
            Connection con=dbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                int id=rs.getInt("id");
                String tipo = rs.getNString("Tipo");
                String descripcion = rs.getNString("Descripcion");
                System.out.println("ID: "+id+", Tipo: "+tipo+" ,Descripcion: "+descripcion);
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar dato");
            ex.printStackTrace();
        }
    }
    public void actualizarDato (int id, String tipo, String descripcion){
        String query = "UPDATE tipos_usuarios SET Tipo=?, Descripcion=? WHERE Tipo=?";
        try{
            Connection con=dbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, tipo);
            ps.setString(3, descripcion);
            
            ps.executeUpdate();
            System.out.println("Dato actualizado con exito");
            
        }catch(SQLException ex){
            System.out.println("Error al actualizar dato");
            ex.printStackTrace();
        }
    }
    
    public void eliminarDato (int id){
        String query = "DELETE FROM tipos_usuarios WHERE id=?";
        try{
            Connection con=dbConnection.conectar();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            System.out.println("Dato eliminado con exito");
            
        }catch(SQLException ex){
            System.out.println("Error al eliminar dato");
            ex.printStackTrace();
        }
    }
}
