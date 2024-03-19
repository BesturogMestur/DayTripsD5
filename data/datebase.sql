DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Trip;
DROP TABLE IF EXISTS Booking;

Create TABLE Users(
	ID VARCHAR(255) PRIMARY KEY,
	FName VARCHAR(255),
	LName VARCHAR(255),
	Pasword VARCHAR(255)
);

Create TABLE Trip(
	trip VARCHAR(255),
	tirpDate date,
	location VARCHAR(255),
	pries int,
	PRIMARY KEY(trip, tirpDate)
);

Create TABLE Booking(
	ID VARCHAR(255),
	trip VARCHAR(255),
	tirpDate date,
	PRIMARY KEY(ID, trip, tirpDate),
	FOREIGN KEY(ID) REFERENCES User(ID),
	FOREIGN KEY(trip, tirpDate) REFERENCES Trip(tirp, tirpDate)
);
	
	
