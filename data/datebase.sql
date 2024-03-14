Create TABLE User(
	ID int PRIMARY KEY,
	FName VARCHAR(255),
	LName VARCHAR(255),
	Pasword VARCHAR(255),
	Clerans int
);

Create TABLE Trip(
	trip VARCHAR(255),
	day date,
	where VARCHAR(255),
	pries int,
	PRIMARY KEY(trip, day)
);

Create TABLE Booking(
	ID int,
	trip VARCHAR(255),
	day date,
	PRIMARY KEY(ID, trip, day),
	FOREIGN KEY(ID) REFERENCES User(ID),
	FOREIGN KEY(trip, day) REFERENCES Trip(tirp, day)
);
	
	
