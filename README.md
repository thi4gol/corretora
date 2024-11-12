# Corretora API RESTful

## Português

### Visão Geral

Esta API RESTful para uma corretora de investimentos simula um ambiente de mercado financeiro, permitindo a realização de operações de compra e venda de ativos. A aplicação foi desenvolvida em Java com o Spring Boot, utilizando o MongoDB para armazenamento de dados, garantindo desempenho e escalabilidade. A API foi projetada seguindo princípios de arquitetura limpa e boas práticas de desenvolvimento.

### Arquitetura

- **Camada de Controller**: Recebe as requisições HTTP e controla o fluxo de execução das operações.
- **Camada de Serviço**: Lógica de negócios, como validação de transações e atualização de saldos, é implementada nesta camada.
- **Camada de Repositório**: Interage com o banco de dados MongoDB para persistência dos dados dos usuários, transações e ativos.
- **MongoDB**: Utilizado para armazenamento não relacional, com documentos organizados em coleções.

### Principais Funcionalidades

1. **Cadastro e Autenticação de Usuários**
   - Criação de contas e autenticação básica via JWT para segurança das operações.

2. **Operações de Investimento**
   - **Compra de Ativos**: Executa a compra de ações e outros ativos. Valida o saldo disponível antes de processar a operação.
   - **Venda de Ativos**: Realiza a venda dos ativos adquiridos, verificando a quantidade de ações disponíveis.

3. **Gestão de Carteira e Saldos**
   - Exibe a carteira atual do usuário, com detalhes de cada ativo.
   - Consulta e atualização de saldo da conta para as operações.

4. **Histórico de Transações**
   - Armazena o histórico completo de transações, permitindo consultas detalhadas de operações passadas.

### Tecnologias e Dependências

- **Java 17**: Versão base da linguagem de programação.
- **Spring Boot**: Framework para construção da API, com módulos de Spring Data e Spring Security.
- **MongoDB**: Banco de dados NoSQL usado para armazenar os documentos de usuários e transações.
- **JWT (JSON Web Token)**: Utilizado para autenticação e autorização das requisições.
- **Maven**: Ferramenta de gerenciamento de dependências e construção do projeto.

### Instalação e Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/thi4gol/corretora.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd corretora
   ```
3. Compile e inicie a aplicação:
   ```bash
   mvn spring-boot:run
   ```

### Endpoints Principais

- **Autenticação**
  - **POST /auth/signup** - Criação de uma nova conta de usuário.
  - **POST /auth/login** - Login de usuário e obtenção de token JWT.

- **Conta**
  - **GET /conta/saldo** - Consulta o saldo disponível na conta.
  - **PUT /conta/deposito** - Realiza um depósito para aumentar o saldo disponível.
  - **PUT /conta/saque** - Realiza um saque para reduzir o saldo.

- **Operações de Investimento**
  - **POST /transacao/compra** - Compra de ações, validando o saldo e registrando a transação.
  - **POST /transacao/venda** - Venda de ações com atualização do saldo e carteira.

- **Carteira e Histórico**
  - **GET /carteira** - Exibe a carteira do usuário com todos os ativos.
  - **GET /historico** - Exibe o histórico completo de transações do usuário.

---

## English

### Overview

This RESTful API simulates a stock brokerage platform, providing functionality for buying and selling assets, portfolio management, and transaction tracking. Developed with Java using Spring Boot, it uses MongoDB for efficient and scalable data storage. The architecture follows clean code principles, separating layers to ensure maintainability and scalability.

### Architecture

- **Controller Layer**: Receives HTTP requests and routes to the appropriate service.
- **Service Layer**: Business logic layer, where transaction validation and balance updates occur.
- **Repository Layer**: Handles data persistence with MongoDB for users, transactions, and assets.
- **MongoDB**: NoSQL database, storing documents in collections for quick access and flexibility.

### Key Features

1. **User Registration and Authentication**
   - User account creation and JWT-based authentication to secure operations.

2. **Investment Operations**
   - **Asset Purchase**: Handles asset purchases by verifying available balance and processing transactions.
   - **Asset Sale**: Executes asset sales by checking available asset quantities in the portfolio.

3. **Portfolio and Balance Management**
   - Displays the user's current portfolio with asset details.
   - Balance inquiries and updates for operations.

4. **Transaction History**
   - Stores a complete transaction history for detailed tracking of past operations.

### Technologies and Dependencies

- **Java 17**: Programming language version.
- **Spring Boot**: Framework for building the API, with Spring Data and Spring Security modules.
- **MongoDB**: NoSQL database used to store user and transaction documents.
- **JWT (JSON Web Token)**: Used for request authentication and authorization.
- **Maven**: Dependency management and project build tool.

### Installation and Execution

1. Clone the repository:
   ```bash
   git clone https://github.com/thi4gol/corretora.git
   ```
2. Navigate to the project directory:
   ```bash
   cd corretora
   ```
3. Build and start the application:
   ```bash
   mvn spring-boot:run
   ```

### Key Endpoints

- **Authentication**
  - **POST /auth/signup** - Creates a new user account.
  - **POST /auth/login** - User login and JWT token issuance.

- **Account**
  - **GET /conta/saldo** - Checks the available account balance.
  - **PUT /conta/deposito** - Deposits to increase the available balance.
  - **PUT /conta/saque** - Withdraws from the balance.

- **Investment Operations**
  - **POST /transacao/compra** - Buys stocks, validating balance and recording the transaction.
  - **POST /transacao/venda** - Sells stocks, updating the balance and portfolio.

- **Portfolio and History**
  - **GET /carteira** - Shows the user’s portfolio with all assets.
  - **GET /historico** - Displays the user's complete transaction history.

--- 
