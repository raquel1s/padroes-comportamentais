# Perguntas de Checagem

- Qual a principal vantagem do padrão Observer em sistemas reativos?
  - Ele permite que os objetos sejam avisados automaticamente quando algo muda. Assim, quem precisa da informação recebe na hora, sem precisar ficar verificando o tempo todo.
- Por que o Strategy é melhor que muitos if?
  - Porque ele organiza melhor o código. Em vez de usar vários "if", escolhemos qual comportamento usar de forma mais clara e fácil de manter.
- Dê um exemplo real em que Command seja melhor que apenas chamar métodos diretamente.
  - Em sistemas com desfazer e refazer, como editores de texto. Cada ação (como digitar ou apagar) vira um comando separado, o que permite guardar, desfazer ou repetir essas ações depois. Chamando métodos direto isso não seria possível.
