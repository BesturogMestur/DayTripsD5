package java.com.mockUps;

import com.model.Pay;
import com.model.Trip;
import com.data.TripTable;
import com.model.TripInt;

public class TripMock implements TripInt {
    private String type;
    private String location;
    private char date;
    private Pay price;
    private TripTable table;

	public TripMock(String type, String location, char date, Pay price) {
		super();
	}

	public TripMock(String type, String location) {
		super();
	}

	public void find(String type, char date) throws Exception {
		this.table.getCon();
		if(table.exict(type, date)){
	    	this.type = type;
	    	this.date = date;
	    	setValues();
		}
		this.table.disCon();
    }

    private void setValues(){
		this.location = table.getlocation(this.type, this.date);
		this.price = table.getPrice(this.type, this.date);
    }

    public void add(String type, String location, char date, Pay price) throws Exception {
		this.table.getCon();
		this.table.add(type, location, date, price);
		this.table.disCon();

		fined(type, date);
    }

	private void fined(String type, char date) {
	}

	public void del() throws Exception {
	this.table.getCon();
	if(table.exict(type, date)){
	    table.del(type,date);
	    makeAllNull();
	}
	this.table.disCon();
    }

    private void makeAllNull(){
	this.type = null;
	this.location = null;
	//this.date = null;
	this.price = null;
    }
}
