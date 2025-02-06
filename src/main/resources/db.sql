DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    firstName VARCHAR(100),
    lastName VARCHAR(100)
);

INSERT INTO users (firstName, lastName) VALUES
    ('Alex', 'Dushkin'),
    ('Valentin', 'Prohorov'),
    ('Danil', 'Sidorov'),
    ('Ivan', 'Ivanov');