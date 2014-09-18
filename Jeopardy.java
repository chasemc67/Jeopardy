import java.awt.*;

public class Jeopardy extends EasyApp
{
   public static void main(String[] args)
   {  new Jeopardy(); }
   
   Label lJeopardy = addLabel("Jeopardy",150,10,500,130,this);
   
   Label lScore = addLabel("Score",50,660,50,30,this);
   TextField tScore = addTextField("0",100,660,80,30,this);

   Button bRealLife = addButton("Real life 100",50,150,110,50,this);
   Button bGames = addButton("Games 100",175,150,110,50,this);
   Button bMusic = addButton("Music 100",300,150,110,50,this);
   Button bPedersen = addButton("Pedersen 100",425,150,110,50,this);
   Button bJanelle = addButton("Janelle 100",550,150,110,50,this);
   
   Button bRealLife2 = addButton("Real life 200",50,225,110,50,this); 
   Button bGames2 = addButton("Games 200",175,225,110,50,this);
   Button bMusic2 = addButton("Music 200",300,225,110,50,this);
   Button bPedersen2 = addButton("Pedersen 200",425,225,110,50,this);
   Button bJanelle2 = addButton("Janelle 200",550,225,110,50,this);
   
   Button bRealLife3 = addButton("Real life 300",50,300,110,50,this); 
   Button bGames3 = addButton("Games 300",175,300,110,50,this);
   Button bMusic3 = addButton("Music 300",300,300,110,50,this);
   Button bPedersen3 = addButton("Pedersen 300",425,300,110,50,this);
   Button bJanelle3 = addButton("Janelle 300",550,300,110,50,this);
   
   Button bRealLife4 = addButton("Real life 400",50,375,110,50,this); 
   Button bGames4 = addButton("Games 400",175,375,110,50,this);
   Button bMusic4 = addButton("Music 400",300,375,110,50,this);
   Button bPedersen4 = addButton("Pedersen 400",425,375,110,50,this);
   Button bJanelle4 = addButton("Janelle 400",550,375,110,50,this);
   
   Button bRealLife5 = addButton("Real life 500",50,450,110,50,this); 
   Button bGames5 = addButton("Games 500",175,450,110,50,this);
   Button bMusic5 = addButton("Music 500",300,450,110,50,this);
   Button bPedersen5 = addButton("Pedersen 500",425,450,110,50,this);
   Button bJanelle5 = addButton("Janelle 500",550,450,110,50,this);
   
   Button bPlayAgain = addButton("Play again",300,650,400,50,this);
   
   double score = 0;

   public Jeopardy()   // Constructor - change window appearance
   {
      setSize(750,750);
      setTitle("Jeopardy - The Janelle Version");
      lJeopardy.setFont(new Font("Arial",1,100));
      lJeopardy.setBackground(new Color(255,255,180));
      lJeopardy.setForeground(Color.red);
      lScore.setBackground(new Color(255,255,180));
      setBackground(new Color(255,255,180));
      bPlayAgain.setFont(new Font("Arial",1,16));   
      
      bRealLife.setFont(new Font("Arial",1,16));
      bGames.setFont(new Font("Arial",1,16));      
      bMusic.setFont(new Font("Arial",1,16));      
      bPedersen.setFont(new Font("Arial",1,16));
      bJanelle.setFont(new Font("Arial",1,16));    
      
      bRealLife2.setFont(new Font("Arial",1,16));
      bGames2.setFont(new Font("Arial",1,16));
      bMusic2.setFont(new Font("Arial",1,16));
      bPedersen2.setFont(new Font("Arial",1,16));
      bJanelle2.setFont(new Font("Arial",1,16));
      
      bRealLife3.setFont(new Font("Arial",1,16));
      bGames3.setFont(new Font("Arial",1,16));
      bMusic3.setFont(new Font("Arial",1,16));
      bPedersen3.setFont(new Font("Arial",1,16));
      bJanelle3.setFont(new Font("Arial",1,16));
      
      bRealLife4.setFont(new Font("Arial",1,16));
      bGames4.setFont(new Font("Arial",1,16));
      bMusic4.setFont(new Font("Arial",1,16));
      bPedersen4.setFont(new Font("Arial",1,16));
      bJanelle4.setFont(new Font("Arial",1,16));
      
      bRealLife5.setFont(new Font("Arial",1,16));
      bGames5.setFont(new Font("Arial",1,16));
      bMusic5.setFont(new Font("Arial",1,16));
      bPedersen5.setFont(new Font("Arial",1,16));
      bJanelle5.setFont(new Font("Arial",1,16));
         
      
   }
   
