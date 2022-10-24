SET search_path TO medical;

SELECT *
FROM address
    JOIN medical_card ON address.contact_id = medical_card.id
