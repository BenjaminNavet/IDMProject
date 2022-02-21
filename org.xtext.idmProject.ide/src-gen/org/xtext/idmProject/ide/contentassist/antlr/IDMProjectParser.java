/*
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.idmProject.ide.contentassist.antlr.internal.InternalIDMProjectParser;
import org.xtext.idmProject.services.IDMProjectGrammarAccess;

public class IDMProjectParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(IDMProjectGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, IDMProjectGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getPathAccess().getAlternatives_0(), "rule__Path__Alternatives_0");
			builder.put(grammarAccess.getPathAccess().getValuesAlternatives_1_1_0(), "rule__Path__ValuesAlternatives_1_1_0");
			builder.put(grammarAccess.getFinalAccess().getAlternatives(), "rule__Final__Alternatives");
			builder.put(grammarAccess.getJsonObjectAccess().getAlternatives(), "rule__JsonObject__Alternatives");
			builder.put(grammarAccess.getJsonPrimitiveAccess().getAlternatives(), "rule__JsonPrimitive__Alternatives");
			builder.put(grammarAccess.getNumberObjectAccess().getAlternatives(), "rule__NumberObject__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getJsonCommandAccess().getGroup(), "rule__JsonCommand__Group__0");
			builder.put(grammarAccess.getInitialisationAccess().getGroup(), "rule__Initialisation__Group__0");
			builder.put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
			builder.put(grammarAccess.getModifyAccess().getGroup(), "rule__Modify__Group__0");
			builder.put(grammarAccess.getSumAccess().getGroup(), "rule__Sum__Group__0");
			builder.put(grammarAccess.getRemoveAccess().getGroup(), "rule__Remove__Group__0");
			builder.put(grammarAccess.getMultAccess().getGroup(), "rule__Mult__Group__0");
			builder.put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
			builder.put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getJsonPrimitiveAccess().getGroup_2(), "rule__JsonPrimitive__Group_2__0");
			builder.put(grammarAccess.getJsonPrimitiveAccess().getGroup_4(), "rule__JsonPrimitive__Group_4__0");
			builder.put(grammarAccess.getArrayObjectAccess().getGroup(), "rule__ArrayObject__Group__0");
			builder.put(grammarAccess.getArrayObjectAccess().getGroup_2(), "rule__ArrayObject__Group_2__0");
			builder.put(grammarAccess.getArrayObjectAccess().getGroup_2_1(), "rule__ArrayObject__Group_2_1__0");
			builder.put(grammarAccess.getJsonEntriesAccess().getGroup(), "rule__JsonEntries__Group__0");
			builder.put(grammarAccess.getJsonEntriesAccess().getGroup_2(), "rule__JsonEntries__Group_2__0");
			builder.put(grammarAccess.getJsonEntryAccess().getGroup(), "rule__JsonEntry__Group__0");
			builder.put(grammarAccess.getJsonCommandsAccess().getJsonCommandsAssignment(), "rule__JsonCommands__JsonCommandsAssignment");
			builder.put(grammarAccess.getJsonCommandAccess().getInitAssignment_0(), "rule__JsonCommand__InitAssignment_0");
			builder.put(grammarAccess.getJsonCommandAccess().getOperationsAssignment_1(), "rule__JsonCommand__OperationsAssignment_1");
			builder.put(grammarAccess.getJsonCommandAccess().getFinalAssignment_2(), "rule__JsonCommand__FinalAssignment_2");
			builder.put(grammarAccess.getInitialisationAccess().getFilePathAssignment_1(), "rule__Initialisation__FilePathAssignment_1");
			builder.put(grammarAccess.getInsertAccess().getPathAssignment_1(), "rule__Insert__PathAssignment_1");
			builder.put(grammarAccess.getInsertAccess().getJsonInStringAssignment_2(), "rule__Insert__JsonInStringAssignment_2");
			builder.put(grammarAccess.getPathAccess().getValuesAssignment_0_0(), "rule__Path__ValuesAssignment_0_0");
			builder.put(grammarAccess.getPathAccess().getValuesAssignment_0_1(), "rule__Path__ValuesAssignment_0_1");
			builder.put(grammarAccess.getPathAccess().getValuesAssignment_0_2(), "rule__Path__ValuesAssignment_0_2");
			builder.put(grammarAccess.getPathAccess().getValuesAssignment_1_1(), "rule__Path__ValuesAssignment_1_1");
			builder.put(grammarAccess.getModifyAccess().getPathAssignment_1(), "rule__Modify__PathAssignment_1");
			builder.put(grammarAccess.getModifyAccess().getJsonObjectAssignment_2(), "rule__Modify__JsonObjectAssignment_2");
			builder.put(grammarAccess.getSumAccess().getPathTOStoreAssignment_1(), "rule__Sum__PathTOStoreAssignment_1");
			builder.put(grammarAccess.getSumAccess().getPathToAddAssignment_2(), "rule__Sum__PathToAddAssignment_2");
			builder.put(grammarAccess.getRemoveAccess().getPathAssignment_2(), "rule__Remove__PathAssignment_2");
			builder.put(grammarAccess.getMultAccess().getPathTOStoreAssignment_1(), "rule__Mult__PathTOStoreAssignment_1");
			builder.put(grammarAccess.getMultAccess().getPathToMultAssignment_2(), "rule__Mult__PathToMultAssignment_2");
			builder.put(grammarAccess.getSelectAccess().getPathAssignment_1(), "rule__Select__PathAssignment_1");
			builder.put(grammarAccess.getStoreAccess().getPathAssignment_1(), "rule__Store__PathAssignment_1");
			builder.put(grammarAccess.getStoreAccess().getFilePathAssignment_2(), "rule__Store__FilePathAssignment_2");
			builder.put(grammarAccess.getPrintAccess().getPathAssignment_2(), "rule__Print__PathAssignment_2");
			builder.put(grammarAccess.getArrayObjectAccess().getValuesAssignment_2_0(), "rule__ArrayObject__ValuesAssignment_2_0");
			builder.put(grammarAccess.getArrayObjectAccess().getValuesAssignment_2_1_1(), "rule__ArrayObject__ValuesAssignment_2_1_1");
			builder.put(grammarAccess.getBooleanObjectAccess().getValueAssignment(), "rule__BooleanObject__ValueAssignment");
			builder.put(grammarAccess.getStringObjectAccess().getValueAssignment(), "rule__StringObject__ValueAssignment");
			builder.put(grammarAccess.getJsonEntriesAccess().getListEntriesAssignment_1(), "rule__JsonEntries__ListEntriesAssignment_1");
			builder.put(grammarAccess.getJsonEntriesAccess().getListEntriesAssignment_2_1(), "rule__JsonEntries__ListEntriesAssignment_2_1");
			builder.put(grammarAccess.getJsonEntryAccess().getKeyAssignment_1(), "rule__JsonEntry__KeyAssignment_1");
			builder.put(grammarAccess.getJsonEntryAccess().getJsonObjectAssignment_4(), "rule__JsonEntry__JsonObjectAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private IDMProjectGrammarAccess grammarAccess;

	@Override
	protected InternalIDMProjectParser createParser() {
		InternalIDMProjectParser result = new InternalIDMProjectParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IDMProjectGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IDMProjectGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
