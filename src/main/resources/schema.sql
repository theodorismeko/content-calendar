CREATE TABLE IF NOT EXISTS Content (
      id SERIAL primary key,
      title varchar(255) NOT NULL,
      description text,
      status varchar(20) not null,
      content_type varchar(50) not null,
      date_created timestamp not null,
      date_updated timestamp,
      url varchar(255)
);

--insert into Content(title, desc, status, content_type, date_created)
--values ('My Spring Data Blog Post', 'A post about spring data', 'IDEA', 'ARTICLE', current_timestamp());