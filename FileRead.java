import java.io.*;
import java.sql.Array;


class FileRead {
    Runtime run = Runtime.getRuntime();

    public static void Edit(String filePath, double[] arr) {
        File fileToBeModified = new File(filePath);
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileToBeModified);
            for (Object o : arr) {
                if (o != null) {
                    String print = o + "\n";
                    writer.write(print);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing the resources
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @return array of saved vars
     */
    public static double[][] Read(String file) {

        try {
            File txt = new File(file);
            FileReader fileRead = new FileReader(txt);
            BufferedReader reader = new BufferedReader(fileRead);
            Object[] arrr = new Object[900];

            for (int r = 0; r < arrr.length; r++) {
                Object var = reader.readLine();
                arrr[r] = var;
            }
            int count = 0;
            double[][] arr = new double[30][30];
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++) {
                    arr[i][j] = (double) arrr[count];
                    count++;
                }
            }
            reader.close();
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
            return new double[0][0];
        }
    }


    public long getUsedMem() {
        return run.maxMemory() - run.freeMemory();
    }

    public long getFreeMem() {
        return run.freeMemory();
    }

    public long getMaxMem() {
        return run.maxMemory();
    }

}