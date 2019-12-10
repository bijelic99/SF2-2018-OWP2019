--
-- File generated with SQLiteStudio v3.2.1 on Tue Dec 10 22:46:21 2019
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
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (1, 'jollydorsal', 'Username8', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (2, 'firechargeappetite', 'Username11', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (3, 'chefgaffer', 'Username9', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (4, 'northerndeprecate', 'Username4', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (5, 'yorkshiregatineau', 'Username3', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (6, 'angrilywashford', 'Username6', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (7, 'cavitiesthames', 'Username10', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (8, 'dennisjackanapes', 'Username7', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (9, 'ceiriogfavoring', 'Username9', '2019-12-10', 0, 0);
INSERT INTO korisnik (id, username, password, datum_registracije, uloga_id, obrisan) VALUES (10, 'gopperswaals', 'Username7', '2019-12-10', 0, 0);

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
CREATE TABLE projekcija(id integer PRIMARY KEY AUTOINCREMENT, film_id int not null, tip_projekcije_id int not null, sala_id int not null, datum_vreme_projekcije datetime not null, cena_karte int not null, obrisan boolean not null default false, CHECK(cena_karte > 0), FOREIGN KEY (film_id) REFERENCES film(id), FOREIGN KEY (tip_projekcije_id) REFERENCES tip_projekcije(id), FOREIGN KEY (sala_id) REFERENCES sala(id));

-- Table: projekcija_administrator
DROP TABLE IF EXISTS projekcija_administrator;
CREATE TABLE projekcija_administrator(projekcija_id int PRIMARY KEY, korisnik_id int, FOREIGN KEY (projekcija_id) REFERENCES projekcija(id), FOREIGN KEY (korisnik_id) REFERENCES korisnik(id));

-- Table: sala
DROP TABLE IF EXISTS sala;
CREATE TABLE sala(id integer primary key autoincrement, naziv varchar(32) NOT NULL);
INSERT INTO sala (id, naziv) VALUES (0, '1A');
INSERT INTO sala (id, naziv) VALUES (1, '1B');
INSERT INTO sala (id, naziv) VALUES (2, '2A');
INSERT INTO sala (id, naziv) VALUES (3, '2B');

-- Table: sediste
DROP TABLE IF EXISTS sediste;
CREATE TABLE sediste(id integer primary key autoincrement, redni_broj integer not null,sala_id integer NOT NULL, FOREIGN KEY (sala_id) references sala(id));
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (1, 1, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (2, 2, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (3, 3, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (4, 4, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (5, 5, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (6, 6, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (7, 7, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (8, 8, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (9, 9, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (10, 10, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (11, 11, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (12, 12, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (13, 13, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (14, 14, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (15, 15, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (16, 16, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (17, 17, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (18, 18, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (19, 19, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (20, 20, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (21, 21, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (22, 22, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (23, 23, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (24, 24, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (25, 25, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (26, 26, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (27, 27, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (28, 28, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (29, 29, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (30, 30, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (31, 31, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (32, 32, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (33, 33, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (34, 34, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (35, 35, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (36, 36, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (37, 37, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (38, 38, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (39, 39, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (40, 40, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (41, 41, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (42, 42, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (43, 43, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (44, 44, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (45, 45, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (46, 46, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (47, 47, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (48, 48, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (49, 49, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (50, 50, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (51, 51, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (52, 52, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (53, 53, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (54, 54, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (55, 55, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (56, 56, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (57, 57, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (58, 58, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (59, 59, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (60, 60, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (61, 61, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (62, 62, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (63, 63, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (64, 64, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (65, 65, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (66, 66, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (67, 67, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (68, 68, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (69, 69, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (70, 70, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (71, 71, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (72, 72, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (73, 73, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (74, 74, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (75, 75, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (76, 76, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (77, 77, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (78, 78, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (79, 79, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (80, 80, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (81, 81, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (82, 82, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (83, 83, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (84, 84, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (85, 85, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (86, 86, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (87, 87, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (88, 88, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (89, 89, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (90, 90, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (91, 91, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (92, 92, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (93, 93, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (94, 94, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (95, 95, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (96, 96, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (97, 97, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (98, 98, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (99, 99, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (100, 100, 0);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (101, 1, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (102, 2, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (103, 3, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (104, 4, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (105, 5, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (106, 6, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (107, 7, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (108, 8, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (109, 9, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (110, 10, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (111, 11, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (112, 12, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (113, 13, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (114, 14, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (115, 15, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (116, 16, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (117, 17, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (118, 18, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (119, 19, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (120, 20, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (121, 21, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (122, 22, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (123, 23, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (124, 24, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (125, 25, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (126, 26, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (127, 27, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (128, 28, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (129, 29, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (130, 30, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (131, 31, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (132, 32, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (133, 33, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (134, 34, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (135, 35, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (136, 36, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (137, 37, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (138, 38, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (139, 39, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (140, 40, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (141, 41, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (142, 42, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (143, 43, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (144, 44, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (145, 45, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (146, 46, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (147, 47, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (148, 48, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (149, 49, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (150, 50, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (151, 51, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (152, 52, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (153, 53, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (154, 54, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (155, 55, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (156, 56, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (157, 57, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (158, 58, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (159, 59, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (160, 60, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (161, 61, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (162, 62, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (163, 63, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (164, 64, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (165, 65, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (166, 66, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (167, 67, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (168, 68, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (169, 69, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (170, 70, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (171, 71, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (172, 72, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (173, 73, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (174, 74, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (175, 75, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (176, 76, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (177, 77, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (178, 78, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (179, 79, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (180, 80, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (181, 81, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (182, 82, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (183, 83, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (184, 84, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (185, 85, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (186, 86, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (187, 87, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (188, 88, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (189, 89, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (190, 90, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (191, 91, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (192, 92, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (193, 93, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (194, 94, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (195, 95, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (196, 96, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (197, 97, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (198, 98, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (199, 99, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (200, 100, 1);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (201, 1, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (202, 2, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (203, 3, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (204, 4, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (205, 5, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (206, 6, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (207, 7, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (208, 8, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (209, 9, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (210, 10, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (211, 11, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (212, 12, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (213, 13, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (214, 14, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (215, 15, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (216, 16, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (217, 17, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (218, 18, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (219, 19, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (220, 20, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (221, 21, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (222, 22, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (223, 23, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (224, 24, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (225, 25, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (226, 26, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (227, 27, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (228, 28, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (229, 29, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (230, 30, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (231, 31, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (232, 32, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (233, 33, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (234, 34, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (235, 35, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (236, 36, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (237, 37, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (238, 38, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (239, 39, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (240, 40, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (241, 41, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (242, 42, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (243, 43, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (244, 44, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (245, 45, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (246, 46, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (247, 47, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (248, 48, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (249, 49, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (250, 50, 2);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (251, 1, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (252, 2, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (253, 3, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (254, 4, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (255, 5, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (256, 6, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (257, 7, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (258, 8, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (259, 9, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (260, 10, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (261, 11, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (262, 12, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (263, 13, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (264, 14, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (265, 15, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (266, 16, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (267, 17, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (268, 18, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (269, 19, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (270, 20, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (271, 21, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (272, 22, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (273, 23, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (274, 24, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (275, 25, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (276, 26, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (277, 27, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (278, 28, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (279, 29, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (280, 30, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (281, 31, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (282, 32, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (283, 33, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (284, 34, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (285, 35, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (286, 36, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (287, 37, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (288, 38, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (289, 39, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (290, 40, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (291, 41, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (292, 42, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (293, 43, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (294, 44, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (295, 45, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (296, 46, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (297, 47, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (298, 48, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (299, 49, 3);
INSERT INTO sediste (id, redni_broj, sala_id) VALUES (300, 50, 3);

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
INSERT INTO uloga (id, naziv) VALUES (0, 'Obican');
INSERT INTO uloga (id, naziv) VALUES (1, 'Admin');

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
