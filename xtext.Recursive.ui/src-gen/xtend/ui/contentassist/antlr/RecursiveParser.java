/*
 * generated by Xtext
 */
package xtend.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import xtend.services.RecursiveGrammarAccess;

public class RecursiveParser extends AbstractContentAssistParser {
	
	@Inject
	private RecursiveGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected xtend.ui.contentassist.antlr.internal.InternalRecursiveParser createParser() {
		xtend.ui.contentassist.antlr.internal.InternalRecursiveParser result = new xtend.ui.contentassist.antlr.internal.InternalRecursiveParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
					put(grammarAccess.getProgramAccess().getStatementsAssignment(), "rule__Program__StatementsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			xtend.ui.contentassist.antlr.internal.InternalRecursiveParser typedParser = (xtend.ui.contentassist.antlr.internal.InternalRecursiveParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RecursiveGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RecursiveGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
