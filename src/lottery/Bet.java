/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.ArrayList;

/**
 *
 * @author nimishchaudhari
 */
public class Bet {
    
    ArrayList<Integer> Nos = new ArrayList<Integer>();
    ArrayList<Integer> DrawnNos = new ArrayList<Integer>();
    int betAmount;
    int luckySuperBetNumber = 0;
    public Bet(ArrayList<Integer> Nos, ArrayList<Integer> DrawnNos, int betAmount) {
        this.Nos = Nos;
        this.DrawnNos = DrawnNos;
        this.betAmount = betAmount;
    }
    
    public int calc(){
        int matched_nos=0;
        int wonAmount = 0;
        for(int i=0; i<Nos.size(); i++) // This loop is to check if numbers match, if they do, matched_nos variable is incremented
        {
            for(int j=0; j<DrawnNos.size();j++)
            {
                if(DrawnNos.get(i)==Nos.get(j))
                {
                    matched_nos+=1;
                }
                else{
                    System.out.println("Numbers not macthing"+DrawnNos.get(i)+Nos.get(j));
                }
            }
            // Now the rest of the function to calculate the won Amount
            
            if(matched_nos<2){
                wonAmount=0;
            }
            else if(matched_nos==2){
                wonAmount=betAmount*2;
            }
            else if(matched_nos==3){
                wonAmount=betAmount*5;
            }
            else{
                wonAmount=betAmount*10;
            }
        }
        return wonAmount;
    }
    public int calcSuperBet(int superbetnum, int luckySuperBetNumber, int amountwon){
        int wonAmount=0;
        if(superbetnum==luckySuperBetNumber){
            wonAmount = amountwon * 5;
        }
        else
        {
            wonAmount = amountwon;
        }
        
        return wonAmount;
    }
}
