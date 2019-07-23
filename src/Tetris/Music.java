/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tetris;

import java.io.File;
import java.io.FileInputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author 王萌宇
 */
public class Music {
    static public File file;
    static public FileInputStream fis;
    static public AudioStream as;
    static int i=0;
    public void play(){
         try {
                file=new File("music//1.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
            catch (Exception e) {}
    }
    public void stop(){
        AudioPlayer.player.stop(as);
    }
    public void nextMusic(){
       AudioPlayer.player.stop(as);
       //int i=(int)(Math.random()*(7-1)+1);   //随机产生一个1到7的数
       i=(i+1)%7;
       switch (i){
           case 0:
                try {
                file=new File("music//1.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                    break;
            case 1:
                try {
                file=new File("music//2.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                break;
            case 2:
                try {
                file=new File("music//3.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                break;
            case 3:
                try {
                file=new File("music//4.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                break;
            case 4:
                try {
                file=new File("music//5.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                break; 
            case 5:
                try {
                file=new File("music//6.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                break;    
            case 6:
                try {
                file=new File("music//7.wav");
                fis=new FileInputStream(file);
                as=new AudioStream(fis);
                AudioPlayer.player.start(as);
                }
                catch (Exception e) {}
                break;  
            default:
                break;                 
    }       
       }
}

