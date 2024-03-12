public class Booking{
    private Users user;
    private Trip[] trips;
    private Book[] book;

    //will make a constutor at somepoint.

    public void setUsers(Users user){
	this.user = user;
    }

    public Users getUser(){
	return user;
    }

    public void setBook(Book[] bo){
	Book = bo;
    }

    public Book[] getBook(){
	return book;
    }

    public void setTrips(Trip[] t){
	trips = t;
    }

    public Trip[] getTrips(){
	return trips;
    }

    public void addBooking(Book bo, Trip t){
	//will do later
    }

    public void delBooking(Book bo, Trip t){
	//will do later
    }

    public void addTrip(Trip t){
	//will do later
    }

    public void delTrip(Trip t){
	//will do later
    }
}
