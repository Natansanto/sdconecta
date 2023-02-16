CREATE TABLE IF NOT EXISTS public.perfil
(
    id bigint NOT NULL,
    bio character varying(255) ,
    email character varying(255) ,
    empresa character varying(255) ,
    foto_url character varying(255) ,
    link_perfil character varying(255) ,
    localizacao character varying(255) ,
    nome character varying(255) ,
    repositorios character varying(255) ,
    data_hora_inclusao timestamp without time zone,
    CONSTRAINT perfil_pkey PRIMARY KEY (id)
)