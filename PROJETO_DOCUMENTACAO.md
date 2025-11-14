# Sistema de Gerenciamento - Empresa de Eletrificação

## Trabalho Prático - Programação Desktop com JDBC

**Disciplina:** Programação Desktop
**Instituição:** UTFPR
**Objetivo:** Implementar conectividade Java Desktop com banco de dados PostgreSQL usando JDBC

---

## Índice

1. [Descrição do Projeto](#descrição-do-projeto)
2. [Requisitos Atendidos](#requisitos-atendidos)
3. [Arquitetura do Sistema](#arquitetura-do-sistema)
4. [Estrutura de Diretórios](#estrutura-de-diretórios)
5. [Configuração e Instalação](#configuração-e-instalação)
6. [Execução do Sistema](#execução-do-sistema)
7. [Funcionalidades Implementadas](#funcionalidades-implementadas)
8. [Tecnologias Utilizadas](#tecnologias-utilizadas)

---

## Descrição do Projeto

Sistema desktop desenvolvido em Java para gerenciar três entidades de uma empresa de eletrificação:

- **Clientes** - Cadastro de clientes da empresa
- **Funcionários** - Gerenciamento de funcionários
- **Serviços** - Controle de serviços oferecidos

O sistema implementa operações CRUD completas (Create, Read, Update, Delete) para cada entidade, utilizando:
- **JDBC** para conectividade com PostgreSQL
- **PreparedStatement** para execução segura de queries
- **Padrões MVC e DAO** para organização do código
- **Swing** para interface gráfica

---

## Requisitos Atendidos

### 1. Conectividade JDBC com PostgreSQL ✅
- Implementado usando `java.sql.*`
- Configuração via arquivo `configuracaobd.properties`
- Driver PostgreSQL: `org.postgresql.Driver`

### 2. Três Janelas com CRUD Completo ✅

**a) JanelaCliente** (`view/JanelaCliente.java`)
- Campos: ID, Nome, Email, Telefone
- Operações: Insert, Update, Delete, Query (navegação entre registros)

**b) JanelaFuncionario** (`view/JanelaFuncionario.java`)
- Campos: ID, Nome, Telefone, Salário, Cargo
- Operações: Insert, Update, Delete, Query (navegação entre registros)

**c) JanelaServico** (`view/JanelaServico.java`)
- Campos: ID, Descrição, Preço, Duração (minutos)
- Operações: Insert, Update, Delete, Query (navegação entre registros)

### 3. PreparedStatement ✅
- Todas as operações utilizam `PreparedStatement`
- Prevenção de SQL Injection
- Queries parametrizadas

### 4. Padrões MVC e DAO ✅

**MVC (Model-View-Controller):**
- **Model:** `model/Cliente.java`, `model/Funcionario.java`, `model/Servico.java`
- **View:** Todas as classes em `view/`
- **Controller:** Lógica nas classes DAO

**DAO (Data Access Object):**
- `dao/ClienteDAO.java`
- `dao/FuncionarioDAO.java`
- `dao/ServicoDAO.java`

### 5. Classe JDBCUtil ✅
- Utilitário para operações comuns do JDBC
- Métodos de navegação: `MovPrimeiro()`, `MovProximo()`, `MovAnterior()`, `MovUltimo()`
- Gerenciamento de conexão centralizado

### 6. Scripts SQL ✅
- `sql/01_create_tables.sql` - Criação das tabelas
- `sql/02_insert_test_data.sql` - Dados de teste

---

## Arquitetura do Sistema

### Padrão MVC + DAO

```
┌─────────────────────────────────────────┐
│          CAMADA VIEW (Interface)        │
│  MenuPrincipal, JanelaCliente,          │
│  JanelaFuncionario, JanelaServico       │
└──────────────┬──────────────────────────┘
               │
               ↓
┌─────────────────────────────────────────┐
│        CAMADA DAO (Acesso a Dados)      │
│  ClienteDAO, FuncionarioDAO,            │
│  ServicoDAO                             │
└──────────────┬──────────────────────────┘
               │
               ↓
┌─────────────────────────────────────────┐
│         CAMADA MODEL (Entidades)        │
│  Cliente, Funcionario, Servico          │
└──────────────┬──────────────────────────┘
               │
               ↓
┌─────────────────────────────────────────┐
│       BANCO DE DADOS (PostgreSQL)       │
│  Tabelas: clientes, funcionarios,       │
│           servicos                      │
└─────────────────────────────────────────┘
```

---

## Estrutura de Diretórios

```
project/
├── src/
│   ├── model/                  # Entidades do sistema
│   │   ├── Cliente.java
│   │   ├── Funcionario.java
│   │   └── Servico.java
│   │
│   ├── view/                   # Interface gráfica (GUI)
│   │   ├── MenuPrincipal.java
│   │   ├── JanelaCliente.java
│   │   ├── JanelaFuncionario.java
│   │   └── JanelaServico.java
│   │
│   ├── dao/                    # Acesso a dados
│   │   ├── ClienteDAO.java
│   │   ├── FuncionarioDAO.java
│   │   └── ServicoDAO.java
│   │
│   └── util/                   # Utilitários
│       └── JDBCUtil.java
│
├── sql/                        # Scripts do banco de dados
│   ├── 01_create_tables.sql
│   └── 02_insert_test_data.sql
│
├── configuracaobd.properties   # Configuração do banco
└── PROJETO_DOCUMENTACAO.md     # Este arquivo
```

---

## Configuração e Instalação

### Pré-requisitos

1. **Java JDK 8 ou superior**
2. **PostgreSQL 9.6 ou superior**
3. **Driver JDBC do PostgreSQL** (`postgresql-XX.X.X.jar`)
4. **IDE NetBeans ou Eclipse** (opcional, mas recomendado)

### Passo 1: Configurar o Banco de Dados

```sql
-- 1. Criar o banco de dados no PostgreSQL (se necessário)
CREATE DATABASE postgres;

-- 2. Executar o script de criação de tabelas
\i sql/01_create_tables.sql

-- 3. Executar o script de dados de teste
\i sql/02_insert_test_data.sql
```

### Passo 2: Configurar a Conexão

Edite o arquivo `configuracaobd.properties`:

```properties
jdbc.url=jdbc:postgresql://localhost:5432/postgres
jdbc.username=postgres
jdbc.password=123456
jdbc.driver=org.postgresql.Driver
```

**IMPORTANTE:** Ajuste `username` e `password` conforme seu ambiente.

### Passo 3: Adicionar o Driver JDBC

1. Baixe o driver PostgreSQL JDBC em: https://jdbc.postgresql.org/
2. Adicione o arquivo `.jar` ao classpath do projeto
3. No NetBeans: Botão direito no projeto → Properties → Libraries → Add JAR/Folder

---

## Execução do Sistema

### Opção 1: Via IDE

1. Abra o projeto no NetBeans ou Eclipse
2. Localize a classe `view/MenuPrincipal.java`
3. Clique com botão direito → Run File (ou pressione Shift+F6)

### Opção 2: Via Linha de Comando

```bash
# Compilar
javac -cp .:postgresql-XX.X.X.jar src/**/*.java

# Executar
java -cp .:postgresql-XX.X.X.jar:src view.MenuPrincipal
```

---

## Funcionalidades Implementadas

### Menu Principal
- Acesso aos três módulos de gerenciamento
- Botão de saída do sistema

### Módulo de Clientes

**Navegação:**
- Primeiro registro
- Registro anterior
- Próximo registro
- Último registro

**Operações CRUD:**
- **Abre BD:** Conecta ao banco de dados e carrega registros
- **Novo:** Limpa campos para nova inserção
- **Inserir:** Adiciona novo cliente ao banco
- **Alterar:** Modifica dados do cliente atual
- **Excluir:** Remove cliente do banco
- **Fechar:** Fecha a janela e desconecta

### Módulo de Funcionários

**Mesmas funcionalidades do módulo de Clientes, adaptadas para:**
- Nome
- Telefone
- Salário
- Cargo

### Módulo de Serviços

**Mesmas funcionalidades do módulo de Clientes, adaptadas para:**
- Descrição
- Preço
- Duração em minutos

---

## Tecnologias Utilizadas

| Tecnologia | Versão | Finalidade |
|------------|--------|------------|
| Java | 8+ | Linguagem de programação |
| PostgreSQL | 9.6+ | Banco de dados relacional |
| JDBC | 4.0+ | Conectividade com banco de dados |
| Swing | Nativo Java | Interface gráfica |
| PreparedStatement | JDBC | Execução segura de queries |

---

## Padrões de Projeto Aplicados

### 1. MVC (Model-View-Controller)
- Separação clara entre camadas
- Model: representação dos dados
- View: interface com o usuário
- Controller: lógica de negócio (dentro dos DAOs)

### 2. DAO (Data Access Object)
- Abstração do acesso a dados
- Encapsulamento de operações CRUD
- Independência da lógica de negócio

### 3. Singleton (Implícito)
- JDBCUtil gerencia conexões de forma centralizada

---

## Operações CRUD Detalhadas

### CREATE (Inserir)

```java
// Exemplo: ClienteDAO
public boolean Inserir(Cliente cli) {
    String sql = "INSERT INTO clientes (id, nome, email, telefone) VALUES (?, ?, ?, ?)";
    pstdados = connection.prepareStatement(sql);
    pstdados.setInt(1, cli.getId());
    pstdados.setString(2, cli.getNome());
    // ...
    int resposta = pstdados.executeUpdate();
    connection.commit();
}
```

### READ (Consultar)

```java
// Navegação pelo ResultSet
public boolean ConsultarTodos() {
    String sql = "SELECT * FROM clientes ORDER BY nome";
    pstdados = connection.prepareStatement(sql);
    rsdados = pstdados.executeQuery();
    return true;
}
```

### UPDATE (Alterar)

```java
public boolean Alterar(Cliente cli) {
    String sql = "UPDATE clientes SET nome = ?, email = ?, telefone = ? WHERE id = ?";
    pstdados = connection.prepareStatement(sql);
    // ... set parameters
    int resposta = pstdados.executeUpdate();
    connection.commit();
}
```

### DELETE (Excluir)

```java
public boolean Excluir(Cliente cli) {
    String sql = "DELETE FROM clientes WHERE id = ?";
    pstdados = connection.prepareStatement(sql);
    pstdados.setInt(1, cli.getId());
    int resposta = pstdados.executeUpdate();
    connection.commit();
}
```

---

## Características Técnicas

### Controle Transacional
- `connection.setAutoCommit(false)` - Desabilita commit automático
- `connection.commit()` - Confirma transação
- `connection.rollback()` - Reverte transação em caso de erro

### Tratamento de Erros
- Try-catch em todas as operações críticas
- Mensagens descritivas para o usuário via `JOptionPane`
- Logs no console para debug

### Segurança
- Uso de PreparedStatement previne SQL Injection
- Senhas devem ser armazenadas de forma segura (não implementado neste protótipo)

---

## Testes Realizados

### Cenários de Teste

1. **Conexão com Banco de Dados**
   - Sucesso ao conectar
   - Falha por credenciais incorretas
   - Falha por banco indisponível

2. **Operação INSERT**
   - Inserção com sucesso
   - Tentativa de inserir ID duplicado
   - Campos obrigatórios vazios

3. **Operação UPDATE**
   - Alteração com sucesso
   - Tentativa de alterar registro inexistente

4. **Operação DELETE**
   - Exclusão com sucesso
   - Tentativa de excluir registro inexistente

5. **Navegação**
   - Primeiro, Anterior, Próximo, Último
   - Comportamento em lista vazia

---

## Melhorias Futuras (Não Implementadas)

1. Validação mais robusta de campos
2. Busca por filtros
3. Relatórios em PDF
4. Auto-incremento de IDs
5. Interface mais moderna (JavaFX)
6. Logs de auditoria
7. Criptografia de senha

---

## Observações Importantes

1. **Arquivo de Configuração:** O arquivo `configuracaobd.properties` deve estar no diretório raiz do projeto

2. **Versão Anterior:** Os arquivos da implementação anterior (usando arquivos binários) foram movidos para:
   - `src/controller/old_binary_version/`
   - `src/view/old_binary_version/`

3. **Entidades:** As classes de modelo agora incluem campo `id` (int) como chave primária

4. **Commit Manual:** O sistema usa controle transacional manual (`autoCommit = false`)

---

## Contato e Suporte

Para dúvidas ou problemas:
- Revise a documentação do PostgreSQL JDBC
- Verifique as configurações de conexão
- Confira se as tabelas foram criadas corretamente
- Valide se o driver JDBC está no classpath

---

## Licença

Projeto desenvolvido para fins educacionais - UTFPR

---

**Trabalho Prático - Programação Desktop com JDBC**
**Implementação Individual - MVC + DAO + PreparedStatement**
