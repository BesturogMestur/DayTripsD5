class BookingMock implements BookingInt{
    private String id;
    private TripMock trip;
    private BookingTable table; 

    public void add(){
	this.table.conn();
	this.table.add(this.id, this.trip);
	this.table.disConn();

	this.id = null;
	this.trip = null;
    }

    public void del(){
	this.table.conn();
	this.table.del(this.id, this.trip);
	this.table.disConn();

	this.id = null;
	this.trip = null;
    }

    public void findBooking(String id, String type, char date){
	this.table.conn();

	if(this.table.ifContensBooking(id, type, date)){
	    this.table.disConn();
	    this.id = id;
	    this.trip.find(type, date);
	}
	else{
	    this.table.disConn();
	}
    }
}
