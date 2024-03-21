public class Trip{
    private String type;
    private String location;
    private char date;
    private Pay price; //will mostliky remove

    public Trip(String type, String location, char date, Pay price){
	getTrip(type, location);
    }

    public Trip(String type, String location){
	addTrip(type, location, date, price);
    }

    //þarf að gera addTrip / getTrip

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
