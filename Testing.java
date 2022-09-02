import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

class Testing {

    public static void HeatMap(String path) {

        try {
            int width = 30;
            int height = 30;
            double[][] weightTable = FileRead.Read("weightTable.txt");
            double currentWeight;
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
        } catch (IOException ignored) {

        }

    }

    public static void massTrainSquare(int count, String path) {

        for (int i = 0; i < count; i++) {
            try {
                ImageIO.write(Square(), "bmp", new File(path + "/" + i + ".bmp"));
            } catch (IOException ignored) {

            }
        }
    }

    public static BufferedImage Square() {
        BufferedImage bufferedImage = new BufferedImage(30, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 30, 30);
        g2d.setColor(Color.black);
        int squareX = (int) (Math.random() * 28) + 2;
        int squareY = (int) (Math.random() * 28) + 2;
        int squareWide = (int) (Math.random() * squareX) + 2;
        int squareTall = (int) (Math.random() * squareY) + 2;
        if (squareWide > 30) {
            squareWide -= (squareWide % 30) + 1;
        }
        if (squareTall > 30) {
            squareTall -= (squareTall % 30) + 1;
        }

        g2d.drawRect(squareX, squareY, squareWide, squareTall);
        return bufferedImage;
    }

    public static void massTrainOval(int count, String path) {

        for (int i = 0; i < count; i++) {
            try {
                ImageIO.write(Oval(), "bmp", new File(path + "/" + i + ".bmp"));
            } catch (IOException ignored) {

            }
        }
    }

    public static BufferedImage Oval() {
        BufferedImage bufferedImage = new BufferedImage(30, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 30, 30);
        g2d.setColor(Color.black);
        int squareX = (int) (Math.random() * 28) + 2;
        int squareY = (int) (Math.random() * 28) + 2;
        int squareWide = (int) (Math.random() * squareX) + 2;
        int squareTall = (int) (Math.random() * squareY) + 2;
        if (squareWide > 30) {
            squareWide -= (squareWide % 30) + 1;
        }
        if (squareTall > 30) {
            squareTall -= (squareTall % 30) + 1;
        }

        g2d.drawOval(squareX, squareY, squareWide, squareTall);
        return bufferedImage;
    }

    public static void findAllFilesInFolder(File folder) {
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (!file.isDirectory()) {
                System.out.println(file.getName());
            } else {
                findAllFilesInFolder(file);
            }
        }
    }


}