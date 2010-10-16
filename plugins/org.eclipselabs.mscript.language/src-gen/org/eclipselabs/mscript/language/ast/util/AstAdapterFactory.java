/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.mscript.language.ast.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.mscript.language.ast.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.mscript.language.ast.AstPackage
 * @generated
 */
public class AstAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AstPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AstPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AstSwitch<Adapter> modelSwitch =
    new AstSwitch<Adapter>()
    {
      @Override
      public Adapter caseMscript(Mscript object)
      {
        return createMscriptAdapter();
      }
      @Override
      public Adapter casePackageDefinition(PackageDefinition object)
      {
        return createPackageDefinitionAdapter();
      }
      @Override
      public Adapter casePackageDefinitionElement(PackageDefinitionElement object)
      {
        return createPackageDefinitionElementAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseDataTypeDefinition(DataTypeDefinition object)
      {
        return createDataTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumerationDefinition(EnumerationDefinition object)
      {
        return createEnumerationDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteralDeclaration(EnumerationLiteralDeclaration object)
      {
        return createEnumerationLiteralDeclarationAdapter();
      }
      @Override
      public Adapter caseTypeAliasDefinition(TypeAliasDefinition object)
      {
        return createTypeAliasDefinitionAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseRecordDefinition(RecordDefinition object)
      {
        return createRecordDefinitionAdapter();
      }
      @Override
      public Adapter caseRecordFieldDeclaration(RecordFieldDeclaration object)
      {
        return createRecordFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseSubroutineDefinition(SubroutineDefinition object)
      {
        return createSubroutineDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseCheckDefinition(CheckDefinition object)
      {
        return createCheckDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterDeclaration(ParameterDeclaration object)
      {
        return createParameterDeclarationAdapter();
      }
      @Override
      public Adapter casePreconditionChain(PreconditionChain object)
      {
        return createPreconditionChainAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseBlockStatement(BlockStatement object)
      {
        return createBlockStatementAdapter();
      }
      @Override
      public Adapter caseExpressionStatement(ExpressionStatement object)
      {
        return createExpressionStatementAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseIfCase(IfCase object)
      {
        return createIfCaseAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseDoWhileStatement(DoWhileStatement object)
      {
        return createDoWhileStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseForStatementInitializer(ForStatementInitializer object)
      {
        return createForStatementInitializerAdapter();
      }
      @Override
      public Adapter caseForeachStatement(ForeachStatement object)
      {
        return createForeachStatementAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseCheckStatusStatement(CheckStatusStatement object)
      {
        return createCheckStatusStatementAdapter();
      }
      @Override
      public Adapter caseTypeSpecifier(TypeSpecifier object)
      {
        return createTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseDataTypeSpecifier(DataTypeSpecifier object)
      {
        return createDataTypeSpecifierAdapter();
      }
      @Override
      public Adapter casePrimitiveTypeSpecifier(PrimitiveTypeSpecifier object)
      {
        return createPrimitiveTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseNumericTypeSpecifier(NumericTypeSpecifier object)
      {
        return createNumericTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseRealTypeSpecifier(RealTypeSpecifier object)
      {
        return createRealTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseIntegerTypeSpecifier(IntegerTypeSpecifier object)
      {
        return createIntegerTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseComplexTypeSpecifier(ComplexTypeSpecifier object)
      {
        return createComplexTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseGaussianTypeSpecifier(GaussianTypeSpecifier object)
      {
        return createGaussianTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseBooleanTypeSpecifier(BooleanTypeSpecifier object)
      {
        return createBooleanTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseStringTypeSpecifier(StringTypeSpecifier object)
      {
        return createStringTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseNamedTypeSpecifier(NamedTypeSpecifier object)
      {
        return createNamedTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseArrayDimensionSpecification(ArrayDimensionSpecification object)
      {
        return createArrayDimensionSpecificationAdapter();
      }
      @Override
      public Adapter caseUnitTypeSpecifier(UnitTypeSpecifier object)
      {
        return createUnitTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpressionPart(AdditiveExpressionPart object)
      {
        return createAdditiveExpressionPartAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpressionPart(MultiplicativeExpressionPart object)
      {
        return createMultiplicativeExpressionPartAdapter();
      }
      @Override
      public Adapter caseFeatureCallPart(FeatureCallPart object)
      {
        return createFeatureCallPartAdapter();
      }
      @Override
      public Adapter caseFeatureReference(FeatureReference object)
      {
        return createFeatureReferenceAdapter();
      }
      @Override
      public Adapter caseArrayElementReference(ArrayElementReference object)
      {
        return createArrayElementReferenceAdapter();
      }
      @Override
      public Adapter caseOperationCall(OperationCall object)
      {
        return createOperationCallAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseRealLiteral(RealLiteral object)
      {
        return createRealLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
      }
      @Override
      public Adapter caseSymbolReference(SymbolReference object)
      {
        return createSymbolReferenceAdapter();
      }
      @Override
      public Adapter caseSubscript(Subscript object)
      {
        return createSubscriptAdapter();
      }
      @Override
      public Adapter caseMatrixConstructionOperator(MatrixConstructionOperator object)
      {
        return createMatrixConstructionOperatorAdapter();
      }
      @Override
      public Adapter caseExpressionList(ExpressionList object)
      {
        return createExpressionListAdapter();
      }
      @Override
      public Adapter caseUnitConstructionOperator(UnitConstructionOperator object)
      {
        return createUnitConstructionOperatorAdapter();
      }
      @Override
      public Adapter caseParenthesizedExpression(ParenthesizedExpression object)
      {
        return createParenthesizedExpressionAdapter();
      }
      @Override
      public Adapter caseBeginExpression(BeginExpression object)
      {
        return createBeginExpressionAdapter();
      }
      @Override
      public Adapter caseEndExpression(EndExpression object)
      {
        return createEndExpressionAdapter();
      }
      @Override
      public Adapter caseUnitExpression(UnitExpression object)
      {
        return createUnitExpressionAdapter();
      }
      @Override
      public Adapter caseUnitExpressionNumerator(UnitExpressionNumerator object)
      {
        return createUnitExpressionNumeratorAdapter();
      }
      @Override
      public Adapter caseUnitExpressionDenominator(UnitExpressionDenominator object)
      {
        return createUnitExpressionDenominatorAdapter();
      }
      @Override
      public Adapter caseUnitExpressionFactor(UnitExpressionFactor object)
      {
        return createUnitExpressionFactorAdapter();
      }
      @Override
      public Adapter caseUnitExpressionExponent(UnitExpressionExponent object)
      {
        return createUnitExpressionExponentAdapter();
      }
      @Override
      public Adapter caseAssignmentExpression(AssignmentExpression object)
      {
        return createAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseRangeExpression(RangeExpression object)
      {
        return createRangeExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalExpression(ConditionalExpression object)
      {
        return createConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalOrExpression(LogicalOrExpression object)
      {
        return createLogicalOrExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalAndExpression(LogicalAndExpression object)
      {
        return createLogicalAndExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter casePowerExpression(PowerExpression object)
      {
        return createPowerExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePostfixExpression(PostfixExpression object)
      {
        return createPostfixExpressionAdapter();
      }
      @Override
      public Adapter caseFeatureCall(FeatureCall object)
      {
        return createFeatureCallAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.Mscript <em>Mscript</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.Mscript
   * @generated
   */
  public Adapter createMscriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.PackageDefinition
   * @generated
   */
  public Adapter createPackageDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.PackageDefinitionElement <em>Package Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.PackageDefinitionElement
   * @generated
   */
  public Adapter createPackageDefinitionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.DataTypeDefinition <em>Data Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.DataTypeDefinition
   * @generated
   */
  public Adapter createDataTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.EnumerationDefinition <em>Enumeration Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.EnumerationDefinition
   * @generated
   */
  public Adapter createEnumerationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.EnumerationLiteralDeclaration <em>Enumeration Literal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.EnumerationLiteralDeclaration
   * @generated
   */
  public Adapter createEnumerationLiteralDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.TypeAliasDefinition <em>Type Alias Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.TypeAliasDefinition
   * @generated
   */
  public Adapter createTypeAliasDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.RecordDefinition <em>Record Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.RecordDefinition
   * @generated
   */
  public Adapter createRecordDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.RecordFieldDeclaration <em>Record Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.RecordFieldDeclaration
   * @generated
   */
  public Adapter createRecordFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.SubroutineDefinition <em>Subroutine Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.SubroutineDefinition
   * @generated
   */
  public Adapter createSubroutineDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.CheckDefinition <em>Check Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.CheckDefinition
   * @generated
   */
  public Adapter createCheckDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ParameterDeclaration
   * @generated
   */
  public Adapter createParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.PreconditionChain <em>Precondition Chain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.PreconditionChain
   * @generated
   */
  public Adapter createPreconditionChainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.BlockStatement
   * @generated
   */
  public Adapter createBlockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ExpressionStatement
   * @generated
   */
  public Adapter createExpressionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.IfCase <em>If Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.IfCase
   * @generated
   */
  public Adapter createIfCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.WhileStatement
   * @generated
   */
  public Adapter createWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.DoWhileStatement <em>Do While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.DoWhileStatement
   * @generated
   */
  public Adapter createDoWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ForStatementInitializer <em>For Statement Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ForStatementInitializer
   * @generated
   */
  public Adapter createForStatementInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ForeachStatement <em>Foreach Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ForeachStatement
   * @generated
   */
  public Adapter createForeachStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.CheckStatusStatement <em>Check Status Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.CheckStatusStatement
   * @generated
   */
  public Adapter createCheckStatusStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.TypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.TypeSpecifier
   * @generated
   */
  public Adapter createTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.DataTypeSpecifier <em>Data Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.DataTypeSpecifier
   * @generated
   */
  public Adapter createDataTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.PrimitiveTypeSpecifier <em>Primitive Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.PrimitiveTypeSpecifier
   * @generated
   */
  public Adapter createPrimitiveTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.NumericTypeSpecifier <em>Numeric Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.NumericTypeSpecifier
   * @generated
   */
  public Adapter createNumericTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.RealTypeSpecifier <em>Real Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.RealTypeSpecifier
   * @generated
   */
  public Adapter createRealTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.IntegerTypeSpecifier <em>Integer Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.IntegerTypeSpecifier
   * @generated
   */
  public Adapter createIntegerTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ComplexTypeSpecifier <em>Complex Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ComplexTypeSpecifier
   * @generated
   */
  public Adapter createComplexTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.GaussianTypeSpecifier <em>Gaussian Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.GaussianTypeSpecifier
   * @generated
   */
  public Adapter createGaussianTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.BooleanTypeSpecifier <em>Boolean Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.BooleanTypeSpecifier
   * @generated
   */
  public Adapter createBooleanTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.StringTypeSpecifier <em>String Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.StringTypeSpecifier
   * @generated
   */
  public Adapter createStringTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.NamedTypeSpecifier <em>Named Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.NamedTypeSpecifier
   * @generated
   */
  public Adapter createNamedTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ArrayDimensionSpecification <em>Array Dimension Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ArrayDimensionSpecification
   * @generated
   */
  public Adapter createArrayDimensionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitTypeSpecifier <em>Unit Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitTypeSpecifier
   * @generated
   */
  public Adapter createUnitTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.AdditiveExpressionPart <em>Additive Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.AdditiveExpressionPart
   * @generated
   */
  public Adapter createAdditiveExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.MultiplicativeExpressionPart <em>Multiplicative Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.MultiplicativeExpressionPart
   * @generated
   */
  public Adapter createMultiplicativeExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.FeatureCallPart <em>Feature Call Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.FeatureCallPart
   * @generated
   */
  public Adapter createFeatureCallPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.FeatureReference <em>Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.FeatureReference
   * @generated
   */
  public Adapter createFeatureReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ArrayElementReference <em>Array Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ArrayElementReference
   * @generated
   */
  public Adapter createArrayElementReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.OperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.OperationCall
   * @generated
   */
  public Adapter createOperationCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.RealLiteral
   * @generated
   */
  public Adapter createRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.SymbolReference <em>Symbol Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.SymbolReference
   * @generated
   */
  public Adapter createSymbolReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.Subscript <em>Subscript</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.Subscript
   * @generated
   */
  public Adapter createSubscriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.MatrixConstructionOperator <em>Matrix Construction Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.MatrixConstructionOperator
   * @generated
   */
  public Adapter createMatrixConstructionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ExpressionList
   * @generated
   */
  public Adapter createExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitConstructionOperator <em>Unit Construction Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitConstructionOperator
   * @generated
   */
  public Adapter createUnitConstructionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ParenthesizedExpression
   * @generated
   */
  public Adapter createParenthesizedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.BeginExpression <em>Begin Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.BeginExpression
   * @generated
   */
  public Adapter createBeginExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.EndExpression <em>End Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.EndExpression
   * @generated
   */
  public Adapter createEndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitExpression <em>Unit Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitExpression
   * @generated
   */
  public Adapter createUnitExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitExpressionNumerator <em>Unit Expression Numerator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitExpressionNumerator
   * @generated
   */
  public Adapter createUnitExpressionNumeratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitExpressionDenominator <em>Unit Expression Denominator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitExpressionDenominator
   * @generated
   */
  public Adapter createUnitExpressionDenominatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitExpressionFactor <em>Unit Expression Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitExpressionFactor
   * @generated
   */
  public Adapter createUnitExpressionFactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnitExpressionExponent <em>Unit Expression Exponent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnitExpressionExponent
   * @generated
   */
  public Adapter createUnitExpressionExponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.AssignmentExpression
   * @generated
   */
  public Adapter createAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.RangeExpression <em>Range Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.RangeExpression
   * @generated
   */
  public Adapter createRangeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.ConditionalExpression
   * @generated
   */
  public Adapter createConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.LogicalOrExpression <em>Logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.LogicalOrExpression
   * @generated
   */
  public Adapter createLogicalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.LogicalAndExpression <em>Logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.LogicalAndExpression
   * @generated
   */
  public Adapter createLogicalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.PowerExpression <em>Power Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.PowerExpression
   * @generated
   */
  public Adapter createPowerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.PostfixExpression <em>Postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.PostfixExpression
   * @generated
   */
  public Adapter createPostfixExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.mscript.language.ast.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.mscript.language.ast.FeatureCall
   * @generated
   */
  public Adapter createFeatureCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AstAdapterFactory
