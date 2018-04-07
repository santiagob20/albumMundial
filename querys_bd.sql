##BASE DE DATOS: album
##owner admin --- admin

CREATE TABLE public."usuario"
(
    nombre text NOT NULL,
    apellido text NOT NULL,
    correo text NOT NULL,
    contrasena text NOT NULL,
    pais text NOT NULL,
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."usuario"
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