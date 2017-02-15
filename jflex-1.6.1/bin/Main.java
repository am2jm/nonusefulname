import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {

      //read in the file
    String filename = args[0];
    String tokens = "";
    boolean myFlag = false;

		File file = new File(filename + "-lex");

    //delete if it exists
 		if (file.exists()){
     		file.delete();
 		}

    //create way to write to new file
		FileWriter fw = new FileWriter(filename+"-lex", true);
		BufferedWriter bw = new BufferedWriter(fw);

		String line = null;

    //create way to read file
    FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

    //build string
		String in = "";
    boolean makeFile = true;
		while((line = bufferedReader.readLine()) != null) {
			in += line + "\n";
		}

    	Lexer l = new Lexer(new StringReader(in));

//loop through each line and get token and print
		try {
			while(true) {
				Token t = l.yylex();
				if(t == null) // we're done
					break;
				else
				{

          //if there were error, log them and do not write to file
          if(t.hadError()){
            myFlag = true;
            System.out.println("ERROR: " + t.getLine() + ": Lexer: " + t.getMessage());
            break;
          }
          else{
            //build token output
          tokens += t.toString();
          tokens += "\n";
          }
				}
			}
		} catch (Error e){
			System.out.println(e.getMessage());
		}

    //if there wasn't error, write to file
    if(!myFlag){
      bw.write(tokens);
    }

    //close reader/writer
		bw.close();
    bufferedReader.close();

    }
}
