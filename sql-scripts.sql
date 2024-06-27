create schema qa3;


create table qa3.users (
	id SMALLSERIAL primary key,
	email VARCHAR(255) NOT NULL UNIQUE,
	photo VARCHAR(512),
	name VARCHAR(255)
);
create table qa3.questions (
	id SMALLSERIAL primary key,
	title VARCHAR(255) NOT NULL,
	description text,
	created_at TIMESTAMP(0),
	updated_at TIMESTAMP(0),
	user_id int,
	FOREIGN KEY (user_id) REFERENCES qa3.users (id) 
);
create table qa3.answers (
	id SMALLSERIAL primary key,
	question_id int not null, 
	content text,
	created_at TIMESTAMP(0),
	updated_at TIMESTAMP(0),
	user_id int,
	FOREIGN KEY (user_id) REFERENCES qa3.users (id),
	FOREIGN KEY (question_id) REFERENCES qa3.questions (id)
);


INSERT INTO qa3.questions (title, description, created_at, updated_at, user_id)
VALUES ('What is PostgreSQL?', 'Can any one give me a detailed explanation about PostgreSQL.', '2023-07-01 10:00:00', '2023-07-01 10:00:00', 1);

INSERT INTO qa3.answers (question_id, content, created_at, updated_at, user_id)
VALUES (1, 'PostgreSQL is a powerful, open-source object-relational database system.', '2023-07-01 11:00:00', '2023-07-01 11:00:00', NULL);

INSERT INTO qa3.users (email, photo, name)
VALUES 
('john.doe@example.com', 'https://pixabay.com/get/ge2c47b1559ca011f4c3a087fc02942df0cb465ef1719191aba3b904c11885859d2136901ff792bdf8c0e4164bcd5df6b3a6bd867ab57ef82e3f90157d5e7b86a_640.jpg', 'John Doe'),
('jane.smith@example.com', 'https://pixabay.com/get/gedea45170c223087f441039ed18331a1d1ad098985e7a3f1b45586f23b6fc48e55710aba4a849eb3999b07cd80e72e47c8b2d778ce4bc3e622eca8e9b04980ee_640.jpg', 'Jane Smith');


INSERT INTO qa3.questions (title, description, created_at, updated_at, user_id)
VALUES 
('When to use serail and when to use small serail?', 'Can any one explain the difference between both? I have confusion', '2023-07-01 10:00:00', '2023-07-01 10:00:00', 1),
('How to optimize SQL queries?', 'Best practices for optimizing SQL queries.', '2023-07-01 10:30:00', '2023-07-01 10:30:00', 2);


INSERT INTO qa3.answers (question_id, content, created_at, updated_at, user_id)
VALUES 
(1, 'PostgreSQL is a powerful, open-source object-relational database system.', '2023-07-01 11:00:00', '2023-07-01 11:00:00', 2),
(2, 'Use indexes to speed up your queries.', '2023-07-01 11:30:00', '2023-07-01 11:30:00', 1);

