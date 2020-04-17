package DataBaseAccess;

// <editor-fold desc="Imports" defaultstate="collapsed">
import java.awt.Cursor;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

import java.io.IOException;
import java.nio.file.Path;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.lang3.RandomStringUtils;



// </editor-fold>

public class myDBAccess
{
    // <editor-fold desc="Constants" defaultstate="collapsed">    #
    private static final String DB_CONNECTOR = "jdbc:sqlite:";
    private static final String DB_LOCATION = "C:/SQLITE/DB/";
    private static final String DB_Name = "Horodateur.db";
    //private static final String DB_TimeZone = "?useTimezone=true&serverTimezone=UTC";
    

    public static final String DB_URL = DB_CONNECTOR + DB_LOCATION + DB_Name;

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement p_statement = null;
    public static ResultSet r_set = null;
    
    private static final Integer EMPLOYEE_ID_LENGTH = 7;
    
    // </editor-fold>

    
    // Everything Database Related.//
    public static void Create_DB()
    {
        CreateDB(DB_Name);
        CreateTables();
        
        Populate_Department();
        Populate_Admin();
    }
    private static void CreateDB(String fileName)
    {
        String url = DB_CONNECTOR + DB_LOCATION + fileName;

        try
        {
            CreatePath();

            if(!CheckDB_Exist(fileName))
            {
                connection = DriverManager.getConnection(url);

                if (connection != null)
                {
                    DatabaseMetaData meta = connection.getMetaData();

                    System.out.println("The driver name is " + meta.getDriverName());
                    System.out.println("A new database named " + DB_Name + " been created.");
                }
            }
            else
            {
                System.out.println("This database name is already in use.");
            }

        }
        catch (SQLException e)
        {
            printSQLException(e);
        }
    }
    private static void CreateTables()
    { 
        String DEPARTMENTS =
                "CREATE TABLE IF NOT EXISTS DEPARTMENTS (\n"
                        + "    Department_ID   INTEGER CONSTRAINT DEPARTMENT_DEPARTMENT_ID_PK   PRIMARY KEY AUTOINCREMENT ,\n"
                        + "    Department_Name TEXT    CONSTRAINT DEPARTMENT_DEPARTMENT_NAME_NN NOT NULL"
                        + ");";

        String EMPLOYEES =
                "CREATE TABLE IF NOT EXISTS EMPLOYEES (\n"
                        + "    Employee_ID          INTEGER  CONSTRAINT EMPLOYEE_EMPLOYEE_ID_PK          PRIMARY KEY,\n"
                        + "    Employee_FirstName   TEXT     CONSTRAINT EMPLOYEE_EMPLOYEE_FIRST_NAME_NN  NOT NULL ,\n"
                        + "    Employee_LastName    TEXT     CONSTRAINT EMPLOYEE_EMPLOYEE_LAST_NAME_NN   NOT NULL ,\n"
                        + "    Employee_Email       TEXT     CONSTRAINT EMPLOYEE_EMPLOYEE_EMAIL_NN       NOT NULL ,\n"
                        + "    Department_ID        INTEGER  CONSTRAINT EMPLOYEE_DEPARTMENT_ID_FK REFERENCES DEPARTMENTS(Department_ID),\n"
                        + "    Joined_In            DATE     DEFAULT    (DATETIME('NOW','LOCALTIME'))"
                        + ");";

        String PUNCH =
                "CREATE TABLE IF NOT EXISTS PUNCH (\n"
                        + "    EMPLOYEE_ID  INTEGER  UNIQUE NOT NULL,\n"
                        + "    PUNCH_DATE   STRING,\n"
                        + "    PUNCH_IN     STRING,\n"
                        + "    PUNCH_OUT    STRING,\n"
                        + "    DINER_IN     STRING,\n"
                        + "    DINER_OUT    STRING,\n"
                        + "    PAUSE_IN     STRING,\n"
                        + "    PAUSE_OUT    STRING"
                        + ");";
        
        String LOGIN_INFO = 
                        "CREATE TABLE IF NOT EXISTS ADMIN_LOGIN (\n"
                        + "    Admin_ID    STRING   CONSTRAINT LOGIN_INFO_ADMIN_LOGIN_PK PRIMARY KEY,\n"
                        + "    Password    STRING   CONSTRAINT LOGIN_INFO_PASSWORD_NN    NOT NULL"
                        + ");";
                
        try
        {
            OpenDB(DB_URL);

            statement.executeUpdate(DEPARTMENTS);
            statement.executeUpdate(EMPLOYEES);
            statement.executeUpdate(PUNCH);
            statement.executeUpdate(LOGIN_INFO);

            CloseDB();
        }
        catch(SQLException e)
        {
            //System.out.print(e);
            printSQLException(e);
        }
    }
    private static void DropTable(String tableToDrop)
    {
        String SQL = "DROP TABLE IF EXISTS " + tableToDrop;

        try
        {
            OpenDB(DB_URL);

            statement.executeUpdate(SQL);

            System.out.println("Table named " + tableToDrop + " has been fully deleted.");

            CloseDB();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }
    public static void DeleteDB() //Delete the Database.db if not in use, else gives a warning.
    {        
        try
        {
            CloseDB();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        File file = new File("C:/SQLITE/DB/Horodateur.db");

        try
        {  

            if(file.delete())
            {
                Warning_Message("The database has successfully been deleted.");
            }
            else
            {
                Warning_Message("This database cannot be deleted, it might be in use.");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }



    //Open and Close the DB.//
    public static void OpenDB(String inputURL)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
        }
        catch (ClassNotFoundException nfE)
        {
            System.out.println(nfE);
        }
        try
        {
            connection = DriverManager.getConnection(inputURL);
            statement = connection.createStatement();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }
    public static void CloseDB() 
    {
        try
        {
            connection.close();
            statement.close();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }

    
    //Inserts.//
    private static void Insert_Department(String DepartmentName) //Insert new departments in the table, autoincrement*.//
    {
        String SQL_Insert = "INSERT INTO DEPARTMENTS (Department_Name) VALUES (?)";

        try
        {
            OpenDB(DB_URL);

            p_statement = connection.prepareStatement(SQL_Insert);

            p_statement.setString(1, DepartmentName);

            p_statement.executeUpdate();

            p_statement.close();
            CloseDB();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }
    public static void Insert_Employee(String FirstName, String LastName, String Email, Integer DepartmentID) //Add new employee to the employee table, random ID*.//
    {
        String SQL_Insert = "INSERT INTO EMPLOYEES (Employee_ID, Employee_FirstName, Employee_LastName, Employee_Email, Department_ID) VALUES (?,?,?,?,?)";
        
        Integer RandomID = GenerateRandomID();
        
        try
        {
            OpenDB(DB_URL);

            p_statement = connection.prepareStatement(SQL_Insert);

            p_statement.setInt(1, RandomID);
            p_statement.setString(2, FirstName);
            p_statement.setString(3, LastName);
            p_statement.setString(4, Email);
            p_statement.setInt(5, DepartmentID);

            p_statement.executeUpdate();

            p_statement.close();
            CloseDB();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }
    public static void Insert_Admin(String LoginID, String LoginPassword) //Insert admin and password in the Login_Info table. *not hashed.//
    {
        String SQL_Insert = "INSERT INTO ADMIN_LOGIN (Admin_ID, Password) VALUES (?,?)";

        try
        {
            OpenDB(DB_URL);

            p_statement = connection.prepareStatement(SQL_Insert);

            p_statement.setString(1, LoginID);
            p_statement.setString(2, LoginPassword);


            p_statement.executeUpdate();

            p_statement.close();
            CloseDB();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }
    public static void InsertPunchIN(Integer EmployeeID) //Insert for the Punch In - Gives a date.// **CHANGE TO PERSISTED FOR ONCE A DAY?**
    {
        String SQL_Insert = "INSERT INTO PUNCH (EMPLOYEE_ID, PUNCH_DATE) VALUES (?,?)";
        
        if(EmployeeIDCheck(EmployeeID))
        {
            Date sqlDate = NewDate();
            try
            {
                OpenDB(DB_URL);

                p_statement = connection.prepareStatement(SQL_Insert);

                p_statement.setInt(1, EmployeeID);
                p_statement.setString(2, sqlDate.toString());
                
                p_statement.executeUpdate();

                p_statement.close();
                CloseDB();
            }
            catch(SQLException e)
            {
                printSQLException(e);
            }
        }
        else
        {
            Warning_Message("Wrong Employee ID / This Employee ID doesn't exist.");
            return;
        }
    }


    //Updates.//
    public static void UpdatePunch(Integer EmployeeID, String ColumnName) //Update the PUNCH table with the new IN and OUTs.//
    {
        if(EmployeeIDCheck(EmployeeID))
        {
            String SQL_Insert = "UPDATE PUNCH SET "+ ColumnName +" = ?  WHERE EMPLOYEE_ID = ?";

            Time sqlDate = newTime();

            try
            {
                OpenDB(DB_URL);

                p_statement = connection.prepareStatement(SQL_Insert);

                p_statement.setInt(2, EmployeeID);
                p_statement.setString(1, sqlDate.toString());
                
                p_statement.executeUpdate();

                p_statement.close();
                CloseDB();
            }
            catch(SQLException e)
            {
                printSQLException(e);
            }
        }
        else
        {
            Warning_Message("Wrong Employee ID / This Employee ID doesn't exist.");
            return;
        }
    }
    
    
    //Populate.// //Only used for tests, creates a basic admin, a random employee and basic departments.//
    private static void Populate_Department()
    {
        Insert_Department("Deli");
        Insert_Department("Butcher");
        Insert_Department("Dairy");
        Insert_Department("Bakery");
        Insert_Department("Packaged");
        Insert_Department("CheckOut");
    }
    private static void Populate_Admin()
    {
        Insert_Admin("Admin", "Admin");
    }
    
    
    //Booleans.//
    private static Boolean CheckDB_Exist(String newDB_Name) //Check if the Database exists, else creates one.//
    {
        File file = new File(DB_LOCATION + newDB_Name);

        return file.exists();
    }
    public static Boolean LoginCheck(String ID, String Password) //Verify if the username matches the password. Returns 
    {
        String SQL_CHECK = "SELECT * FROM ADMIN_LOGIN WHERE Admin_ID = ? AND Password = ?";

            try
            {
                OpenDB(DB_URL);
                
                p_statement = connection.prepareStatement(SQL_CHECK);
                
                p_statement.setString(1, ID);
                p_statement.setString(2, Password);
                
                
                ResultSet RS = p_statement.executeQuery();
                


                CloseDB();
                
                if(RS.next())
                {
                    System.out.println("ID and Password matches");
                    return true;
                }
            }
            catch(SQLException e)
            {
                printSQLException(e);
            }
            
            System.out.println("No Match");
            return false;
            
    }
    private static Boolean EmployeeIDCheck(Integer ID) //Check if the Employee ID Exists within the Employee table.//
    {
         String SQL_CHECK = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
         
            try
            {
                OpenDB(DB_URL);
                
                p_statement = connection.prepareStatement(SQL_CHECK);
                
                p_statement.setInt(1, ID);
                
                ResultSet RS = p_statement.executeQuery();
                
                
                
                if(RS.next())
                {
                    System.out.println("ID EXISTS");
                    CloseDB();
                    return true;
                }
            }
            catch(SQLException e)
            {
                printSQLException(e);
            }
            
            System.out.println("No Match");
            CloseDB();
            return false;
            
    }
    
    
    //Time and Date.//
    private static Time newTime()
    {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Time sqlDate = new java.sql.Time(javaTime);
        return sqlDate;
    }
    private static Date NewDate()
    {
        java.util.Date javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        return sqlDate;
    }
    
    
    //Warnings.//
    private static void Warning_Message(String Warning_String) //Display warning message.//
    {
        JOptionPane.showMessageDialog(null, Warning_String ,"Warning",JOptionPane.WARNING_MESSAGE);
    }
    
    
    //Prints Exceptions.//
    public static void printSQLException(SQLException ex)
    {

        for (Throwable ThrowEx : ex)
        {
            if (ThrowEx instanceof SQLException)
            {
                if (!ignoreSQLException(((SQLException) ThrowEx).getSQLState()))
                {
                    ThrowEx.printStackTrace(System.err);

                    System.err.println("SQLState: " +((SQLException)ThrowEx).getSQLState());
                    System.err.println("Error Code: " +((SQLException)ThrowEx).getErrorCode());
                    System.err.println("Message: " + ThrowEx.getMessage());

                    Throwable throwable = ex.getCause();

                    while(throwable != null)
                    {
                        System.out.println("Cause: " + throwable);

                        throwable = throwable.getCause();
                    }
                }
            }
        }
    }
    private static Boolean ignoreSQLException(String sqlState)
    {
        if (sqlState == null)
        {
            System.out.println("The SQL state is not defined!");
            return false;
        }

        // X0Y32: Jar file already exists in schema
        if (sqlState.equalsIgnoreCase("X0Y32"))
        {
            return true;
        }

        // 42Y55: Table already exists in schema
        return sqlState.equalsIgnoreCase("42Y55");
    }
    
    
    //Others.//
    private static void CreatePath() //If it doesn't exist already, create a path for the Database.//
    {
        Path path = Paths.get(DB_LOCATION);

        if (!Files.exists(path))
        {
            try
            {
                Files.createDirectories(path);
                System.out.println("The path did not exist prior, it has been created at : " + DB_LOCATION);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Path to the Database already Exists... continuing.");
        }
    }
    private static Integer GenerateRandomID() //For the Employee ID, generate a X *See constants* long number, 
    {
        Integer Employee_ID = Integer.parseInt(RandomStringUtils.randomNumeric(EMPLOYEE_ID_LENGTH));
        
        return Employee_ID;
    }
    
    
    
    public static String ReturnEmail(Integer EmployeeID) //Return the email of the Punching Employee.//
    {
        String SQL_SELECT = "SELECT EMPLOYEE_EMAIL FROM EMPLOYEES WHERE EMPLOYEE_ID =" + EmployeeID+"";
         
        System.out.println(SQL_SELECT);
            try
            {
                OpenDB(DB_URL);
                
                p_statement = connection.prepareStatement(SQL_SELECT);
                
                ResultSet RS = p_statement.executeQuery();
                
                
                
                if(RS.next())
                {
                  String EmployeeEmail = RS.getString("Employee_Email");
                  System.out.println(EmployeeEmail);
                 
                  CloseDB();
                  return EmployeeEmail;
                }
            }
            catch(SQLException e)
            {
                printSQLException(e);
            }
            
            System.out.println("No Match");
            return null;
    }
    
    
    
    public static void FillTable(JTable jtable, String Query)
    {
        try
        {
            OpenDB(DB_URL);
            statement = connection.createStatement();
            
            ResultSet RS = statement.executeQuery(Query);
            
            while(jtable.getRowCount() > 0)
            {
                ((DefaultTableModel) jtable.getModel()).removeRow(0);
            }
            
            int columns = RS.getMetaData().getColumnCount();
            
            System.out.println(columns);
            
            while(RS.next())
            {
                Object[] row = new Object[columns];
                for(int i = 1; i < columns + 1; i++)
                {
                    row[i - 1] = RS.getObject(i);
                }
                ((DefaultTableModel) jtable.getModel()).insertRow(RS.getRow()-1, row);
            }
            
            RS.close();
            CloseDB();
        }
        catch(SQLException e)
        {
            printSQLException(e);
        }
    }
    
}


