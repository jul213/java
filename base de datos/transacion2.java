import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparatedStatement;
import java.sql.ResultSet;
import java.sql.Connection;


Connection conn = null;
Statement st2 = null;
ResultSet rs2 = null;


try {
    conn.setAutoCommit(false);

    String query = "insert into actor (first_name, last_name, last_update) values (?,?,?)";

    PreparatedStatement pst1 = conn.PreparatedStatement(query);

    pst1.setString(1,"juan");
    pst1.setString(2, "perez");
    pst1.setDate(3, new Date(new java.util.Date().getTime()));

    int result1 = pst1.executeUpdate();


    Statement st2 = conn.createStatement();

    ResultSet rs2 = st2.executeQuery("select * from actor where first_name = 'juan' ");

    while (rs2.next()){

        int id = rs2.getInt("actor_id");
        String firstName = rs2.getString("first_name");
        String lastName = rs2.getString("last_name");
        Date lastUpdate = rs2.getDate("last_update");
    }

    System.out.println("Actor: ");
    System.out.println("id: " + id);
    System.out.println("Name: " + firstName);
    System.out.println("last name: " + lastName);
    System.out.println("last Update: " + lastUpdate.toString());


    conn.commit();
} catch (SQLException e){
    e.printStackTrace();

    try {

        if (conn !== null){
            conn.rollback();
        } 
    } catch (SQLException rollbackEx){
        rollbackEx.printStackTrace();
    }
} finally {
    st2.close();
    rs2.close();
    conn.close();
}