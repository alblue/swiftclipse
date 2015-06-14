/*
 * generated by Xtext
 */
grammar InternalRecursive;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package xtend.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
	    }
		lv_statements_0_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_0_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleStatement
entryRuleStatement returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); } 
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current.getText(); }  
	 EOF 
;

// Rule Statement
ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='var' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getStatementAccess().getVarKeyword_0()); 
    }
    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getStatementAccess().getIDTerminalRuleCall_1()); 
    }

	kw=':' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getStatementAccess().getColonKeyword_2()); 
    }

    { 
        newCompositeNode(grammarAccess.getStatementAccess().getTypeParserRuleCall_3()); 
    }
    this_Type_3=ruleType    {
		$current.merge(this_Type_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw=';' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getStatementAccess().getSemicolonKeyword_4()); 
    }
)
    ;





// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Int' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0()); 
    }

    |
	kw='Bool' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

