/**
 */
package ttc2019.live.bibtex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2019.live.bibtex.Article#getJournal <em>Journal</em>}</li>
 * </ul>
 *
 * @see ttc2019.live.bibtex.BibtexPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends AuthoredEntry, DatedEntry, TitledEntry {
	/**
	 * Returns the value of the '<em><b>Journal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal</em>' attribute.
	 * @see #setJournal(String)
	 * @see ttc2019.live.bibtex.BibtexPackage#getArticle_Journal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getJournal();

	/**
	 * Sets the value of the '{@link ttc2019.live.bibtex.Article#getJournal <em>Journal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal</em>' attribute.
	 * @see #getJournal()
	 * @generated
	 */
	void setJournal(String value);

} // Article