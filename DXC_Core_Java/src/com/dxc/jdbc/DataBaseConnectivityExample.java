package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

//Establish the Connection with DataBase
//1. Create Connection
//2. Establish Connection
//3. Perform Transactions (create,update,delete,read) we use classes like Statement,PreparedStatement,ResultSet etc

public class DataBaseConnectivityExample {

	public static void main(String[] args) throws Exception {

		// Step 1
		Class.forName("com.mysql.jdbc.Driver");
		// Step 2
		// "jdbc:mysql://localhost:3306/contactdb" , "root", "root"
		// 1. jdbc: defines JDBC type Bridge Connection Driver
		// 2. mysql: defines the database which we are using i.e MYSQL
		// 3. localhost:3306: defines the IP of system where MYSQL is installed
		// and 3306 defines its default port
		// 4. contactdb: it tells the name of the databse used in MYSQL Database
		// 5. "root": First root defines database username
		// 6. "root": Second root defines database password
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root", "root");

		// Step 3

		/**********************  Inserting Into DataBase  ***************************/
		/*PreparedStatement stmtInsert = con.prepareStatement("insert into contact values(?,?,?,?,?)");
		stmtInsert.setInt(1, 3);
		stmtInsert.setString(2, "Virender Sehwag");
		stmtInsert.setString(3, "viru@gmail.com");
		stmtInsert.setString(4, "New Delhi");
		stmtInsert.setString(5, "3214569874");

		System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");*/
		
		
		
		/**********************  Updating Existing Row in DataBase  ***************************/
		/*PreparedStatement stmtUpdate = con.prepareStatement("update contact set name=? where contact_id=?");
		stmtUpdate.setString(1, "Viru Sehwag"); // 1 specifies the first parameter in the query i.e name
		stmtUpdate.setInt(2, 3); // 2 specifies the second parameter in the query i.e contact_id
		
		System.out.println(stmtUpdate.executeUpdate() + " No of Records Updated");*/

		
		/**********************  Deleting Data from DataBase  ***************************/
		/*PreparedStatement stmtDelete = con.prepareStatement("delete from contact where contact_id=?");
		stmtDelete.setInt(1, 3); // 1 specifies the second parameter in the query i.e contact_id
		
		System.out.println(stmtDelete.executeUpdate() + " No of Records Deleted");*/
		
		
		
		/**********************  Selecting/Reading Data from DataBase  ***************************/
		/*Statement stmt = con.createStatement(); // Statement interface used for Creating SQL Query to be executed
		ResultSet rs = stmt.executeQuery("select * from contact");
		while (rs.next())
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4)
					+ ", " + rs.getString(5));*/
		
		
		/************************** Implementing ResultSetMetaData Interface  ****************************/
		// It means Data about Data i.e from our data we can get information about complete Table
		/*ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Total Columns in Table "+rsmd.getColumnCount());
		System.out.println("First Column Name is "+rsmd.getColumnName(1));
		System.out.println("First Column Type is "+rsmd.getColumnTypeName(1));*/
		
		
		/************************** Implementing DataBaseMetaData Interface  ****************************/
		// It means Data about Data i.e from our data we can get information about complete DataBase
		/*DatabaseMetaData dbmd = con.getMetaData();
		System.out.println("Driver Name "+dbmd.getDriverName());
		System.out.println("Driver Version "+dbmd.getDriverVersion());
		System.out.println("User Name "+dbmd.getUserName());
		System.out.println("Database Product Name "+dbmd.getDatabaseProductName());
		System.out.println("Database Product Version "+dbmd.getDatabaseProductVersion());*/
		
		
		/**********************  Inserting Image Into DataBase  ***************************/
		/*PreparedStatement stmtInsertImage = con.prepareStatement("insert into imageTable values(?,?)");
		stmtInsertImage.setString(1, "icon");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\icon.jpg");
		stmtInsertImage.setBinaryStream(2, fis,fis.available());

		System.out.println(stmtInsertImage.executeUpdate() + " No of Records Inserted");*/
		
		
		/**********************  Retreiving Image From DataBase  ***************************/
		/*PreparedStatement stmtRetreiveImage = con.prepareStatement("select * from imageTable");
		ResultSet rs = stmtRetreiveImage.executeQuery();
		if(rs.next()) {
			Blob mBlob = rs.getBlob(2);
			byte imgArray[] = mBlob.getBytes(1, (int) mBlob.length());
			FileOutputStream fout = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\icon_from_db.jpg");
			fout.write(imgArray);
			fout.close();
		}
		System.out.println("Image Retreived Successfully");*/
		
		
		
		/**********************  Inserting File Into DataBase  ***************************/
		/*PreparedStatement stmtInsertFile = con.prepareStatement("insert into fileTable values(?,?)");
		stmtInsertFile.setInt(1, 101);
		
		File mFile = new File("C:\\Users\\lenovo\\Desktop\\Maps.java");
		FileReader mFReader = new FileReader(mFile);
		stmtInsertFile.setCharacterStream(2, mFReader, (int) mFile.length());
		
		System.out.println(stmtInsertFile.executeUpdate()+" No of Records Inserted");*/
		
		
		/**********************  Retreiving File From DataBase  ***************************/
		/*PreparedStatement stmtRetreiveFile = con.prepareStatement("select * from fileTable");
		ResultSet rs = stmtRetreiveFile.executeQuery();
		rs.next();
		
		Clob mClob = rs.getClob(2);
		Reader mReader = mClob.getCharacterStream();
		
		FileWriter mWriter = new FileWriter("C:\\Users\\lenovo\\Desktop\\Maps_from_DB.java");
		int i;
		while((i = mReader.read()) != -1)
			mWriter.write((char) i);
		mWriter.close();
		System.out.println("File Retreived Successfully");*/
			
		
		
		con.close();		//closing the connection
	}
}
