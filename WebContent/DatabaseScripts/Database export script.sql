--
-- File generated with SQLiteStudio v3.2.1 on Thu Dec 12 18:47:22 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: film
DROP TABLE IF EXISTS film;
CREATE TABLE film(id integer PRIMARY KEY AUTOINCREMENT, naziv varchar(64) not null, reziser_id integer, trajanje integer not null, distributer varchar(64) not null, zemlja_porekla varchar(64) not null, godina_proizvodnje int not null,  opis varchar(1024), obrisan boolean NOT NULL default false, CHECK(trajanje > 0), CHECK(godina_proizvodnje > 0), FOREIGN KEY (reziser_id) REFERENCES osoba(id));
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (1, 'Captain America: The First Avenger', 7, 818300, 'Dejan Productions', 'Bolivia', 1985, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (2, 'Iron Man', 9, 789100, 'Dejan Productions', 'Reunion', 2000, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (3, 'The Incredible Hulk', 7, 810800, 'Dejan Productions', 'Switzerland', 1971, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (4, 'Iron Man 2', 4, 1025900, 'Dejan Productions', 'Greece', 1945, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (5, 'Thor', 9, 1067000, 'Dejan Productions', 'El Salvador', 1954, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (6, 'The Avengers', 5, 626400, 'Dejan Productions', 'Liechtenstein', 1953, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (7, 'Iron Man 3', 17, 423900, 'Dejan Productions', 'Morocco', 1994, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (8, 'Thor: The Dark World', 1, 747300, 'Dejan Productions', 'Papua New Guinea', 1948, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (9, 'Captain America: The Winter Soldier', 3, 767900, 'Dejan Productions', 'Norway', 1991, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (10, 'Guardians of the Galaxy', 8, 922100, 'Dejan Productions', 'Pakistan', 1945, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (11, 'Guardians of the Galaxy Vol. 2', 3, 365900, 'Dejan Productions', 'Bolivia', 1991, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (12, 'Avengers: Age of Ultron', 4, 897700, 'Dejan Productions', 'Reunion', 1973, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (13, 'Ant-Man', 10, 890900, 'Dejan Productions', 'Switzerland', 1977, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (14, 'Captain America: Civil War', 8, 1064000, 'Dejan Productions', 'Greece', 1996, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (15, 'Spider-Man: Homecoming', 11, 715400, 'Dejan Productions', 'El Salvador', 1991, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (16, 'Doctor Strange', 5, 476600, 'Dejan Productions', 'Liechtenstein', 2011, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (17, 'Thor: Ragnarok', 13, 524100, 'Dejan Productions', 'Morocco', 1954, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (18, 'Black Panther', 10, 953200, 'Dejan Productions', 'Papua New Guinea', 1961, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (19, 'Avengers: Infinity War', 2, 964200, 'Dejan Productions', 'Norway', 1978, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);
INSERT INTO film (id, naziv, reziser_id, trajanje, distributer, zemlja_porekla, godina_proizvodnje, opis, obrisan) VALUES (20, 'Ant-Man and the Wasp', 1, 746100, 'Dejan Productions', 'Pakistan', 1988, 'The quiet, Cornish town of London holds a secret.

Cuthbert Pitt has the perfect life working as a housekeeper in the city and laughing with his sweet boyfriend, Tony Sparrow.

However, when he finds a warped blade in his cellar, he begins to realise that things are not quite as they seem in the Pitt family.

An engagement party leaves Cuthbert with some startling questions about his past, and he sets off to sunny London to find some answers.

At first the people of London are gracious and popular. He is intrigued by the curiously helpful housekeeper, Phil Bogtrotter. However, after he introduces him to hard sugar, Cuthbert slowly finds himself drawn into a web of adultery, adultery and perhaps, even violence.

Can Cuthbert resist the charms of Phil Bogtrotter and uncover the secret of the warped blade before it''s too late, or will his demise become yet another London legend?', 0);

-- Table: film_glumac
DROP TABLE IF EXISTS film_glumac;
CREATE TABLE film_glumac (film_id int, glumac_id int, FOREIGN KEY (film_id) REFERENCES film (id), FOREIGN KEY (glumac_id) REFERENCES osoba (id), PRIMARY KEY (film_id, glumac_id));
INSERT INTO film_glumac (film_id, glumac_id) VALUES (8, 1);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (15, 2);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (13, 3);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (11, 4);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (20, 5);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 6);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 7);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (11, 8);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (4, 9);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 10);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (20, 11);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (11, 12);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (8, 13);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (3, 14);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (19, 15);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (12, 16);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (8, 17);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (9, 18);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (18, 19);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (1, 20);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (16, 21);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (12, 22);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (6, 23);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (19, 24);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (15, 25);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 26);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (6, 27);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 28);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (20, 29);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (12, 30);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (18, 31);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (11, 32);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (20, 33);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 34);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (15, 35);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 36);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 37);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (19, 38);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (15, 39);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (17, 40);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (13, 41);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (12, 42);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (1, 43);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (13, 44);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (6, 45);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (8, 46);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (7, 47);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (17, 48);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 49);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (8, 50);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 51);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (5, 52);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (12, 53);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (8, 54);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 55);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (4, 56);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (6, 57);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 58);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (14, 59);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 60);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (19, 61);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (4, 62);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 63);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (7, 64);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (17, 65);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (4, 66);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (16, 67);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (16, 68);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (10, 69);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (19, 70);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (12, 71);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (7, 72);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (1, 73);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (7, 74);
INSERT INTO film_glumac (film_id, glumac_id) VALUES (11, 75);

-- Table: film_zanr
DROP TABLE IF EXISTS film_zanr;
CREATE TABLE film_zanr(film_id int, zanr_id int, FOREIGN KEY (film_id) REFERENCES film(id), FOREIGN KEY (zanr_id) REFERENCES zanr(id), PRIMARY KEY (film_id, zanr_id));
INSERT INTO film_zanr (film_id, zanr_id) VALUES (1, 4);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (2, 5);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (3, 1);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (4, 1);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (5, 1);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (6, 2);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (7, 2);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (8, 2);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (9, 3);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (10, 4);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (11, 3);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (12, 1);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (13, 2);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (14, 2);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (15, 4);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (16, 1);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (17, 4);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (18, 4);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (19, 4);
INSERT INTO film_zanr (film_id, zanr_id) VALUES (20, 4);

-- Table: karta
DROP TABLE IF EXISTS karta;
CREATE TABLE karta(id integer PRIMARY KEY AUTOINCREMENT, projekcija_id int not null, sediste_id int not null, korisnik_id int not null, datum_vreme_prodaje datetime not null default (datetime('now')), obrisan boolean not null default false, FOREIGN KEY (projekcija_id) REFERENCES projekcija(id), foreign key (sediste_id) REFERENCES sediste(id), FOREIGN KEY (korisnik_id) REFERENCES korisnik(id));

-- Table: korisnik
DROP TABLE IF EXISTS korisnik;
CREATE TABLE korisnik(id integer PRIMARY KEY AUTOINCREMENT, username varchar(64) UNIQUE not null, password varchar(64) not null, datum_registracije date not null default (date('now')), uloga_id integer not null DEFAULT 0, obrisan boolean not null DEFAULT false, FOREIGN KEY (uloga_id) REFERENCES uloga(id));
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (1, 'jollydorsal', 'Username8', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (2, 'firechargeappetite', 'Username11', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (3, 'chefgaffer', 'Username9', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (4, 'northerndeprecate', 'Username4', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (5, 'yorkshiregatineau', 'Username3', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (6, 'angrilywashford', 'Username6', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (7, 'cavitiesthames', 'Username10', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (8, 'dennisjackanapes', 'Username7', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (9, 'ceiriogfavoring', 'Username9', '2019-12-10', 1, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (10, 'gopperswaals', 'Username7', '2019-12-10', 1, 0);

-- Table: osoba
DROP TABLE IF EXISTS osoba;
CREATE TABLE osoba(id integer PRIMARY KEY AUTOINCREMENT, ime_prezime varchar(126) NOT NULL);
INSERT INTO osoba (id, ime_prezime) VALUES (1, 'Jun Erickson');
INSERT INTO osoba (id, ime_prezime) VALUES (2, 'Lavinia Bains');
INSERT INTO osoba (id, ime_prezime) VALUES (3, 'Garfield William');
INSERT INTO osoba (id, ime_prezime) VALUES (4, 'Letitia Dean');
INSERT INTO osoba (id, ime_prezime) VALUES (5, 'Susan Wilkes');
INSERT INTO osoba (id, ime_prezime) VALUES (6, 'Clarke Proctor');
INSERT INTO osoba (id, ime_prezime) VALUES (7, 'Oisin Nolan');
INSERT INTO osoba (id, ime_prezime) VALUES (8, 'Eathan Beach');
INSERT INTO osoba (id, ime_prezime) VALUES (9, 'Kira Fox');
INSERT INTO osoba (id, ime_prezime) VALUES (10, 'Cadence Lyons');
INSERT INTO osoba (id, ime_prezime) VALUES (11, 'Lennon Francis');
INSERT INTO osoba (id, ime_prezime) VALUES (12, 'Sylvia Robertson');
INSERT INTO osoba (id, ime_prezime) VALUES (13, 'Nazifa Best');
INSERT INTO osoba (id, ime_prezime) VALUES (14, 'Stanley Schroeder');
INSERT INTO osoba (id, ime_prezime) VALUES (15, 'Ciaron Hastings');
INSERT INTO osoba (id, ime_prezime) VALUES (16, 'August Coleman');
INSERT INTO osoba (id, ime_prezime) VALUES (17, 'Shania Foley');
INSERT INTO osoba (id, ime_prezime) VALUES (18, 'Mischa Dixon');
INSERT INTO osoba (id, ime_prezime) VALUES (19, 'Finley Logan');
INSERT INTO osoba (id, ime_prezime) VALUES (20, 'Boyd Southern');
INSERT INTO osoba (id, ime_prezime) VALUES (21, 'Angelina Mill');
INSERT INTO osoba (id, ime_prezime) VALUES (22, 'Shelly Murphy');
INSERT INTO osoba (id, ime_prezime) VALUES (23, 'Ammar Hurst');
INSERT INTO osoba (id, ime_prezime) VALUES (24, 'Candice Markham');
INSERT INTO osoba (id, ime_prezime) VALUES (25, 'Cohan Appleton');
INSERT INTO osoba (id, ime_prezime) VALUES (26, 'Lee Doyle');
INSERT INTO osoba (id, ime_prezime) VALUES (27, 'Zander Buxton');
INSERT INTO osoba (id, ime_prezime) VALUES (28, 'Mira Kline');
INSERT INTO osoba (id, ime_prezime) VALUES (29, 'Oskar Kirby');
INSERT INTO osoba (id, ime_prezime) VALUES (30, 'Chaim Brock');
INSERT INTO osoba (id, ime_prezime) VALUES (31, 'Star Willis');
INSERT INTO osoba (id, ime_prezime) VALUES (32, 'Izaak Hodgson');
INSERT INTO osoba (id, ime_prezime) VALUES (33, 'Ifan Rosas');
INSERT INTO osoba (id, ime_prezime) VALUES (34, 'Cali Gibson');
INSERT INTO osoba (id, ime_prezime) VALUES (35, 'James Leblanc');
INSERT INTO osoba (id, ime_prezime) VALUES (36, 'Kingston Lloyd');
INSERT INTO osoba (id, ime_prezime) VALUES (37, 'Frances Lang');
INSERT INTO osoba (id, ime_prezime) VALUES (38, 'Wilbur Holcomb');
INSERT INTO osoba (id, ime_prezime) VALUES (39, 'Lily-Rose Hook');
INSERT INTO osoba (id, ime_prezime) VALUES (40, 'Isabelle Coulson');
INSERT INTO osoba (id, ime_prezime) VALUES (41, 'Danyaal Cochran');
INSERT INTO osoba (id, ime_prezime) VALUES (42, 'Zayyan Lancaster');
INSERT INTO osoba (id, ime_prezime) VALUES (43, 'Shayan Vargas');
INSERT INTO osoba (id, ime_prezime) VALUES (44, 'Jaylen Knights');
INSERT INTO osoba (id, ime_prezime) VALUES (45, 'Aneurin Webster');
INSERT INTO osoba (id, ime_prezime) VALUES (46, 'Menna Lowery');
INSERT INTO osoba (id, ime_prezime) VALUES (47, 'Mai Perkins');
INSERT INTO osoba (id, ime_prezime) VALUES (48, 'Anabel Phelps');
INSERT INTO osoba (id, ime_prezime) VALUES (49, 'Marisa Steadman');
INSERT INTO osoba (id, ime_prezime) VALUES (50, 'Ayisha Hardin');
INSERT INTO osoba (id, ime_prezime) VALUES (51, 'Beatriz Durham');
INSERT INTO osoba (id, ime_prezime) VALUES (52, 'Aron Spence');
INSERT INTO osoba (id, ime_prezime) VALUES (53, 'Amar Emery');
INSERT INTO osoba (id, ime_prezime) VALUES (54, 'Bruce Swift');
INSERT INTO osoba (id, ime_prezime) VALUES (55, 'Brenda Dowling');
INSERT INTO osoba (id, ime_prezime) VALUES (56, 'Kamil Ahmad');
INSERT INTO osoba (id, ime_prezime) VALUES (57, 'Cassian Ventura');
INSERT INTO osoba (id, ime_prezime) VALUES (58, 'Romany Dyer');
INSERT INTO osoba (id, ime_prezime) VALUES (59, 'Lara Mccartney');
INSERT INTO osoba (id, ime_prezime) VALUES (60, 'Rumaisa Jenkins');
INSERT INTO osoba (id, ime_prezime) VALUES (61, 'Moshe Potter');
INSERT INTO osoba (id, ime_prezime) VALUES (62, 'Reece Salazar');
INSERT INTO osoba (id, ime_prezime) VALUES (63, 'Nyah Peralta');
INSERT INTO osoba (id, ime_prezime) VALUES (64, 'Antoine Waller');
INSERT INTO osoba (id, ime_prezime) VALUES (65, 'Rosina Buck');
INSERT INTO osoba (id, ime_prezime) VALUES (66, 'Saffron Pratt');
INSERT INTO osoba (id, ime_prezime) VALUES (67, 'Ellice Burn');
INSERT INTO osoba (id, ime_prezime) VALUES (68, 'Taiba Trujillo');
INSERT INTO osoba (id, ime_prezime) VALUES (69, 'Payton Vaughan');
INSERT INTO osoba (id, ime_prezime) VALUES (70, 'Lola-Mae Clegg');
INSERT INTO osoba (id, ime_prezime) VALUES (71, 'Shahid Mahoney');
INSERT INTO osoba (id, ime_prezime) VALUES (72, 'Jay-Jay Esquivel');
INSERT INTO osoba (id, ime_prezime) VALUES (73, 'Ritchie Hess');
INSERT INTO osoba (id, ime_prezime) VALUES (74, 'Victor Bull');
INSERT INTO osoba (id, ime_prezime) VALUES (75, 'Jodie Mayer');

-- Table: projekcija
DROP TABLE IF EXISTS projekcija;
CREATE TABLE projekcija (id integer PRIMARY KEY AUTOINCREMENT, film_id int NOT NULL, tip_projekcije_id int NOT NULL, sala_id int NOT NULL, datum_vreme_projekcije datetime NOT NULL, cena_karte DOUBLE NOT NULL, obrisan boolean NOT NULL DEFAULT false, CHECK (cena_karte > 0), FOREIGN KEY (film_id) REFERENCES film (id), FOREIGN KEY (tip_projekcije_id) REFERENCES tip_projekcije (id), FOREIGN KEY (sala_id) REFERENCES sala (id));

-- Table: projekcija_administrator
DROP TABLE IF EXISTS projekcija_administrator;
CREATE TABLE projekcija_administrator(projekcija_id int PRIMARY KEY, korisnik_id int, FOREIGN KEY (projekcija_id) REFERENCES projekcija(id), FOREIGN KEY (korisnik_id) REFERENCES korisnik(id));

-- Table: sala
DROP TABLE IF EXISTS sala;
CREATE TABLE sala(id integer primary key autoincrement, naziv varchar(32) NOT NULL);
INSERT INTO sala (id, naziv) VALUES (1, '1A');
INSERT INTO sala (id, naziv) VALUES (2, '1B');
INSERT INTO sala (id, naziv) VALUES (3, '2A');
INSERT INTO sala (id, naziv) VALUES (4, '2B');

-- Table: sediste
DROP TABLE IF EXISTS sediste;
CREATE TABLE sediste(sala_id integer NOT NULL, redni_broj integer not null, FOREIGN KEY (sala_id) references sala(id), primary key (sala_id, redni_broj));
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 1);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 2);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 3);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 4);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 5);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 6);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 7);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 8);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 9);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 10);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 11);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 12);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 13);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 14);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 15);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 16);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 17);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 18);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 19);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 20);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 21);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 22);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 23);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 24);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 25);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 26);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 27);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 28);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 29);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 30);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 31);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 32);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 33);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 34);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 35);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 36);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 37);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 38);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 39);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 40);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 41);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 42);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 43);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 44);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 45);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 46);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 47);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 48);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 49);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 50);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 51);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 52);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 53);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 54);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 55);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 56);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 57);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 58);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 59);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 60);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 61);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 62);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 63);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 64);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 65);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 66);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 67);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 68);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 69);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 70);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 71);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 72);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 73);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 74);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 75);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 76);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 77);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 78);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 79);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 80);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 81);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 82);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 83);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 84);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 85);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 86);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 87);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 88);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 89);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 90);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 91);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 92);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 93);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 94);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 95);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 96);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 97);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 98);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 99);
INSERT INTO sediste (sala_id, redni_broj) VALUES (1, 100);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 1);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 2);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 3);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 4);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 5);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 6);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 7);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 8);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 9);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 10);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 11);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 12);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 13);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 14);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 15);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 16);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 17);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 18);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 19);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 20);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 21);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 22);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 23);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 24);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 25);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 26);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 27);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 28);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 29);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 30);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 31);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 32);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 33);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 34);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 35);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 36);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 37);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 38);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 39);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 40);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 41);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 42);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 43);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 44);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 45);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 46);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 47);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 48);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 49);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 50);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 51);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 52);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 53);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 54);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 55);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 56);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 57);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 58);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 59);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 60);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 61);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 62);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 63);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 64);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 65);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 66);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 67);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 68);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 69);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 70);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 71);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 72);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 73);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 74);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 75);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 76);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 77);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 78);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 79);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 80);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 81);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 82);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 83);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 84);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 85);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 86);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 87);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 88);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 89);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 90);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 91);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 92);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 93);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 94);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 95);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 96);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 97);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 98);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 99);
INSERT INTO sediste (sala_id, redni_broj) VALUES (2, 100);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 1);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 2);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 3);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 4);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 5);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 6);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 7);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 8);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 9);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 10);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 11);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 12);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 13);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 14);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 15);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 16);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 17);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 18);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 19);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 20);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 21);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 22);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 23);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 24);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 25);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 26);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 27);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 28);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 29);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 30);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 31);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 32);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 33);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 34);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 35);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 36);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 37);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 38);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 39);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 40);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 41);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 42);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 43);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 44);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 45);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 46);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 47);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 48);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 49);
INSERT INTO sediste (sala_id, redni_broj) VALUES (3, 50);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 1);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 2);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 3);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 4);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 5);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 6);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 7);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 8);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 9);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 10);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 11);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 12);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 13);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 14);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 15);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 16);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 17);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 18);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 19);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 20);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 21);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 22);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 23);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 24);
INSERT INTO sediste (sala_id, redni_broj) VALUES (4, 25);

