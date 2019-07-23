package Tetris;

/**
 *
 * @author 王萌宇
 */
public class Run {
    int currentX = 4;
    int currentY = 0;
    public static int[][] fix = new int[20][20];
    Block currentShape;
    int remove=0;//同时消行数量
    static Block nextShape = new Block();

    public void getShape() {  
        currentShape = nextShape; 
        nextShape = new Block();
    }

    public Block getcurrentShape() {
        return currentShape;
    }
    public static Block getNextShape() {
        return nextShape;
    }
    public void init(){           //初始化界面
        for (int j = 0; j <= 9; j++) {
            for (int k = 0; k <= 19; k++) {
                fix[j][k] = 0;
            }
        }
    }
    public boolean isValid(int x, int y) {      //判断是否出界
        int[] tempShape = getcurrentShape().getCurrentBlocks();
        for (int i = 0; i < 8; i += 2) {
            if ((tempShape[i + 1] + y) < 0 || (tempShape[i + 1] + y) > 19) {
                return false;
            }
            if ((tempShape[i] + x) < 0 || (tempShape[i] + x) > 9) {
                return false;
            }
            if (fix[tempShape[i] + x][tempShape[i + 1] + y] != 0) {
                return false;
            }
        }
        return true;
    }
    public void left() {    //左移
        if (isValid(currentX - 1, currentY)) {
            currentX--;
        }
    }
    public void right() {    //右移
        if (isValid(currentX + 1, currentY)) {
            currentX++;
        }

    }
    public void down() {     //下落
        if (isValid(currentX, currentY + 1)) {
            currentY++;
        } else {
            add(currentX, currentY);
        }
    }
    public void turn() {     //变形
        currentShape.next();
        if (!isValid(currentX, currentY)) {
            currentShape.forward();
        }
    }

    public void add(int x, int y) {             //将无法继续下落的方块变成背景
        int[] tempShape = currentShape.getCurrentBlocks();
        for (int i = 0; i < 8; i += 2) {
            fix[x + tempShape[i]][y + tempShape[i + 1]] = 9;
        }
        remove();
        currentX = 3;
        currentY = 0;
        getShape();
        Count.Next();
    }
    public void remove() {              //消行
        for (int i = 19; i > 0; i--) {  //i一共20行
            int flag = 0;
            for (int j = 0; j < 10; j++) {
                if (fix[j][i] == 0) {
                    flag = 1;           //可消行
                }
            }
            if (flag == 0) {
                Main.count += 10;
                Main.changeCount();
                for (int j = 0; j < 10; j++) {
                    fix[j][i] = 0;          //消行
                }
                for (int k = i; k > 0; k--) {
                    for (int j = 0; j < 10; j++) {
                        fix[j][k] = fix[j][k - 1];          //其他行下移一行
                    }
                }
                remove++;
                remove();
            }
        }
        int flag0 = 0;           //判断第一行是否要被消除
        for (int j = 0; j < 10; j++) {
            if (fix[j][0] == 0) {
                flag0 = 1;
            }
        }
        if (flag0 == 0) {
            for (int j = 0; j < 10; j++) {
                fix[j][0] = 0;
            }
        }
        remove = 1;
    }
    //按钮“消除一行”
    static public void G1() {
        //消除一行
        for (int j = 0; j < 10; j++) {
            fix[j][19] = 0;
        }
        //其他行下移一行
        for (int k = 19; k > 0; k--) {
            for (int j = 0; j < 10; j++) {
                fix[j][k] = fix[j][k - 1];
            }
        }
        Main.count +=10;
        Main.changeCount();
        Main.gp.repaint();
    }
}
