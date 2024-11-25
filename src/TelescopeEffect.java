import java.awt.Color;

public class TelescopeEffect {

    public static void applyTelescopeEffect(Picture picture) {
        // Get the width and height of the image
        int width = picture.getWidth();
        int height = picture.getHeight();

        // Find the center of the image
        int centerX = width / 2;
        int centerY = height / 2;

        // Calculate the radius of the circle (40% of the smaller dimension)
        int radius = (int) (0.4 * Math.min(width, height));

        // Loop through every pixel in the picture
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // Calculate the distance from the center to the current pixel
                int dx = col - centerX;
                int dy = row - centerY;
                double distance = Math.sqrt(dx * dx + dy * dy);

                // If the distance is greater than the radius, set the pixel to black
                if (distance > radius) {
                    // Set the pixel color to black (RGB: 0, 0, 0)
                    picture.setPixelColor(col, row, new Color(0, 0, 0));
                }
            }
        }
    }

    public static void main(String[] args) {
        // Load the picture (assuming you have a method to load the picture)
        Picture picture = new Picture("path_to_image.jpg");

        // Apply the telescope effect
        applyTelescopeEffect(picture);

        // Show the modified picture
        picture.show();
    }
}
