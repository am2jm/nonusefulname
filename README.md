# be sure to edit the team.txt file
<br/>
<br>
readme.txt: your README file<br>
references.txt: your file of citations<br/>
good.cl: a novel positive testcase<br>
bad.cl: a novel negative testcase<br>
<i>source_files: including<br></i>
main.java (contains the main method)<br>
<b>some_file.flex</b> (or similar)<br>
<br>
<i>If your regular expressions and lexer definition are in some other files (e.g., <b>lexer.flex</b>), be sure to include those as well!</i>
<br>
Whitespace<br>
Comments<br>
Type - probably needs recursion or regex or something
 {Type} { return token(tok.TYPE, yytext()); }
<br><br> 
 Type = [A-Z][_a-zA-Z]*
