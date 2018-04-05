##BASE DE DATOS: album
##owner admin --- admin

CREATE TABLE public."user"
(
    email text NOT NULL,
    password text NOT NULL
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."user"
    OWNER to admin;


    

CREATE TABLE public.ficha
(
    numficha integer NOT NULL,
    encontrada boolean NOT NULL,
    PRIMARY KEY (numficha)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.ficha
    OWNER to admin;