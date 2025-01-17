-- Exemplo de migração inicial
CREATE TABLE IF NOT EXISTS transactions (
                                            id SERIAL PRIMARY KEY,
                                            description VARCHAR(255) NOT NULL,
                                            amount DECIMAL(10,2) NOT NULL,
                                            created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);