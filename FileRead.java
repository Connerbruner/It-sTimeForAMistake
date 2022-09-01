import java.io.*;


class FileRead {
    Runtime run = Runtime.getRuntime( );

    public static void Edit( String filePath , Object[] arr ) {
        File       fileToBeModified = new File( filePath );
        FileWriter writer           = null;
        try {
            writer = new FileWriter( fileToBeModified );
            for ( Object o : arr ) {
                if ( o != null ) {
                    String print = o + "\n";
                    writer.write( print );
                }
            }

        } catch ( IOException e ) {
            e.printStackTrace( );
        } finally {
            try {
                //Closing the resources
                assert writer != null;
                writer.close( );
            } catch ( IOException e ) {
                e.printStackTrace( );
            }
        }
    }

    /**
     * @return array of saved vars
     */
    public static Object[] Read( String file ) {

        try {
            File           txt      = new File( file );
            FileReader     fileRead = new FileReader( txt );
            BufferedReader reader   = new BufferedReader( fileRead );
            Object[]       arr      = new Object[ 13 ];

            for ( int r = 0 ; r < arr.length ; r++ ) {
                Object var = reader.readLine( );
                arr[ r ] = var;
            }
            reader.close( );
            return arr;
        } catch ( IOException e ) {
            e.printStackTrace( );
            return new Object[ 0 ];
        }
    }





    public long getUsedMem( ) {
        return run.maxMemory( ) - run.freeMemory( );
    }

    public long getFreeMem( ) {
        return run.freeMemory( );
    }

    public long getMaxMem( ) {
        return run.maxMemory( );
    }

}