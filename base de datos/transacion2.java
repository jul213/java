try {
    conn.setAutoCommit(false);

    String query = "insert into actor (first_name, last_name, last_update) values (?,?,?)";

    PreparatedStatement pst1 = conn.PreparatedStatement(query);

    pst1.setString("juan");
    
}