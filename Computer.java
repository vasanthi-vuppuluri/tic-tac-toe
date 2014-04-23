/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sdassignment2;

/**
 *
 * @author Vasanthi
 */


class Computer extends player 
{
    public Computer()
    {
    }

    public void takeTurn(String[][] board, Human human) 
    {
        boolean mademove = false;

        set Setup = new set();
        int bs = play.bs();
        int counter = 1;
        // check if you can take a win vertically
        for(int a = 0; a<bs; a++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if((board[j][a].equals(board[j+1][a]) && board[j][a].equals(Marker))
                        || (board[j][a].equals(board[j+2][a]) && board[j][a].equals(Marker))
                        || (board[j+1][a].equals(board[j+2][a]) && board[j+1][a].equals(Marker)))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0;k<bs;k++)
                    {
                        if(!board[k][a].equals(human.getMarker()) && !board[k][a].equals(Marker))
                        {
                            board[k][a] = Marker;
                            mademove = true;
                            return;
                        }
                    }
                }
            }
            counter = 1;
        }
        
        counter = 1;
        // check if you can take a win horizontally
        for(int i = 0; i<bs; i++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if((board[i][j].equals(board[i][j+1]) && board[i][j].equals(Marker))
                        ||(board[i][j].equals(board[i][j+2]) && board[i][j].equals(Marker))
                        || (board[i][j+1].equals(board[i][j+2]) && board[i][j+1].equals(Marker)))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0; k<bs; k++)
                    {
                        if(!board[i][k].equals(human.getMarker()) && !board[i][k].equals(Marker))
                        {
                            board[i][k] = Marker;
                            mademove = true;
                            return;
                        }
                    }
                }
                //}
            }
            counter = 1;
        }
        
        counter = 1;
        // check if you can take a win diagonally left-top to right-bottom
        for(int i=0;i<bs;i++)
        {
            for(int j=0;j<bs;j++)
            {
                if(i!=j)
                {
                    if(board[i][i].equals(board[j][j]) && board[j][j].equals(Marker))
                    {
                        counter = counter+1;
                    }
                    if(counter == bs-1)
                    {
                        for(int k=0;k<bs;k++)
                        {
                            if(!board[k][k].equals(human.getMarker()) && !board[k][k].equals(Marker))
                            {
                                board[k][k] = Marker;
                                mademove = true;
                                return;
                            }
                        }
                    }
                }
            }
        }
        counter = 1;
        // check if you can take a win diagonally right-bottom to left-top
        for(int j=bs-2;j>=0;j--)
            {
                int i=bs-1;
                if(board[i][i].equals(board[j][j]) && board[j][j].equals(Marker))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0;k<bs;k++)
                    {
                        if(!board[k][k].equals(human.getMarker()) && !board[k][k].equals(Marker))
                        {
                            board[k][k] = Marker;
                            mademove = true;
                            return;
                        }
                    }
                }
            }
        
        counter = 1;
        //Check if you can win diagonally from right-top to left-bottom
        for(int i=0;i<bs-2;i++)
        {
            if(board[i][bs-1-i].equals(board[i+1][bs-1-i-1]) && board[i][bs-1-i].equals(Marker))
            {
                counter = counter+1;
            }
            if(counter == bs-1)
            {
                for(int k=0;k<bs-1;k++)
                {
                    if(!board[k][bs-1-k].equals(human.getMarker()) && !board[k][bs-1-k].equals(Marker))
                    {
                        board[k][bs-1-k] = Marker;
                        mademove = true;
                        return;
                    }
                }
            }
        }
  
        // BLOCKS!!!! //
        counter = 1;
        // check if you can block a win horizontally
        for(int a = 0; a<bs; a++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if((board[a][j].equals(board[a][j+1]) && board[a][j].equals(human.getMarker()))
                        ||(board[a][j].equals(board[a][j+2]) && board[a][j].equals(human.getMarker()))
                        || (board[a][j+1].equals(board[a][j+2]) && board[a][j+1].equals(human.getMarker())))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0;k<bs;k++)
                    {
                        if(!board[a][k].equals(human.getMarker()) && !board[a][k].equals(Marker))
                        {
                            System.out.println("I am placing the marker at: "+a+" "+k);
                            board[a][k] = Marker;
                            mademove = true;
                            return;
                        }
                    }
                }
            }
            counter = 1;
        }
        
        counter = 1;
        // check if you can block a win vertically
        for(int i = 0; i<bs; i++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if(board[j][i].equals(board[j+1][i]) && board[j][i].equals(human.getMarker())
                        || (board[j][i].equals(board[j+2][i]) && board[j][i].equals(human.getMarker()))
                        || (board[j+1][i].equals(board[j+2][i]) && board[j+1][i].equals(human.getMarker())))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0; k<bs; k++)
                    {
                        if(!board[i][k].equals(human.getMarker()) && !board[i][k].equals(Marker))
                        {
                            System.out.println("I am placing the marker at: "+k+" "+i);
                            board[k][i] = Marker;
                            mademove = true;
                            return;
                        }
                    }
                }
                //}
            }
            counter = 1;
        }
        
        
        // check if you can block a win diagonally left-top to right-bottom
        counter = 1;
        for(int j=1;j<bs;j++)
        {
            int i=0;
            if(board[i][i].equals(board[j][j]) && board[j][j].equals(human.getMarker()))
            {
                counter = counter+1;
            }
            if(counter == bs-1)
            {
                for(int k=0;k<bs;k++)
                {
                    if(!board[k][k].equals(human.getMarker()) && !board[k][k].equals(Marker))
                    {
                        System.out.println("I am placing the marker at: "+k+" "+k);
                        board[k][k] = Marker;
                        mademove = true;
                        return;
                    }
                }
            }
        }
        
        //Check if you can block a win diagonally from right-top to left-bottom
        counter = 1;
        for(int i=0;i<bs-1;i++)
        {
            if(board[i][bs-1-i].equals(board[i+1][bs-1-i-1]) && board[i][bs-1-i].equals(human.getMarker()))
            {
                counter = counter+1;
            }
            if(counter == bs-1)
            {
                for(int k=0;k<bs;k++)
                {
                    if(!board[k][bs-1-k].equals(human.getMarker()) && !board[k][bs-1-k].equals(Marker))
                    {
                        System.out.println("I am placing the marker at: "+k+" "+(bs-1-k));
                        board[k][bs-1-k] = Marker;
                        mademove = true;
                        return;
                    }
                }
            }
        }

        // make random move if above rules dont apply
        int rand1 = 0;
        int rand2 = 0;
        
        while(!mademove)
        {
            rand1 = (int) (Math.random() * bs);
            rand2 = (int) (Math.random() * bs);

            int rand11,rand22;
            if(!"X".equals(board[rand1][rand2]) && !"O".equals(board[rand1][rand2]))
            {
                rand11 = rand1+1;
                rand22 = rand2+1;
                System.out.println("\nI am placing the marker at: "+rand11+" "+rand22);
                board[rand1][rand2] = Marker;
                mademove = true;        
            }
        }
    }
}