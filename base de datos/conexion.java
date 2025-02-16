import java.sql.*

public class Main{

    public static void main(string args[]){

        Connection c = null;
        Statement stmt = null;

        try{
            class.forName("org.postgresql.driver");

            c = DriverManager
            .getConnection("jdbc:postgresql://asa:2336/pokemon");
            c.setAutoCommit(false);
            System.out.println("base de datos abierto");

            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery(
                "select  * from pokemon;"
            );

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("el ID es: " + id);
                System.out.println("el nombre es: " + nombre);
            }

            rs.close();
            stmt.close();
            c.close();
        } catch(Exception e){
            System.err.println(
                e.getClass().getName() + ": " + e.getMessage()
            );
            System.exit(0);
        }
        System.out.println("operacion exitosa");
    }
}