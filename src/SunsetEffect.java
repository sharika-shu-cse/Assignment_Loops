import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SunsetEffect {

    public static void applySunsetEffect(BufferedImage image) {
        // Loop through every pixel in the image
        for (int row = 0; row < image.getHeight(); row++) {
            for (int col = 0; col < image.getWidth(); col++) {
                // Get the color of the current pixel
                Color color = new Color(image.getRGB(col, row));

                // Get the red, green, and blue components
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                // Increase the red value by 30%, with a maximum of 255
                red = (int) (red * 1.3); // Increase by 30%
                if (red > 255) {
                    red = 255; // Clamp to 255 if it exceeds
                }

                // Create a new color with the modified red value
                Color newColor = new Color(red, green, blue);

                // Set the new color for the pixel
                image.setRGB(col, row, newColor.getRGB());
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Load the image from a file
            BufferedImage image = ImageIO.read(new File("path_to_image.jpg"));

            // Apply the sunset effect
            applySunsetEffect(image);

            // Save the modified image (optional)
            ImageIO.write(image, "jpg", new File("path_to_output_image.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
