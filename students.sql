CREATE TABLE IF NOT EXISTS students(
    id INT NOT NULL,
    name VARCHAR(45) NOT NULL,
    mobile BIGINT(12) NULL,
    country VARCHAR(45) NULL,
    PRIMARY KEY(id)
);

INSERT INTO students(id, name, mobile, country) VALUES (1, 'Frank', 0123456789, 'Vietnam');
INSERT INTO students(id, name, mobile, country) VALUES (2, 'Jeff', 0123456788, 'US');
INSERT INTO students(id, name, mobile, country) VALUES (3, 'Patrik', 0123456787, 'US');