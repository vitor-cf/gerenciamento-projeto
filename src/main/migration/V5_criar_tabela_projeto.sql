CREATE TABLE projetos (
    id UUID PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    objetivo TEXT NOT NULL,
    data_inicio_prevista DATE NOT NULL,
    escopo TEXT,
    publico_alvo VARCHAR(150) NOT NULL,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP
);
