/* The following code was generated by JFlex 1.6.1 */

/*
 * Simple Caclulater Lexer
 * Lexer.flex
 */

// section 1: user code copied verbatim


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int Comment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\54\1\7\1\10\1\10\1\10\22\0\1\54\1\0\1\5"+
    "\5\0\1\11\1\13\1\12\1\51\1\24\1\14\1\26\1\25\12\3"+
    "\1\23\1\45\1\41\1\27\1\43\1\0\1\15\32\4\1\0\1\6"+
    "\2\0\1\2\1\0\1\17\1\1\1\16\1\40\1\21\1\30\1\1"+
    "\1\33\1\31\2\1\1\22\1\52\1\32\1\37\1\47\1\1\1\34"+
    "\1\20\1\35\1\53\1\36\1\50\3\1\1\42\1\0\1\44\1\46"+
    "\6\0\1\10\u1fa2\0\1\10\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\0\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\4\1\1\12\1\13\1\14\1\15"+
    "\1\16\5\1\1\17\1\20\1\21\1\22\1\23\2\1"+
    "\1\24\1\0\2\4\1\25\1\0\1\26\1\4\7\1"+
    "\1\27\1\1\1\30\1\1\1\31\1\32\4\1\1\33"+
    "\1\34\1\35\2\1\1\0\1\4\1\36\2\0\5\1"+
    "\1\37\4\1\1\40\1\41\4\1\1\36\1\4\1\42"+
    "\1\1\1\22\1\43\1\44\1\45\3\1\1\46\1\47"+
    "\1\50\1\1\1\51\1\52\2\1\1\53\1\54\2\1"+
    "\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[108];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u010e\0\u010e\0\u0168\0\u010e\0\u0195\0\u01c2\0\u01ef\0\u021c"+
    "\0\u010e\0\u010e\0\u010e\0\u010e\0\u0249\0\u0276\0\u02a3\0\u02d0"+
    "\0\u02fd\0\u032a\0\u0357\0\u010e\0\u010e\0\u010e\0\u010e\0\u0384"+
    "\0\u03b1\0\u010e\0\u03de\0\u040b\0\u03de\0\u010e\0\u0438\0\u0465"+
    "\0\u0492\0\u04bf\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd"+
    "\0\u010e\0\u05fa\0\132\0\u0627\0\132\0\u0654\0\u0681\0\u06ae"+
    "\0\u06db\0\u0708\0\132\0\u010e\0\u010e\0\u0735\0\u0762\0\u078f"+
    "\0\u07bc\0\u07bc\0\u0465\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d"+
    "\0\u08ca\0\132\0\u08f7\0\u0924\0\u0951\0\u097e\0\132\0\132"+
    "\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\u03de\0\u0465\0\132\0\u0a5f"+
    "\0\132\0\132\0\132\0\132\0\u0a8c\0\u0ab9\0\u0ae6\0\132"+
    "\0\132\0\132\0\u0b13\0\132\0\132\0\u0b40\0\u0b6d\0\132"+
    "\0\132\0\u0b9a\0\u0bc7\0\132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[108];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\3\1\0\1\4\1\5\1\6\1\0\1\7"+
    "\1\0\1\10\1\11\1\12\1\13\1\14\1\15\1\3"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\3\1\31\1\3\1\32\1\3"+
    "\1\33\1\34\1\0\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\2\3\1\7\7\43\1\7\1\0\1\43\1\44"+
    "\41\43\1\45\1\0\4\3\11\0\5\3\5\0\11\3"+
    "\6\0\2\3\1\0\2\3\4\0\1\4\52\0\2\5"+
    "\1\0\1\5\11\0\5\5\5\0\11\5\6\0\2\5"+
    "\1\0\2\5\1\0\5\6\1\46\1\47\46\6\67\0"+
    "\1\50\56\0\1\51\41\0\4\3\11\0\1\3\1\52"+
    "\2\3\1\53\5\0\11\3\6\0\2\3\1\0\2\3"+
    "\2\0\4\3\11\0\3\3\1\54\1\3\5\0\11\3"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\2\3"+
    "\1\55\1\3\1\56\5\0\11\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\3\3\1\57\1\3\5\0"+
    "\7\3\1\60\1\3\6\0\2\3\1\0\2\3\44\0"+
    "\1\61\12\0\4\3\11\0\1\3\1\62\3\3\5\0"+
    "\1\3\1\63\7\3\6\0\2\3\1\0\2\3\2\0"+
    "\4\3\11\0\2\3\1\64\2\3\5\0\1\65\1\3"+
    "\1\66\6\3\6\0\2\3\1\0\2\3\2\0\4\3"+
    "\11\0\3\3\1\67\1\3\5\0\7\3\1\70\1\3"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\5\3"+
    "\5\0\3\3\1\71\1\72\4\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\5\3\5\0\1\73\10\3"+
    "\6\0\2\3\1\0\2\3\15\0\1\74\12\0\1\75"+
    "\26\0\4\3\11\0\5\3\5\0\7\3\1\76\1\3"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\5\3"+
    "\5\0\3\3\1\77\5\3\6\0\2\3\1\0\2\3"+
    "\1\0\7\43\2\0\1\43\1\100\42\43\7\101\2\0"+
    "\1\101\1\44\1\102\41\101\7\6\2\0\44\6\7\103"+
    "\2\0\1\103\1\104\42\103\7\51\2\0\44\51\1\0"+
    "\4\3\11\0\2\3\1\105\2\3\5\0\11\3\6\0"+
    "\2\3\1\0\2\3\2\0\4\3\11\0\1\3\1\106"+
    "\3\3\5\0\11\3\6\0\2\3\1\0\2\3\2\0"+
    "\4\3\11\0\5\3\5\0\11\3\6\0\2\3\1\0"+
    "\1\107\1\3\2\0\4\3\11\0\1\3\1\110\3\3"+
    "\5\0\11\3\6\0\2\3\1\0\2\3\2\0\4\3"+
    "\11\0\2\3\1\111\2\3\5\0\11\3\6\0\2\3"+
    "\1\0\2\3\2\0\4\3\11\0\5\3\5\0\5\3"+
    "\1\112\3\3\6\0\2\3\1\0\2\3\2\0\4\3"+
    "\11\0\5\3\5\0\7\3\1\113\1\3\6\0\2\3"+
    "\1\0\2\3\2\0\4\3\11\0\4\3\1\114\5\0"+
    "\11\3\6\0\2\3\1\0\2\3\2\0\4\3\11\0"+
    "\5\3\5\0\6\3\1\115\2\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\5\3\5\0\3\3\1\116"+
    "\5\3\6\0\2\3\1\0\2\3\2\0\4\3\11\0"+
    "\5\3\5\0\11\3\6\0\1\3\1\117\1\0\2\3"+
    "\2\0\4\3\11\0\5\3\5\0\5\3\1\120\3\3"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\3\3"+
    "\1\121\1\3\5\0\11\3\6\0\2\3\1\0\2\3"+
    "\2\0\4\3\11\0\5\3\5\0\11\3\6\0\2\3"+
    "\1\0\1\3\1\122\2\0\4\3\11\0\5\3\5\0"+
    "\7\3\1\123\1\3\6\0\2\3\1\0\2\3\2\0"+
    "\4\3\11\0\5\3\5\0\1\3\1\124\7\3\6\0"+
    "\2\3\1\0\2\3\1\0\7\43\2\0\1\43\1\100"+
    "\1\125\41\43\7\101\2\0\1\101\1\44\42\101\7\103"+
    "\2\0\1\103\1\104\1\126\41\103\1\0\4\3\11\0"+
    "\3\3\1\127\1\3\5\0\11\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\2\3\1\130\2\3\5\0"+
    "\11\3\6\0\2\3\1\0\2\3\2\0\4\3\11\0"+
    "\5\3\5\0\1\3\1\131\7\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\1\132\4\3\5\0\11\3"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\3\3"+
    "\1\133\1\3\5\0\11\3\6\0\2\3\1\0\2\3"+
    "\2\0\4\3\11\0\5\3\5\0\11\3\6\0\1\134"+
    "\1\3\1\0\2\3\2\0\4\3\11\0\2\3\1\135"+
    "\2\3\5\0\11\3\6\0\2\3\1\0\2\3\2\0"+
    "\4\3\11\0\5\3\5\0\7\3\1\136\1\3\6\0"+
    "\2\3\1\0\2\3\2\0\4\3\11\0\3\3\1\137"+
    "\1\3\5\0\11\3\6\0\2\3\1\0\2\3\2\0"+
    "\4\3\11\0\5\3\5\0\2\3\1\140\6\3\6\0"+
    "\2\3\1\0\2\3\2\0\4\3\11\0\3\3\1\141"+
    "\1\3\5\0\11\3\6\0\2\3\1\0\2\3\2\0"+
    "\4\3\11\0\4\3\1\142\5\0\11\3\6\0\2\3"+
    "\1\0\2\3\2\0\4\3\11\0\4\3\1\143\5\0"+
    "\11\3\6\0\2\3\1\0\2\3\2\0\4\3\11\0"+
    "\2\3\1\144\2\3\5\0\11\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\3\3\1\145\1\3\5\0"+
    "\11\3\6\0\2\3\1\0\2\3\2\0\4\3\11\0"+
    "\5\3\5\0\1\3\1\146\7\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\5\3\5\0\4\3\1\147"+
    "\4\3\6\0\2\3\1\0\2\3\2\0\4\3\11\0"+
    "\3\3\1\150\1\3\5\0\11\3\6\0\2\3\1\0"+
    "\2\3\2\0\4\3\11\0\5\3\5\0\10\3\1\151"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\5\3"+
    "\5\0\1\3\1\152\7\3\6\0\2\3\1\0\2\3"+
    "\2\0\4\3\11\0\5\3\5\0\5\3\1\153\3\3"+
    "\6\0\2\3\1\0\2\3\2\0\4\3\11\0\2\3"+
    "\1\154\2\3\5\0\11\3\6\0\2\3\1\0\2\3"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3060];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\3\1\1\0\1\11\1\1\2\11\1\1\1\11"+
    "\4\1\4\11\7\1\4\11\2\1\1\11\1\0\2\1"+
    "\1\11\1\0\11\1\1\11\12\1\2\11\2\1\1\0"+
    "\2\1\2\0\50\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[108];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
   // Code in here is copied verbatim into the Lexer class

 	private Token token(tok type) {
 		return new Token(type, yyline+1, yycolumn+1, null);
 	}

 	private Token token(tok type, Object lexeme) {
    	return new Token(type, yyline+1, yycolumn+1, lexeme);
 	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return token(tok.IDENT, yytext());
            }
          case 46: break;
          case 2: 
            { return token(tok.INT, yytext());
            }
          case 47: break;
          case 3: 
            { return token(tok.TYPE, yytext());
            }
          case 48: break;
          case 4: 
            { /* ignore */
            }
          case 49: break;
          case 5: 
            { return token(tok.LPAREN);
            }
          case 50: break;
          case 6: 
            { return token(tok.TIMES);
            }
          case 51: break;
          case 7: 
            { return token(tok.RPAREN);
            }
          case 52: break;
          case 8: 
            { return token(tok.MINUS);
            }
          case 53: break;
          case 9: 
            { return token(tok.AT);
            }
          case 54: break;
          case 10: 
            { return token(tok.COLON);
            }
          case 55: break;
          case 11: 
            { return token(tok.COMMA);
            }
          case 56: break;
          case 12: 
            { return token(tok.DIVIDE);
            }
          case 57: break;
          case 13: 
            { return token(tok.DOT);
            }
          case 58: break;
          case 14: 
            { return token(tok.EQUALS);
            }
          case 59: break;
          case 15: 
            { return token(tok.LT);
            }
          case 60: break;
          case 16: 
            { return token(tok.LBRACE);
            }
          case 61: break;
          case 17: 
            { return token(tok.RBRACE);
            }
          case 62: break;
          case 18: 
            { return token(tok.SEMI);
            }
          case 63: break;
          case 19: 
            { return token(tok.TILDE);
            }
          case 64: break;
          case 20: 
            { return token(tok.PLUS);
            }
          case 65: break;
          case 21: 
            { String temp = yytext();
		temp = temp.substring(1, temp.length()-1);
		return token(tok.STRING, temp);
            }
          case 66: break;
          case 22: 
            { yybegin(Comment);
            }
          case 67: break;
          case 23: 
            { return token(tok.RARROW);
            }
          case 68: break;
          case 24: 
            { return token(tok.FI);
            }
          case 69: break;
          case 25: 
            { return token(tok.IF);
            }
          case 70: break;
          case 26: 
            { return token(tok.IN);
            }
          case 71: break;
          case 27: 
            { return token(tok.OF);
            }
          case 72: break;
          case 28: 
            { return token(tok.LARROW);
            }
          case 73: break;
          case 29: 
            { return token(tok.LE);
            }
          case 74: break;
          case 30: 
            { yybegin(YYINITIAL);
            }
          case 75: break;
          case 31: 
            { return token(tok.LET);
            }
          case 76: break;
          case 32: 
            { return token(tok.NEW);
            }
          case 77: break;
          case 33: 
            { return token(tok.NOT);
            }
          case 78: break;
          case 34: 
            { return token(tok.CASE);
            }
          case 79: break;
          case 35: 
            { return token(tok.ESAC);
            }
          case 80: break;
          case 36: 
            { return token(tok.ELSE);
            }
          case 81: break;
          case 37: 
            { return token(tok.LOOP);
            }
          case 82: break;
          case 38: 
            { return token(tok.THEN);
            }
          case 83: break;
          case 39: 
            { return token(tok.TRUE);
            }
          case 84: break;
          case 40: 
            { return token(tok.POOL);
            }
          case 85: break;
          case 41: 
            { return token(tok.CLASS);
            }
          case 86: break;
          case 42: 
            { return token(tok.FALSE);
            }
          case 87: break;
          case 43: 
            { return token(tok.WHILE);
            }
          case 88: break;
          case 44: 
            { return token(tok.ISVOID);
            }
          case 89: break;
          case 45: 
            { return token(tok.INHERITS);
            }
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}