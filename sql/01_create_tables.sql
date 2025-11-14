-- Script para criação das tabelas do banco de dados
-- Banco: PostgreSQL
-- Autor: Sistema de Gerenciamento

-- Tabela de Clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(20)
);

-- Tabela de Funcionários
CREATE TABLE IF NOT EXISTS funcionarios (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    salario DECIMAL(10,2),
    cargo VARCHAR(50)
);

-- Tabela de Serviços
CREATE TABLE IF NOT EXISTS servicos (
    id INTEGER PRIMARY KEY,
    descricao VARCHAR(200) NOT NULL,
    preco DECIMAL(10,2),
    duracao_minutos INTEGER
);
