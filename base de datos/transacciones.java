conn.setAutoCommit(false);

String query = "insert into actor (first_name, last_name, last_updates) values()";
PreparedStatement ps = conn.PreparedStatement(query);