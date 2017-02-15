// Token.java

/**
 * Store values associated with a token
 */

public class Token {
    private Object lexeme;
    private tok tokType;
    private int line, col;
    private boolean hadError;
    private String message;

    //modified token constructor for error handeling
    public Token(tok type, int line, String message, boolean error) {
      this.tokType = type;
      this.line = line;
      this.message = message;
      this.hadError = error;
    }

    //modified token constructor
    public Token(tok type, int line, int col, Object value) {
        this.tokType = type;
        this.line = line;
        this.col = col;
        this.lexeme = value;

        //check for int range error (int too large)
        if(type.toString() == "integer"){
          String number = value.toString();
          try{
            this.lexeme = Integer.parseInt(number);

          }catch(Exception e){

            this.message = "Max int length";
            hadError = true;
          }

        }
    }

    //getters for private flag variables
    public boolean hadError(){
      return hadError;
    }
    public int getLine(){
      return line;
    }
    public String getMessage(){
      return message;
    }

//convert to string
    public String toString() {
        if(this.lexeme == null) {
            return this.line + "\n"+ this.tokType;
        } else {
            return this.line + "\n" + this.tokType + "\n" + this.lexeme;
        }
    }
}
