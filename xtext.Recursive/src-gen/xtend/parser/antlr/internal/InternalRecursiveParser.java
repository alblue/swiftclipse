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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "':'", "';'", "'?'", "'!'", "'Int'", "'Bool'", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

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

        EObject lv_statements_0_0 = null;


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
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

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
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:115:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'var' this_ID_1= RULE_ID otherlv_2= ':' this_Type_3= ruleType otherlv_4= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Type_3 = null;


         enterRule(); 
            
        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:118:28: ( (otherlv_0= 'var' this_ID_1= RULE_ID otherlv_2= ':' this_Type_3= ruleType otherlv_4= ';' ) )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:119:1: (otherlv_0= 'var' this_ID_1= RULE_ID otherlv_2= ':' this_Type_3= ruleType otherlv_4= ';' )
            {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:119:1: (otherlv_0= 'var' this_ID_1= RULE_ID otherlv_2= ':' this_Type_3= ruleType otherlv_4= ';' )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:119:3: otherlv_0= 'var' this_ID_1= RULE_ID otherlv_2= ':' this_Type_3= ruleType otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStatement213); 

                	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVarKeyword_0());
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement224); 
             
                newLeafNode(this_ID_1, grammarAccess.getStatementAccess().getIDTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStatement235); 

                	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getColonKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getStatementAccess().getTypeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleStatement257);
            this_Type_3=ruleType();

            state._fsp--;

             
                    current = this_Type_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStatement268); 

                	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getSemicolonKeyword_4());
                

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
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:152:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:153:2: (iv_ruleType= ruleType EOF )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:154:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType304);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType314); 

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
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:161:1: ruleType returns [EObject current=null] : (this_BaseType_0= ruleBaseType ( (otherlv_1= '?' () ) | (otherlv_3= '!' () ) )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BaseType_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:164:28: ( (this_BaseType_0= ruleBaseType ( (otherlv_1= '?' () ) | (otherlv_3= '!' () ) )* ) )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:165:1: (this_BaseType_0= ruleBaseType ( (otherlv_1= '?' () ) | (otherlv_3= '!' () ) )* )
            {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:165:1: (this_BaseType_0= ruleBaseType ( (otherlv_1= '?' () ) | (otherlv_3= '!' () ) )* )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:166:5: this_BaseType_0= ruleBaseType ( (otherlv_1= '?' () ) | (otherlv_3= '!' () ) )*
            {
             
                    newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBaseType_in_ruleType361);
            this_BaseType_0=ruleBaseType();

            state._fsp--;

             
                    current = this_BaseType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:174:1: ( (otherlv_1= '?' () ) | (otherlv_3= '!' () ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }
                else if ( (LA2_0==15) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:174:2: (otherlv_1= '?' () )
            	    {
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:174:2: (otherlv_1= '?' () )
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:174:4: otherlv_1= '?' ()
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleType374); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_0_0());
            	        
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:178:1: ()
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:179:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getTypeAccess().getOptionallyTypeTypeAction_1_0_1(),
            	                current);
            	        

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:185:6: (otherlv_3= '!' () )
            	    {
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:185:6: (otherlv_3= '!' () )
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:185:8: otherlv_3= '!' ()
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleType403); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getExclamationMarkKeyword_1_1_0());
            	        
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:189:1: ()
            	    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:190:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getTypeAccess().getImplicitlyUnwrappedTypeTypeAction_1_1_1(),
            	                current);
            	        

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleBaseType"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:203:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:204:2: (iv_ruleBaseType= ruleBaseType EOF )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:205:2: iv_ruleBaseType= ruleBaseType EOF
            {
             newCompositeNode(grammarAccess.getBaseTypeRule()); 
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType451);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;

             current =iv_ruleBaseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType461); 

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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:212:1: ruleBaseType returns [EObject current=null] : ( ( () otherlv_1= 'Int' ) | ( () otherlv_3= 'Bool' ) | (otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']' ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Type_5 = null;


         enterRule(); 
            
        try {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:215:28: ( ( ( () otherlv_1= 'Int' ) | ( () otherlv_3= 'Bool' ) | (otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']' ) ) )
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:216:1: ( ( () otherlv_1= 'Int' ) | ( () otherlv_3= 'Bool' ) | (otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']' ) )
            {
            // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:216:1: ( ( () otherlv_1= 'Int' ) | ( () otherlv_3= 'Bool' ) | (otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:216:2: ( () otherlv_1= 'Int' )
                    {
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:216:2: ( () otherlv_1= 'Int' )
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:216:3: () otherlv_1= 'Int'
                    {
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:216:3: ()
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:217:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getIntTypeAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBaseType508); 

                        	newLeafNode(otherlv_1, grammarAccess.getBaseTypeAccess().getIntKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:227:6: ( () otherlv_3= 'Bool' )
                    {
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:227:6: ( () otherlv_3= 'Bool' )
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:227:7: () otherlv_3= 'Bool'
                    {
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:227:7: ()
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:228:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseTypeAccess().getBoolTypeAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleBaseType537); 

                        	newLeafNode(otherlv_3, grammarAccess.getBaseTypeAccess().getBoolKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:238:6: (otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']' )
                    {
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:238:6: (otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']' )
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:238:8: otherlv_4= '[' this_Type_5= ruleType () otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBaseType557); 

                        	newLeafNode(otherlv_4, grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleBaseType579);
                    this_Type_5=ruleType();

                    state._fsp--;

                     
                            current = this_Type_5; 
                            afterParserOrEnumRuleCall();
                        
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:251:1: ()
                    // ../xtext.Recursive/src-gen/xtend/parser/antlr/internal/InternalRecursive.g:252:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getBaseTypeAccess().getArrayTypeTypeAction_2_2(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleBaseType599); 

                        	newLeafNode(otherlv_7, grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_2_3());
                        

                    }


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
    // $ANTLR end "ruleBaseType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProgram130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatement213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement235 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_ruleType_in_ruleStatement257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatement268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleType361 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleType374 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_15_in_ruleType403 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBaseType508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBaseType537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBaseType557 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_ruleType_in_ruleBaseType579 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBaseType599 = new BitSet(new long[]{0x0000000000000002L});

}