-- Table: tip_projekcije
DROP TABLE IF EXISTS tip_projekcije;
CREATE TABLE tip_projekcije(id integer primary key autoincrement, naziv varchar(32) NOT NULL);
INSERT INTO tip_projekcije (id, naziv) VALUES (0, '2D');
INSERT INTO tip_projekcije (id, naziv) VALUES (1, '3D');
INSERT INTO tip_projekcije (id, naziv) VALUES (2, '4D');
INSERT INTO tip_projekcije (id, naziv) VALUES (3, '5D');

-- Table: tip_projekcije_u_sali
DROP TABLE IF EXISTS tip_projekcije_u_sali;
CREATE TABLE tip_projekcije_u_sali(sala_id integer not null, tip_projekcije_id int not null, foreign key (sala_id) references sala(id), foreign key (tip_projekcije_id) references tip_projekcije(id), primary key (sala_id, tip_projekcije_id));

-- Table: uloga
DROP TABLE IF EXISTS uloga;
CREATE TABLE uloga(id integer PRIMARY KEY AUTOINCREMENT, naziv varchar(64) not null);
INSERT INTO uloga (id, naziv) VALUES (1, 'Obican');
INSERT INTO uloga (id, naziv) VALUES (2, 'Admin');

-- Table: zanr
DROP TABLE IF EXISTS zanr;
CREATE TABLE zanr(id integer PRIMARY KEY AUTOINCREMENT, naziv varchar(64) NOT NULL);
INSERT INTO zanr (id, naziv) VALUES (1, 'Deciji');
INSERT INTO zanr (id, naziv) VALUES (2, 'Triler');
INSERT INTO zanr (id, naziv) VALUES (3, 'Horor');
INSERT INTO zanr (id, naziv) VALUES (4, 'Komedija');
INSERT INTO zanr (id, naziv) VALUES (5, 'Akcija');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
