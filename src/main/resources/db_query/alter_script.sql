-- ALTER TABLE CB.job_listing
-- ADD COLUMN user_id INT;


-- ALTER TABLE CB.job_listing 
-- ALTER COLUMN user_id SET NOT NULL;

-- ALTER TABLE CB.job_listing 
-- ADD CONSTRAINT fk_user_id
--     FOREIGN KEY (id)
--     REFERENCES CB.Users (id)
--     ON DELETE RESTRICT;


-- ALTER TABLE CB.job_listing
-- ALTER COLUMN category_id TYPE VARCHAR(50);

-- ALTER TABLE CB.users
-- RENAME COLUMN  username TO user_name;

-- ALTER TABLE CB.Job_Listing
-- DROP CONSTRAINT fk_user_id;

ALTER TABLE CB.Job_Listing
ADD CONSTRAINT fk_user_id
FOREIGN KEY (user_id)
REFERENCES CB.Users (id)
ON DELETE CASCADE; -- Changed from RESTRICT to CASCADE