
/**
 * Author:  mathe
 * Created: 17 de nov. de 2025
 */

/*SCRIPTS PARA GERAR AS TABELAS E POPULAR*/

/* CLIENTES */
CREATE TABLE clientes (
    id INTEGER,
    nome VARCHAR(100),
    email VARCHAR(100),
    fone VARCHAR(30)
);

INSERT INTO clientes VALUES (1, 'Ana', 'ana.souza@email.com', '4399999-1111');
INSERT INTO clientes VALUES (2, 'Bruno', 'bruno.lima@email.com', '4398888-2222');
INSERT INTO clientes VALUES (3, 'Carla', 'carla.mendes@email.com', '4397777-3333');

/* FUNCIONARIOS */
CREATE TABLE funcionarios (
    id INTEGER,
    nome VARCHAR(100),
    telefone VARCHAR(50),
    salario FLOAT,
    cargo VARCHAR(50)
);

INSERT INTO funcionarios VALUES (1, 'Matheus', '333-333-33', 2500.00, 'engenheiro eletrico');
INSERT INTO funcionarios VALUES (2, 'Teste',   '333-333-22', 3300.00, 'engenheiro de software');
INSERT INTO funcionarios VALUES (3, 'Tres',    '443-444-33', 1000.00, 'estagiario');


/* SERVICOS */
CREATE TABLE servicos (
    id INTEGER,
    descricao VARCHAR(200),
    preco FLOAT,
    duracaoDias INTEGER
);

INSERT INTO servicos VALUES (1, 'Limpeza Completa', 250.00, 3);
INSERT INTO servicos VALUES (2, 'Manutenção Elétrica', 180.00, 1);
INSERT INTO servicos VALUES (3, 'Reforma de Pintura', 1200.00, 7);
