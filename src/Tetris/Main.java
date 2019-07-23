package Tetris;

import java.util.Calendar;
import javax.swing.JOptionPane;



public class Main extends javax.swing.JFrame {
    static int model;//模式
    static int point;//得分
    static Game gp;//游戏板
    static Count cp;//计分板
    static int count=0;//分数
    static int interval=1000;//间隔
    static boolean isOver = true;  //判断结束
    static boolean isPause = false;   //判断暂停
    static Calendar calendar;     //时间
    static long time1;            //当前时间毫秒数
    
    public Main() { 
        initComponents();
        start.setVisible(false);        
        pause.setVisible(false);        
        musicButton.setVisible(false);
        switchMusic.setVisible(false);
        restart.setVisible(false);
        pauseLabel.setVisible(false);
        cp=new Count();
        cp.setSize(100,600);    //计分板大小
        cp.setLocation(254, 100);            //画板位置
        cp.setVisible(false);
        this.getContentPane().add(cp);     
        this.setSize(400, 600);        //画板大小
    }     
    
    static  public void changeCount(){
        cp.count.setText(Integer.toString(Main.count));  //显示分数
        switch (count){
            case 30:
                cp.name.setText("英勇黄铜");
                break;
            case 50:
                cp.name.setText("不屈白银");
                break;
            case 70:
                cp.name.setText("荣耀黄金");
                break;
            case 100:
                cp.name.setText("华贵铂金");
                break; 
            case 140:
                cp.name.setText("璀璨钻石");
                break;  
            case 180:
                cp.name.setText("超凡大师");
                break;
            case 220:
                cp.name.setText("傲世宗师");
                break;
            case 300:
                cp.name.setText("最强王者");
                break;    
            default:
                break;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        go = new javax.swing.JButton();
        start = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        chooseModel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        modelBox = new javax.swing.JComboBox<>();
        startGame = new javax.swing.JLabel();
        musicButton = new javax.swing.JButton();
        switchMusic = new javax.swing.JLabel();
        restart = new javax.swing.JLabel();
        pauseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        go.setBackground(new java.awt.Color(204, 204, 204));
        go.setFont(new java.awt.Font("Lucida Grande", 1, 64)); // NOI18N
        go.setForeground(new java.awt.Color(204, 204, 204));
        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/开始游戏.png"))); // NOI18N
        go.setToolTipText("");
        go.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/重新开始.png"))); // NOI18N
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/暂停.png"))); // NOI18N
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        chooseModel.setFont(new java.awt.Font("楷体", 1, 18)); // NOI18N
        chooseModel.setText("难度选择：");

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/Avengers.jpg"))); // NOI18N

        modelBox.setFont(new java.awt.Font("楷体", 1, 24)); // NOI18N
        modelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "正常", "地狱" }));
        modelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelBoxActionPerformed(evt);
            }
        });

        startGame.setFont(new java.awt.Font("楷体", 1, 18)); // NOI18N
        startGame.setText("开始游戏");

        musicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tetris/icons/音乐.png"))); // NOI18N
        musicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicButtonActionPerformed(evt);
            }
        });

        switchMusic.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        switchMusic.setText("切换音乐");

        restart.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        restart.setText("重新开始");

        pauseLabel.setFont(new java.awt.Font("楷体", 1, 15)); // NOI18N
        pauseLabel.setText("暂停游戏");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(go)
                            .addComponent(startGame, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chooseModel)
                            .addComponent(modelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pauseLabel))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restart)
                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musicButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switchMusic, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(musicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(switchMusic)
                            .addComponent(restart))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pauseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(background)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseModel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startGame, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelBox))
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        try {
            gp.keyPressed(evt);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "还没点开始", "错误", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_formKeyPressed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        // 游戏开始
        startGame.setVisible(false);
        musicButton.setVisible(true);
        chooseModel.setVisible(false);
        background.setVisible(false);
        modelBox.setVisible(false);
        switchMusic.setVisible(true);
        restart.setVisible(true);
        pauseLabel.setVisible(true);
        start.setVisible(true);
        pause.setVisible(true);
        cp.setVisible(true);
        isOver=false;
        gp=new Game();
        gp.setSize(200,400);
        gp.setLocation(50, 100);
        this.getContentPane().add(gp);
        go.setVisible(false);
        cp.setG1Count(3);
        calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
        calendar.set(year, month, day, hour, minute, second);
        time1=calendar.getTimeInMillis();   //当前时间的毫秒数
        this.requestFocusInWindow();
    }//GEN-LAST:event_goActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // 暂停游戏:
        if (isPause) {
            isPause=false;
            pauseLabel.setText("暂停游戏");
        }else{
            isPause=true; 
            pauseLabel.setText("继续游戏");
        }
        this.requestFocusInWindow();
    }//GEN-LAST:event_pauseActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // 重新开始
        try {
            over();
            Thread.sleep(1000);    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.isOver=false;
        gp=new Game();
        gp.setSize(200,400);
        gp.setLocation(50, 100);
        this.getContentPane().add(gp);
        count=0;
        changeCount();
        cp.setG1Count(3);
        this.requestFocusInWindow();
    }//GEN-LAST:event_startActionPerformed

    private void modelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelBoxActionPerformed
       //模式选择
       String mo=(String)modelBox.getSelectedItem();
       switch (mo) {
            case "正常":
                model=1;
                break;
            case "地狱":
                model=2;
                interval=100;
                break;
            default:
                break;
    }//GEN-LAST:event_modelBoxActionPerformed
    }
    
    static public void over(){    
        //结束
        isOver=true;
        isPause=false;
    }
    
    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
        // 切换音乐
        Music mu=new Music();
        mu.nextMusic();
        this.requestFocusInWindow();
    }//GEN-LAST:event_musicButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {     
            public void run() {
             Music m=new Music();   //背景音乐
             m.play();
             Main mf =new Main();
             mf.setVisible(true);
             mf.requestFocusInWindow();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel chooseModel;
    private javax.swing.JButton go;
    private javax.swing.JComboBox<String> modelBox;
    private javax.swing.JButton musicButton;
    private javax.swing.JButton pause;
    private javax.swing.JLabel pauseLabel;
    private javax.swing.JLabel restart;
    private javax.swing.JButton start;
    private javax.swing.JLabel startGame;
    private javax.swing.JLabel switchMusic;
    // End of variables declaration//GEN-END:variables
}
