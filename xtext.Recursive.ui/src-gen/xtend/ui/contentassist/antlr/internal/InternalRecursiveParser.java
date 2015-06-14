package xtend.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import xtend.services.RecursiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecursiveParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'Bool'", "'var'", "':'", "';'"
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
    public String getGrammarFileName() { return "../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g"; }


     
     	private RecursiveGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RecursiveGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:61:1: ( ruleProgram EOF )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:69:1: ruleProgram : ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:73:2: ( ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:74:1: ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:74:1: ( ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:75:1: ( ( rule__Program__StatementsAssignment ) ) ( ( rule__Program__StatementsAssignment )* )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:75:1: ( ( rule__Program__StatementsAssignment ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:76:1: ( rule__Program__StatementsAssignment )
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:77:1: ( rule__Program__StatementsAssignment )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:77:2: rule__Program__StatementsAssignment
            {
            pushFollow(FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram96);
            rule__Program__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }

            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:80:1: ( ( rule__Program__StatementsAssignment )* )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:81:1: ( rule__Program__StatementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:82:1: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:82:2: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram108);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:95:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:96:1: ( ruleStatement EOF )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:97:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement138);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:104:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:108:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:109:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:109:1: ( ( rule__Statement__Group__0 ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:110:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:111:1: ( rule__Statement__Group__0 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:111:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement171);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleType"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:123:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:124:1: ( ruleType EOF )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:125:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType198);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:132:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:136:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:137:1: ( ( rule__Type__Alternatives ) )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:137:1: ( ( rule__Type__Alternatives ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:138:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:139:1: ( rule__Type__Alternatives )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:139:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType231);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:151:1: rule__Type__Alternatives : ( ( 'Int' ) | ( 'Bool' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:155:1: ( ( 'Int' ) | ( 'Bool' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:156:1: ( 'Int' )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:156:1: ( 'Int' )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:157:1: 'Int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives268); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:164:6: ( 'Bool' )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:164:6: ( 'Bool' )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:165:1: 'Bool'
                    {
                     before(grammarAccess.getTypeAccess().getBoolKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives288); 
                     after(grammarAccess.getTypeAccess().getBoolKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:179:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:183:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:184:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__0320);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__0323);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:191:1: rule__Statement__Group__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:195:1: ( ( 'var' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:196:1: ( 'var' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:196:1: ( 'var' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:197:1: 'var'
            {
             before(grammarAccess.getStatementAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Statement__Group__0__Impl351); 
             after(grammarAccess.getStatementAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:210:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:214:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:215:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__1382);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__1385);
            rule__Statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:222:1: rule__Statement__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:226:1: ( ( RULE_ID ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:227:1: ( RULE_ID )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:227:1: ( RULE_ID )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:228:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__Group__1__Impl412); 
             after(grammarAccess.getStatementAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:239:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:243:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:244:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__2441);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__2444);
            rule__Statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:251:1: rule__Statement__Group__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:255:1: ( ( ':' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:256:1: ( ':' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:256:1: ( ':' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:257:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Statement__Group__2__Impl472); 
             after(grammarAccess.getStatementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:270:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:274:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:275:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__3503);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__3506);
            rule__Statement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:282:1: rule__Statement__Group__3__Impl : ( ruleType ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:286:1: ( ( ruleType ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:287:1: ( ruleType )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:287:1: ( ruleType )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:288:1: ruleType
            {
             before(grammarAccess.getStatementAccess().getTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleType_in_rule__Statement__Group__3__Impl533);
            ruleType();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTypeParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__4"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:299:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:303:1: ( rule__Statement__Group__4__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:304:2: rule__Statement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__4562);
            rule__Statement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4"


    // $ANTLR start "rule__Statement__Group__4__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:310:1: rule__Statement__Group__4__Impl : ( ';' ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:314:1: ( ( ';' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:315:1: ( ';' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:315:1: ( ';' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:316:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Statement__Group__4__Impl590); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__4__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:340:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:344:1: ( ( ruleStatement ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:345:1: ( ruleStatement )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:345:1: ( ruleStatement )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:346:1: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment636);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram96 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram108 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__0320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__0323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Statement__Group__0__Impl351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__1382 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__Group__1__Impl412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__2441 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statement__Group__2__Impl472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__3503 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Statement__Group__3__Impl533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Statement__Group__4__Impl590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment636 = new BitSet(new long[]{0x0000000000000002L});

}