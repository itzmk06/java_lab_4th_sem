import java.awt.*;
import java.awt.event.*;
class SimpleAwt extends Frame{
    public SimpleAwt(){
        Button b=new Button("Click here");
        b.setBounds(20,100,80,55);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        SimpleAwt sa=new SimpleAwt();
    }
}