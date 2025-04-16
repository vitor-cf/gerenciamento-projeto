CREATE TABLE GRUPOS (
	id UUID PRIMARY KEY
	nome VARCHAR(50) NOT NULL
	coordenador_id UUID NOT NULL
	ativo boolean NOT NULL
	descricao text
	created_at TIMESTAMP WITH TIME ZONE NOT NULL,
	updated_at TIMESTAMP WITH TIME ZONE NOT NULL
	
		CONSTRAINT fk_grupo_coordenador
			FOREIGN KEY (pessoa_id)
			REFERENCES pessoas(id)
)