/**
 * generated by Xtext 2.25.0
 */
package org.xtext.idmProject.iDMProject.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.idmProject.iDMProject.ArrayObject;
import org.xtext.idmProject.iDMProject.BooleanObject;
import org.xtext.idmProject.iDMProject.Final;
import org.xtext.idmProject.iDMProject.IDMProjectPackage;
import org.xtext.idmProject.iDMProject.Initialisation;
import org.xtext.idmProject.iDMProject.Insert;
import org.xtext.idmProject.iDMProject.JsonCommand;
import org.xtext.idmProject.iDMProject.JsonCommands;
import org.xtext.idmProject.iDMProject.JsonEntries;
import org.xtext.idmProject.iDMProject.JsonEntry;
import org.xtext.idmProject.iDMProject.JsonObject;
import org.xtext.idmProject.iDMProject.JsonPrimitive;
import org.xtext.idmProject.iDMProject.Modify;
import org.xtext.idmProject.iDMProject.Mult;
import org.xtext.idmProject.iDMProject.Operation;
import org.xtext.idmProject.iDMProject.Path;
import org.xtext.idmProject.iDMProject.Print;
import org.xtext.idmProject.iDMProject.Remove;
import org.xtext.idmProject.iDMProject.Select;
import org.xtext.idmProject.iDMProject.Store;
import org.xtext.idmProject.iDMProject.StringObject;
import org.xtext.idmProject.iDMProject.Sum;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.idmProject.iDMProject.IDMProjectPackage
 * @generated
 */
public class IDMProjectSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IDMProjectPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDMProjectSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IDMProjectPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case IDMProjectPackage.JSON_COMMANDS:
      {
        JsonCommands jsonCommands = (JsonCommands)theEObject;
        T result = caseJsonCommands(jsonCommands);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.JSON_COMMAND:
      {
        JsonCommand jsonCommand = (JsonCommand)theEObject;
        T result = caseJsonCommand(jsonCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.INITIALISATION:
      {
        Initialisation initialisation = (Initialisation)theEObject;
        T result = caseInitialisation(initialisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.INSERT:
      {
        Insert insert = (Insert)theEObject;
        T result = caseInsert(insert);
        if (result == null) result = caseOperation(insert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.PATH:
      {
        Path path = (Path)theEObject;
        T result = casePath(path);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.MODIFY:
      {
        Modify modify = (Modify)theEObject;
        T result = caseModify(modify);
        if (result == null) result = caseOperation(modify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.SUM:
      {
        Sum sum = (Sum)theEObject;
        T result = caseSum(sum);
        if (result == null) result = caseOperation(sum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.REMOVE:
      {
        Remove remove = (Remove)theEObject;
        T result = caseRemove(remove);
        if (result == null) result = caseOperation(remove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.MULT:
      {
        Mult mult = (Mult)theEObject;
        T result = caseMult(mult);
        if (result == null) result = caseOperation(mult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = caseOperation(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.FINAL:
      {
        Final final_ = (Final)theEObject;
        T result = caseFinal(final_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = caseFinal(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.PRINT:
      {
        Print print = (Print)theEObject;
        T result = casePrint(print);
        if (result == null) result = caseFinal(print);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.JSON_OBJECT:
      {
        JsonObject jsonObject = (JsonObject)theEObject;
        T result = caseJsonObject(jsonObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.JSON_PRIMITIVE:
      {
        JsonPrimitive jsonPrimitive = (JsonPrimitive)theEObject;
        T result = caseJsonPrimitive(jsonPrimitive);
        if (result == null) result = caseJsonObject(jsonPrimitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.ARRAY_OBJECT:
      {
        ArrayObject arrayObject = (ArrayObject)theEObject;
        T result = caseArrayObject(arrayObject);
        if (result == null) result = caseJsonPrimitive(arrayObject);
        if (result == null) result = caseJsonObject(arrayObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.BOOLEAN_OBJECT:
      {
        BooleanObject booleanObject = (BooleanObject)theEObject;
        T result = caseBooleanObject(booleanObject);
        if (result == null) result = caseJsonPrimitive(booleanObject);
        if (result == null) result = caseJsonObject(booleanObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.STRING_OBJECT:
      {
        StringObject stringObject = (StringObject)theEObject;
        T result = caseStringObject(stringObject);
        if (result == null) result = caseJsonPrimitive(stringObject);
        if (result == null) result = caseJsonObject(stringObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.JSON_ENTRIES:
      {
        JsonEntries jsonEntries = (JsonEntries)theEObject;
        T result = caseJsonEntries(jsonEntries);
        if (result == null) result = caseJsonObject(jsonEntries);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IDMProjectPackage.JSON_ENTRY:
      {
        JsonEntry jsonEntry = (JsonEntry)theEObject;
        T result = caseJsonEntry(jsonEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Commands</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Commands</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonCommands(JsonCommands object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonCommand(JsonCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialisation(Initialisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInsert(Insert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePath(Path object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modify</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modify</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModify(Modify object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSum(Sum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemove(Remove object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMult(Mult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinal(Final object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrint(Print object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonObject(JsonObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonPrimitive(JsonPrimitive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayObject(ArrayObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanObject(BooleanObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringObject(StringObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Entries</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Entries</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonEntries(JsonEntries object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonEntry(JsonEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //IDMProjectSwitch