# Resumo das Alterações - Trabalho Prático 2

## O QUE FOI MODIFICADO

### 1. MODELOS (Model)

#### Cliente.java
**ADICIONADO:**
- Atributo: `private String telefone;`
- Getter: `getTelefone()`
- Setter: `setTelefone(String telefone)`
- Atualizado construtor: `Cliente(String nome, String email, String telefone)`
- Atualizado `toString()` para incluir telefone

#### Funcionario.java
**ADICIONADO:**
- Atributo: `private String cargo;`
- Getter: `getCargo()`
- Setter: `setCargo(String cargo)`
- Atualizado construtor: `Funcionario(String nome, String telefone, double salario, String cargo)`
- Atualizado `toString()` para incluir cargo

#### Servico.java
**ADICIONADO:**
- Atributo: `private int duracaoMinutos;`
- Getter: `getDuracaoMinutos()`
- Setter: `setDuracaoMinutos(int duracaoMinutos)`
- Atualizado construtor: `Servico(String descricao, double preco, int duracaoMinutos)`
- Atualizado `toString()` para incluir duração

---

### 2. VIEWS (Interface Gráfica)

#### TelaCliente.java
**ADICIONADO:**
- Campo de texto: `txtTelefone`
- Label: `jLabel3` ("Telefone:")
- Método: `txtTelefoneActionPerformed()`

**MODIFICADO:**
- `limparCampos()` - limpa também txtTelefone
- `criarCliente()` - coleta e valida telefone
- `btnAtualizarMouseClicked()` - carrega e atualiza telefone
- `btnVisualizarMouseClicked()` - exibe telefone na listagem

#### TelaFuncionario.java
**ADICIONADO:**
- Campo de texto: `txtCargo`
- Label: `jLabel4` ("Cargo")
- Método: `txtCargoActionPerformed()`

**MODIFICADO:**
- `limparCampos()` - limpa também txtCargo
- `criarFuncionario()` - coleta e valida cargo
- `btnAtualizarMouseClicked()` - carrega e atualiza cargo
- `btnVisualizarMouseClicked()` - exibe cargo na listagem

#### TelaServico.java
**ADICIONADO:**
- Campo de texto: `txtDuracao`
- Label: `jLabel3` ("Duração (min)")
- Método: `txtDuracaoActionPerformed()`

**MODIFICADO:**
- `limparCampos()` - limpa também txtDuracao
- `criarServico()` - coleta e valida duração em minutos
- `btnAtualizarMouseClicked()` - carrega e atualiza duração
- `btnDeletarMouseClicked()` - considera duração na busca
- `btnVisualizarMouseClicked()` - exibe duração na listagem

---

### 3. CONTROLLERS (Não Modificados)

Os controllers já estavam implementados corretamente:
- ✅ `ControllerArquivo.java` - classe abstrata base
- ✅ `ControllerArquivoBinario.java` - controller genérico
- ✅ `ControllerClienteBinario.java` - CRUD de clientes
- ✅ `ControllerFuncionarioBinario.java` - CRUD de funcionários
- ✅ `ControllerServicoBinario.java` - CRUD de serviços

Todos já implementavam:
- Carregamento automático de dados (`lerArquivo()` no construtor)
- Salvamento automático após operações (`salvarArquivo()`)
- Operações CRUD completas
- Persistência em arquivos .dat separados

---

## FUNCIONAMENTO DO SISTEMA

### ARQUITETURA
```
┌─────────────────────────────────────┐
│          INTERFACE (View)           │
│  TelaCliente / TelaFuncionario /    │
│         TelaServico                 │
└──────────────┬──────────────────────┘
               │
               ↓
┌─────────────────────────────────────┐
│        CONTROLADOR (Controller)     │
│  ControllerClienteBinario /         │
│  ControllerFuncionarioBinario /     │
│  ControllerServicoBinario           │
└──────────────┬──────────────────────┘
               │
               ↓
┌─────────────────────────────────────┐
│           MODELO (Model)            │
│  Cliente / Funcionario / Servico    │
└──────────────┬──────────────────────┘
               │
               ↓
┌─────────────────────────────────────┐
│      PERSISTÊNCIA (Arquivos)        │
│  clientes.dat / funcionarios.dat /  │
│         servicos.dat                │
└─────────────────────────────────────┘
```

