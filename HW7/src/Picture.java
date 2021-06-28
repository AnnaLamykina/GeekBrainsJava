import javax.swing.*;
import java.awt.*;

public class Picture extends JLabel {

    private ImageIcon imgIcon;

    public Picture() {
        imgIcon = new ImageIcon("./java.jpg");
        ReScale(100, 100);
        this.setVisible(true);
    }

    public void ReScale(int width, int height) {
        Image image = imgIcon.getImage();
        Image imgScaled = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); // scale it the smooth
                                                                                               // way
        this.setIcon(new ImageIcon(imgScaled)); // transform it back
    }

    public void SetVisible() {
        if (this.isVisible()) {
            this.setVisible(false);
        } else {
            this.setVisible(true);
        }
    }
}
