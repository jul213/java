String drv = "com.mysql.cj.jdbc.Driver"; 
class.forName(drv);

String serverAdress = "localhost:3306";
String db = "empresa";
String User = "juan";
String pass = "kilo2345";
String url = "jdbc:mysql://" + serverAdress + "/" + db + "?noAccessToProcedureBodies=true";
conn = DriverManager.getConnection(url, user, pass);
conn.setAutoCommit(true);
System.out.println("conectado a la base de datos")