   public void actions(Object source,String command)
   {
      if (source == bRealLife)
      {   realLife(); }
      if (source == bGames)
      {  games();  }
      if (source == bMusic)
      {  music();  }
      if (source == bPedersen)
      {  pedersen();   }
      if (source == bJanelle)
      {  janelle();   }
      
      
      if (source == bRealLife2)
      {   realLife2(); }
      if (source == bGames2)
      {  games2();  }
      if (source == bMusic2)
      {  music2();  }
      if (source == bPedersen2)
      {  pedersen2();   }
      if (source == bJanelle2)
      {  janelle2();   }
      
      if (source == bRealLife3)
      {   realLife3(); }
      if (source == bGames3)
      {  games3();  }
      if (source == bMusic3)
      {  music3();  }
      if (source == bPedersen3)
      {  pedersen3();   }
      if (source == bJanelle3)
      {  janelle3();   }
      
      if (source == bRealLife4)
      {   realLife4(); }
      if (source == bGames4)
      {  games4();  }
      if (source == bMusic4)
      {  music4();  }
      if (source == bPedersen4)
      {  pedersen4();   }
      if (source == bJanelle4)
      {  janelle4();   }
      
      if (source == bRealLife5)
      {   realLife5(); }
      if (source == bGames5)
      {  games5();  }
      if (source == bMusic5)
      {  music5();  }
      if (source == bPedersen5)
      {  pedersen5();   }
      if (source == bJanelle5)
      {  janelle5();   }
      
      
      if (source == bPlayAgain)
      {  
         bRealLife.setEnabled(true);
         bGames.setEnabled(true);
         bMusic.setEnabled(true);
         bPedersen.setEnabled(true);
         bJanelle.setEnabled(true);
         
         bRealLife2.setEnabled(true);
         bGames2.setEnabled(true);
         bMusic2.setEnabled(true);
         bPedersen2.setEnabled(true);
         bJanelle2.setEnabled(true);
         
         bRealLife3.setEnabled(true);
         bGames3.setEnabled(true);
         bMusic3.setEnabled(true);
         bPedersen3.setEnabled(true);
         bJanelle3.setEnabled(true);
         
         bRealLife4.setEnabled(true);
         bGames4.setEnabled(true);
         bMusic4.setEnabled(true);
         bPedersen4.setEnabled(true);
         bJanelle4.setEnabled(true);
         
         bRealLife5.setEnabled(true);
         bGames5.setEnabled(true);
         bMusic5.setEnabled(true);
         bPedersen5.setEnabled(true);
         bJanelle5.setEnabled(true);
         
         score = 0;
      }   
      tScore.setText(score + "");
   }
   
   public void realLife()
   {
      int guess = inputInt("why was 6 afraid of 7? cause 7 __ 9!");
      if (guess == 8 )
      {
         score = score + 100;
         output("Right!");  
      }
      else
      {  
         score = score - 100;         
         output("Wrong..." );
      }      

      bRealLife.setEnabled(false);
   }
   
   public void games()
   {
      String guess = inputString("Who do you play as in Halo 3");
      if (guess.equalsIgnoreCase("Master chief")||guess.equalsIgnoreCase("chief"))
      {
         score = score + 100;
         output("Right!");  
      }
      else
      {  
         score = score - 100;         
         output("Wrong...");
      }      
      bGames.setEnabled(false);
   }

   public void music()
   {
      String guess = inputString("Who is the worst band in the world who is still together");
      if (guess.equalsIgnoreCase("nickelback"))
      {
         score = score + 100;
         output("Right!");  
      }
      else
      {  
         score = score - 100;         
         output("Wrong...");
      }      
      bMusic.setEnabled(false);
   }
   
      public void pedersen()
   {
      String guess = inputString("What is pedersen's first name");
      if (guess.equalsIgnoreCase("lance"))  
      {
         score = score + 100;
         output("Right!");  
      }

      else
      {  
         score = score - 100;         
         output("Wrong...");
      }      
      bPedersen.setEnabled(false);
   }
   
   public void janelle()
   {
      String guess = inputString("What is janelle's middle name?");
      if (guess.equalsIgnoreCase("anne"))  
      {
         score = score + 100;
         output("Right!");  
      }

      else
      {  
         score = score - 100;         
         output("Wrong...");
      }      
      bJanelle.setEnabled(false);
   }
   
   public void realLife2()
   {
      String guess = inputString("What type of car is a beemer?");
      if 
      	(guess.equalsIgnoreCase("bmw"))
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong..." );
      }      

      bRealLife2.setEnabled(false);
   }
   
   public void games2()
   {
      String guess = inputString("what company made black ops");
      if (guess.equalsIgnoreCase("treyarch")||guess.equalsIgnoreCase("treyarc"))
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong");
      }      
      bGames2.setEnabled(false);
   }

   public void music2()
   {
      String guess = inputString("how many beatles were there?");
      if (guess.equalsIgnoreCase("4"))
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong");
      }      
      bMusic2.setEnabled(false);
   }
  
   public void pedersen2()
   {
      String guess = inputString("What is Pedersen's fiance's name");
      if ( guess.equalsIgnoreCase("Jill") )
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong...");
      }      
      bPedersen2.setEnabled(false);
   }

