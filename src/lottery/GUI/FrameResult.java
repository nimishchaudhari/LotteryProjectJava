/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery.GUI;

import java.util.ArrayList;
import lottery.Bet;

import lottery.Lottery;

/**
 *
 * @author nimishchaudhari
 */
public class FrameResult extends javax.swing.JFrame {

    int n1, n2, n3, n4, luckyN, bet;

    /**
     * Creates new form FrameResult
     */
    public FrameResult() {
        initComponents();

    }

    public FrameResult(int n1, int n2, int n3, int n4, int luckyN, int bet) {
        initComponents();
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.luckyN = luckyN;
        this.bet = bet;
        result(n1, n2, n3, n4, luckyN, bet);
    }

    public FrameResult(int n1, int n2, int n3, int n4, int bet) {
        initComponents();
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.bet = bet;
        result(n1, n2, n3, n4, bet);
    }

    //getting result for Bet
    public void result(int n1, int n2, int n3, int n4, int bet) {
        Lottery l = new Lottery();
        ArrayList<Integer> rand = l.getDrawnNos();
        System.out.println("Going from FrameResult to CreateBet in Lottery class");
        int gain = l.createBet(n1, n2, n3, n4, bet);
        System.out.println("Gonna set numbers now");
        LNum1.setText(Integer.toString(n1));
        LNum2.setText(Integer.toString(n2));
        LNum3.setText(Integer.toString(n3));
        LNum4.setText(Integer.toString(n4));
        LGain.setText(Integer.toString(gain));
        LWin1.setText(Integer.toString(rand.get(0)));
        LWin2.setText(Integer.toString(rand.get(1)));
        LWin3.setText(Integer.toString(rand.get(2)));
        LWin4.setText(Integer.toString(rand.get(3)));
        Plucky.setVisible(false);
    }

    //getting result for Super Bet
    public void result(int n1, int n2, int n3, int n4, int luckyN, int bet) {
        Lottery l = new Lottery();
        ArrayList<Integer> rand = l.getDrawnNos();
        int gain = l.createBet(n1, n2, n3, n4, luckyN, bet);
        LNum1.setText(Integer.toString(n1));
        LNum2.setText(Integer.toString(n2));
        LNum3.setText(Integer.toString(n3));
        LNum4.setText(Integer.toString(n4));
        LNumLucky.setText(Integer.toString(luckyN));
        LWin1.setText(Integer.toString(rand.get(0)));
        LWin2.setText(Integer.toString(rand.get(1)));
        LWin3.setText(Integer.toString(rand.get(2)));
        LWin4.setText(Integer.toString(rand.get(3)));
        LGain.setText(Integer.toString(gain));
        LWinLN.setText(Integer.toString(l.getRandLuckyNum()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LNum2 = new javax.swing.JLabel();
        LNum3 = new javax.swing.JLabel();
        LNum4 = new javax.swing.JLabel();
        Plucky = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        LNumLucky = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LWinLN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LGain = new javax.swing.JLabel();
        LNum1 = new javax.swing.JLabel();
        LWin1 = new javax.swing.JLabel();
        LWin2 = new javax.swing.JLabel();
        LWin3 = new javax.swing.JLabel();
        LWin4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LNum2.setText("Num2");

        LNum3.setText("Num3");

        LNum4.setText("Num4");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Your Lucky number:");

        LNumLucky.setText("NumL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Winning Lucky number:");

        LWinLN.setText("NumL");

        javax.swing.GroupLayout PluckyLayout = new javax.swing.GroupLayout(Plucky);
        Plucky.setLayout(PluckyLayout);
        PluckyLayout.setHorizontalGroup(
            PluckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PluckyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PluckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(LNumLucky)
                    .addComponent(jLabel8)
                    .addComponent(LWinLN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PluckyLayout.setVerticalGroup(
            PluckyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PluckyLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LNumLucky)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LWinLN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Your result:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Winning numbers:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Amount won:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Your numbers:");

        LGain.setText("Gain");

        LNum1.setText("Num1");

        LWin1.setText("Num1");

        LWin2.setText("Num2");

        LWin3.setText("Num3");

        LWin4.setText("Num4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LGain)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LWin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LWin2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LWin3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LWin4))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LNum1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LNum2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LNum3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LNum4))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(Plucky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNum1)
                            .addComponent(LNum2)
                            .addComponent(LNum3)
                            .addComponent(LNum4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LWin1)
                            .addComponent(LWin2)
                            .addComponent(LWin3)
                            .addComponent(LWin4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(Plucky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LGain)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LGain;
    private javax.swing.JLabel LNum1;
    private javax.swing.JLabel LNum2;
    private javax.swing.JLabel LNum3;
    private javax.swing.JLabel LNum4;
    private javax.swing.JLabel LNumLucky;
    private javax.swing.JLabel LWin1;
    private javax.swing.JLabel LWin2;
    private javax.swing.JLabel LWin3;
    private javax.swing.JLabel LWin4;
    private javax.swing.JLabel LWinLN;
    private javax.swing.JPanel Plucky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
