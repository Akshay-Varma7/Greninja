//stage-? + background image + animations + eternal youth + evolution + final ash with pikachu jump vid(it glare sky) 1500 max score(mrng,evng(slowdown slow pokemon),n8) - end forever
//moutain or hill + restart

//death animation like knockout + make pokemon(3) h,w,x,y and not pikachu but charmander 
//intuition->component coordinates update live-physics or event tracking
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;//ActionListener,KeyListener //of awt->has aplet-idk
import javax.swing.*;//JFrame,JPanel

//JFrame is the browser Window ->have many JPanels
//JPanel is section inside it that arranges components
public class Greninja extends JPanel implements ActionListener , KeyListener{//mouse,keyboard(*)
    //panel dimensions
    int w ;
    int b ;

    //images of character(1)+obstacles(4)
    Image greninja;
    Image treetrunk;
    Image pit;//?
    Image pikachu;
    Image mew;//may add cloud sep

    //any component in world
    class Block{
        int height;
        int width;
        int x;
        int y;
        Image img;

        Block(int height,int width,int x,int y,Image img){
            this.height = height;
            this.width = width;
            this.x = x;
            this.y = y;
            this.img = img;
        }
    }

    int greninjaH = 40;
    int greninjaW = 20;
    int greninjaY = b - greninjaH;//st from there top of img
    int greninjaX = 30;

    Block greninja;//class attribute obj too 

    //obstacles 

    //o.1 treetrunk-to be cut and fall left = animation of throw
    int treetrunkH = 80;
    int treetrunkW = 15;
    int treetrunkY = b - pillarH;
    int treetrunkX = ?

    //o.2 pit - jump = greninja change while

    //o.3 pikachu running - jump = thunder animation front and come from back - speed and time after only spawn next pillar 
    int pikachuH = 10;
    int pikachuW = 20;
    int pikachuY = b - pikachuH;
    int pikachuX = ?

    //o.4 mew+cloud(shld be hard so diff one but at mew spawn only) - none => cant slice but pass
    int mewH = 40;
    int mewW = 20;
    int mewY = b - mewH;
    int mewX = ?

    ArrayList<Block> obstacles;

    //physics
    int velocityX = -12;//obstacles-slowdown in afternoon
    int velocityY = 0;
    int gravity = 1;

    //game stats
    boolean gameover = false;
    int score = 0;

    //timers
    Timer gameloop;//for game
    Timer obstaclePlace;//can be diff? in future

    public Greninja(int w ,int b){
        this.w = w;
        this.b = b;

        //inherited from JPanel
        setPreferredSize(new Dimension(this.w,this.b));//method from JComponent (par of Jpanel too)
        setBackground(Color.blue);//img?

        setFocusable(true);//to recieve keyboard inputs
        addKeyListener(this);//When a key is pressed, use the code written in this class to handle it.
    }
}