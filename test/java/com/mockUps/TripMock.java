class TripMock implements Trip{
    private String type;
    private String location;
    private char date;
    private Pay price;
    private TripTable table;

    public void find(String type, char date){
	this.table.conn();
	if(table.exict(type, date)){
	    this.type = type;
	    this.date = date;
	    setValues();
	}
	this.table.disConn;
    }

    private void setValues(){
	this.location = table.getlocation(this.type, this.date);
	this.price = table.getPrice(this.type, this.date);
    }

    public void add(String type, String location, char date, Pay price){
	this.table.conn();
	this.table.add(type, location, date, price);
	this.table.disconn;

	fined(type, date);
    }

    public void del(){
	this.table.conn();
	if(table.exict(type, date)){
	    table.del(type,dete);
	    makeAllNull();
	}
	this.table.disConn();
    }

    private void makeAllNull(){
	this.type = null;
	this.location = null;
	this.date = null;
	this.price = null;
    }
}
