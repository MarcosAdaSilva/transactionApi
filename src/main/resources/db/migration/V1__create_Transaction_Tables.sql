CREATE TABLE tb_transactions (
                                 transaction_id UUID PRIMARY KEY,
                                 total DECIMAL(19,2) NOT NULL,
                                 created_at TIMESTAMP NOT NULL,
                                 card_number VARCHAR(16) NOT NULL,
                                 cvv VARCHAR(4) NOT NULL,
                                 owner VARCHAR(100) NOT NULL,
                                 ein VARCHAR(20) NOT NULL
);