CREATE TABLE grupos (
    id UUID PRIMARY KEY,
    nome VARCHAR(50),
    coordenador_id UUID,
    ativo BOOLEAN NOT NULL DEFAULT TRUE,
    descricao TEXT,
    created_at TIMESTAMPTZ DEFAULT now(),
    updated_at TIMESTAMPTZ DEFAULT now(),

    CONSTRAINT fk_coordenador
        FOREIGN KEY (coordenador_id)
        REFERENCES pessoa(id)
);