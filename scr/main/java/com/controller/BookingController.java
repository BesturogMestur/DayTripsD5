class BookingController{
    private Booking book;

    public void addBooking(){
	book.add();
	book = null;
    }

    public void delBooking(){
	book.del();
	booking = null;
    }

    public void setBooking(String id, Trip trip){
	this.book = new Booking(id, trip);
    }

    public Booking getBooking(){
	return book;
    }
}
