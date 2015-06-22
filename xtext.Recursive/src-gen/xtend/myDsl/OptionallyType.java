/**
 */
package xtend.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optionally Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtend.myDsl.OptionallyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see xtend.myDsl.MyDslPackage#getOptionallyType()
 * @model
 * @generated
 */
public interface OptionallyType extends Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see xtend.myDsl.MyDslPackage#getOptionallyType_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link xtend.myDsl.OptionallyType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // OptionallyType
