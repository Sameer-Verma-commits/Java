import java.io.*;

class copyBytes {
    public static void main(String args[]) {
        // Declare input and output file stream
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        // Declare variable to hold a byte
        byte byteRead;
        try {
            // Connect infile to input file (in.dat)
            infile = new FileInputStream("in.dat");
            // Connect outfile to output file (out.dat)
            outfile = new FileOutputStream("out.dat");
            // Read from in.dat & wite to out.dat
            do {
                byteRead = (byte) infile.read();
                outfile.write(byteRead);
            } while (byteRead != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // close files
            try {
                infile.close();
                outfile.close();
            } catch (IOException e) {
            }
        }
    }
}