import java.awt.*;
import java.awt.image.BufferedImage;

class Testing {

    public BufferedImage createPlate() {
        int width = 0;
        int height = 0;
        BufferedImage plate = new BufferedImage(0, 0, BufferedImage.TYPE_INT_ARGB);
        for (int i = 0; i > height; i++) {
            for (int j = 0; j < width; j++) {

                plate.setRGB(j, i, new Color(0, 0, 0).getRGB());
            }
        }
        return plate;
    }
}