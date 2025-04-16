CREATE TABLE usuarios (
	id UUID PRIMARY KEY,
	pessoa_id UUID NOT NULL,
	password VARCHAR(50) NOT NULL,
	login VARCHAR(50) NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE NOT NULL,
	updated_at TIMESTAMP WITH TIME ZONE NOT NULL
	
	CONSTRAINT fk_usuario_pessoa
		FOREIGN KEY (pessoa_id)
		REFERENCES pessoas(id)
)