### FLUXO DE DADOS

#### AO INICIAR O PROGRAMA:
1. View cria instância do Controller
2. Controller automaticamente chama `lerArquivo()`
3. Se arquivo .dat existe, carrega ArrayList de objetos
4. Dados ficam disponíveis na memória

#### AO CADASTRAR (INSERT):
1. Usuário preenche campos na tela
2. Clica em "Cadastrar"
3. View valida campos e cria objeto
4. Controller adiciona à lista e chama `salvarArquivo()`
5. Dados salvos em .dat usando ObjectOutputStream

#### AO ATUALIZAR (UPDATE):
1. Usuário preenche campo de busca
2. Clica em "Atualizar"
3. Sistema busca registro na lista
4. **MOSTRA DADOS ATUAIS EM CAIXAS DE DIÁLOGO**
5. Usuário modifica apenas o necessário
6. Controller atualiza lista e salva arquivo

#### AO DELETAR (DELETE):
1. Usuário preenche campo de busca
2. Clica em "Deletar"
3. Sistema localiza e remove da lista
4. Controller salva arquivo atualizado

#### AO VISUALIZAR (CONSULT):
1. Usuário clica em "Visualizar Todos"
2. Sistema percorre ArrayList
3. Exibe todos os registros formatados

---

## VALIDAÇÕES IMPLEMENTADAS

### Cliente:
- ✅ Nome não pode estar vazio
- ✅ Email não pode estar vazio
- ✅ Telefone não pode estar vazio

### Funcionário:
- ✅ Nome não pode estar vazio
- ✅ Telefone não pode estar vazio
- ✅ Salário deve ser número decimal válido
- ✅ Cargo não pode estar vazio

### Serviço:
- ✅ Descrição não pode estar vazia
- ✅ Valor deve ser número decimal válido
- ✅ Duração deve ser número inteiro válido

---

## COMO TESTAR

### 1. Executar o projeto no NetBeans
### 2. Testar CRUD de Cliente:
   - Cadastrar cliente com nome, email e telefone
   - Visualizar - verificar se telefone aparece
   - Atualizar - verificar se carrega dados atuais
   - Deletar cliente

### 3. Testar CRUD de Funcionário:
   - Cadastrar funcionário com nome, telefone, salário e cargo
   - Visualizar - verificar se cargo aparece
   - Atualizar - verificar se carrega dados atuais
   - Deletar funcionário

### 4. Testar CRUD de Serviço:
   - Cadastrar serviço com descrição, valor e duração
   - Visualizar - verificar se duração aparece
   - Atualizar - verificar se carrega dados atuais
   - Deletar serviço

### 5. Verificar Persistência:
   - Cadastrar alguns registros
   - Fechar o programa
   - Reabrir o programa
   - Verificar se dados foram mantidos

### 6. Verificar arquivos criados:
   - `clientes.dat`
   - `funcionarios.dat`
   - `servicos.dat`

---

## CONCLUSÃO

✅ Todos os requisitos do professor foram atendidos
✅ Sistema mantém estilo de código original
✅ Atributos extras adicionados a todas as entidades
✅ CRUD completo funcional em todas as telas
✅ Persistência binária implementada corretamente
✅ Dados carregados automaticamente ao iniciar
✅ Um arquivo por classe (3 arquivos .dat)
✅ Update carrega dados existentes para edição
✅ Estrutura MVC mantida
✅ Controller genérico reutilizável

O sistema está pronto para apresentação e avaliação!
