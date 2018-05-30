
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class JayFrame extends JFrame {
    
    JLabel msgLabel;
    
    private void setLabelMsg(String str){
        msgLabel.setText(str);
    }
    
    JayFrame(){
        
        setLayout( new FlowLayout() );
        msgLabel = new JLabel("Move Mouse Over This Panel and Click",
                JLabel.CENTER);
        
        this.addMouseListener( new JayClickListener() );
        this.add( msgLabel );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Click Window Test");
        setSize(400, 300);
        setVisible(true);
    }
    
    class JayClickListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println("Mouse Clicked");
            setLabelMsg("Mouse Clicked at ("+ e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //System.out.println("Mouse Down");
            setLabelMsg("Mouse Down");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            setLabelMsg("Mouse Up");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            setLabelMsg("Mouse Over");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            setLabelMsg("Mouse Gone");
        }
    
    }
    
}
