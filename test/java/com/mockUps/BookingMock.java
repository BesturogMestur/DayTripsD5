package java.com.mockUps;

import com.data.BookingTable;
import com.model.BookingInt;
import com.model.Trip;

public class BookingMock implements BookingInt {
	private String id;
	private Trip trip;
	private BookingTable table;

	public void add() throws Exception {
		this.table.getCon();
		this.table.add(this.id, this.trip);
		this.table.disCon();

		this.id = null;
		this.trip = null;
	}

	public void del() throws Exception {
		this.table.getCon();
		this.table.del(this.id, this.trip);
		this.table.disCon();

		this.id = null;
		this.trip = null;
	}

	@Override
	public void find(String id, String type, char date) {
		// Implement find method
	}

	public void findBooking(String id, String type, char date) throws Exception {
		this.table.getCon();

		if (this.table.ifContentsBooking(id, type, date)) {
			this.table.disCon();
			this.id = id;
			// Stub for TripMock
			System.out.println("Trip found: " + type + " on " + date);
		} else {
			this.table.disCon();
		}
	}
}

