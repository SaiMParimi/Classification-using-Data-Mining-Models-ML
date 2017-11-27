import java.io.*;
import java.sql.*;
import java.math.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class gui2 extends Frame implements ActionListener
{
private java.sql.Connection con = null;
  private final String url = "jdbc:sqlserver://";
  private final String serverName = "Infopoint104";
  private final String userName = "sa";
  private final String password = "MyPassword";
  // Informs the driver to use server a side-cursor,
  // which permits more than one active statement
  // on a connection.
  private final String selectMethod = "cursor";
  private static String strSql;
  private static Statement stmtSQL;
  private String strdata;
//=============================||||||||FRAME||||||||=============================
Frame f;
	Label l1, l2,l3,l4,l5,l6,l7,l8;
	TextField t1, t2,t3,t4,t5,t6,t7,t8;
	Button  b1,b2,b3,b4, b5;
gui2()
{

		try{
		
		
			
			f=new Frame();
			f.setLayout(null);
			f.setVisible(true);
			//f.setBackground( Color.yellow);
			f.setSize(980, 980);
			l1=new Label("First Name");
			l1.setBounds(60, 92, 130, 50);
		    l1.setFont(new Font("Centuary", Font.BOLD, 20));
			l1.setForeground(Color.blue);
			f.add(l1);
			l2=new Label("M.I.");
			l2.setBounds(400, 92, 50, 50);
			l2.setFont(new Font("Centuary", Font.BOLD, 20));
			l2.setForeground(Color.blue);
			f.add(l2);
			l3=new Label("Last Name");
			l3.setBounds(620, 92, 130, 50);
			l3.setFont(new Font("Centuary", Font.BOLD, 20));
			l3.setForeground(Color.blue);
			f.add(l3);
			l4=new Label("SSN");
			l4.setBounds(60, 242, 100, 50);
			l4.setFont(new Font("Centuary", Font.BOLD, 20));
			l4.setForeground(Color.blue);
			f.add(l4);
			l5=new Label("Address");
			l5.setBounds(60, 292, 100, 50);
			l5.setFont(new Font("Centuary", Font.BOLD, 20));
			l5.setForeground(Color.blue);
			f.add(l5);
		    l6=new Label("Sex");
			l6.setFont(new Font("Centuary", Font.BOLD, 20));
			l6.setForeground(Color.blue);
			l6.setBounds(60, 342, 100, 50);
			f.add(l6);
			l7=new Label("Salary");
			l7.setFont(new Font("Centuary", Font.BOLD, 20));
			l7.setForeground(Color.blue);
			l7.setBounds(60, 392, 100, 50);
			f.add(l7);
			l8=new Label("Department");
			l8.setFont(new Font("Centuary", Font.BOLD, 20));
			l8.setForeground(Color.blue);
			l8.setBounds(60, 442, 120, 50);
			f.add(l8);
			
			
			
			
			t1=new TextField();
			t1.setBounds(190, 100, 100, 30);
			t1.setFont(new Font("Centuary", Font.BOLD, 20));
		    t1.setForeground(Color.green);
			f.add(t1);
			t2=new TextField();
			t2.setBounds(460, 100, 90, 30);
			t2.setFont(new Font("Centuary", Font.BOLD, 20));
		    t2.setForeground(Color.green);
			f.add(t2);
			t3=new TextField();
			t3.setBounds(760, 100, 100, 30);
			t3.setFont(new Font("Centuary", Font.BOLD, 20));
		    t3.setForeground(Color.green);
			f.add(t3);
			t4=new TextField();
			t4.setBounds(190, 250, 100, 30);
			t4.setFont(new Font("Centuary", Font.BOLD, 20));
		    t4.setForeground(Color.green);
			f.add(t4);
			t5=new TextField();
			t5.setBounds(190, 300, 100, 30);
			t5.setFont(new Font("Centuary", Font.BOLD, 20));
		    t5.setForeground(Color.green);
			f.add(t5);
			t6=new TextField();
			t6.setBounds(190, 400, 100, 30);
			t6.setFont(new Font("Centuary", Font.BOLD, 20));
		    t6.setForeground(Color.red);
			f.add(t6);
           
			
			b4= new Button("CLOSE");
			b4.setBounds(250, 600, 75, 40);
			b4.setBackground( Color.orange);
			b4.setFont(new Font("Centuary", Font.BOLD, 20));
		    b4.setForeground(Color.blue);
			f.add(b4);
			b4.addActionListener(this);
			
			
			
			//b5= new Button("EXECUTE");
			b5= new Button("SEARCH");
			b5.setBounds(100, 600, 100, 40);
			b5.setBackground( Color.orange);
			b5.setFont(new Font("Centuary", Font.BOLD, 20));
		    b5.setForeground(Color.blue);
			f.add(b5);
			b5.addActionListener(this);
			
		
			}catch(Exception e){}
		
		
		}//ends Constructor
public void actionPerformed(ActionEvent ae){

		try{
			int i=1;
			//System.out.print("SNo.\t"+"ID\t"+"NAME\t\t"+"REGNO\t\t"+"TENTH\t"+"TWELTH\n");
			if(ae.getSource()==b4){
				
				
				//c.close();
				f.dispose();
				
		
				}
			
			
			
			   else if(ae.getSource()==b5){
			   
			      double Person_id=0;
                 
			          String fn=t1.getText();
			        System.out.print("\n");
					  // System.out.print(i++ +"\t");
					System.out.print(fn+"\t ");
				      String mi=t2.getText();
					System.out.print(mi+"\t   " );	
					  String ln=t3.getText();
					System.out.print(ln+"\t      ");
					  Person_id=Double.parseDouble(t4.getText());
					  System.out.print(Person_id+"\t");
					//System.out.print(tenth1+"\t ");
					//  twelth1=Double.parseDouble(t5.getText());
					//System.out.print(twelth1+"\t ");

		//}//end else if
		
		//-----------------------------------------------------------------------------------------------------
		/*try
{
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      System.out.println(getConnectionUrl());
      // Use a static method of DriverManager to get a connectio to the
      // database.
      con = java.sql.DriverManager.getConnection(getConnectionUrl());
      if (con != null)
        {
        System.out.println("Connection Successful!");
        }
      } catch (Exception e)
      {
      e.printStackTrace();
      System.out.println("Error Trace in getConnection() : " + e.getMessage());
      }
/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection connect = DriverManager.getConnection("jdbc:odbc:tester");

Statement sest = connect.createStatement();

float counter1=0,counter2=0, counttngps=0;*/

/*ResultSet rs0 = sest.executeQuery("SELECT * FROM studyaft ");
while(rs0.next())
{
int gp1=rs0.getInt("grp");
if(gp1==1)
{ 
counter1++;//no. of students in grp1
}//end of if1
}// end of while1
System.out.println("Total no. of students in grp1: \t"+counter1);

		}//end of try
catch(Exception e) 
{System.out.println(e);}*/

			}//end else if
		}//end of try
		catch(Exception e){}
		}// action performed end
		private String getConnectionUrl()
    {
//???          return "jdbc:sqlserver://localhost:1433;instanceName=Infopoint104;databaseName=Company;integratedSecurity=true";
   // return "driver=SQLServerDriver; server=MONICA-PC\\SQLEXPRESS; database=company; Trusted_Connection=yes; integratedSecurity=true;";
	return "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=company;integratedSecurity=true;";
    }

  // Return a connection to a database, or null if one cannot be found.
  private java.sql.Connection getConnection()
    {
    try
      {
      // Load the driver. This is specific to Microsoft SQL Server.
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      System.out.println(getConnectionUrl());
      // Use a static method of DriverManager to get a connectio to the
      // database.
      con = java.sql.DriverManager.getConnection(getConnectionUrl());
      if (con != null)
        {
        System.out.println("Connection Successful!");
        }
      } catch (Exception e)
      {
      e.printStackTrace();
      System.out.println("Error Trace in getConnection() : " + e.getMessage());
      }
    return con;
    }
	
	
	\\-------------------------------------------------------------------------------------------==============================
	 public void displayDbProperties()
    {
    java.sql.DatabaseMetaData dm = null;
    java.sql.ResultSet rs = null;
    try
      {
      con = this.getConnection();
      if (con != null)
        {
        dm = con.getMetaData();
        System.out.println("Driver Information");
        System.out.println("\tDriver Name: " + dm.getDriverName());
        System.out.println("\tDriver Version: " + dm.getDriverVersion());
        System.out.println("\nDatabase Information ");
        System.out.println("\tDatabase Name: " + dm.getDatabaseProductName());
        System.out.println("\tDatabase Version: " + dm.getDatabaseProductVersion());
        System.out.println("Avalilable Catalogs ");
        rs = dm.getCatalogs();
        // Show all databases within the connection.
        while (rs.next())
          {
          System.out.println("\tcatalog: " + rs.getString(1));
          }
        rs.close();
        rs = null;

        // Create a SQL statement object and run a query against it to return
        // all employees in last name order.
        stmtSQL = con.createStatement();
        ResultSet rs1 = stmtSQL.executeQuery("SELECT * FROM Employee order by lname");

        // Read all records in the result set and show info.
        while (rs1.next())
          {
          strdata = rs1.getString("fname") + " " + rs1.getString("lname") + " "
                  + rs1.getInt("dno");
          System.out.println(strdata);
          }

        closeConnection();
        } else
        {
        System.out.println("Error: No active Connection");
        }
      } catch (Exception e)
      {
      e.printStackTrace();
      }
    dm = null;
    }
	\\-------------------------------------------------------------------------------------------==============================
	
	 private void closeConnection()
    {
    try
      {
      if (con != null)
        {
        con.close();
        }
      con = null;
      }
    catch (Exception e)
      {
      e.printStackTrace();
      }
    }
		
		public static void main(String[] args) 
{
gui2 g2=new gui2();
g2.displayDbProperties();
}//end of public
		
		}//end class