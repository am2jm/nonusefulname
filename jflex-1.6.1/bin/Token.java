// Token.java

/**
 * Store values associated with a token
 */

public class Token {
    private Object lexeme;
    private tok tokType;
    private int line, col;

    public Token(tok type, int line, int col, Object value) {
        this.tokType = type;
        this.line = line;
        this.col = col;
        this.lexeme = value;
    }

    public String toString() {
        if(this.lexeme == null) {
            return this.line + "\n"+ this.tokType;
        } else {
            return this.line + "\n" + this.tokType + "\n" + this.lexeme;
        }
    }
}
