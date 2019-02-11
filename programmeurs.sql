DROP TABLE "PROGRAMMEUR";

CREATE TABLE "PROGRAMMEUR" (
	"ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	"NOM" VARCHAR(35),
	"PRENOM" VARCHAR(35),
 	"ADRESSE" VARCHAR(150),
	"PSEUDO" VARCHAR(20),
	"RESPONSABLE" VARCHAR(30),
	"HOBBY" VARCHAR(10),
	"ANNAISSANCE" VARCHAR(4),
	"SALAIRE" VARCHAR(10),
	"PRIME" VARCHAR(10),
	CONSTRAINT primary_key_programmeur PRIMARY KEY (ID)
);

INSERT INTO PROGRAMMEUR(NOM,PRENOM,ADRESSE,PSEUDO,RESPONSABLE,HOBBY,ANNAISSANCE,SALAIRE,PRIME) VALUES
('Torvalds','Linus','2 avenue Linux Git','linuxroot','Didier Achvar','Salsa','1969','2170','50'),
('Stroustrup','Bjarne','294 rue C++','c++1','Karim Lahlou','Voyages','1950','2466','80'),
('Gosling','James','3 bvd JVM','javapapa','Jacques Augustin','Peinture','1955','1987','10'),
('Turing','Alan','4 ruelle Enigma','robot1er','Nicolas Sicard','Maquettes','1912','2497','39'),
('Ritchie','Dennis','6 rue des Pointeurs','ccmoi','Didier Achvar','Boxe','1941','1688','88'),
('Wall','Larry','39 bvd Perl','expresso','Jacques Augustin','Aucun','1954','3822','99'),
('Hopper','Grace','140 avenue Cob','coboliator','Marc Souchet','Marche','1906','2400','66'),
('Lerdorf','Rasmus','2 rue P Hache Paix','webgourou','Christian Khoury','Dormir','1968','4210','123'),
('Fielding','Roy','2 impasse des services','grandrest','Christian Khoury','Judo','1968','3482','58'),
('Codd','Edgar Frank','2 bvd des Relations','bdd1','Lamine Bougueroua','Puzzles','1923','8541','55');