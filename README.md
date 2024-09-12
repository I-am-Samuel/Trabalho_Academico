# Trabalho Academico

Observações:
    i. Este código deve ser feito em grupo de até 5 pessoas
    ii. Ele deverá ser postado no Envio de Trabalho até o dia 15/09 às 23:59.
    iii. Valor: 4,0 pontos na C1
    iv. O grupo deve desenvolver os códigos abaixo e postar em .java .
    v. O grupo deve postar também um relatório descrevendo como cada um contribuiu para o
    desenvolvimento do código

1 – Implemente as classes a seguir
a- Classe Assento que tem o seguinte atributo:
    • disponivel[ ][ ] → uma matriz booleana (5 filas e 4 lugares em cada fila) que
    armazena true se o assento está disponível e false se tiver sido vendido.
    No mínimo o método:
    • mostraLugares → que deve retornar um String contendo as informações da matriz
    disponivel da seguinte maneira: Se o assento estiver ocupado, coloque um X, se
    ele estiver vazio, deixe em branco, como mostrada abaixo:
    | | | |
    | X | | |
b- Classe Seção que tem os seguintes atributos:
    • de instância: nome do filme e horário da seção
    • de classe : preço (50,00)
    No mínimo os métodos:
    • venda: recebe a fila e o assento. Se esse assento estiver desocupado, deve alterar
    para ocupado e retornar true e, se o assento estiver ocupado retorna false.
c- Classe cinema que contém o método main e um menu:
    1 – Cadastrar
    2 – Vender
    3 – Sair
Cada opção do menu deve ser um método, exceto a opção 3. Assim, teremos pelo menos
2 métodos:
    • Cadastrar: vai pedir ao usuário as informações de 5 seções e cadastrá-las.
    • Venda: deve mostrar na tela todas as seções (nome do filme e horário). Assim, o
    usuário deve escolher a seção. Em seguida, deve mostrar na tela os lugares da
    seção, para que o usuário escolha a fila e o assento disponível para comprar.
    Então realiza a venda.
