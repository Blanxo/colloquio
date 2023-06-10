-- Creazione della tabella "User"
CREATE TABLE User (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255),
  email VARCHAR(255),
  name VARCHAR(255),
  surname VARCHAR(255)
);

-- Creazione della tabella "Itinerary"
CREATE TABLE Itinerary (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT,
  description VARCHAR(255),
  startDate DATE,
  endDate DATE,
  FOREIGN KEY (user_id) REFERENCES User(id)
);

-- Creazione della tabella "City"
CREATE TABLE City (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  latitude DOUBLE,
  longitude DOUBLE
);

-- Creazione della tabella "SkyConditions"
CREATE TABLE SkyConditions (
  id INT AUTO_INCREMENT PRIMARY KEY,
  sky_condition ENUM('CLEAR_SKY', 'CLOUDY', 'RAIN_SHOWERS', 'SNOW_SHOWERS')
);

-- Creazione della tabella "WeatherConditions"
CREATE TABLE WeatherConditions (
  id INT AUTO_INCREMENT PRIMARY KEY,
  temperature DOUBLE,
  humidity DOUBLE,
  skyCondition_id INT,
  FOREIGN KEY (skyCondition_id) REFERENCES SkyConditions(id)
);


-- Creazione della tabella "Stay"
CREATE TABLE Stay (
  id INT AUTO_INCREMENT PRIMARY KEY,
  itinerary_id INT,
  stayDate DATE,
  description VARCHAR(255),
  city_id INT,
  weather_id INT,
  FOREIGN KEY (itinerary_id) REFERENCES Itinerary(id),
  FOREIGN KEY (city_id) REFERENCES City(id),
  FOREIGN KEY (weather_id) REFERENCES WeatherConditions(id)
);



