READ ME:

'tic-tac-toe' consists of 7 different class files:
1. Player.java
    - This class contains methods to set the markers (i.e. X or O) for the computer and the player
2. set.java
    - This class has methods to check the current state of the board, to create the board and to print the board
3. Human.java
    - This class extends Player.java
    - Internally calls set.java
    - Enables the player to enter positions/co-ordinates for inputting the marker on the board. This class also checks if the entered values are valid or not
4. Easy.java
    - This class extends Player.java
    - Internally makes calls to set.java
    - This class is for the 'Easy' level of the game. This class uses a random algorithm to select a position to place the marker on the board. If the obtained random position already contains a marker, a different random position is generated and the marker is placed if vacant
5. Medium.java
    - This class extends Player.java
    - This class is for the 'Medium' level of the game. This class checks for four conditions before generating a random position to place the marker
          - Condition 1: Checks if there is a possibility to win by placing the next marker in a row
          - Condition 2: Checks if there is a possibility to win by placing the next marker in a column
          - Condition 3: Checks if there is a possibility to win by placing the next marker in the left-top to right-bottom diadonal (\)
          - Condition 4: Checks if there is a possibility to win by placing the next marker in the right-top to left-bottom diagonal (/)
     If none of the above conditions are satisfied, if uses a random number generator to place the marker at an available location on the board
6. Computer.java
    - This class extends Player.java
    - Internally makes calls to set.java
    - This class is for the 'Hard' level of the game. This class checks for 8 different conditions. 4 to check if it is possible to win in the next move and 4 to block the users winning scenario. If none of the conditions satisfy the maker is placed at a randomly chosen position
7. Play.java
    - This is the main class of the tic-tac-toe
    - Player is asked to choose the size of the board
    - Once a valid board size is chosen, the player is asked to select the game level
    - After selecting the level, player is given an option to choose the marker (i.e. X or O)
    - Then a random number generator is used to decide who make the initial move
    - And then the user will be prompted for input and a call is made to Human.java
    - Calls are made to Easy.java or Medium.java or Computer.java depending upon the level chosen by the player, for the computer to place its marker
    - Exceptions are handled in this class

Execution steps:
    All the java programs are present in the package sdassignment2
    The code is tested using NetBeans IDE
    All the programs need to be in the same package
    Play.java is the program to be executed

Sample output:
//Numbers will be replaced by either X or O
run:

Welcome to Tic-Tac-Toe!!!

Please choose the size of the board! 
Enter 3 for 3X3 board, 4 for 4X4 board, etc.. 
 from getBoardSize()
3
[ 1 ] [ 2 ] [ 3 ] 
[ 4 ] [ 5 ] [ 6 ] 
[ 7 ] [ 8 ] [ 9 ] 

Choose the level you want to play from the following options
	1. Easy
	2. Medium
	3.Hard
Select from (1,2,3) for (Easy, Medium, Hard) levels!!
2
please choose your marker
type 1 for 'x' or 2 for 'o'
2
You chose Knought 'O'
I make the first move!
I make the first move!

[ 1 ] [ 2 ] [ 3 ] 
[ 4 ] [ 5 ] [ 6 ] 
[ 7 ] [ x ] [ 9 ] 
please enter row
2
please enter col
2
you entered 2 2

[ 1 ] [ 2 ] [ 3 ] 
[ 4 ] [ o ] [ 6 ] 
[ 7 ] [ x ] [ 9 ] 

[ 1 ] [ x ] [ 3 ] 
[ 4 ] [ o ] [ 6 ] 
[ 7 ] [ x ] [ 9 ] 
please enter row
3
please enter col
3
you entered 3 3

[ 1 ] [ x ] [ 3 ] 
[ 4 ] [ o ] [ 6 ] 
[ 7 ] [ x ] [ o ] 

[ 1 ] [ x ] [ x ] 
[ 4 ] [ o ] [ 6 ] 
[ 7 ] [ x ] [ o ] 
please enter row
1
please enter col
1
you entered 1 1

[ o ] [ x ] [ x ] 
[ 4 ] [ o ] [ 6 ] 
[ 7 ] [ x ] [ o ] 

You gots the winz!
Would you like to play again? Type 1 for yes!!
Any other input will be considered as a 'NO'!!

2
