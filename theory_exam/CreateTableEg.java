import java.sql.*;
public class CreateTableEg
{ 
    public static void main(String args[]) throws ClassNotFoundException
{
try {
// Register JDBC driver
Class.forName("com.mysql.jdbc.Driver");
//Open a connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC" , "root","root123");


Statement st=con.createStatement();

st.executeUpdate("CREATE TABLE Student (rollno int, name varchar(15))");
System.out.println("Table created");
con.close(); //Close the connection
}
catch(SQLException e)
 { System.out.println("Error is " +e); }
}
}