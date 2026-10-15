# POO_PROVA_1

Projeto desenvolvido para a 1ª Avaliação Prática da disciplina de Programação Orientada a Objetos (POO) — Unidade 2, CEFET-MG (Unidade Campo Belo/MG).

## Descrição

O sistema simula o cadastro e gerenciamento de funcionários de uma empresa, permitindo associar cada funcionário a um departamento e a um cargo, além de realizar operações como atualização de dados, reajuste salarial e demissão.

## Tecnologia utilizada

- Java 17
- IDE: IntelliJ IDEA (ou qualquer IDE compatível com projetos Java padrão, sem uso de frameworks ou bibliotecas externas)

## Como executar o projeto

1. Clone o repositório:
   ```
   git clone https://github.com/<seu-usuario>/POO_PROVA_1.git
   ```
2. Acesse a pasta do projeto:
   ```
   cd POO_PROVA_1
   ```
3. Compile os arquivos-fonte (via terminal, a partir da raiz do projeto):
   ```
   javac -d bin src/*.java
   ```
4. Execute a classe principal:
   ```
   java -cp bin TesteSistema
   ```

> Alternativamente, basta importar a pasta `src/` como projeto Java em sua IDE de preferência e executar a classe `TesteSistema`.

## Descrição das classes

| Classe | Responsabilidade |
|---|---|
| `Departamento` | Representa um departamento da empresa. Possui o atributo `nome` e expõe getter/setter. Só pode ser instanciada via construtor parametrizado. |
| `Cargo` | Representa um cargo da empresa. Possui o atributo `nome` e expõe getter/setter. Só pode ser instanciada via construtor parametrizado. |
| `Funcionario` | Representa um funcionário, contendo `nome`, `cpf`, `departamento`, `cargo`, `salario` e `ativo`. Oferece construtor parametrizado (funcionário ativo por padrão) e construtor default (valores padrão, funcionário inativo). Implementa `alterarDados()`, `aplicarReajuste()`, `demitir()` e `toString()` para exibir os dados formatados, incluindo status ATIVO/INATIVO e tratamento de departamento/cargo não definidos. |
| `TesteSistema` | Classe contendo o método `main`, responsável por executar o roteiro de testes: criação de departamentos, cargos e funcionários, impressão de dados, alteração de dados, aplicação de reajuste salarial e demissão. |

## Aluno

- **Nome:** [Nome do Aluno]
- **Turma:** [Turma]
