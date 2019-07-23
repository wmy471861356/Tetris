package Tetris;

import static Tetris.Main.cp;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author 王萌宇
 */
public class Count extends javax.swing.JPanel implements Runnable {
    private int G1Count = 0;
    public Count() {
        initComponents();
        G1show.setText("剩余机会："+G1Count);
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void drawBlocks(Graphics g) {
        int[] shape = Run.getNextShape().getCurrentBlocks();
        for (int i = 0; i < shape.length; i += 2) {
            g.setColor(Color.black);
            g.drawRect(20*(shape[i])+15,20*(shape[i + 1])+250,19,19);
            g.setColor(Run.getNextShape().getColor());
            g.fillRect(20*(shape[i])+15,20*(shape[i + 1])+250,18,18);
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBlocks(g);
        FileInputStream fis = null ;
        ImageInputStream iis =null ;
        Image BK=null;
        try {
            fis = new FileInputStream("bg.png");     
            BK=ImageIO.read(fis);
        } catch (Exception ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(BK,0,0,102,415,Main.cp);   //添加背景图
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currrentCount = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        nextBlock = new javax.swing.JLabel();
        G1 = new javax.swing.JButton();
        G1show = new javax.swing.JLabel();
        currentName = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        currentTime = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        currrentCount.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        currrentCount.setForeground(new java.awt.Color(255, 51, 51));
        currrentCount.setText("当前得分:");

        count.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        count.setForeground(new java.awt.Color(255, 51, 51));
        count.setText("0");

        nextBlock.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        nextBlock.setText("下一块：");

        G1.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        G1.setForeground(new java.awt.Color(0, 102, 204));
        G1.setText("消除一行");
        G1.setFocusable(false);
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        G1show.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        G1show.setForeground(new java.awt.Color(51, 102, 255));
        G1show.setText("剩余机会：0");

        currentName.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        currentName.setForeground(new java.awt.Color(0, 51, 51));
        currentName.setText("段位：");

        name.setFont(new java.awt.Font("楷体", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(0, 51, 51));
        name.setText("坚韧黑铁");

        currentTime.setFont(new java.awt.Font("楷体", 1, 14)); // NOI18N
        currentTime.setForeground(new java.awt.Color(153, 51, 0));

        time.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        time.setForeground(new java.awt.Color(153, 51, 0));
        time.setText("游戏时间：");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G1)
                            .addComponent(nextBlock)
                            .addComponent(G1show)
                            .addComponent(time)
                            .addComponent(currrentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(currentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currrentCount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(count)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addGap(18, 18, 18)
                .addComponent(nextBlock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(G1show, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        // 主动消除一行:
        if (G1Count>0&&!Main.isOver) {
            Run.G1();
            G1Count--;
            G1show.setText("剩余机会："+G1Count);
        }
    }//GEN-LAST:event_G1ActionPerformed
    public void setG1Count(int G1Count) {
        this.G1Count = G1Count;
        this.G1show.setText("剩余机会："+G1Count);
    }
    static public void Next(){   
        cp.repaint();
        Main.changeCount();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton G1;
    private javax.swing.JLabel G1show;
    public javax.swing.JLabel count;
    private javax.swing.JLabel currentName;
    public javax.swing.JLabel currentTime;
    private javax.swing.JLabel currrentCount;
    public javax.swing.JLabel name;
    private javax.swing.JLabel nextBlock;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

}
