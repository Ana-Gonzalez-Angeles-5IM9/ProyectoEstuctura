package mx.edu.ipn.cecyt9.centaursoft.utlis;

import java.sql.*;

public class Conexion{
    String url = "jdbc:mysql://localhost/BanApp";
    String usr = "root";
    String pass = "n0m3l0";
    private static Connection conexion = null;
    private Statement sta = null;
    private ResultSet rset = null;
    
    public int Conecta (String usuario, String contra){
        int tipo = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usr, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.toString());
        }
        try{
            sta = conexion.createStatement();
            rset = sta.executeQuery("select * from Usuario where user = '" + usuario + "' and password = '" + contra + "'");
            if(rset.next()){
                tipo = rset.getInt("tipo");
            }
            else{
                tipo = 0;
            }
        } 
        catch (SQLException e){
            System.out.println("Error: " + e.toString());
        }
        return tipo;
    }
    public static void cerrar() throws SQLException {
      if (conexion != null) {
         conexion.close();
      }
    }
}
