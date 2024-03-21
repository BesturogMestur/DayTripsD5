public class UserTable{
    private Connection conn;
    private Statement s;

    public UserTable(){
	getConn();
	s = con.createStatement();
    }

    private void getCon() throws Exception{
	try{
	    Class.forName("org.postgresql.Driver");
	    java.util.Properties props = new java.util.Properties();
	    props.setProperty("user",args[0]);
	    props.setProperty("password",args[1]);
	    conn = DriverManager.getConnection("jdbc:postgresql:datebase",props);
	}
	catch(Exception e){
	    try{
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:datebase.db");
	    }
	    catch(Exception e2){
		conn = DriverManager.getConnection("jdbc:odbc:dataBase");
	    }
	}
    }

    public void save(Sring username, char password, Sting Fname, String Lname){
	Sting stmti1 = "Selcet id form Users Where ID =" +username;
	ResultSet r = s.executeQuery(stmt1);
	if(username == r.getSting(1)){
	    println("Username is allredytaken");
	}
	stmil1 = "INSERT INTO Users VALUES("+username+","+Fame+","+Lname+",0)";
	s.executeUpdate(stiml1);
    }

    public Users findById(Sting id){
	Sting stmti1 = "Selcet id, FName, LName, Pasword form Users Where ID =" +Id;
	ResultSet r = s.executeQuery(stmt1);
	
	user = new User(;
    }

    public void update(Users user){
	//I will do this later
    }

    public void delete(int id){
	//I will do this later
    }
}
