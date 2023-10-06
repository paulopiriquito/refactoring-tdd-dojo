## On-boarding Leroy Merlin Berlengas - Sistema de Inventário

Olá e bem-vindos à equipa Leroy Merlin Berlengas!
Como sabem, somos uma pequena unidade de negócio numa localização previligiada, o arquipélago das Berlengas.
Temos um sistema de gestão de inventário que foi desenvolvido por um parceiro externo chamado Quick&EasyIT, no qual
gostariamos de adicionar uma nova funcionalidade.
Infelizmente a bolsa de horas acabou e não temos orçamento para pagar à Quick&EasyIT para fazer esta alteração.
O cógido fonte está disponível no nosso repositório Git, por isso, a vossa tarefa é adicionar a nova funcionalidade ao
nosso sistema para que possamos começar a vender uma nova categoria de produtos.

Uma particularidade que nos impede de utilizar a plataforma de inventários da Leroy Merlin é que os nossos produtos
degradam-se com a salinidade no ar, e por isso, temos de ter em conta a data de validade dos mesmos.
À medida que o tempo passa, os nossos produtos vão perdendo valor, e por isso, temos de os vender o mais rápido
possível, caso contrário temos que aumentar o desconto no preço.

O sistema atual tem as seguintes regras de negócio:

    - Todos os produtos têm uma data de validade, que indica o número de dias que temos para vender o produto
    - Todos os produtos têm um idicador de qualidade, que indica o preço do produto
    - No final de cada dia, o sistema diminui o valor de ambos os atributos para cada produto

Simples? Bem, aqui é que a coisa fica interessante:

    - Quando a data de validade passa, a qualidade do produto degrada duas vezes mais rápido
    - A qualidade de um produto nunca é negativa
    - O "Sal para Piscinas" aumenta a qualidade à medida que o tempo passa
    - A qualidade de um produto nunca é superior a 50
    - O "Martelo de Inox DEXTER" é um produto lendário, e por isso, não tem data de validade nem perde qualidade

Recentemente, assinamos um contrato com um novo fornecedor de pregos de ferro. Isto requer uma atualização ao nosso
sistema:

    - Os pregos de ferro degradam-se duas vezes mais rápido que os outros produtos
