String drv = "com.mysql.jdbc.Driver"; 
class.forName(drv);

String serverAdress = "localhost:3306";
String db = "empresa";
String User = "juan";
String pass = "kilo2345";
String url = "jdbc:mysql://" + serverAdress + "/" + db + "?noAccessToProcedureBodies=true";
conn = DriverManager.getConnection(url, user, pass);
conn.setAutoCommit(true);