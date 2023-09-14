Implemented the hibernate inheritance mapping.

Has two classes in models

1. Player
   1. id
   2. name
   3. age
   
2. Bot (extends Player)
   1. rank (name: bot_rank)


After running this application the resulted tables will be created like this:

![scaler_assignment_table_player.png](imgs%2Fscaler_assignment_table_player.png)
![scaler_assignment_table_bot.png](imgs%2Fscaler_assignment_table_bot.png)

For this I used **@Inheritance(strategy = InheritanceType.JOINED)** in the parent class.