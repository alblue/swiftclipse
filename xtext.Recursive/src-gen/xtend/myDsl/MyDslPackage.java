/**
 */
package xtend.myDsl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xtend.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/Recursive";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = xtend.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.ProgramImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.StatementImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.TypeImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.OptionallyTypeImpl <em>Optionally Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.OptionallyTypeImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getOptionallyType()
   * @generated
   */
  int OPTIONALLY_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONALLY_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optionally Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONALLY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.ImplicitlyUnwrappedTypeImpl <em>Implicitly Unwrapped Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.ImplicitlyUnwrappedTypeImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getImplicitlyUnwrappedType()
   * @generated
   */
  int IMPLICITLY_UNWRAPPED_TYPE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICITLY_UNWRAPPED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implicitly Unwrapped Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICITLY_UNWRAPPED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.IntTypeImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 5;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.BoolTypeImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 6;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link xtend.myDsl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtend.myDsl.impl.ArrayTypeImpl
   * @see xtend.myDsl.impl.MyDslPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link xtend.myDsl.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see xtend.myDsl.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link xtend.myDsl.Program#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see xtend.myDsl.Program#getStatements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Statements();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see xtend.myDsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see xtend.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.OptionallyType <em>Optionally Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optionally Type</em>'.
   * @see xtend.myDsl.OptionallyType
   * @generated
   */
  EClass getOptionallyType();

  /**
   * Returns the meta object for the containment reference '{@link xtend.myDsl.OptionallyType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see xtend.myDsl.OptionallyType#getType()
   * @see #getOptionallyType()
   * @generated
   */
  EReference getOptionallyType_Type();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.ImplicitlyUnwrappedType <em>Implicitly Unwrapped Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implicitly Unwrapped Type</em>'.
   * @see xtend.myDsl.ImplicitlyUnwrappedType
   * @generated
   */
  EClass getImplicitlyUnwrappedType();

  /**
   * Returns the meta object for the containment reference '{@link xtend.myDsl.ImplicitlyUnwrappedType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see xtend.myDsl.ImplicitlyUnwrappedType#getType()
   * @see #getImplicitlyUnwrappedType()
   * @generated
   */
  EReference getImplicitlyUnwrappedType_Type();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see xtend.myDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see xtend.myDsl.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link xtend.myDsl.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see xtend.myDsl.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the containment reference '{@link xtend.myDsl.ArrayType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see xtend.myDsl.ArrayType#getType()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.ProgramImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.StatementImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.TypeImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.OptionallyTypeImpl <em>Optionally Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.OptionallyTypeImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getOptionallyType()
     * @generated
     */
    EClass OPTIONALLY_TYPE = eINSTANCE.getOptionallyType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONALLY_TYPE__TYPE = eINSTANCE.getOptionallyType_Type();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.ImplicitlyUnwrappedTypeImpl <em>Implicitly Unwrapped Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.ImplicitlyUnwrappedTypeImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getImplicitlyUnwrappedType()
     * @generated
     */
    EClass IMPLICITLY_UNWRAPPED_TYPE = eINSTANCE.getImplicitlyUnwrappedType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLICITLY_UNWRAPPED_TYPE__TYPE = eINSTANCE.getImplicitlyUnwrappedType_Type();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.IntTypeImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.BoolTypeImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link xtend.myDsl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtend.myDsl.impl.ArrayTypeImpl
     * @see xtend.myDsl.impl.MyDslPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__TYPE = eINSTANCE.getArrayType_Type();

  }

} //MyDslPackage
