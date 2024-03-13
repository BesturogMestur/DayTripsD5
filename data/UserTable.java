public class UserTable{
    private Connection conn;

    public UserTable(){
	getConn();
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

    public void save(Users user){
	//I will do this lataer
    }

    public Users findById(long id){
	//I will do this later
    }

    public void update(Users user){
	//I will do this later
    }

    public void delete(int id){
	//I will do this later
    }
}
