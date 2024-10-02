-- ext
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- tables
CREATE TABLE "user"
(
    id character varying(36) not null DEFAULT gen_random_uuid(),
    first_name character varying(100),
    second_name character varying(100),
    birthdate date,
    biography text,
    city character varying(100),
    password character varying(100)
);