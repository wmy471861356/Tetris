/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tetris;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 王萌宇
 */
public class Block {
    List<int[][]> Blocks = new ArrayList<>();
    List<Color> colors = new ArrayList<>();
    int i;
    public Block() {
        i=(int)(0+Math.random()*(6-0+1));    //随机产生一个0到7的数
        Blocks.add(lshape);
        colors.add(Color.orange);
        Blocks.add(oshape);
        colors.add(Color.pink);
        Blocks.add(ishape);
        colors.add(Color.yellow);
        Blocks.add(zshape);
        colors.add(Color.blue);
        Blocks.add(flshape);
        colors.add(Color.green);
        Blocks.add(fzshape);
        colors.add(Color.red);
        Blocks.add(tshape);
        colors.add(Color.cyan);
    }  
    int state=0;
    int[][] tshape={
        {1,0,0,1,1,1,2,1},
        {1,0,1,1,2,1,1,2},
        {1,2,0,1,1,1,2,1},
        {1,0,0,1,1,1,1,2}            
    };
    int[][] lshape={
        {1,0,1,1,1,2,2,2},
        {0,1,1,1,2,1,0,2},
        {0,0,1,0,1,1,1,2},
        {2,0,0,1,1,1,2,1}            
    };
    int[][]flshape={
        {1,0,1,1,1,2,0,2},
        {0,0,0,1,1,1,2,1},
        {1,0,2,0,1,1,1,2},
        {0,1,1,1,2,1,2,2}   
    };
    int[][]ishape={
        {0,0,1,0,2,0,3,0},
        {2,0,2,1,2,2,2,3},
        {0,0,1,0,2,0,3,0},
        {2,0,2,1,2,2,2,3}
    };
    int[][]oshape={
        {1,0,2,0,1,1,2,1},
        {1,0,2,0,1,1,2,1},
        {1,0,2,0,1,1,2,1},
        {1,0,2,0,1,1,2,1}  
    };
    int[][]zshape={
        {1,0,2,0,1,1,0,1},
        {1,0,1,1,2,1,2,2},
        {1,0,2,0,1,1,0,1},
        {1,0,1,1,2,1,2,2}  
    };
    int[][]fzshape={
        {0,0,1,0,1,1,2,1},
        {1,0,1,1,0,1,0,2},
        {0,0,1,0,1,1,2,1},
        {1,0,1,1,0,1,0,2} 
    };
    public int[] getCurrentBlocks() {
            return Blocks.get(i)[state];
    }
    public void next() {
        state = state == 3 ? 0 : state + 1;
    }
    public void forward() {
        state = state == 0 ? 3 : state - 1;
    } 
    public Color getColor(){
        return colors.get(i);
    }
}
