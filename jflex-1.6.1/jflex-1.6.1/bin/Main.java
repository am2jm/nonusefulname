import java.io.*;

public class Main{
    /* This is really bad code; strive for better! */
    public static void main(String[] args) throws IOException {
    	String filename = args[0];
      File f = new File(filename + "-lex");
      FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);

      String line = null;
      FileReader fileReader = new FileReader(filename);
      // Always wrap FileReader in BufferedReader.
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String in = "";
      while((line = bufferedReader.readLine()) != null) {
        in += line + "\n";
      }

      Lexer l = new Lexer(new StringReader(in));

            try {
                while(true) {
                    Token t = l.yylex();
                    if(t == null) // we're done
                        break;
                    else
                    {
                        System.out.println(t);
                        bw.write(t.toString());
                        bw.write("\n");
                      }
                }
            } catch (Error e){
                System.out.println(e.getMessage());
            }

      bufferedReader.close();
          // Always close files.


//        BufferedReader br = new BufferedReader(
//                              new InputStreamReader(System.in));
//
//        while(true) {
//            System.out.println("Enter equation (stop with newline)");
//
//
//        }
    }
}