public void janelle2()
   {
      String guess = inputString("How many concussions has janelle suffered as of dec 13 2010");
      if (guess.equalsIgnoreCase("3"))  
      {
         score = score + 100;
         output("Right!");  
      }

      else
      {  
         score = score - 100;         
         output("Wrong...");
      }      
      bJanelle2.setEnabled(false);
   }
   
   public void realLife3()
   {
      String guess = inputString("what is the lead character's name in the matrix");
      if 
      	(guess.equalsIgnoreCase("neo"))
      {
         score = score + 300;
         output("Right!");  
      }
      else
      {  
         score = score - 300;         
         output("Wrong..." );
      }      

      bRealLife3.setEnabled(false);
   }
   
   public void games3()
   {
      String guess = inputString("What game console did microsoft release before the xbox 360");
      if (guess.equalsIgnoreCase("xbox"))
      {
         score = score + 300;
         output("Right!");  
      }
      else
      {  
         score = score - 300;         
         output("Wrong...");
      }      
      bGames3.setEnabled(false);
   }

   public void music3()
   {
      String guess = inputString("what movie franchise did the montage song debut in");
      if (guess.equalsIgnoreCase("Team america"))
      {
         score = score + 300;
         output("Right!"); 
      }
      else
      {  
         score = score - 300;         
         output("");
      }      
      bMusic3.setEnabled(false);
   }
  
   public void pedersen3()
   {
      String guess = inputString("What type of phone does pedersen have");
      if ( guess.equalsIgnoreCase("Iphone")||guess.equalsIgnoreCase("Iphone4")||guess.equalsIgnoreCase("Iphone 4") )
      {
         score = score + 300;
         output("Right!");  
      }
      else
      {  
         score = score - 300;         
         output("" );
      }      
      bPedersen3.setEnabled(false);
   }

public void janelle3()
   {
      String guess = inputString("what general religion is janelle (religion without denomination)");
      if (guess.equalsIgnoreCase("christian"))  
      {
         score = score + 300;
         output("Right!");  
      }

      else
      {  
         score = score - 300;         
         output("Wrong...");
      }      
      bJanelle3.setEnabled(false);
   }
   
   public void realLife4()
   {
      String guess = inputString("What car symbol looks like a peace sign");
      if 
      	(guess.equalsIgnoreCase("mercedes")||guess.equalsIgnoreCase("mercedes benz")||guess.equalsIgnoreCase("benz"))
      {
         score = score + 400;
         output("Right!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong..." );
      }      

      bRealLife4.setEnabled(false);
   }
   
   public void games4()
   {
      String guess = inputString("What was the first video game ever invented");
      if (guess.equalsIgnoreCase("Pong"))
      {
         score = score + 400;
         output("Right!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong...");
      }      
      bGames4.setEnabled(false);
   }

   public void music4()
   {
      String guess = inputString("What is the first song on great white whale");
      if (guess.equalsIgnoreCase("Blonde monster"))
      {
         score = score + 400;
         output("Right!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong...");
      }      
      bMusic4.setEnabled(false);
   }
  
   public void pedersen4()
   {
      String guess = inputString("Does pedersen own black ops? (yes or no)");
      if ( guess.equalsIgnoreCase("no") )
      {
         score = score + 400;
         output("Right!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong..." );
      }      
      bPedersen4.setEnabled(false);
   }

public void janelle4()
   {
      String guess = inputString("How many siblings does janelle have");
      if (guess.equalsIgnoreCase("5"))  
      {
         score = score + 400;
         output("Right!");  
      }

      else
      {  
         score = score - 400;         
         output("Wrong...");
      }      
      bJanelle4.setEnabled(false);
   }
   
   public void realLife5()
   {
      String guess = inputString("What tv show is chuck norris from?");
      if 
      	(guess.equalsIgnoreCase("walker texas ranger")||guess.equalsIgnoreCase("walker, texas ranger"))
      {
         score = score + 500;
         output("Right!");  
      }
      else
      {  
         score = score - 500;         
         output("Wrong..." );
      }      

      bRealLife5.setEnabled(false);
   }
   
   public void games5()
   {
      String guess = inputString("What game won the award for best character in the 2010 VGA's");
      if (guess.equalsIgnoreCase("black Ops"))
      {
         score = score + 500;
         output("Right!");  
      }
      else
      {  
         score = score - 500;         
         output("Wrong...");
      }      
      bGames5.setEnabled(false);
   }

   public void music5()
   {
      String guess = inputString("Who in the beatles was left handed");
      if (guess.equalsIgnoreCase("paul")||guess.equalsIgnoreCase("mccartney")||guess.equalsIgnoreCase("paul mccartney"))
      {
         score = score + 500;
         output("Right!");  
      }
      else
      {  
         score = score - 500;         
         output("Wrong...");
      }      
      bMusic5.setEnabled(false);
   }
  
   public void pedersen5()
   {
      String guess = inputString("how many DT's has pedersen givien evan as of Dec. 13");
      if ( guess.equalsIgnoreCase("7") )
      {
         score = score + 500;
         output("Right!");  
      }
      else
      {  
         score = score - 500;         
         output("Wrong..." );
      }      
      bPedersen5.setEnabled(false);
   }

public void janelle5()
   {
      String guess = inputString("How many boyfriends has janelle had");
      if (guess.equalsIgnoreCase("1"))  
      {
         score = score + 500;
         output("Right!");  
      }

      else
      {  
         score = score - 500;         
         output("Wrong...");
      }      
      bJanelle5.setEnabled(false);
   }

}