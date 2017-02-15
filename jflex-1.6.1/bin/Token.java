// Token.java

/**
 * Store values associated with a token
 */

public class Token {
    private Object lexeme;
    private tok tokType;
    private int line, col;
    private boolean hadError;

    public Token(tok type, int line, int col, Object value) {
        this.tokType = type;
        this.line = line;
        this.col = col;
        this.lexeme = value;

        if(type.toString() == "integer"){
          String number = value.toString();
          try{
            int temp = Integer.parseInt(number);

          }catch(Exception e){
            // System.out.println(e);
            hadError = true;
          }

        }
    }

    public boolean hadError(){
      return hadError;
    }
    public int getLine(){
      return line;
    }

    public String toString() {
        if(this.lexeme == null) {
            return this.line + "\n"+ this.tokType;
        } else {
            return this.line + "\n" + this.tokType + "\n" + this.lexeme;
        }
    }
}
