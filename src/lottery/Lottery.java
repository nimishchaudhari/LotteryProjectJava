/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nimishchaudhari
 */
public class Lottery {
    ArrayList<Integer> Nos = new ArrayList();
    ArrayList<Integer> DrawnNos = new ArrayList();
    int betAmount;
    int randLuckyNum;

    public ArrayList<Integer> getDrawnNos() {
        return DrawnNos;            //Gets the Drawn Nos from the class
    }

    public int getRandLuckyNum() {
        return randLuckyNum;        // Gets the RandomLuckyNumber from the Class
    }
    
    public ArrayList<Integer> setRandom() // This function should generate 4 Random Numbers for ArrayList of DrawnNos
    {
        int loop=0;
        while(loop<4)
        {
            Random r = new Random();
            int num = r.nextInt(19)+1; // Since it generates a num between 0-19 and user can't input 0
            if (!DrawnNos.contains(num)){ // This condition pretty much makes sure you don't repeat 
                DrawnNos.add(num);        // One of these numbers, twice in the DrawnNos list
                loop++;                  // Should only increment the loop ONLY if a new unique number is generated
                System.out.println("Testing num:"+num);
            }
            System.out.println("Drew number:"+num);
        }
        return DrawnNos;            
    }

    public int setRandLuckyNum() {     // To get the fifth "RandLuckyNum" generated
        int luckyrandnum=0,loop=0;
        while(loop==0)
        {
            System.out.println("Entering setRandLuckyNum");
            Random r = new Random();
            luckyrandnum = r.nextInt(19)+1;
            if (!DrawnNos.contains(luckyrandnum)){ // This condition pretty much makes sure you don't repeat from other list of nos
                loop=1;
            }
            System.out.println("Lucky number:"+luckyrandnum);
        }
        randLuckyNum = luckyrandnum;
        return luckyrandnum;
    }
    public int createBet(int n1, int n2, int n3, int n4, int betAmount){
    System.out.println("Entering CreateBet");
    Nos.add(n1);
    Nos.add(n2);
    Nos.add(n3);
    Nos.add(n4);  //Added 4 nos in the Arraylist of input nos
    int matchednos=0;
    
    DrawnNos = setRandom();
    for(int i=0; i<4;i++)
    {
        for(int j=0;j<4;j++){
            System.out.println("Iteration"+i+j+Nos.get(1));
            if(Nos.get(i)==DrawnNos.get(j))
            {
                matchednos++;       // This is to get the number of matched numbers
            }
            System.out.println(matchednos+" Matched ");
        }
    }
        Bet b = new Bet(Nos,DrawnNos,betAmount);
        return b.calc();            // Returns the amount that a person won (without doing the super bet)
    }
    
    
    public int createBet(int n1, int n2, int n3, int n4, int superbetnum, int betAmount){ // Overloading for superbet
        
        int amountwon=createBet(n1,n2,n3,n4,betAmount); // Running the existing function to get amount won on normal Bet
        int luckySuperBetNumber = setRandLuckyNum();
        Bet b = new Bet(Nos,DrawnNos, betAmount);
        return b.calcSuperBet(superbetnum,luckySuperBetNumber,amountwon); // Giving parameters 1- SuperBet Number by the user
        // 2. LuckySuperBetNumber generated before
        // 3. Amount won after calculating 'calc' function
        
    }
    /**
     * @param args the command line arguments
     */
   
    
}
