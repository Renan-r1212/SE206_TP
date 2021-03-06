/**
 */
package fr.tpt.mem4csd.dag.model.dag;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.Channel#getDestPort <em>Dest Port</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.Channel#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.Channel#getDestTask <em>Dest Task</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.dag.model.dag.Channel#getSourcePort <em>Source Port</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.dag.model.dag.DagPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends IdentifiedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Dest Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Port</em>' reference.
	 * @see #setDestPort(Port)
	 * @see fr.tpt.mem4csd.dag.model.dag.DagPackage#getChannel_DestPort()
	 * @model required="true"
	 * @generated
	 */
	Port getDestPort();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dag.model.dag.Channel#getDestPort <em>Dest Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Port</em>' reference.
	 * @see #getDestPort()
	 * @generated
	 */
	void setDestPort(Port value);

	/**
	 * Returns the value of the '<em><b>Source Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Task</em>' reference.
	 * @see fr.tpt.mem4csd.dag.model.dag.DagPackage#getChannel_SourceTask()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Task getSourceTask();

	/**
	 * Returns the value of the '<em><b>Dest Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Task</em>' reference.
	 * @see fr.tpt.mem4csd.dag.model.dag.DagPackage#getChannel_DestTask()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Task getDestTask();

	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' reference.
	 * @see #setSourcePort(Port)
	 * @see fr.tpt.mem4csd.dag.model.dag.DagPackage#getChannel_SourcePort()
	 * @model required="true"
	 * @generated
	 */
	Port getSourcePort();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.dag.model.dag.Channel#getSourcePort <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' reference.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Port value);

} // Channel
