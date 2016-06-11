
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ralleg
 */
public class Map extends javax.swing.JFrame {

    private static int TURN = 0;
    private Image X;
    private Image O;
    private char[][] game;
    private JButton[] Buttons;

    /**
     * Creates new form Map
     */
    public Map() {
        this.game = new char[3][3];
        try {
            this.X = ImageIO.read(getClass().getResource("resources/x.png"));
            X = X.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH);
            this.O = ImageIO.read(getClass().getResource("resources/o.png"));
            O = O.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.Buttons = new JButton[]{Pos00,Pos01,Pos02,Pos10,Pos11,Pos12,Pos20,Pos21,Pos22};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pos01 = new javax.swing.JButton();
        Pos00 = new javax.swing.JButton();
        Pos02 = new javax.swing.JButton();
        Pos11 = new javax.swing.JButton();
        Pos10 = new javax.swing.JButton();
        Pos12 = new javax.swing.JButton();
        Pos21 = new javax.swing.JButton();
        Pos20 = new javax.swing.JButton();
        Pos22 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pos01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos01ActionPerformed(evt);
            }
        });

        Pos00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos00ActionPerformed(evt);
            }
        });

        Pos02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos02ActionPerformed(evt);
            }
        });

        Pos11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos11ActionPerformed(evt);
            }
        });

        Pos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos10ActionPerformed(evt);
            }
        });

        Pos12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos12ActionPerformed(evt);
            }
        });

        Pos21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos21ActionPerformed(evt);
            }
        });

        Pos20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos20ActionPerformed(evt);
            }
        });

        Pos22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pos22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pos00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pos01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pos02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pos20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pos21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pos00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pos20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pos22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pos00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos00ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos00,0,0);
        TURN++;
    }//GEN-LAST:event_Pos00ActionPerformed

    private void Pos01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos01ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos01,0,1);
        TURN++;
    }//GEN-LAST:event_Pos01ActionPerformed

    private void Pos02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos02ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos02,0,2);
        TURN++;
    }//GEN-LAST:event_Pos02ActionPerformed

    private void Pos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos10ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos10,1,0);
        TURN++;
    }//GEN-LAST:event_Pos10ActionPerformed

    private void Pos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos11ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos11,1,1);
        TURN++;
    }//GEN-LAST:event_Pos11ActionPerformed

    private void Pos12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos12ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos12,1,2);
        TURN++;
    }//GEN-LAST:event_Pos12ActionPerformed

    private void Pos20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos20ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos20,2,0);
        TURN++;
    }//GEN-LAST:event_Pos20ActionPerformed

    private void Pos21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos21ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos21,2,1);
        TURN++;
    }//GEN-LAST:event_Pos21ActionPerformed

    private void Pos22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pos22ActionPerformed
        // TODO add your handling code here:
        this.modify(Pos22,2,2);
        TURN++;
    }//GEN-LAST:event_Pos22ActionPerformed

    private void modify(JButton b,int x,int y){
        if (TURN % 2 == 0) {
            b.setIcon(new ImageIcon(X));
            game[x][y]='x';
        } else {
            b.setIcon(new ImageIcon(O));
            game[x][y]='o';
        }
        b.setEnabled(false);
        if(win(x,y))end();
    }
    
    private boolean win(int x, int y){
        char[] sudo={'x','o'};
        if(abs(x-y)%2==0&&x!=1){
            if(game[x][y]==sudo[TURN%2]&&game[(x+1)%3][y]==sudo[TURN%2]&&game[(x+2)%3][y]==sudo[TURN%2]){
                setWon(x,y);
                setWon((x+1)%3,y);
                setWon((x+2)%3,y);
                return true;
            }else if(game[x][y]==sudo[TURN%2]&&game[x][(y+1)%3]==sudo[TURN%2]&&game[x][(y+2)%3]==sudo[TURN%2]){
                setWon(x,y);
                setWon(x,(y+1)%3);
                setWon(x,(y+2)%3);
                return true;
            }
            if(abs(x-y)==0){
                if(game[x][y]==sudo[TURN%2]&&game[(x+1)%3][(y+1)%3]==sudo[TURN%2]&&game[(x+2)%3][(y+2)%3]==sudo[TURN%2]){
                    setWon(x,y);
                    setWon((x+1)%3,(y+1)%3);
                    setWon((x+2)%3,(y+2)%3);
                    return true;
                }
            }else{
                if(game[x][y]==sudo[TURN%2]&&game[abs(x-1)%3][abs(y-1)%3]==sudo[TURN%2]&&game[abs(x-2)%3][abs(y-2)%3]==sudo[TURN%2]){
                    setWon(x,y);
                    setWon(abs(x-1)%3,abs(y-1)%3);
                    setWon(abs(x-2)%3,abs(y-2)%3);
                    return true;
                }
            }
            
        }else if(abs(x-y)%2==1){
            if(game[x][y]==sudo[TURN%2]&&game[(x+1)%3][y]==sudo[TURN%2]&&game[(x+2)%3][y]==sudo[TURN%2]){
                setWon(x,y);
                setWon((x+1)%3,y);
                setWon((x+2)%3,y);
                return true;
            }else if(game[x][y]==sudo[TURN%2]&&game[x][(y+1)%3]==sudo[TURN%2]&&game[x][(y+2)%3]==sudo[TURN%2]){
                setWon(x,y);
                setWon(x,(y+1)%3);
                setWon(x,(y+2)%3);
                return true;
            }
        }else{
            if(game[1][0]==sudo[TURN%2]&&game[1][1]==sudo[TURN%2]&&game[1][2]==sudo[TURN%2]){
                setWon(1,0);
                setWon(1,1);
                setWon(1,2);
                return true;
            }else if(game[0][1]==sudo[TURN%2]&&game[1][1]==sudo[TURN%2]&&game[2][1]==sudo[TURN%2]){
                setWon(0,1);
                setWon(1,1);
                setWon(2,1);
                return true;
            }else if(game[0][0]==sudo[TURN%2]&&game[1][1]==sudo[TURN%2]&&game[2][2]==sudo[TURN%2]){
                setWon(0,0);
                setWon(1,1);
                setWon(2,2);
                return true;
            }else if(game[2][0]==sudo[TURN%2]&&game[1][1]==sudo[TURN%2]&&game[0][2]==sudo[TURN%2]){
                setWon(2,0);
                setWon(1,1);
                setWon(0,2);
                return true;
            }
        }
        return false;
    }
    
    private void setWon(int x,int y){
        Buttons[3*x+y].setBackground(Color.red);
        Buttons[3*x+y].setOpaque(true);
    }
    
    private void end(){
        for(JButton b:Buttons){
            b.setEnabled(false);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Map().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pos00;
    private javax.swing.JButton Pos01;
    private javax.swing.JButton Pos02;
    private javax.swing.JButton Pos10;
    private javax.swing.JButton Pos11;
    private javax.swing.JButton Pos12;
    private javax.swing.JButton Pos20;
    private javax.swing.JButton Pos21;
    private javax.swing.JButton Pos22;
    // End of variables declaration//GEN-END:variables
}
