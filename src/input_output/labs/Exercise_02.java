package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02{

    public static void main(String[] args) {


        BufferedReader reader = null;
        BufferedWriter writer = null;

        try{
            reader = new BufferedReader(new FileReader("/Users/trevortabaka/Documents/CodingNomads/online_java_labs/Genesis.txt"));
            writer = new BufferedWriter(new FileWriter("/Users/trevortabaka/Documents/CodingNomads/online_java_labs/Encypted_Genesis.txt"));

            int c;

            while((c=reader.read()) != -1){
                char ch = Character.toLowerCase((char) c);
                switch (ch){

                    case 'a':
                    case 'n':
                    case 'm':
                    case 'z':
                        c = '1';
                        break;

                    case 'b':
                    case 'y':
                    case 'o':
                    case 'l':

                        c = '2';
                        break;
                    case 'c':
                    case 'k':
                    case 'p':
                    case 'x':

                        c = '3';
                        break;
                    case 'd':
                    case 'j':
                    case 'q':
                    case 'w':

                        c = '4';
                        break;
                    case 'e':
                    case 'r':
                    case 'i':
                    case 'v':

                        c = '5';
                        break;
                    case 'f':
                    case 'h':
                    case 'u':
                    case 's':

                        c = '6';
                        break;
                    case 'g':
                    case 't':

                        c = '7';
                        break;
                }




                writer.write(c);

            }


        }catch (IOException io){


        }finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}