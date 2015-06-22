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

                if ( (LA1_0==11) ) {
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:132:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:136:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:137:1: ( ( rule__Type__Group__0 ) )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:137:1: ( ( rule__Type__Group__0 ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:138:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:139:1: ( rule__Type__Group__0 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:139:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType231);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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


    // $ANTLR start "entryRuleBaseType"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:151:1: entryRuleBaseType : ruleBaseType EOF ;
    public final void entryRuleBaseType() throws RecognitionException {
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:152:1: ( ruleBaseType EOF )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:153:1: ruleBaseType EOF
            {
             before(grammarAccess.getBaseTypeRule()); 
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType258);
            ruleBaseType();

            state._fsp--;

             after(grammarAccess.getBaseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType265); 

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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:160:1: ruleBaseType : ( ( rule__BaseType__Alternatives ) ) ;
    public final void ruleBaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:164:2: ( ( ( rule__BaseType__Alternatives ) ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:165:1: ( ( rule__BaseType__Alternatives ) )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:165:1: ( ( rule__BaseType__Alternatives ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:166:1: ( rule__BaseType__Alternatives )
            {
             before(grammarAccess.getBaseTypeAccess().getAlternatives()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:167:1: ( rule__BaseType__Alternatives )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:167:2: rule__BaseType__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseType__Alternatives_in_ruleBaseType291);
            rule__BaseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "rule__Type__Alternatives_1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:179:1: rule__Type__Alternatives_1 : ( ( ( rule__Type__Group_1_0__0 ) ) | ( ( rule__Type__Group_1_1__0 ) ) );
    public final void rule__Type__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:183:1: ( ( ( rule__Type__Group_1_0__0 ) ) | ( ( rule__Type__Group_1_1__0 ) ) )
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
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:184:1: ( ( rule__Type__Group_1_0__0 ) )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:184:1: ( ( rule__Type__Group_1_0__0 ) )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:185:1: ( rule__Type__Group_1_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1_0()); 
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:186:1: ( rule__Type__Group_1_0__0 )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:186:2: rule__Type__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1_0__0_in_rule__Type__Alternatives_1327);
                    rule__Type__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:190:6: ( ( rule__Type__Group_1_1__0 ) )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:190:6: ( ( rule__Type__Group_1_1__0 ) )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:191:1: ( rule__Type__Group_1_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1_1()); 
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:192:1: ( rule__Type__Group_1_1__0 )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:192:2: rule__Type__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_1_1__0_in_rule__Type__Alternatives_1345);
                    rule__Type__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Type__Alternatives_1"


    // $ANTLR start "rule__BaseType__Alternatives"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:201:1: rule__BaseType__Alternatives : ( ( ( rule__BaseType__Group_0__0 ) ) | ( ( rule__BaseType__Group_1__0 ) ) | ( ( rule__BaseType__Group_2__0 ) ) );
    public final void rule__BaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:205:1: ( ( ( rule__BaseType__Group_0__0 ) ) | ( ( rule__BaseType__Group_1__0 ) ) | ( ( rule__BaseType__Group_2__0 ) ) )
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
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:206:1: ( ( rule__BaseType__Group_0__0 ) )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:206:1: ( ( rule__BaseType__Group_0__0 ) )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:207:1: ( rule__BaseType__Group_0__0 )
                    {
                     before(grammarAccess.getBaseTypeAccess().getGroup_0()); 
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:208:1: ( rule__BaseType__Group_0__0 )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:208:2: rule__BaseType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseType__Group_0__0_in_rule__BaseType__Alternatives378);
                    rule__BaseType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:212:6: ( ( rule__BaseType__Group_1__0 ) )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:212:6: ( ( rule__BaseType__Group_1__0 ) )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:213:1: ( rule__BaseType__Group_1__0 )
                    {
                     before(grammarAccess.getBaseTypeAccess().getGroup_1()); 
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:214:1: ( rule__BaseType__Group_1__0 )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:214:2: rule__BaseType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BaseType__Group_1__0_in_rule__BaseType__Alternatives396);
                    rule__BaseType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:218:6: ( ( rule__BaseType__Group_2__0 ) )
                    {
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:218:6: ( ( rule__BaseType__Group_2__0 ) )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:219:1: ( rule__BaseType__Group_2__0 )
                    {
                     before(grammarAccess.getBaseTypeAccess().getGroup_2()); 
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:220:1: ( rule__BaseType__Group_2__0 )
                    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:220:2: rule__BaseType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BaseType__Group_2__0_in_rule__BaseType__Alternatives414);
                    rule__BaseType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__BaseType__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:231:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:235:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:236:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__0445);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__0448);
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:243:1: rule__Statement__Group__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:247:1: ( ( 'var' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:248:1: ( 'var' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:248:1: ( 'var' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:249:1: 'var'
            {
             before(grammarAccess.getStatementAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Statement__Group__0__Impl476); 
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:262:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:266:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:267:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__1507);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__1510);
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:274:1: rule__Statement__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:278:1: ( ( RULE_ID ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:279:1: ( RULE_ID )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:279:1: ( RULE_ID )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:280:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__Group__1__Impl537); 
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:291:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:295:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:296:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__2566);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__2569);
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:303:1: rule__Statement__Group__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:307:1: ( ( ':' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:308:1: ( ':' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:308:1: ( ':' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:309:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Statement__Group__2__Impl597); 
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:322:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:326:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:327:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__3628);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__3631);
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:334:1: rule__Statement__Group__3__Impl : ( ruleType ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:338:1: ( ( ruleType ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:339:1: ( ruleType )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:339:1: ( ruleType )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:340:1: ruleType
            {
             before(grammarAccess.getStatementAccess().getTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleType_in_rule__Statement__Group__3__Impl658);
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:351:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:355:1: ( rule__Statement__Group__4__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:356:2: rule__Statement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__4687);
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
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:362:1: rule__Statement__Group__4__Impl : ( ';' ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:366:1: ( ( ';' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:367:1: ( ';' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:367:1: ( ';' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:368:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Statement__Group__4__Impl715); 
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


    // $ANTLR start "rule__Type__Group__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:391:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:395:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:396:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__0756);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__0759);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:403:1: rule__Type__Group__0__Impl : ( ruleBaseType ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:407:1: ( ( ruleBaseType ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:408:1: ( ruleBaseType )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:408:1: ( ruleBaseType )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:409:1: ruleBaseType
            {
             before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBaseType_in_rule__Type__Group__0__Impl786);
            ruleBaseType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:420:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:424:1: ( rule__Type__Group__1__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:425:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__1815);
            rule__Type__Group__1__Impl();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:431:1: rule__Type__Group__1__Impl : ( ( rule__Type__Alternatives_1 )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:435:1: ( ( ( rule__Type__Alternatives_1 )* ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:436:1: ( ( rule__Type__Alternatives_1 )* )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:436:1: ( ( rule__Type__Alternatives_1 )* )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:437:1: ( rule__Type__Alternatives_1 )*
            {
             before(grammarAccess.getTypeAccess().getAlternatives_1()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:438:1: ( rule__Type__Alternatives_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:438:2: rule__Type__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_1_in_rule__Type__Group__1__Impl842);
            	    rule__Type__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1_0__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:452:1: rule__Type__Group_1_0__0 : rule__Type__Group_1_0__0__Impl rule__Type__Group_1_0__1 ;
    public final void rule__Type__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:456:1: ( rule__Type__Group_1_0__0__Impl rule__Type__Group_1_0__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:457:2: rule__Type__Group_1_0__0__Impl rule__Type__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1_0__0__Impl_in_rule__Type__Group_1_0__0877);
            rule__Type__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1_0__1_in_rule__Type__Group_1_0__0880);
            rule__Type__Group_1_0__1();

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
    // $ANTLR end "rule__Type__Group_1_0__0"


    // $ANTLR start "rule__Type__Group_1_0__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:464:1: rule__Type__Group_1_0__0__Impl : ( '?' ) ;
    public final void rule__Type__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:468:1: ( ( '?' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:469:1: ( '?' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:469:1: ( '?' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:470:1: '?'
            {
             before(grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_0_0()); 
            match(input,14,FOLLOW_14_in_rule__Type__Group_1_0__0__Impl908); 
             after(grammarAccess.getTypeAccess().getQuestionMarkKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Type__Group_1_0__0__Impl"


    // $ANTLR start "rule__Type__Group_1_0__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:483:1: rule__Type__Group_1_0__1 : rule__Type__Group_1_0__1__Impl ;
    public final void rule__Type__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:487:1: ( rule__Type__Group_1_0__1__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:488:2: rule__Type__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1_0__1__Impl_in_rule__Type__Group_1_0__1939);
            rule__Type__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Type__Group_1_0__1"


    // $ANTLR start "rule__Type__Group_1_0__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:494:1: rule__Type__Group_1_0__1__Impl : ( () ) ;
    public final void rule__Type__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:498:1: ( ( () ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:499:1: ( () )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:499:1: ( () )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:500:1: ()
            {
             before(grammarAccess.getTypeAccess().getOptionallyTypeTypeAction_1_0_1()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:501:1: ()
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:503:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getOptionallyTypeTypeAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1_1__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:517:1: rule__Type__Group_1_1__0 : rule__Type__Group_1_1__0__Impl rule__Type__Group_1_1__1 ;
    public final void rule__Type__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:521:1: ( rule__Type__Group_1_1__0__Impl rule__Type__Group_1_1__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:522:2: rule__Type__Group_1_1__0__Impl rule__Type__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Type__Group_1_1__0__Impl_in_rule__Type__Group_1_1__01001);
            rule__Type__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_1_1__1_in_rule__Type__Group_1_1__01004);
            rule__Type__Group_1_1__1();

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
    // $ANTLR end "rule__Type__Group_1_1__0"


    // $ANTLR start "rule__Type__Group_1_1__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:529:1: rule__Type__Group_1_1__0__Impl : ( '!' ) ;
    public final void rule__Type__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:533:1: ( ( '!' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:534:1: ( '!' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:534:1: ( '!' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:535:1: '!'
            {
             before(grammarAccess.getTypeAccess().getExclamationMarkKeyword_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Type__Group_1_1__0__Impl1032); 
             after(grammarAccess.getTypeAccess().getExclamationMarkKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Type__Group_1_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1_1__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:548:1: rule__Type__Group_1_1__1 : rule__Type__Group_1_1__1__Impl ;
    public final void rule__Type__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:552:1: ( rule__Type__Group_1_1__1__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:553:2: rule__Type__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_1_1__1__Impl_in_rule__Type__Group_1_1__11063);
            rule__Type__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Type__Group_1_1__1"


    // $ANTLR start "rule__Type__Group_1_1__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:559:1: rule__Type__Group_1_1__1__Impl : ( () ) ;
    public final void rule__Type__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:563:1: ( ( () ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:564:1: ( () )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:564:1: ( () )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:565:1: ()
            {
             before(grammarAccess.getTypeAccess().getImplicitlyUnwrappedTypeTypeAction_1_1_1()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:566:1: ()
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:568:1: 
            {
            }

             after(grammarAccess.getTypeAccess().getImplicitlyUnwrappedTypeTypeAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1_1__1__Impl"


    // $ANTLR start "rule__BaseType__Group_0__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:582:1: rule__BaseType__Group_0__0 : rule__BaseType__Group_0__0__Impl rule__BaseType__Group_0__1 ;
    public final void rule__BaseType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:586:1: ( rule__BaseType__Group_0__0__Impl rule__BaseType__Group_0__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:587:2: rule__BaseType__Group_0__0__Impl rule__BaseType__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseType__Group_0__0__Impl_in_rule__BaseType__Group_0__01125);
            rule__BaseType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseType__Group_0__1_in_rule__BaseType__Group_0__01128);
            rule__BaseType__Group_0__1();

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
    // $ANTLR end "rule__BaseType__Group_0__0"


    // $ANTLR start "rule__BaseType__Group_0__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:594:1: rule__BaseType__Group_0__0__Impl : ( () ) ;
    public final void rule__BaseType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:598:1: ( ( () ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:599:1: ( () )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:599:1: ( () )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:600:1: ()
            {
             before(grammarAccess.getBaseTypeAccess().getIntTypeAction_0_0()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:601:1: ()
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:603:1: 
            {
            }

             after(grammarAccess.getBaseTypeAccess().getIntTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseType__Group_0__0__Impl"


    // $ANTLR start "rule__BaseType__Group_0__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:613:1: rule__BaseType__Group_0__1 : rule__BaseType__Group_0__1__Impl ;
    public final void rule__BaseType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:617:1: ( rule__BaseType__Group_0__1__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:618:2: rule__BaseType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseType__Group_0__1__Impl_in_rule__BaseType__Group_0__11186);
            rule__BaseType__Group_0__1__Impl();

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
    // $ANTLR end "rule__BaseType__Group_0__1"


    // $ANTLR start "rule__BaseType__Group_0__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:624:1: rule__BaseType__Group_0__1__Impl : ( 'Int' ) ;
    public final void rule__BaseType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:628:1: ( ( 'Int' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:629:1: ( 'Int' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:629:1: ( 'Int' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:630:1: 'Int'
            {
             before(grammarAccess.getBaseTypeAccess().getIntKeyword_0_1()); 
            match(input,16,FOLLOW_16_in_rule__BaseType__Group_0__1__Impl1214); 
             after(grammarAccess.getBaseTypeAccess().getIntKeyword_0_1()); 

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
    // $ANTLR end "rule__BaseType__Group_0__1__Impl"


    // $ANTLR start "rule__BaseType__Group_1__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:647:1: rule__BaseType__Group_1__0 : rule__BaseType__Group_1__0__Impl rule__BaseType__Group_1__1 ;
    public final void rule__BaseType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:651:1: ( rule__BaseType__Group_1__0__Impl rule__BaseType__Group_1__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:652:2: rule__BaseType__Group_1__0__Impl rule__BaseType__Group_1__1
            {
            pushFollow(FOLLOW_rule__BaseType__Group_1__0__Impl_in_rule__BaseType__Group_1__01249);
            rule__BaseType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseType__Group_1__1_in_rule__BaseType__Group_1__01252);
            rule__BaseType__Group_1__1();

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
    // $ANTLR end "rule__BaseType__Group_1__0"


    // $ANTLR start "rule__BaseType__Group_1__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:659:1: rule__BaseType__Group_1__0__Impl : ( () ) ;
    public final void rule__BaseType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:663:1: ( ( () ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:664:1: ( () )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:664:1: ( () )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:665:1: ()
            {
             before(grammarAccess.getBaseTypeAccess().getBoolTypeAction_1_0()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:666:1: ()
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:668:1: 
            {
            }

             after(grammarAccess.getBaseTypeAccess().getBoolTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseType__Group_1__0__Impl"


    // $ANTLR start "rule__BaseType__Group_1__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:678:1: rule__BaseType__Group_1__1 : rule__BaseType__Group_1__1__Impl ;
    public final void rule__BaseType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:682:1: ( rule__BaseType__Group_1__1__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:683:2: rule__BaseType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseType__Group_1__1__Impl_in_rule__BaseType__Group_1__11310);
            rule__BaseType__Group_1__1__Impl();

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
    // $ANTLR end "rule__BaseType__Group_1__1"


    // $ANTLR start "rule__BaseType__Group_1__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:689:1: rule__BaseType__Group_1__1__Impl : ( 'Bool' ) ;
    public final void rule__BaseType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:693:1: ( ( 'Bool' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:694:1: ( 'Bool' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:694:1: ( 'Bool' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:695:1: 'Bool'
            {
             before(grammarAccess.getBaseTypeAccess().getBoolKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__BaseType__Group_1__1__Impl1338); 
             after(grammarAccess.getBaseTypeAccess().getBoolKeyword_1_1()); 

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
    // $ANTLR end "rule__BaseType__Group_1__1__Impl"


    // $ANTLR start "rule__BaseType__Group_2__0"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:712:1: rule__BaseType__Group_2__0 : rule__BaseType__Group_2__0__Impl rule__BaseType__Group_2__1 ;
    public final void rule__BaseType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:716:1: ( rule__BaseType__Group_2__0__Impl rule__BaseType__Group_2__1 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:717:2: rule__BaseType__Group_2__0__Impl rule__BaseType__Group_2__1
            {
            pushFollow(FOLLOW_rule__BaseType__Group_2__0__Impl_in_rule__BaseType__Group_2__01373);
            rule__BaseType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseType__Group_2__1_in_rule__BaseType__Group_2__01376);
            rule__BaseType__Group_2__1();

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
    // $ANTLR end "rule__BaseType__Group_2__0"


    // $ANTLR start "rule__BaseType__Group_2__0__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:724:1: rule__BaseType__Group_2__0__Impl : ( '[' ) ;
    public final void rule__BaseType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:728:1: ( ( '[' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:729:1: ( '[' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:729:1: ( '[' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:730:1: '['
            {
             before(grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__BaseType__Group_2__0__Impl1404); 
             after(grammarAccess.getBaseTypeAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__BaseType__Group_2__0__Impl"


    // $ANTLR start "rule__BaseType__Group_2__1"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:743:1: rule__BaseType__Group_2__1 : rule__BaseType__Group_2__1__Impl rule__BaseType__Group_2__2 ;
    public final void rule__BaseType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:747:1: ( rule__BaseType__Group_2__1__Impl rule__BaseType__Group_2__2 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:748:2: rule__BaseType__Group_2__1__Impl rule__BaseType__Group_2__2
            {
            pushFollow(FOLLOW_rule__BaseType__Group_2__1__Impl_in_rule__BaseType__Group_2__11435);
            rule__BaseType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseType__Group_2__2_in_rule__BaseType__Group_2__11438);
            rule__BaseType__Group_2__2();

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
    // $ANTLR end "rule__BaseType__Group_2__1"


    // $ANTLR start "rule__BaseType__Group_2__1__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:755:1: rule__BaseType__Group_2__1__Impl : ( ruleType ) ;
    public final void rule__BaseType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:759:1: ( ( ruleType ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:760:1: ( ruleType )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:760:1: ( ruleType )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:761:1: ruleType
            {
             before(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleType_in_rule__BaseType__Group_2__1__Impl1465);
            ruleType();

            state._fsp--;

             after(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__BaseType__Group_2__1__Impl"


    // $ANTLR start "rule__BaseType__Group_2__2"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:772:1: rule__BaseType__Group_2__2 : rule__BaseType__Group_2__2__Impl rule__BaseType__Group_2__3 ;
    public final void rule__BaseType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:776:1: ( rule__BaseType__Group_2__2__Impl rule__BaseType__Group_2__3 )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:777:2: rule__BaseType__Group_2__2__Impl rule__BaseType__Group_2__3
            {
            pushFollow(FOLLOW_rule__BaseType__Group_2__2__Impl_in_rule__BaseType__Group_2__21494);
            rule__BaseType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseType__Group_2__3_in_rule__BaseType__Group_2__21497);
            rule__BaseType__Group_2__3();

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
    // $ANTLR end "rule__BaseType__Group_2__2"


    // $ANTLR start "rule__BaseType__Group_2__2__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:784:1: rule__BaseType__Group_2__2__Impl : ( () ) ;
    public final void rule__BaseType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:788:1: ( ( () ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:789:1: ( () )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:789:1: ( () )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:790:1: ()
            {
             before(grammarAccess.getBaseTypeAccess().getArrayTypeTypeAction_2_2()); 
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:791:1: ()
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:793:1: 
            {
            }

             after(grammarAccess.getBaseTypeAccess().getArrayTypeTypeAction_2_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseType__Group_2__2__Impl"


    // $ANTLR start "rule__BaseType__Group_2__3"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:803:1: rule__BaseType__Group_2__3 : rule__BaseType__Group_2__3__Impl ;
    public final void rule__BaseType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:807:1: ( rule__BaseType__Group_2__3__Impl )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:808:2: rule__BaseType__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__BaseType__Group_2__3__Impl_in_rule__BaseType__Group_2__31555);
            rule__BaseType__Group_2__3__Impl();

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
    // $ANTLR end "rule__BaseType__Group_2__3"


    // $ANTLR start "rule__BaseType__Group_2__3__Impl"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:814:1: rule__BaseType__Group_2__3__Impl : ( ']' ) ;
    public final void rule__BaseType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:818:1: ( ( ']' ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:819:1: ( ']' )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:819:1: ( ']' )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:820:1: ']'
            {
             before(grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,19,FOLLOW_19_in_rule__BaseType__Group_2__3__Impl1583); 
             after(grammarAccess.getBaseTypeAccess().getRightSquareBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__BaseType__Group_2__3__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:842:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:846:1: ( ( ruleStatement ) )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:847:1: ( ruleStatement )
            {
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:847:1: ( ruleStatement )
            // ../xtext.Recursive.ui/src-gen/xtend/ui/contentassist/antlr/internal/InternalRecursive.g:848:1: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment1627);
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
    public static final BitSet FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram96 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Program__StatementsAssignment_in_ruleProgram108 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Alternatives_in_ruleBaseType291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_0__0_in_rule__Type__Alternatives_1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_1__0_in_rule__Type__Alternatives_1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_0__0_in_rule__BaseType__Alternatives378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_1__0_in_rule__BaseType__Alternatives396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__0_in_rule__BaseType__Alternatives414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__0445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group__0__Impl476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__1507 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__Group__1__Impl537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__2566 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statement__Group__2__Impl597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__3628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Statement__Group__4_in_rule__Statement__Group__3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Statement__Group__3__Impl658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__4__Impl_in_rule__Statement__Group__4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Statement__Group__4__Impl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__0756 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__0759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_rule__Type__Group__0__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_1_in_rule__Type__Group__1__Impl842 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_0__0__Impl_in_rule__Type__Group_1_0__0877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1_0__1_in_rule__Type__Group_1_0__0880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Group_1_0__0__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_0__1__Impl_in_rule__Type__Group_1_0__1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_1__0__Impl_in_rule__Type__Group_1_1__01001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Type__Group_1_1__1_in_rule__Type__Group_1_1__01004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Group_1_1__0__Impl1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_1_1__1__Impl_in_rule__Type__Group_1_1__11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_0__0__Impl_in_rule__BaseType__Group_0__01125 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BaseType__Group_0__1_in_rule__BaseType__Group_0__01128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_0__1__Impl_in_rule__BaseType__Group_0__11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BaseType__Group_0__1__Impl1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_1__0__Impl_in_rule__BaseType__Group_1__01249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BaseType__Group_1__1_in_rule__BaseType__Group_1__01252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_1__1__Impl_in_rule__BaseType__Group_1__11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BaseType__Group_1__1__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__0__Impl_in_rule__BaseType__Group_2__01373 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__1_in_rule__BaseType__Group_2__01376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BaseType__Group_2__0__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__1__Impl_in_rule__BaseType__Group_2__11435 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__2_in_rule__BaseType__Group_2__11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BaseType__Group_2__1__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__2__Impl_in_rule__BaseType__Group_2__21494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__3_in_rule__BaseType__Group_2__21497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__Group_2__3__Impl_in_rule__BaseType__Group_2__31555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BaseType__Group_2__3__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Program__StatementsAssignment1627 = new BitSet(new long[]{0x0000000000000002L});

}