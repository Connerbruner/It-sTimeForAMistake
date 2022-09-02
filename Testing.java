import java.awt.*;
import java.awt.image.BufferedImage;

class Testing {

    public static void HeatMap(String path) {

        try {
            int width = 30;
            int height = 30;
            double[][] weightTable = FileRead.Read("weightTable.txt");
            double currentWeight = 0;
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = bufferedImage.createGraphics();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    currentWeight = weightTable[i][j];
                    if (currentWeight == 0) {
                        g2d.setColor(new Color(255, 255, 255));
                    } else if (currentWeight < 0) {
                        g2d.setColor(new Color(255 + (int) (currentWeight * 255), 255 + (int) (currentWeight * 255), 255));
                    } else {
                        g2d.setColor(new Color(255, 255 - (int) (currentWeight * 255), 255 - (int) (currentWeight * 255)));
                    }
                    g2d.fillRect(i, j, 1, 1);
                }
            }
            ImageIO.write(bufferedImage, "jpg", new File(path));
        } catch (IOException e) {

        }

    }

    public static void massTrainSquare(int count,String path) {
        int width = 30;
        int height = 30;

        for (int i=0; i<count; i++) {
            try {
                ImageIO.write(Square(), "bmp", new File(path+"/"+i+".bmp"));
            } catch (IOException e) {

            }
        }
    }
    public static BufferedImage Square() {
        BufferedImage bufferedImage = new BufferedImage(30, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 30, 30);
        g2d.setColor(Color.black);
        g2d.drawRect((int)(Math.random()*30), (int)(Math.random()*30), (int)(Math.random()*30)-1, (int)(Math.random()*30)-1);
        return bufferedImage;
    }



}