import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Picture {
    private BufferedImage image;

    public Picture(String path) throws IOException {
        this.image = ImageIO.read(new File(path));
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }

    public void setPixelColor(int x, int y, Color color) {
        image.setRGB(x, y, color.getRGB());
    }

    public Color getPixelColor(int x, int y) {
        int rgb = image.getRGB(x, y);
        return new Color(rgb);
    }

    public void show() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(image.getWidth(), image.getHeight());
        frame.add(new JLabel(new ImageIcon(image)));
        frame.setVisible(true);
    }
}
