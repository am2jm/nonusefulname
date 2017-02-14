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
%state Comment

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
 Type = [A-Z][a-zA-Z_0-9]*
 String = \"([^\\\"]|\\.)*\"

 //SingleLineParen =[(][*].*[*][)]
 HypenComments = [-][-].*
 ParenComments = [(][*].*([*][)]){0, 1}

%%

// Section 3...lexical rules
<YYINITIAL> {
 	"@"     { return token(tok.AT); }
 	"case"  { return token(tok.CASE); }
 	[Cc][Ll][Aa][Ss][Ss] { return token(tok.CLASS); }
 	":"     { return token(tok.COLON); }
 	","     { return token(tok.COMMA); }
 	"/"     { return token(tok.DIVIDE); }
 	"."     { return token(tok.DOT); }
 	"else"  { return token(tok.ELSE); }
  "Else"  { return token(tok.ELSE); }
 	"=" 	{ return token(tok.EQUALS); }
 	"esac" 	{return token(tok.ESAC); }
  "Esac" 	{return token(tok.ESAC); }
 	"false" {return token(tok.FALSE); }
  "False" {return token(tok.FALSE); }
 	"fi" 	{return token(tok.FI); }
 	"if" 	{return token(tok.IF); }
 	"in" 	{return token(tok.IN); }
 	"inherits"	{return token(tok.INHERITS); }
 	"isvoid" 	{return token(tok.ISVOID); }
 	"<-" 	{return token(tok.LARROW); }
 	"{" 	{return token(tok.LBRACE); }
 	"<=" 	{return token(tok.LE); }
 	"let" 	{return token(tok.LET); }
 	"(" 	{return token(tok.LPAREN); }
 	"<" 	{return token(tok.LT); }
 	"=>" 	{return token(tok.RARROW); }
 	"}" 	{return token(tok.RBRACE); }
 	";" 	{return token(tok.SEMI); }
 	"~" 	{return token(tok.TILDE); }
 	"loop" 	{return token(tok.LOOP); }
 	"-" 	{return token(tok.MINUS); }
 	"new" 	{return token(tok.NEW); }
 	"not" 	{return token(tok.NOT); }
 	"of" 	{return token(tok.OF); }
 	"+" 	{return token(tok.PLUS);}
 	"pool" 	{return token(tok.POOL);}
 	"of" 	{return token(tok.OF);}
 	")" 	{return token(tok.RPAREN);}
 	"semi" 	{return token(tok.SEMI); }
 	"then" 	{return token(tok.THEN); }
 	"*" 	{return token(tok.TIMES); }
 	"true" 	{return token(tok.TRUE); }
 	"while" {return token(tok.WHILE);}




	{String} {
		String temp = yytext();
		temp = temp.substring(1, temp.length()-1);
		return token(tok.STRING, temp);
	}

	{Type} 	{ return token(tok.TYPE, yytext()); }
	{Identifier}	{ return token(tok.IDENT, yytext()); }
	{IntegerLiteral}	{ return token(tok.INT, yytext()); }

	//{SingleLineParen}	{
	//	System.out.println("Why not!");
	//}
	{HypenComments} { /* ignore */ }
	{ParenComments} {
		if( !(yytext().contains("*)")) ){
			//System.out.println("Does not have *)");
			//System.out.println(yytext()+ ": was it:" + yyline+1);
			yybegin(Comment);
		}
	}

	[ \t\n]  { /* ignore */ }
}


  <Comment>{
  	[ \t\n]  {
		//System.out.println("My text whitespace:" + yytext());
		}
    .*[*][)][ \t]* 	{
		//System.out.println("My text return:" + yytext());
		yybegin(YYINITIAL); }
	[*].*	{
		//System.out.println("My text star:" + yytext() + ":end");

		}
	(.*)+ 	{
		//System.out.println("My text text:" + yytext() + ":end");

		}

	//s[\n]	{ yybegin(YYINITIAL); }
	///* [^*](.*)+	{ yybegin(YYINITIAL); } */
	///* fixes half of it breaks the other half */
}
