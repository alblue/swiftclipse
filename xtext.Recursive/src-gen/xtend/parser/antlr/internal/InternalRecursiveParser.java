package xtend.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtend.services.RecursiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecursiveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "':'", "';'", "'Int'", "'Bool'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRecursiveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecursiveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecursiveParser.tokenNames; }
    public String getGrammarFileName() { return "../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g"; }



     	private RecursiveGrammarAccess grammarAccess;
     	
        public InternalRecursiveParser(TokenStream input, RecursiveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected RecursiveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:79:28: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:80:1: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:80:1: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:81:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:81:1: (lv_statements_0_0= ruleStatement )
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:82:3: lv_statements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleProgram130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:106:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement167);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:115:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' this_ID_1= RULE_ID kw= ':' this_Type_3= ruleType kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Type_3 = null;


         enterRule(); 
            
        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:118:28: ( (kw= 'var' this_ID_1= RULE_ID kw= ':' this_Type_3= ruleType kw= ';' ) )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:119:1: (kw= 'var' this_ID_1= RULE_ID kw= ':' this_Type_3= ruleType kw= ';' )
            {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:119:1: (kw= 'var' this_ID_1= RULE_ID kw= ':' this_Type_3= ruleType kw= ';' )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:120:2: kw= 'var' this_ID_1= RULE_ID kw= ':' this_Type_3= ruleType kw= ';'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleStatement216); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementAccess().getVarKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement231); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getStatementAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleStatement249); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getStatementAccess().getTypeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleStatement271);
            this_Type_3=ruleType();

            state._fsp--;


            		current.merge(this_Type_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleStatement289); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleType"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:163:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:164:2: (iv_ruleType= ruleType EOF )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:165:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType330);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:172:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Int' | kw= 'Bool' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:175:28: ( (kw= 'Int' | kw= 'Bool' ) )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:176:1: (kw= 'Int' | kw= 'Bool' )
            {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:176:1: (kw= 'Int' | kw= 'Bool' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:177:2: kw= 'Int'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleType379); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:184:2: kw= 'Bool'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleType398); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProgram130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatement216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement231 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement249 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleType_in_ruleStatement271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleType379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType398 = new BitSet(new long[]{0x0000000000000002L});

}