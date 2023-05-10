CREATE TABLE question4."Address" (
                                     address_id INT PRIMARY KEY,
                                     zip_code VARCHAR(10),
                                     address VARCHAR(255),
                                     complement VARCHAR(255),
                                     neighborhood VARCHAR(255),
                                     city VARCHAR(255),
                                     state VARCHAR(255),
                                     country VARCHAR(255)
);

CREATE TABLE question4.Person (
                                  person_id INT PRIMARY KEY,
                                  name VARCHAR(255),
                                  age INT,
                                  phone VARCHAR(20),
                                  height FLOAT,
                                  email VARCHAR(255),
                                  CPF VARCHAR(14),
                                  date_of_birth DATE,
                                  id_address INT,
                                  FOREIGN KEY (id_address) REFERENCES Address(address_id)
);