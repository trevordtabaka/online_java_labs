package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Exercise_01{

    public static void main(String[] args) {

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;

        try{

            inputStream = new BufferedInputStream(new FileInputStream("/Users/trevortabaka/Documents/CodingNomads/online_java_labs/input_outputExample01/file.txt"));
            outputStream = new BufferedOutputStream(new FileOutputStream("/Users/trevortabaka/Documents/CodingNomads/online_java_labs/input_outputExample01/newFile.txt"));
            int c;

            while((c=inputStream.read()) != -1){
                System.out.println("in while: " + c);
                outputStream.write(c);

            }



        }catch (IOException e){

            System.out.println("File not found");

        }finally{

            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }




    }

}