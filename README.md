# Trabalho Acadêmico

## Observações:
1. Este código deve ser feito em grupo de até 5 pessoas.
2. Ele deverá ser postado no Envio de Trabalho até o dia 15/09 às 23:59.
3. Valor: 4,0 pontos na C1.
4. O grupo deve desenvolver os códigos abaixo e postar em arquivos `.java`.
5. O grupo deve postar também um relatório descrevendo como cada um contribuiu para o desenvolvimento do código.

## 1 – Implemente as classes a seguir

### a) Classe `Assento`
Atributo:
- `disponivel[][]` → Uma matriz booleana (5 filas e 4 lugares em cada fila) que armazena `true` se o assento está disponível e `false` se tiver sido vendido.

Método mínimo:
- `mostraLugares` → Deve retornar um `String` contendo as informações da matriz `disponivel` da seguinte maneira: Se o assento estiver ocupado, coloque um `X`; se ele estiver vazio, deixe em branco. Exemplo:

|  |  |  |
|X |  |  |

### b) Classe `Seção`
Atributos:
- Instância: Nome do filme e horário da seção.
- Classe: Preço (50,00).

Método mínimo:
- `venda` → Recebe a fila e o assento. Se esse assento estiver desocupado, deve alterar para ocupado e retornar `true`. Se o assento estiver ocupado, deve retornar `false`.

### c) Classe `Cinema`
Contém o método `main` e um menu:
1. Cadastrar
2. Vender
3. Sair

Cada opção do menu deve ser um método, exceto a opção 3. Assim, teremos pelo menos 2 métodos:
- `Cadastrar` → Vai pedir ao usuário as informações de 5 seções e cadastrá-las.
- `Venda` → Deve mostrar na tela todas as seções (nome do filme e horário). O usuário deve escolher a seção e, em seguida, visualizar os lugares da seção para escolher a fila e o assento disponível para compra. Então, realiza a venda.
