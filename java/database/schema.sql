
DROP TABLE IF EXISTS me_pro, me_lang, languages, project, me;
DROP SEQUENCE IF EXISTS  seq_pro_id, seq_lang_id;

CREATE TABLE me (
	my_id INT NOT NULL DEFAULT 1,
	my_name VARCHAR(36) NOT NULL,
	my_age INT NOT NULL,
	
	CONSTRAINT PK_me PRIMARY KEY (my_id)
);

CREATE SEQUENCE seq_pro_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE TABLE project (
	project_id INT NOT NULL DEFAULT nextval('seq_pro_id'),
	project_name VARCHAR(36) NOT NULL,
	project_description VARCHAR(8000) NOT NULL,
	
	CONSTRAINT PK_project PRIMARY KEY (project_id)
);

CREATE SEQUENCE seq_lang_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;
  
CREATE TABLE languages (
	lang_id INT NOT NULL DEFAULT nextval('seq_lang_id'),
	lang_name VARCHAR(36) NOT NULL,
	proficiency INT NOT NULL,
	
	CONSTRAINT PK_languages PRIMARY KEY (lang_id)
);

CREATE TABLE me_pro (
	my_id INT NOT NULL,
	project_id INT NOT NULL,
	
	CONSTRAINT PK_me_pro PRIMARY KEY (my_id, project_id),
	CONSTRAINT FK_me_pro_my_id FOREIGN KEY (my_id) REFERENCES me(my_id),
	CONSTRAINT FK_me_pro_project_id FOREIGN KEY (project_id) REFERENCES project(project_id)
);

CREATE TABLE me_lang (
	my_id INT NOT NULL,
	lang_id INT NOT NULL,
	
	CONSTRAINT PK_me_lang PRIMARY KEY (my_id, lang_id),
	CONSTRAINT FK_me_lang_my_id FOREIGN KEY (my_id) REFERENCES me(my_id),
	CONSTRAINT FK_me_lang_lang_id FOREIGN KEY (lang_id) REFERENCES languages(lang_id)
);

INSERT INTO me (my_id, my_name, my_age)
VALUES (1, 'Alex Best', 24);

INSERT INTO project (project_name, project_description)
VALUES ('TechBot', 'A chatbot that was created to help new or current students at techelevator that need quick answers or need help related to the pathway program or curriculum.');

INSERT INTO project (project_name, project_description)
VALUES ('Tenmo', 'A banking application that allows users to register an account, add money, and transfer money between registered users.');

INSERT INTO project (project_name, project_description)
VALUES ('CandyStore', 'A terminal based candystore application that allows users to register an account, add money, view the inventory and buy candy.');

INSERT INTO project (project_name, project_description)
VALUES ('Jammming', 'An application I built while doing the fullstack dev path on codecademy that utilizes the spotify api to allow you to sign in to your account and create/update/delete music playlists.');

INSERT INTO languages (lang_name, proficiency)
VALUES ('Java', 3);

INSERT INTO languages (lang_name, proficiency)
VALUES ('Javascript', 3);

INSERT INTO languages (lang_name, proficiency)
VALUES ('Css', 2);

INSERT INTO languages (lang_name, proficiency)
VALUES ('Html', 3);

INSERT INTO languages (lang_name, proficiency)
VALUES ('SQL', 3);

INSERT INTO me_lang (my_id, lang_id)
VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5);

INSERT INTO me_pro (my_id, project_id)
VALUES (1, 1), (1, 2), (1, 3), (1, 4);

SELECT * FROM languages;