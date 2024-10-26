create table people_v2_csv (
  fi_names character varying(100),
  birthdate date,
  city character varying(100),
  id bigserial,
  CONSTRAINT people_v2_csv_pk PRIMARY KEY (id)
);

copy people_v2_csv(fi_names, birthdate, city)
from '/tmp/HL/people.v2.csv'
delimiter ',';

insert into "user"
  (first_name, second_name, birthdate, biography, city, password)
select
  substring(fi_names, position(' ' IN fi_names) + 1) AS first_name,
  left(fi_names, position(' ' IN fi_names)) AS second_name,
  birthdate,
  'жил был',
  city,
  '$2a$10$xZo/badjLmSgojkroXbjse4TiEOb0mM9PXtbNzYcMBk6SSGnXA/j6'
from people_v2_csv;