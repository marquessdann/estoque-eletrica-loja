# Estoque de Loja Elétrica – Java

## Descrição
Aplicação console desenvolvida em Java com o objetivo de simular o controle
básico de estoque de uma loja de materiais elétricos.  
O projeto utiliza conceitos fundamentais de Programação Orientada a Objetos
(POO) e estruturas de dados da API padrão do Java.

## Tecnologias Utilizadas
- Java SE
- Collections Framework (`List`, `ArrayList`)

## Arquitetura do Projeto

### Classe `Produto`
Classe de domínio responsável por representar um item do estoque.

**Atributos:**
- `nome` (`String`): nome do produto
- `categoria` (`String`): categoria à qual o produto pertence
- `preco` (`double`): preço unitário do produto

**Responsabilidades:**
- Encapsular os dados do produto
- Disponibilizar métodos de acesso (`getters`)
- Definir uma representação textual por meio do método `toString()`

### Classe `EstoqueLojaEletrica`
Classe principal da aplicação, contendo o método `main`.

**Responsabilidades:**
- Inicializar listas de produtos organizadas por categoria
- Instanciar objetos do tipo `Produto`
- Exibir os produtos de forma estruturada no console
- Calcular o valor total dos produtos por categoria

## Funcionamento
1. São criadas listas do tipo `List<Produto>` para cada categoria de produtos.
2. Os produtos são instanciados e adicionados às respectivas listas.
3. A aplicação percorre cada lista utilizando laços `for-each` para exibição.
4. O valor total dos produtos é calculado por meio da soma dos preços individuais.
5. Os resultados são exibidos no console.

## Execução
Para executar o projeto:

```bash
javac estoqueLojaEletrica.java
java estoqueLojaEletrica
