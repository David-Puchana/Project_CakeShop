/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import model.Insumo;
import utils.ConnectionDB;

import javax.swing.JOptionPane;


/**
 *
 * @author davidpuchana
 */
public class insumoDAO {
    private Connection conn = null;
    
    public ArrayList<Insumo> getAllInsumo(){
        ArrayList<Insumo> insumos = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT * FROM Insumo;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                Insumo insumo = new Insumo(result.getInt(1), result.getString(2), result.getString(3));
                insumos.add( insumo );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return insumos;        
    }
    
}
