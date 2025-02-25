try {
    conn.setAutoCommit(false);

    String query = "insert into actor (first_name, last_name, last_update) values (?,?,?)";

    PreparatedStatement pst1 = conn.PreparatedStatement(query);

    pst1.setString(1,"juan");
    pst1.setString(2, "perez");
    pst1.setDate(3, new Date(new java.util.Date().getTime()));
}