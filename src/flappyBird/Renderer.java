
package flappyBird;

import java.awt.Graphics;
import javax.swing.JPanel;


public class Renderer extends JPanel{
    
    private static final long serialVersionUID =1L;
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        FlappyBird.flappyBird.repaint(g);
    }
    
    
    
}
