/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.mscript.language.ast.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.mscript.language.ast.AssignmentExpression;
import org.eclipselabs.mscript.language.ast.AssignmentOperator;
import org.eclipselabs.mscript.language.ast.AstPackage;
import org.eclipselabs.mscript.language.ast.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.mscript.language.ast.impl.AssignmentExpressionImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link org.eclipselabs.mscript.language.ast.impl.AssignmentExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipselabs.mscript.language.ast.impl.AssignmentExpressionImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements AssignmentExpression
{
  /**
   * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftHandSide()
   * @generated
   * @ordered
   */
  protected Expression leftHandSide;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final AssignmentOperator OPERATOR_EDEFAULT = AssignmentOperator.ASSIGNMENT;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected AssignmentOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightHandSide()
   * @generated
   * @ordered
   */
  protected Expression rightHandSide;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AstPackage.Literals.ASSIGNMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeftHandSide()
  {
    return leftHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftHandSide(Expression newLeftHandSide, NotificationChain msgs)
  {
    Expression oldLeftHandSide = leftHandSide;
    leftHandSide = newLeftHandSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE, oldLeftHandSide, newLeftHandSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftHandSide(Expression newLeftHandSide)
  {
    if (newLeftHandSide != leftHandSide)
    {
      NotificationChain msgs = null;
      if (leftHandSide != null)
        msgs = ((InternalEObject)leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE, null, msgs);
      if (newLeftHandSide != null)
        msgs = ((InternalEObject)newLeftHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE, null, msgs);
      msgs = basicSetLeftHandSide(newLeftHandSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE, newLeftHandSide, newLeftHandSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(AssignmentOperator newOperator)
  {
    AssignmentOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ASSIGNMENT_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRightHandSide()
  {
    return rightHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightHandSide(Expression newRightHandSide, NotificationChain msgs)
  {
    Expression oldRightHandSide = rightHandSide;
    rightHandSide = newRightHandSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE, oldRightHandSide, newRightHandSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightHandSide(Expression newRightHandSide)
  {
    if (newRightHandSide != rightHandSide)
    {
      NotificationChain msgs = null;
      if (rightHandSide != null)
        msgs = ((InternalEObject)rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE, null, msgs);
      if (newRightHandSide != null)
        msgs = ((InternalEObject)newRightHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE, null, msgs);
      msgs = basicSetRightHandSide(newRightHandSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE, newRightHandSide, newRightHandSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE:
        return basicSetLeftHandSide(null, msgs);
      case AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE:
        return basicSetRightHandSide(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE:
        return getLeftHandSide();
      case AstPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
        return getOperator();
      case AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE:
        return getRightHandSide();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE:
        setLeftHandSide((Expression)newValue);
        return;
      case AstPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
        setOperator((AssignmentOperator)newValue);
        return;
      case AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE:
        setRightHandSide((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE:
        setLeftHandSide((Expression)null);
        return;
      case AstPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE:
        setRightHandSide((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AstPackage.ASSIGNMENT_EXPRESSION__LEFT_HAND_SIDE:
        return leftHandSide != null;
      case AstPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case AstPackage.ASSIGNMENT_EXPRESSION__RIGHT_HAND_SIDE:
        return rightHandSide != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //AssignmentExpressionImpl
