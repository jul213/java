conn.setAutoCommit(false);

String query = "insert into actor (first_name, last_name, last_updates) values()";
PreparedStatement ps = conn.PreparedStatement(query);
ps.setString(1,"luis");
ps.setString(2, "oscar");
ps.setDate(3, new Date(new java.util.Date().getTime());


int result = ps.executeUpdate();

Statement t2 = conn.createStatement();

int result2 = t2.executeUpdate("delete from actor where actor_id = 5");

conn.commit();

