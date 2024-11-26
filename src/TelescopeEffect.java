import java.awt.*;
import java.io.IOException;

public class TelescopeEffect {
    public static void applyTelescopeEffect(Picture picture) {
        int width = picture.getWidth();
        int height = picture.getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        int radius = (int) (0.4 * Math.min(width, height));

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int dx = x - centerX;
                int dy = y - centerY;
                if (dx * dx + dy * dy > radius * radius) {
                    picture.setPixelColor(x, y, Color.BLACK);
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Picture picture = new Picture("path_to_image.jpg"); // Update path
            applyTelescopeEffect(picture);
            picture.show();
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }
}
