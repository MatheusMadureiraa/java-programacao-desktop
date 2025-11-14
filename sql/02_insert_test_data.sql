-- Script para inserção de dados de teste
-- Banco: PostgreSQL

-- Dados de teste para Clientes
INSERT INTO clientes (id, nome, email, telefone) VALUES
(1, 'João Silva', 'joao.silva@email.com', '(41) 99999-1111'),
(2, 'Maria Santos', 'maria.santos@email.com', '(41) 99999-2222'),
(3, 'Pedro Oliveira', 'pedro.oliveira@email.com', '(41) 99999-3333'),
(4, 'Ana Costa', 'ana.costa@email.com', '(41) 99999-4444'),
(5, 'Carlos Souza', 'carlos.souza@email.com', '(41) 99999-5555');

-- Dados de teste para Funcionários
INSERT INTO funcionarios (id, nome, telefone, salario, cargo) VALUES
(1, 'Roberto Almeida', '(41) 98888-1111', 3500.00, 'Eletricista'),
(2, 'Fernanda Lima', '(41) 98888-2222', 4200.00, 'Engenheira Elétrica'),
(3, 'Lucas Pereira', '(41) 98888-3333', 2800.00, 'Auxiliar Técnico'),
(4, 'Juliana Martins', '(41) 98888-4444', 3200.00, 'Técnica em Eletrônica'),
(5, 'Ricardo Ferreira', '(41) 98888-5555', 5000.00, 'Supervisor');

-- Dados de teste para Serviços
INSERT INTO servicos (id, descricao, preco, duracao_minutos) VALUES
(1, 'Instalação Elétrica Residencial', 450.00, 180),
(2, 'Manutenção Preventiva', 200.00, 90),
(3, 'Troca de Disjuntores', 150.00, 60),
(4, 'Instalação de Tomadas', 80.00, 45),
(5, 'Projeto Elétrico Completo', 1200.00, 480);
