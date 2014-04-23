/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sdassignment2;

import java.util.Scanner;

/**
 *
 * @author Vasanthi
 */


class Human extends player 
{

    public Human()
    {

    }   

    public void takeTurn(String[][] board) 
    {

        Scanner s = new Scanner(System.in);

        boolean turn = true;

        int bs = play.bs();
        while(turn)
        {
            System.out.println("please enter row");
            int row = s.nextInt();
            System.out.println("please enter col");
            int col = s.nextInt();
            System.out.print("you entered "+row+" "+col);
            System.out.println();
            if(row<1 || row>bs || col<1 ||col>bs)
            {
                System.out.println("Enter valid numbers for placing the marker!!");
                System.exit(bs);
            }
            if(!"X".equals(board[row - 1][col - 1]) && !"O".equals(board[row - 1][col - 1]))
            {
                board[row - 1][col - 1] = Marker;
                turn = false;
            } // closes if
            else 
            {
                System.out.println("Already Marker here! please guess again!");
        }
    } // ends while
} // ends method

} // ends class
