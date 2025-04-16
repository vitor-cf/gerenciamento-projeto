CREATE TABLE pessoas (
	id UUID PRIMARY KEY,
	nome VARCHAR(150) NOT NULL,
	email_institucional VARCHAR(100) NOT NULL UNIQUE,
	escola_departamento VARCHAR(100),
	perfil_id UUID NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE NOT NULL,
	updated_at TIMESTAMP WITH TIME ZONE NOT NULL,
	
	CONSTRAINT fk_pessoa_perfil
		FOREIGN KEY (perfil_id)
		REFERENCES perfis(id)
)
