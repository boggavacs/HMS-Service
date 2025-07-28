CREATE SCHEMA IF NOT EXISTS CB AUTHORIZATION root;

CREATE TABLE IF NOT EXISTS CB.Job_Listing(
    id SERIAL PRIMARY KEY, -- SERIAL for auto-incrementing integer ID
    company VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
    category_id INT, -- Assuming this links to a categories table
    location VARCHAR(255),
    short_description VARCHAR(500), -- Shorter text field
    long_description TEXT,           -- Longer text field
    instructions TEXT,
    status VARCHAR(50) DEFAULT 'active', -- Common status like 'active', 'closed', 'draft'
    job_listing_type VARCHAR(50) DEFAULT 'full-time', -- e.g., 'full-time', 'part-time', 'contract'
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    expires_at TIMESTAMP WITH TIME ZONE

    -- CONSTRAINT fk_user
);


CREATE TABLE IF NOT EXISTS CB.Users (
    id SERIAL PRIMARY KEY, -- Auto-incrementing integer, unique identifier for each user.
    username VARCHAR(100) UNIQUE NOT NULL, -- User's unique username. Cannot be empty.
    email VARCHAR(255) UNIQUE NOT NULL,    -- User's unique email address. Cannot be empty.
    first_name VARCHAR(100),               -- User's first name.
    last_name VARCHAR(100),                -- User's last name.
    active BOOLEAN DEFAULT TRUE,           -- Indicates if the user account is active. Defaults to TRUE.
    password VARCHAR(255) NOT NULL,        -- Hashed password for the user. Cannot be empty. (Store hashes, not plain text!)
    avatar_url TEXT,                       -- URL to the user's avatar image. TEXT for potentially long URLs.
    role VARCHAR(50) DEFAULT 'user',       -- User's role (e.g., 'user', 'admin', 'moderator'). Defaults to 'user'.
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP, -- Timestamp of user creation.
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP, -- Timestamp of last update.
    expires_at TIMESTAMP WITH TIME ZONE    -- Optional: Timestamp when the user account or session expires.
);