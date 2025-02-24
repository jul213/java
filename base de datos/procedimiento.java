import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

String drv = "com.mysql.cj.jdbc.Driver"; 

try {

class.forName(drv);

String serverAdress = "localhost:3306";
String db = "empresa";
String User = "juan";
String pass = "kilo2345";
String url = "jdbc:mysql://" + serverAdress + "/" + db + "?noAccessToProcedureBodies=true";
conn = DriverManager.getConnection(url, user, pass);
conn.setAutoCommit(true);
System.out.println("conectado a la base de datos")
} catch (classNotFoundException e){
    e.printStackTrace();
} catch (SQLException e){
    System.err.println("conexion fallida");
    e.printStackTrace();
} finally {
    if (conn !== null){
        try{
            conn.close();
        } catch(SQLException e){
            System.out.println("error en el cierre de la conexion de la base de datos")
        }
    }
}