SET search_path TO medical;

DELETE FROM illness;
DELETE FROM address;
DELETE FROM person_data;
DELETE FROM medical_card;
DELETE FROM contact;

INSERT INTO contact (id, phone_number, email, profile_link) VALUES (1, '2558843', 'adf', 'j.com');
INSERT INTO contact (id, phone_number, email, profile_link) VALUES (2, '2558843', 'adf', 'j.com');
INSERT INTO contact (id, phone_number, email, profile_link) VALUES (3, '2558843', 'adf', 'j.com');
INSERT INTO contact (id, phone_number, email, profile_link) VALUES (4, '2558844', 'adfasd', 'adfasd.com');

INSERT INTO medical_card (id, client_status, med_status, registry_dt, comment) VALUES (1, 'd', '1', '2000-02-15', '1');
INSERT INTO medical_card (id, client_status, med_status, registry_dt, comment) VALUES (2, 'd', '1', '2012-03-10', '1');
INSERT INTO medical_card (id, client_status, med_status, registry_dt, comment) VALUES (3, 'i', '1', '2003-03-03', '1');

INSERT INTO address (id, contact_id, country_id, city, index, street, building, flat) VALUES (1, 1, 13, 'NN', 1313, 'B', '6', '15');
INSERT INTO address (id, contact_id, country_id, city, index, street, building, flat) VALUES (2, 2, 13, 'NN', 1313, 'P', '2', '2');
INSERT INTO address (id, contact_id, country_id, city, index, street, building, flat) VALUES (3, 3, 13, 'SP', 14, 'B', '13', '23');
INSERT INTO address (id, contact_id, country_id, city, index, street, building, flat) VALUES (4, 4, 13, 'NN', 4242, 'P', '56', '13');

INSERT INTO person_data (id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (1, 'A', 'A', '2000-02-15', 1, 'M', 1, 1, null);
INSERT INTO person_data (id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (2, 'B', 'B', '2000-02-15', 1, 'F', 2, 2, 1);
INSERT INTO person_data (id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (3, 'C', 'C', '2000-02-15', null, 'M', 3, 3, null);


