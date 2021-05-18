package org.example.db;

public class soutTest {


    public static void main(String[] args) {
        String host = "localhost";
        String port = "5432";
        String user = "postgres";
        String pass = "1234";
        String database = "postgres";
        sout psqlc = new sout(host, port, user, pass, database);
        String prettyConsoleOutput = psqlc.getResults("SELECT *FROM kullanici ");
        System.out.println(prettyConsoleOutput);
    }
}
