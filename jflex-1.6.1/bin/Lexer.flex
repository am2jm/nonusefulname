/*
 * Cool Language Lexer
 */

// section 1: user code copied verbatim

%%

// section 2: options and declarations

%class Lexer
%unicode
%line
%column
%type Token
%state Comment
%state StartString

%{
   // Code in here is copied verbatim into the Lexer class

   int myCounter = 0;
   String buildString = "";


   //types of tokens defined here
 	private Token token(tok type) {
 		return new Token(type, yyline+1, yycolumn+1, null);
 	}
  private Token token(tok type, String message, boolean hadError) {
    return new Token(type, yyline+1, message, hadError);
  }
 	private Token token(tok type, Object lexeme) {
    	return new Token(type, yyline+1, yycolumn+1, lexeme);
 	}
%}

 // define some "macro" regular expressions

 //basic types
 Identifier = [a-z][_A-Za-z0-9]*
 IntegerLiteral = [0-9]+
 Type = [A-Z][a-zA-Z_0-9]*

//two type of comments
 SingleLineParen =[(][*].*[*][)]
 HypenComments = [-][-].*

%%

// Section 3...lexical rules
<YYINITIAL> {
 	":"     { return token(tok.COLON); }
 	","     { return token(tok.COMMA); }
 	"."     { return token(tok.DOT); }
  "@"     { return token(tok.AT); }
  "~" 	{return token(tok.TILDE); }
  [Ii][Ss][Vv][Oo][Ii][Dd]			{return token(tok.ISVOID); }
  "*" 	{return token(tok.TIMES); }
  "/"     { return token(tok.DIVIDE); }
  "+" 	{return token(tok.PLUS);}
  "-" 	{return token(tok.MINUS); }
  "=" 	{ return token(tok.EQUALS); }
  "<=" 	{return token(tok.LE); }
  "=>" 	{return token(tok.RARROW); }
  "<" 	{return token(tok.LT); }
  [Nn][Oo][Tt]	 	{return token(tok.NOT); }
  "<-" 	{return token(tok.LARROW); }

  "{" 	{return token(tok.LBRACE); }
  "(" 	{return token(tok.LPAREN); }
  "}" 	{return token(tok.RBRACE); }
  ";" 	{return token(tok.SEMI); }
  ")" 	{return token(tok.RPAREN);}

 	[Ee][Ll][Ss][Ee]  		{ return token(tok.ELSE); }
 	[Ee][Ss][Aa][Cc] 		{return token(tok.ESAC); }
  [Cc][Aa][Ss][Ee]  { return token(tok.CASE); }
  [Cc][Ll][Aa][Ss][Ss]	{ return token(tok.CLASS); }
 	[f][Aa][Ll][Ss][Ee] 	{return token(tok.FALSE); }
 	[Ff][Ii] 	{return token(tok.FI); }
 	[Ii][Ff] 	{return token(tok.IF); }
 	[Ii][Nn] 	{return token(tok.IN); }
 	[Ii][Nn][Hh][Ee][Rr][Ii][Tt][Ss]	{return token(tok.INHERITS); }
 	[Ll][Ee][Tt] 	{return token(tok.LET); }
 	[Ll][Oo][Oo][Pp]	{return token(tok.LOOP); }
 	[Nn][Ee][Ww]	 	{return token(tok.NEW); }
 	[Oo][Ff]	 		{return token(tok.OF); }
 	[Pp][Oo][Oo][Ll]	{return token(tok.POOL);}
 	[Ss][Ee][Mm][Ii] 	{return token(tok.SEMI); }
 	[Tt][Hh][Ee][Nn] 	{return token(tok.THEN); }
 	[t][Rr][Uu][Ee] 	{return token(tok.TRUE); }
 	[Ww][Hh][Ii][Ll][Ee] {return token(tok.WHILE);}

  \" {
    buildString = "";
    yybegin(StartString);
    }


//
	{Type} 	{ return token(tok.TYPE, yytext()); }
	{Identifier}	{
			String temp = yytext();
			int isZero = temp.indexOf("0");
			if(temp.substring(0, 1).equals("0") && temp.length() > 1)
				return token(tok.STRING, "Invalid Number", true);
			else
				return token(tok.IDENT, yytext());
			}
	{IntegerLiteral}	{ return token(tok.INT, yytext()); }

	{SingleLineParen}	{ /*ignore */ }
	{HypenComments} { /* ignore */ }


	"(*" {
		myCounter = 0;
		yybegin(Comment);
	}

	[ \t\n\s]  { /* ignore */ }

	[^]	{ // catchall?
		return token(tok.STRING, "Invalid Character", true);

		}
}

  <StartString>{
  <<EOF>> {
		//System.out.println("ERROR: " + yyline + 1 +  ": Lexer: ");
		return token(tok.STRING, "END OF FILE", true);
		}



  (\\\") {
            buildString += yytext();
            if(buildString.length() >= 1024){
              return token(tok.STRING, "Max String Length", true);
            }

        }

	\x00 {
		return token(tok.STRING, "Invalid String", true);
		}

	\xd {
		return token(tok.STRING, "Invalid String", true);
		}

	\xa  {
        return token(tok.STRING, "Invalid String", true);
      }

    \" {
        yybegin(YYINITIAL);
        return token(tok.STRING, buildString);

        }

    \\n {
		// catches a typed newline
        buildString += yytext();
        if(buildString.length() >= 1024){
          return token(tok.STRING, "Max String Length", true);
          }
      }



    .|\s {
        buildString += yytext();
        if(buildString.length() >= 1024){
          return token(tok.STRING, "Max String Length", true);
        }
      }
  }
  <Comment>{
  <<EOF>> {
		//System.out.println("ERROR: " + yyline + 1 +  ": Lexer: ");
		return token(tok.STRING, "END OF FILE", true);
		}

  	[ \t\n]  {
		//System.out.println("My text whitespace:" + yytext());
		}

	"(*"	{
				myCounter ++;

			}
	"*)" 	{
				if(myCounter == 0)
					yybegin(YYINITIAL);
				else
					myCounter --;

			}
	.|\s {
    //System.out.println("other: "+yytext());
    /* ignore */
  }

}
