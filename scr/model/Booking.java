public class Booking{
    private String id;
    private Trip trip;

    public Booking(String id, Trip trip){
	this.id = id;
	this.trip = trip
    }

    public void updateTrips(Trip t){
	trips = t;
    }

    public Trip getTrips(){
	return trips;
    }

    public String getId(){
	return id;
    }
}
