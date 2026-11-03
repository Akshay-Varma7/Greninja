import javax.swing.*;//jframe

public class App{
    public static void main(String[] args){
        JFrame frame = new JFrame("greninja");

        int w = 900;//px
        int b = 400;
        //default changing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//static ->program terminates

        frame.setSize(w,b);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);//(0,0) top left to mid
        
        frame.setVisible(true);

    }
}
