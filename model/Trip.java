public class Trip{
    //constructor will be made later

    private String type;
    private String location;
    private char date;
    private Pay price;

    protected void SetType(String name){
	type = name;
    }

    public String getType(){
	return type;
    }

    protected void setLocation(String name){
	location = name;
    }

    public String getlocation(){
	return location;
    }

    protected void setDate(char day){
	date = day;
    }

    public char getDate(){
	return date;
    }

    protected void setPrice(Pay p){
	price = p;
    }

    public Pay getPrice(){
	return price;
    }
} 
