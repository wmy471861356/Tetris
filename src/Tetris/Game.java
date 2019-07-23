package Tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author 王萌宇
 */
public class Game extends javax.swing.JPanel implements Runnable {
    Run run = new Run();
    public Game() {
        initComponents();
        run.getShape();
        run.init();
        new Thread(this).start();
    }
        @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBlocks(g, run.currentX, run.currentY);
        drawback(g);
    }
    public void keyPressed(java.awt.event.KeyEvent evt) {    //按键
        if ((!Main.isOver)&&(!Main.isPause)) {
            switch (evt.getKeyCode()) {
                case 37:
                    run.left();
                    break;
                case 39:
                    run.right();
                    break;
                case 40:
                    run.down();
                    break;
                case 38:
                    run.turn();
                    break;
                default:
                    break;
            }
            repaint();
        }
    }
    @Override
    public void run() {
        gameStart.setVisible(true);
        gameOver.setVisible(false);
        while (!Main.isOver) {
            try {
                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                int hour=calendar.get(Calendar.HOUR_OF_DAY);
                int minute=calendar.get(Calendar.MINUTE);
                int second=calendar.get(Calendar.SECOND);
                calendar.set(year, month, day, hour, minute, second);
                long time2=calendar.getTimeInMillis();
                int subSecond=(int)(time2-Main.time1)/(1000);  //开始后过去的时间秒数
                //System.out.println(String.valueOf(subSecond));
                calendar.set(year,month,day,hour,0,subSecond);  //分钟从零开始，秒数到60将自动进位
                String subTime=String.format("%tM:%<tS",calendar);  //时间格式化
                Main.cp.currentTime.setText(subTime);
                if (!Main.isPause) {
                    run.down();
                    this.repaint(); 
                }  
                Thread.currentThread().sleep(Main.interval);
                gameStart.setVisible(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void drawback(Graphics g) {
        for (int i=0;i<=9;i++) {
            for (int j=0;j<=19;j++) {
                if (run.fix[i][j] == 1) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.yellow);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 2) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.blue);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 3) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.green);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 4) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.cyan);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 5) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.pink);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 6) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.white);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 7) {
                    g.setColor(Color.black);
                    g.drawRect(20*i,20*j,19,19);
                    g.setColor(Color.orange);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 9) {
                    g.setColor(Color.lightGray);
                    g.fillRect(20*i,20*j,18,18);
                }
                if (run.fix[i][j] == 10) {
                    g.setColor(Color.red);
                    g.fillRect(20*i,20*j,18,18);
                }
            }
        }
    }
    public void drawBlocks(Graphics g, int x, int y) {       // 画方块
        int[] shape = run.getcurrentShape().getCurrentBlocks();
        for (int i = 0; i < shape.length; i += 2) {
            if (run.fix[shape[i] + x][shape[i + 1] + y] != 0) {
                for (int j = 0; j < shape.length; j += 2) {
                    run.fix[shape[j] + x][shape[j + 1] + y]=10;
                }
                Main.over();
                gameOver.setVisible(true);
                return;
            }
        }
        for (int i = 0; i < shape.length; i += 2) {
            g.setColor(Color.black);
            g.drawRect(20 * (shape[i] + x), 20 * (shape[i + 1] + y), 19, 19);
            g.setColor(run.getcurrentShape().getColor());
            g.fillRect(20 * (shape[i] + x), 20 * (shape[i + 1] + y), 18, 18);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameStart = new javax.swing.JLabel();
        gameOver = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gameStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/gamestart.png"))); // NOI18N

        gameOver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/游戏结束.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(gameStart, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameOver)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(gameStart, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameOver, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameOver;
    public javax.swing.JLabel gameStart;
    // End of variables declaration//GEN-END:variables
}

