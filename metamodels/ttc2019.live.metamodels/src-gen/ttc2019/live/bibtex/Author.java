/**
 */
package ttc2019.live.bibtex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2019.live.bibtex.Author#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see ttc2019.live.bibtex.BibtexPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see ttc2019.live.bibtex.BibtexPackage#getAuthor_Author()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link ttc2019.live.bibtex.Author#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // Author
