// Generated from PASCALet.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PASCALetParser}.
 */
public interface PASCALetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PASCALetParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PASCALetParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PASCALetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PASCALetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PASCALetParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PASCALetParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PASCALetParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PASCALetParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PASCALetParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PASCALetParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(PASCALetParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(PASCALetParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PASCALetParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PASCALetParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(PASCALetParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(PASCALetParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PASCALetParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PASCALetParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PASCALetParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PASCALetParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PASCALetParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PASCALetParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PASCALetParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PASCALetParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(PASCALetParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(PASCALetParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PASCALetParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PASCALetParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PASCALetParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PASCALetParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PASCALetParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PASCALetParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(PASCALetParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(PASCALetParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(PASCALetParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(PASCALetParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(PASCALetParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(PASCALetParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(PASCALetParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(PASCALetParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PASCALetParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PASCALetParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(PASCALetParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(PASCALetParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(PASCALetParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(PASCALetParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(PASCALetParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(PASCALetParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(PASCALetParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(PASCALetParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(PASCALetParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(PASCALetParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(PASCALetParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(PASCALetParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(PASCALetParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(PASCALetParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PASCALetParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PASCALetParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(PASCALetParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(PASCALetParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(PASCALetParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(PASCALetParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(PASCALetParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(PASCALetParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(PASCALetParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(PASCALetParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(PASCALetParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(PASCALetParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(PASCALetParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(PASCALetParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(PASCALetParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(PASCALetParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(PASCALetParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(PASCALetParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PASCALetParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PASCALetParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PASCALetParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PASCALetParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(PASCALetParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(PASCALetParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(PASCALetParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(PASCALetParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PASCALetParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PASCALetParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PASCALetParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PASCALetParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(PASCALetParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(PASCALetParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PASCALetParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PASCALetParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PASCALetParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PASCALetParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(PASCALetParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(PASCALetParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PASCALetParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PASCALetParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PASCALetParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PASCALetParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PASCALetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PASCALetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(PASCALetParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(PASCALetParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PASCALetParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PASCALetParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PASCALetParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PASCALetParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PASCALetParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PASCALetParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PASCALetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PASCALetParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(PASCALetParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(PASCALetParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PASCALetParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PASCALetParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(PASCALetParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(PASCALetParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PASCALetParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PASCALetParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(PASCALetParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(PASCALetParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PASCALetParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PASCALetParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PASCALetParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PASCALetParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PASCALetParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PASCALetParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(PASCALetParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(PASCALetParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PASCALetParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PASCALetParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PASCALetParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PASCALetParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(PASCALetParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(PASCALetParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PASCALetParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PASCALetParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PASCALetParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PASCALetParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PASCALetParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PASCALetParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(PASCALetParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(PASCALetParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(PASCALetParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(PASCALetParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PASCALetParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PASCALetParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(PASCALetParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(PASCALetParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PASCALetParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PASCALetParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PASCALetParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PASCALetParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PASCALetParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PASCALetParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PASCALetParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PASCALetParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PASCALetParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PASCALetParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PASCALetParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PASCALetParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(PASCALetParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(PASCALetParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(PASCALetParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(PASCALetParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PASCALetParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PASCALetParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PASCALetParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PASCALetParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PASCALetParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PASCALetParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PASCALetParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PASCALetParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PASCALetParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PASCALetParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PASCALetParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PASCALetParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PASCALetParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PASCALetParser.FinalValueContext ctx);
}