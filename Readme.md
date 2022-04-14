# Curso Capgemini Logicade Programacao e Algoritmos III

## Apresentação do Conteúdo

- 1  Linguagem Java
- 2 Interfaces graficas utilizando swing
- 3 Iniciando o Projeto
- 5 Especificando um projeto
- 6 Iniciando a codificação


## Ferramentas Utilizadas

- IDE - NetBeans
- XAMP (mysql e apache)
- JDK(Java Development Kit)


## Java

Java é uma linguagem de programação orientada a objetos que começou a ser criada em 1991, na Sun Microsystems. Teve inicio com o Green Project, no qual os mentores foram Patrick Naughton, Mike Sheridan, e James Gosling.

Java se popularizou por que ela é multiplataforma, ela funciona em todos os Sistemas Operacionais.


![image](https://user-images.githubusercontent.com/52088444/163073268-790aae0e-e32e-4834-ad6b-6d31faecb89a.png)


## POO 


POO surgiu final dos anos 60. Substituir a programação estruturada.
Pensar nas entidades do mundo real. Modelar o nosso sistema de acordo com o Mundo real

![image](https://user-images.githubusercontent.com/52088444/163291415-579cebfe-3934-4247-976c-d28479abe918.png)

POO possui 4 principios :

- Polimorfismo
- Herança
- Abstração : enxergar o mundo real e verificar quais dados são importantes para modelar o algoritmo
- Encapsulamento : vinculado ao conceito de segurança (modificadores de acesso/ utilizo os métodos acessores fetters/setters)

Conceitos fundamentais da Orientação a objetos

![image](https://user-images.githubusercontent.com/52088444/163291859-7c6fedba-42e2-47e8-a8b7-3b3b51bb829b.png)

- Classe - é a forma do objeto, ou seja eu observo o mundo real e eu crio uma classe que digo o que esse objeto do mundo 
real tem de relevante 
## Modificadores de Acesso

- public
- private
- protected
- padrão ou acessibilidade de pacote


## Métodos Acessores

- Getters 
- Setters


## Métodos construtores

O (pseudo-)método construtor determina que ações devem ser executadas quando da criação de um objeto. Em Java, o
construtor é definido como um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno --
nem mesmo void. O construtor é unicamente invocado no momento da criação do objeto através do operador new.

Ex: Pessoa pessoa = new Pessoa(); ou seja quando esse trecho de código é executado,

O retorno do operador new é uma referência para o objeto recém-criado. O construtor pode receber argumentos, como 
qualquer método. Usando o mecanismo de sobrecarga, mais de um construtor pode ser definido para uma classe. Veja 
por exemplo os construtores definidos para a classe Point de Java.

Toda classe tem pelo menos um construtor sempre definido. Se nenhum construtor for explicitamente definido pelo 
programador da classe, um construtor padrão, que não recebe argumentos, é incluído para a classe pelo compilador Java. 
No entanto, se o programador da classe criar pelo menos um método construtor, o construtor padrão não será criado 
automaticamente -- se o programador desejar mantê-lo, deverá criar um construtor sem argumentos explicitamente.

No momento em que um construtor é invocado, a seguinte seqüência de ações é executada para a criação de um objeto:

O espaço para o objeto é alocado e seu conteúdo é inicializado (bitwise) com zeros.

O construtor da classe base é invocado. Se a classe não tem uma superclasse definida explicitamente, a classe Object 
é a classe base.

Os membros da classe são inicializados para o objeto, seguindo a ordem em que foram declarados na classe.

O restante do corpo do construtor é executado.

Seguir essa seqüência é uma necessidade de forma a garantir que, quando o corpo de um construtor esteja sendo executado,
o objeto já terá à disposição as funcionalidades mínimas necessárias, quais sejam aquelas definidas por seus ancestrais.
O primeiro passo garante que nenhum campo do objeto terá um valor arbitrário, que possa tornar erros de não inicialização
difíceis de detectar.

As vezes o método construtor não é necessário, ele só é necessário quando eu quero passar um método default para o meu objeto.
Se eu quiser fazer uma validação...

Parei vídeo Aula 4.W 
