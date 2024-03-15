Create TABLE Users(
	ID int PRIMARY KEY,
	FName VARCHAR(255),
	LName VARCHAR(255),
	Pasword VARCHAR(255),
	Clerans int
);

Create TABLE Trip(
	trip VARCHAR(255),
	tirpDate date,
	location VARCHAR(255),
	pries int,
	PRIMARY KEY(trip, tirpDate)
);

Create TABLE Booking(
	ID int,
	trip VARCHAR(255),
	tirpDate date,
	PRIMARY KEY(ID, trip, tirpDate),
	FOREIGN KEY(ID) REFERENCES User(ID),
	FOREIGN KEY(trip, tirpDate) REFERENCES Trip(tirp, tirpDate)
);
	
	
