# Guia Rápido de Execução

## Passo a Passo para Executar o Projeto

### 1. Preparar o Banco de Dados PostgreSQL

```bash
# Conectar ao PostgreSQL
psql -U postgres

# Executar os scripts SQL (dentro do psql)
\i sql/01_create_tables.sql
\i sql/02_insert_test_data.sql

# Verificar se as tabelas foram criadas
\dt

# Verificar se os dados foram inseridos
SELECT * FROM clientes;
SELECT * FROM funcionarios;
SELECT * FROM servicos;
```

### 2. Verificar Configuração

Abra o arquivo `configuracaobd.properties` e ajuste se necessário:

```properties
jdbc.url=jdbc:postgresql://localhost:5432/postgres
jdbc.username=postgres
jdbc.password=123456
jdbc.driver=org.postgresql.Driver
```

### 3. Adicionar Driver JDBC

**No NetBeans:**
1. Botão direito no projeto → Properties
2. Libraries → Add JAR/Folder
3. Selecione o arquivo `postgresql-XX.X.X.jar`

**No Eclipse:**
1. Botão direito no projeto → Build Path → Configure Build Path
2. Libraries → Add External JARs
3. Selecione o arquivo `postgresql-XX.X.X.jar`

### 4. Executar o Sistema

**Classe principal:** `view.MenuPrincipal`

**No NetBeans:**
1. Abra `src/view/MenuPrincipal.java`
2. Pressione `Shift + F6` ou clique em Run File

**No Eclipse:**
1. Abra `src/view/MenuPrincipal.java`
2. Botão direito → Run As → Java Application

### 5. Usar o Sistema

#### No Menu Principal:
- Clique em "Gerenciar Clientes" para abrir a tela de clientes
- Clique em "Gerenciar Funcionários" para abrir a tela de funcionários
- Clique em "Gerenciar Serviços" para abrir a tela de serviços

#### Em Cada Tela:
1. **Primeiro, clique em "Abre BD"** para conectar ao banco de dados
2. Use os botões de navegação para ver os registros existentes
3. Clique em "Novo" para limpar os campos
4. Preencha os campos e clique em "Inserir" para adicionar
5. Modifique um registro e clique em "Alterar" para atualizar
6. Clique em "Excluir" para remover o registro atual

---

## Problemas Comuns

### Erro: "Falha ao carregar o driver JDBC"
**Solução:** Certifique-se de que o driver PostgreSQL JDBC está no classpath

### Erro: "Falha na conexao"
**Solução:**
- Verifique se o PostgreSQL está rodando
- Confirme usuário e senha no arquivo `configuracaobd.properties`
- Teste a conexão manualmente: `psql -U postgres -h localhost`

### Erro: "Tabela não existe"
**Solução:** Execute os scripts SQL:
```bash
psql -U postgres -f sql/01_create_tables.sql
```

### Janela não abre ao clicar nos botões
**Solução:** Verifique se o driver JDBC foi adicionado corretamente ao projeto

---

## Estrutura dos Dados de Teste

### Clientes (5 registros)
- IDs: 1 a 5
- Exemplo: João Silva, Maria Santos, Pedro Oliveira...

### Funcionários (5 registros)
- IDs: 1 a 5
- Exemplo: Roberto Almeida (Eletricista), Fernanda Lima (Eng. Elétrica)...

### Serviços (5 registros)
- IDs: 1 a 5
- Exemplo: Instalação Elétrica Residencial, Manutenção Preventiva...

---

## Download do Driver JDBC PostgreSQL

**Site oficial:** https://jdbc.postgresql.org/download/

**Versão recomendada:** 42.X.X (compatível com PostgreSQL 9.6+)

**Arquivo necessário:** `postgresql-42.X.X.jar`

---

## Checklist de Verificação

- [ ] PostgreSQL instalado e rodando
- [ ] Banco de dados criado
- [ ] Scripts SQL executados (tabelas + dados)
- [ ] Driver JDBC baixado
- [ ] Driver JDBC adicionado ao projeto
- [ ] Arquivo `configuracaobd.properties` configurado
- [ ] Projeto compilando sem erros
- [ ] Classe `MenuPrincipal` executando

Se todos os itens estiverem marcados, o sistema deve funcionar corretamente!
