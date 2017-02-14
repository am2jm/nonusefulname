/*
 * Simple Caclulater Lexer
 * Lexer.flex
 */

 // section 1: user code copied verbatim

%%

// section 2: options and declarations

%class Lexer
%unicode
%line
%column
%type Token

%{
   // Code in here is copied verbatim into the Lexer class

   private Token token(tok type) {
       return new Token(type, yyline+1, yycolumn+1, null);
   }

   private Token token(tok type, Object lexeme) {
       return new Token(type, yyline+1, yycolumn+1, lexeme);
   }
%}

 // define some "macro" regular expressions
 Identifier = [a-z][_A-Za-z0-9]*
 IntegerLiteral = [0-9]+
 FloatLiteral = [0-9]+"." | "."[0-9]+ | [0-9]+"."[0-9]+

%%

// Section 3...lexical rules
<YYINITIAL> {
   "@"     { return token(tok.AT); }
   "case"     { return token(tok.CASE); }
   "class"     { return token(tok.CASE); }
   ":"     { return token(tok.COLON); }
   ","     { return token(tok.COMMA); }
   "/"     { return token(tok.DIVIDE); }
   "."     { return token(tok.DOT); }
   "else"  { return token(tok.ELSE); }
   "equals" { return token(tok.EQUALS); }
   "esac" {return token(tok.ESAC); }
   "false" {return token(tok.FALSE); }
   "fi" {return token(tok.FI); }
   "if" {return token(tok.IF); }
   "in" {return token(tok.IN); }
   "inherits" {return token(tok.INHERITS); }
   "Int" {return token(tok.INTEGER); }
   "isvoid" {return token(tok.ISVOID); }
   "<-" {return token(tok.LARROW); }
   "{" {return token(tok.LBRACE); }
   "<=" {return token(tok.LE); }
   "let" {return token(tok.LET); }
   "(" {return token(tok.LPAREN); }
   "<" {return token(tok.LT); }
   "=>" {return token(tok.RARROW); }
   "}" {return token(tok.RBRACE); }
   ";" {return token(tok.SEMI); }
   "~" {return token(tok.TILDE); }
   "loop" {return token(tok.LOOP); }
   "-" {return token(tok.MINUS); }
   "new" {return token(tok.NEW); }
   "not" {return token(tok.NOT); }
   "of" {return token(tok.OF); }
   "+" {return token(tok.PLUS);}
   "pool" {return token(tok.POOL);}
   "of" {return token(tok.OF);}
   ")" {return token(tok.RPAREN);}
   "semi" {return token(tok.SEMI); }
   "String" {return token(tok.String); }
   "then" {return token(tok.THEN); }
   "*" {return token(tok.TIMES); }
    "true" {return token(tok.TRUE); }
    "type" {return token(tok.TYPE)}
    "while" {return token(tok.WHILE)}
    





   {Identifier} { return token(tok.IDENT, yytext()); }
   {IntegerLiteral} { return token(tok.INT, yytext()); }
   {FloatLiteral} { return token(tok.FLOAT, yytext()); }

   [ \t\n]  { /* ignore */ }
}
