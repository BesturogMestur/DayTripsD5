class TripController{
    private Trip trip;

    public void makeTrip(String type, String location, char date, Pay price){
	this.trip = new trip(type, location, data, price);
    }

    public void findTrip(String type, char date){
	this.trip = this.trip.findTrip(type, date);
    }

    public void delTrip(){
	this.trip.del();
    }

    public Trip getTrip(){
	return this.trip;
    }
}
