package com.Bridgelabzday4;

public class SnakeAndladder
{

    public static void main(String[] args) 
    {
        System.out.println("Snake and ladder game. Player 1 at 0");
        
        int p1 = 0;
        int p2 = 0;
        int Dice = 0;
        boolean turnPlayer = true;

        while( p1 != 100 && p2 != 100)
        {
            int dice = rollDice();
            Dice++;
            int option = checkOptions();
            if(turnPlayer)
            {
                if ( option == 1)
                {
                    p1 =p1+ dice;
                    if(p1>100)
                    {
                        p1 =p1 - dice;
                    }
                    System.out.println("Player1 position after dice roll :: "+ p1);
                }else if ( option == 2)
                {
                    p1=p1+ dice;
                    if(p1 < 0)
                    {
                        p1 = 0;
                    }
                    System.out.println("P1 position after roll :: "+ p1);
                    turnPlayer = false;
                }else{
                    System.out.println("Pl position after roll :: "+ p1);
                    turnPlayer = false;
                }
            }else
            {
                if ( option == 1)
                {
                    p2 =p2 + dice;
                    if(p2>100)
                    {
                        p2 = p2 - dice;
                    }
                    System.out.println("Player2 position after dice roll : "+ p2);
                }else if ( option == 2)
                {
                    p2= p2 + dice;
                    if(p2 < 0)
                    {
                        p2 = 0;
                    }
                    System.out.println("P2 position after roll : "+ p2);
                    turnPlayer = true;
                }else{
                    System.out.println("P2 position roll : "+ p2);
                    turnPlayer = true;
                }
            }
            
        }
        if(p1 == 100)
        {
            System.out.println("P1 won!!!");
        }else
        {
            System.out.println("P2 won!!!");
        }
        System.out.println("number of times the dice was played to win the game : "+ Dice);
    }
    
    public static int rollDice()
    {
        return (int) ((Math.random()*10)%6) + 1;
    }

    // 0 -> No Play
    // 1 -> Ladder
    // 2 -> Snake
    public static int checkOptions()
    {
        return (int) (Math.random()*10)%3; 
    }

    

}