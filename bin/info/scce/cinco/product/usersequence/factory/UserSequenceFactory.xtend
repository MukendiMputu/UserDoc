package info.scce.cinco.product.usersequence.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage
import info.scce.cinco.product.usersequence.usersequence.impl.UsersequenceFactoryImpl
import info.scce.cinco.product.usersequence.usersequence.internal.InternalFactory
import info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage

import info.scce.cinco.product.usersequence.usersequence.adapter.*

import graphmodel.internal.InternalModelElement
import graphmodel.internal.InternalModelElementContainer
import graphmodel.internal.InternalGraphModel
import graphmodel.internal.InternalContainer
import graphmodel.internal.InternalNode
import graphmodel.internal.InternalEdge
import graphmodel.internal.InternalType
import graphmodel.internal.InternalIdentifiableElement
import graphmodel.ModelElement
import graphmodel.IdentifiableElement
import graphmodel.GraphModel
import graphmodel.Type

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin

class UserSequenceFactory extends UsersequenceFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static UserSequenceFactory eINSTANCE = UserSequenceFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def UserSequenceFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(UsersequencePackage.eNS_URI) as UserSequenceFactory
			if (fct != null)
				return fct as UserSequenceFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new UserSequenceFactory
	}
	
	/**
	 * This method creates an UserSequenceGraphModel with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createUserSequenceGraphModel(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createUserSequenceGraphModel => [ 
			setID(ID)
			internal = ime ?: createInternalUserSequenceGraphModel => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.UserSequenceGraphModelEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an UserSequenceGraphModel with the given id. Post create hook won't be triggered.
	 */
	def createUserSequenceGraphModel(String ID){
		createUserSequenceGraphModel(ID,null,null,false)
	}
	
	/**
	 * This method creates an UserSequenceGraphModel with the given id. Post create hook will be triggered.
	 */
	def createUserSequenceGraphModel(InternalModelElementContainer parent){
		createUserSequenceGraphModel(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an UserSequenceGraphModel with the given id. Post create hook will be triggered.
	 */
	def createUserSequenceGraphModel(String ID, InternalModelElementContainer parent){
		createUserSequenceGraphModel(ID,null,parent,true)
	}
	
	def createUserSequenceGraphModel(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createUserSequenceGraphModel(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an UserSequenceGraphModel with the given id. Post create hook won't be triggered.
	 */
	def createUserSequenceGraphModel(InternalModelElement ime) {
		createUserSequenceGraphModel(generateUUID,ime,null,false)
	}
	
	override createUserSequenceGraphModel() {
		createUserSequenceGraphModel(generateUUID)
	}
	/**
	 * This method creates an Div with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDiv(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDiv => [
			setID(ID)
			internal = ime ?: createInternalDiv => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.DivEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Div with the given id. Post create hook won't be triggered.
	 */
	def createDiv(String ID){
		createDiv(ID,null,null,false)
	}
	
	/**
	 * This method creates an Div with the given id. Post create hook will be triggered.
	 */
	def createDiv(InternalModelElementContainer parent){
		createDiv(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Div with the given id. Post create hook will be triggered.
	 */
	def createDiv(String ID, InternalModelElementContainer parent){
		createDiv(ID,null,parent,true)
	}
	
	def createDiv(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDiv(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Div with the given id. Post create hook won't be triggered.
	 */
	def createDiv(InternalModelElement ime) {
		createDiv(generateUUID,ime,null,false)
	}
	
	override createDiv() {
		createDiv(generateUUID)
	}
	/**
	 * This method creates an SubSequence with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSubSequence(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSubSequence => [
			setID(ID)
			internal = ime ?: createInternalSubSequence => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.SubSequenceEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SubSequence with the given id. Post create hook won't be triggered.
	 */
	def createSubSequence(String ID){
		createSubSequence(ID,null,null,false)
	}
	
	/**
	 * This method creates an SubSequence with the given id. Post create hook will be triggered.
	 */
	def createSubSequence(InternalModelElementContainer parent){
		createSubSequence(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SubSequence with the given id. Post create hook will be triggered.
	 */
	def createSubSequence(String ID, InternalModelElementContainer parent){
		createSubSequence(ID,null,parent,true)
	}
	
	def createSubSequence(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSubSequence(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SubSequence with the given id. Post create hook won't be triggered.
	 */
	def createSubSequence(InternalModelElement ime) {
		createSubSequence(generateUUID,ime,null,false)
	}
	
	override createSubSequence() {
		createSubSequence(generateUUID)
	}
	/**
	 * This method creates an Section with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSection(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSection => [
			setID(ID)
			internal = ime ?: createInternalSection => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.SectionEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Section with the given id. Post create hook won't be triggered.
	 */
	def createSection(String ID){
		createSection(ID,null,null,false)
	}
	
	/**
	 * This method creates an Section with the given id. Post create hook will be triggered.
	 */
	def createSection(InternalModelElementContainer parent){
		createSection(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Section with the given id. Post create hook will be triggered.
	 */
	def createSection(String ID, InternalModelElementContainer parent){
		createSection(ID,null,parent,true)
	}
	
	def createSection(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSection(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Section with the given id. Post create hook won't be triggered.
	 */
	def createSection(InternalModelElement ime) {
		createSection(generateUUID,ime,null,false)
	}
	
	override createSection() {
		createSection(generateUUID)
	}
	/**
	 * This method creates an Form with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createForm(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createForm => [
			setID(ID)
			internal = ime ?: createInternalForm => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.FormEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Form with the given id. Post create hook won't be triggered.
	 */
	def createForm(String ID){
		createForm(ID,null,null,false)
	}
	
	/**
	 * This method creates an Form with the given id. Post create hook will be triggered.
	 */
	def createForm(InternalModelElementContainer parent){
		createForm(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Form with the given id. Post create hook will be triggered.
	 */
	def createForm(String ID, InternalModelElementContainer parent){
		createForm(ID,null,parent,true)
	}
	
	def createForm(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createForm(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Form with the given id. Post create hook won't be triggered.
	 */
	def createForm(InternalModelElement ime) {
		createForm(generateUUID,ime,null,false)
	}
	
	override createForm() {
		createForm(generateUUID)
	}
	/**
	 * This method creates an Input with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createInput(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createInput => [
			setID(ID)
			internal = ime ?: createInternalInput => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.InputEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook won't be triggered.
	 */
	def createInput(String ID){
		createInput(ID,null,null,false)
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook will be triggered.
	 */
	def createInput(InternalModelElementContainer parent){
		createInput(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook will be triggered.
	 */
	def createInput(String ID, InternalModelElementContainer parent){
		createInput(ID,null,parent,true)
	}
	
	def createInput(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createInput(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Input with the given id. Post create hook won't be triggered.
	 */
	def createInput(InternalModelElement ime) {
		createInput(generateUUID,ime,null,false)
	}
	
	override createInput() {
		createInput(generateUUID)
	}
	/**
	 * This method creates an Table with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTable(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTable => [
			setID(ID)
			internal = ime ?: createInternalTable => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TableEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Table with the given id. Post create hook won't be triggered.
	 */
	def createTable(String ID){
		createTable(ID,null,null,false)
	}
	
	/**
	 * This method creates an Table with the given id. Post create hook will be triggered.
	 */
	def createTable(InternalModelElementContainer parent){
		createTable(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Table with the given id. Post create hook will be triggered.
	 */
	def createTable(String ID, InternalModelElementContainer parent){
		createTable(ID,null,parent,true)
	}
	
	def createTable(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTable(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Table with the given id. Post create hook won't be triggered.
	 */
	def createTable(InternalModelElement ime) {
		createTable(generateUUID,ime,null,false)
	}
	
	override createTable() {
		createTable(generateUUID)
	}
	/**
	 * This method creates an Navigation with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createNavigation(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createNavigation => [
			setID(ID)
			internal = ime ?: createInternalNavigation => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.NavigationEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Navigation with the given id. Post create hook won't be triggered.
	 */
	def createNavigation(String ID){
		createNavigation(ID,null,null,false)
	}
	
	/**
	 * This method creates an Navigation with the given id. Post create hook will be triggered.
	 */
	def createNavigation(InternalModelElementContainer parent){
		createNavigation(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Navigation with the given id. Post create hook will be triggered.
	 */
	def createNavigation(String ID, InternalModelElementContainer parent){
		createNavigation(ID,null,parent,true)
	}
	
	def createNavigation(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createNavigation(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Navigation with the given id. Post create hook won't be triggered.
	 */
	def createNavigation(InternalModelElement ime) {
		createNavigation(generateUUID,ime,null,false)
	}
	
	override createNavigation() {
		createNavigation(generateUUID)
	}
	/**
	 * This method creates an TableHead with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTableHead(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTableHead => [
			setID(ID)
			internal = ime ?: createInternalTableHead => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TableHeadEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an TableHead with the given id. Post create hook won't be triggered.
	 */
	def createTableHead(String ID){
		createTableHead(ID,null,null,false)
	}
	
	/**
	 * This method creates an TableHead with the given id. Post create hook will be triggered.
	 */
	def createTableHead(InternalModelElementContainer parent){
		createTableHead(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an TableHead with the given id. Post create hook will be triggered.
	 */
	def createTableHead(String ID, InternalModelElementContainer parent){
		createTableHead(ID,null,parent,true)
	}
	
	def createTableHead(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTableHead(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an TableHead with the given id. Post create hook won't be triggered.
	 */
	def createTableHead(InternalModelElement ime) {
		createTableHead(generateUUID,ime,null,false)
	}
	
	override createTableHead() {
		createTableHead(generateUUID)
	}
	/**
	 * This method creates an WebElement with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createWebElement(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createWebElement => [
			setID(ID)
			internal = ime ?: createInternalWebElement => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.WebElementEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an WebElement with the given id. Post create hook won't be triggered.
	 */
	def createWebElement(String ID){
		createWebElement(ID,null,null,false)
	}
	
	/**
	 * This method creates an WebElement with the given id. Post create hook will be triggered.
	 */
	def createWebElement(InternalModelElementContainer parent){
		createWebElement(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an WebElement with the given id. Post create hook will be triggered.
	 */
	def createWebElement(String ID, InternalModelElementContainer parent){
		createWebElement(ID,null,parent,true)
	}
	
	def createWebElement(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createWebElement(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an WebElement with the given id. Post create hook won't be triggered.
	 */
	def createWebElement(InternalModelElement ime) {
		createWebElement(generateUUID,ime,null,false)
	}
	
	override createWebElement() {
		createWebElement(generateUUID)
	}
	/**
	 * This method creates an Label with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createLabel(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createLabel => [
			setID(ID)
			internal = ime ?: createInternalLabel => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.LabelEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Label with the given id. Post create hook won't be triggered.
	 */
	def createLabel(String ID){
		createLabel(ID,null,null,false)
	}
	
	/**
	 * This method creates an Label with the given id. Post create hook will be triggered.
	 */
	def createLabel(InternalModelElementContainer parent){
		createLabel(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Label with the given id. Post create hook will be triggered.
	 */
	def createLabel(String ID, InternalModelElementContainer parent){
		createLabel(ID,null,parent,true)
	}
	
	def createLabel(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createLabel(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Label with the given id. Post create hook won't be triggered.
	 */
	def createLabel(InternalModelElement ime) {
		createLabel(generateUUID,ime,null,false)
	}
	
	override createLabel() {
		createLabel(generateUUID)
	}
	/**
	 * This method creates an Button with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createButton(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createButton => [
			setID(ID)
			internal = ime ?: createInternalButton => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.ButtonEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Button with the given id. Post create hook won't be triggered.
	 */
	def createButton(String ID){
		createButton(ID,null,null,false)
	}
	
	/**
	 * This method creates an Button with the given id. Post create hook will be triggered.
	 */
	def createButton(InternalModelElementContainer parent){
		createButton(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Button with the given id. Post create hook will be triggered.
	 */
	def createButton(String ID, InternalModelElementContainer parent){
		createButton(ID,null,parent,true)
	}
	
	def createButton(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createButton(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Button with the given id. Post create hook won't be triggered.
	 */
	def createButton(InternalModelElement ime) {
		createButton(generateUUID,ime,null,false)
	}
	
	override createButton() {
		createButton(generateUUID)
	}
	/**
	 * This method creates an TableBody with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTableBody(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTableBody => [
			setID(ID)
			internal = ime ?: createInternalTableBody => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TableBodyEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an TableBody with the given id. Post create hook won't be triggered.
	 */
	def createTableBody(String ID){
		createTableBody(ID,null,null,false)
	}
	
	/**
	 * This method creates an TableBody with the given id. Post create hook will be triggered.
	 */
	def createTableBody(InternalModelElementContainer parent){
		createTableBody(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an TableBody with the given id. Post create hook will be triggered.
	 */
	def createTableBody(String ID, InternalModelElementContainer parent){
		createTableBody(ID,null,parent,true)
	}
	
	def createTableBody(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTableBody(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an TableBody with the given id. Post create hook won't be triggered.
	 */
	def createTableBody(InternalModelElement ime) {
		createTableBody(generateUUID,ime,null,false)
	}
	
	override createTableBody() {
		createTableBody(generateUUID)
	}
	/**
	 * This method creates an TableData with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTableData(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTableData => [
			setID(ID)
			internal = ime ?: createInternalTableData => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TableDataEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an TableData with the given id. Post create hook won't be triggered.
	 */
	def createTableData(String ID){
		createTableData(ID,null,null,false)
	}
	
	/**
	 * This method creates an TableData with the given id. Post create hook will be triggered.
	 */
	def createTableData(InternalModelElementContainer parent){
		createTableData(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an TableData with the given id. Post create hook will be triggered.
	 */
	def createTableData(String ID, InternalModelElementContainer parent){
		createTableData(ID,null,parent,true)
	}
	
	def createTableData(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTableData(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an TableData with the given id. Post create hook won't be triggered.
	 */
	def createTableData(InternalModelElement ime) {
		createTableData(generateUUID,ime,null,false)
	}
	
	override createTableData() {
		createTableData(generateUUID)
	}
	/**
	 * This method creates an Comment with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createComment(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createComment => [
			setID(ID)
			internal = ime ?: createInternalComment => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.CommentEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Comment with the given id. Post create hook won't be triggered.
	 */
	def createComment(String ID){
		createComment(ID,null,null,false)
	}
	
	/**
	 * This method creates an Comment with the given id. Post create hook will be triggered.
	 */
	def createComment(InternalModelElementContainer parent){
		createComment(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Comment with the given id. Post create hook will be triggered.
	 */
	def createComment(String ID, InternalModelElementContainer parent){
		createComment(ID,null,parent,true)
	}
	
	def createComment(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createComment(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Comment with the given id. Post create hook won't be triggered.
	 */
	def createComment(InternalModelElement ime) {
		createComment(generateUUID,ime,null,false)
	}
	
	override createComment() {
		createComment(generateUUID)
	}
	/**
	 * This method creates an SelectBox with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSelectBox(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSelectBox => [
			setID(ID)
			internal = ime ?: createInternalSelectBox => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.SelectBoxEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SelectBox with the given id. Post create hook won't be triggered.
	 */
	def createSelectBox(String ID){
		createSelectBox(ID,null,null,false)
	}
	
	/**
	 * This method creates an SelectBox with the given id. Post create hook will be triggered.
	 */
	def createSelectBox(InternalModelElementContainer parent){
		createSelectBox(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SelectBox with the given id. Post create hook will be triggered.
	 */
	def createSelectBox(String ID, InternalModelElementContainer parent){
		createSelectBox(ID,null,parent,true)
	}
	
	def createSelectBox(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSelectBox(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SelectBox with the given id. Post create hook won't be triggered.
	 */
	def createSelectBox(InternalModelElement ime) {
		createSelectBox(generateUUID,ime,null,false)
	}
	
	override createSelectBox() {
		createSelectBox(generateUUID)
	}
	/**
	 * This method creates an Stop with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createStop(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createStop => [
			setID(ID)
			internal = ime ?: createInternalStop => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.StopEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Stop with the given id. Post create hook won't be triggered.
	 */
	def createStop(String ID){
		createStop(ID,null,null,false)
	}
	
	/**
	 * This method creates an Stop with the given id. Post create hook will be triggered.
	 */
	def createStop(InternalModelElementContainer parent){
		createStop(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Stop with the given id. Post create hook will be triggered.
	 */
	def createStop(String ID, InternalModelElementContainer parent){
		createStop(ID,null,parent,true)
	}
	
	def createStop(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createStop(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Stop with the given id. Post create hook won't be triggered.
	 */
	def createStop(InternalModelElement ime) {
		createStop(generateUUID,ime,null,false)
	}
	
	override createStop() {
		createStop(generateUUID)
	}
	/**
	 * This method creates an Span with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSpan(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSpan => [
			setID(ID)
			internal = ime ?: createInternalSpan => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.SpanEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Span with the given id. Post create hook won't be triggered.
	 */
	def createSpan(String ID){
		createSpan(ID,null,null,false)
	}
	
	/**
	 * This method creates an Span with the given id. Post create hook will be triggered.
	 */
	def createSpan(InternalModelElementContainer parent){
		createSpan(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Span with the given id. Post create hook will be triggered.
	 */
	def createSpan(String ID, InternalModelElementContainer parent){
		createSpan(ID,null,parent,true)
	}
	
	def createSpan(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSpan(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Span with the given id. Post create hook won't be triggered.
	 */
	def createSpan(InternalModelElement ime) {
		createSpan(generateUUID,ime,null,false)
	}
	
	override createSpan() {
		createSpan(generateUUID)
	}
	/**
	 * This method creates an Th with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTh(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTh => [
			setID(ID)
			internal = ime ?: createInternalTh => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.ThEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Th with the given id. Post create hook won't be triggered.
	 */
	def createTh(String ID){
		createTh(ID,null,null,false)
	}
	
	/**
	 * This method creates an Th with the given id. Post create hook will be triggered.
	 */
	def createTh(InternalModelElementContainer parent){
		createTh(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Th with the given id. Post create hook will be triggered.
	 */
	def createTh(String ID, InternalModelElementContainer parent){
		createTh(ID,null,parent,true)
	}
	
	def createTh(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTh(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Th with the given id. Post create hook won't be triggered.
	 */
	def createTh(InternalModelElement ime) {
		createTh(generateUUID,ime,null,false)
	}
	
	override createTh() {
		createTh(generateUUID)
	}
	/**
	 * This method creates an P with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createP(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createP => [
			setID(ID)
			internal = ime ?: createInternalP => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.PEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an P with the given id. Post create hook won't be triggered.
	 */
	def createP(String ID){
		createP(ID,null,null,false)
	}
	
	/**
	 * This method creates an P with the given id. Post create hook will be triggered.
	 */
	def createP(InternalModelElementContainer parent){
		createP(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an P with the given id. Post create hook will be triggered.
	 */
	def createP(String ID, InternalModelElementContainer parent){
		createP(ID,null,parent,true)
	}
	
	def createP(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createP(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an P with the given id. Post create hook won't be triggered.
	 */
	def createP(InternalModelElement ime) {
		createP(generateUUID,ime,null,false)
	}
	
	override createP() {
		createP(generateUUID)
	}
	/**
	 * This method creates an SelectBoxOption with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSelectBoxOption(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSelectBoxOption => [
			setID(ID)
			internal = ime ?: createInternalSelectBoxOption => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.SelectBoxOptionEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SelectBoxOption with the given id. Post create hook won't be triggered.
	 */
	def createSelectBoxOption(String ID){
		createSelectBoxOption(ID,null,null,false)
	}
	
	/**
	 * This method creates an SelectBoxOption with the given id. Post create hook will be triggered.
	 */
	def createSelectBoxOption(InternalModelElementContainer parent){
		createSelectBoxOption(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SelectBoxOption with the given id. Post create hook will be triggered.
	 */
	def createSelectBoxOption(String ID, InternalModelElementContainer parent){
		createSelectBoxOption(ID,null,parent,true)
	}
	
	def createSelectBoxOption(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSelectBoxOption(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SelectBoxOption with the given id. Post create hook won't be triggered.
	 */
	def createSelectBoxOption(InternalModelElement ime) {
		createSelectBoxOption(generateUUID,ime,null,false)
	}
	
	override createSelectBoxOption() {
		createSelectBoxOption(generateUUID)
	}
	/**
	 * This method creates an Screenshot with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createScreenshot(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createScreenshot => [
			setID(ID)
			internal = ime ?: createInternalScreenshot => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.ScreenshotEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Screenshot with the given id. Post create hook won't be triggered.
	 */
	def createScreenshot(String ID){
		createScreenshot(ID,null,null,false)
	}
	
	/**
	 * This method creates an Screenshot with the given id. Post create hook will be triggered.
	 */
	def createScreenshot(InternalModelElementContainer parent){
		createScreenshot(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Screenshot with the given id. Post create hook will be triggered.
	 */
	def createScreenshot(String ID, InternalModelElementContainer parent){
		createScreenshot(ID,null,parent,true)
	}
	
	def createScreenshot(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createScreenshot(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Screenshot with the given id. Post create hook won't be triggered.
	 */
	def createScreenshot(InternalModelElement ime) {
		createScreenshot(generateUUID,ime,null,false)
	}
	
	override createScreenshot() {
		createScreenshot(generateUUID)
	}
	/**
	 * This method creates an Textarea with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTextarea(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTextarea => [
			setID(ID)
			internal = ime ?: createInternalTextarea => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TextareaEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Textarea with the given id. Post create hook won't be triggered.
	 */
	def createTextarea(String ID){
		createTextarea(ID,null,null,false)
	}
	
	/**
	 * This method creates an Textarea with the given id. Post create hook will be triggered.
	 */
	def createTextarea(InternalModelElementContainer parent){
		createTextarea(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Textarea with the given id. Post create hook will be triggered.
	 */
	def createTextarea(String ID, InternalModelElementContainer parent){
		createTextarea(ID,null,parent,true)
	}
	
	def createTextarea(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTextarea(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Textarea with the given id. Post create hook won't be triggered.
	 */
	def createTextarea(InternalModelElement ime) {
		createTextarea(generateUUID,ime,null,false)
	}
	
	override createTextarea() {
		createTextarea(generateUUID)
	}
	/**
	 * This method creates an Start with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createStart(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createStart => [
			setID(ID)
			internal = ime ?: createInternalStart => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.StartEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an Start with the given id. Post create hook won't be triggered.
	 */
	def createStart(String ID){
		createStart(ID,null,null,false)
	}
	
	/**
	 * This method creates an Start with the given id. Post create hook will be triggered.
	 */
	def createStart(InternalModelElementContainer parent){
		createStart(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an Start with the given id. Post create hook will be triggered.
	 */
	def createStart(String ID, InternalModelElementContainer parent){
		createStart(ID,null,parent,true)
	}
	
	def createStart(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createStart(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an Start with the given id. Post create hook won't be triggered.
	 */
	def createStart(InternalModelElement ime) {
		createStart(generateUUID,ime,null,false)
	}
	
	override createStart() {
		createStart(generateUUID)
	}
	/**
	 * This method creates an SectionNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createSectionNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createSectionNode => [
			setID(ID)
			internal = ime ?: createInternalSectionNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.SectionNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an SectionNode with the given id. Post create hook won't be triggered.
	 */
	def createSectionNode(String ID){
		createSectionNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an SectionNode with the given id. Post create hook will be triggered.
	 */
	def createSectionNode(InternalModelElementContainer parent){
		createSectionNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an SectionNode with the given id. Post create hook will be triggered.
	 */
	def createSectionNode(String ID, InternalModelElementContainer parent){
		createSectionNode(ID,null,parent,true)
	}
	
	def createSectionNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createSectionNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an SectionNode with the given id. Post create hook won't be triggered.
	 */
	def createSectionNode(InternalModelElement ime) {
		createSectionNode(generateUUID,ime,null,false)
	}
	
	override createSectionNode() {
		createSectionNode(generateUUID)
	}
	/**
	 * This method creates an TableRow with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createTableRow(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createTableRow => [
			setID(ID)
			internal = ime ?: createInternalTableRow => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TableRowEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an TableRow with the given id. Post create hook won't be triggered.
	 */
	def createTableRow(String ID){
		createTableRow(ID,null,null,false)
	}
	
	/**
	 * This method creates an TableRow with the given id. Post create hook will be triggered.
	 */
	def createTableRow(InternalModelElementContainer parent){
		createTableRow(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an TableRow with the given id. Post create hook will be triggered.
	 */
	def createTableRow(String ID, InternalModelElementContainer parent){
		createTableRow(ID,null,parent,true)
	}
	
	def createTableRow(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createTableRow(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an TableRow with the given id. Post create hook won't be triggered.
	 */
	def createTableRow(InternalModelElement ime) {
		createTableRow(generateUUID,ime,null,false)
	}
	
	override createTableRow() {
		createTableRow(generateUUID)
	}
	/**
	 * This method creates an H with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createH(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createH => [
			setID(ID)
			internal = ime ?: createInternalH => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.HEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an H with the given id. Post create hook won't be triggered.
	 */
	def createH(String ID){
		createH(ID,null,null,false)
	}
	
	/**
	 * This method creates an H with the given id. Post create hook will be triggered.
	 */
	def createH(InternalModelElementContainer parent){
		createH(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an H with the given id. Post create hook will be triggered.
	 */
	def createH(String ID, InternalModelElementContainer parent){
		createH(ID,null,parent,true)
	}
	
	def createH(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createH(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an H with the given id. Post create hook won't be triggered.
	 */
	def createH(InternalModelElement ime) {
		createH(generateUUID,ime,null,false)
	}
	
	override createH() {
		createH(generateUUID)
	}
	def createAnchor(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createAnchor => [
			setID(ID)
			internal = ime ?: createInternalAnchor => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.AnchorEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an Anchor with the given id. Post create hook will be triggered.
	 */
	def createAnchor(String ID, InternalNode source, InternalNode target){
		createAnchor(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an Anchor with generated id. Post create hook will be triggered.
	 */
	def createAnchor(InternalNode source, InternalNode target){
		createAnchor(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an Anchor with the given id. Post create hook won't be triggered.
	 */
	def createAnchor(String ID){
		createAnchor(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an Anchor with a generated id. Post create hook won't be triggered.
	 */
	override createAnchor() {
		createAnchor(generateUUID)
	}
	def createTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createTransition => [
			setID(ID)
			internal = ime ?: createInternalTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.TransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an Transition with the given id. Post create hook will be triggered.
	 */
	def createTransition(String ID, InternalNode source, InternalNode target){
		createTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an Transition with generated id. Post create hook will be triggered.
	 */
	def createTransition(InternalNode source, InternalNode target){
		createTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an Transition with the given id. Post create hook won't be triggered.
	 */
	def createTransition(String ID){
		createTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an Transition with a generated id. Post create hook won't be triggered.
	 */
	override createTransition() {
		createTransition(generateUUID)
	}
	def createLabeledTransition(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createLabeledTransition => [
			setID(ID)
			internal = ime ?: createInternalLabeledTransition => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.usersequence.adapter.LabeledTransitionEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an LabeledTransition with the given id. Post create hook will be triggered.
	 */
	def createLabeledTransition(String ID, InternalNode source, InternalNode target){
		createLabeledTransition(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an LabeledTransition with generated id. Post create hook will be triggered.
	 */
	def createLabeledTransition(InternalNode source, InternalNode target){
		createLabeledTransition(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an LabeledTransition with the given id. Post create hook won't be triggered.
	 */
	def createLabeledTransition(String ID){
		createLabeledTransition(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an LabeledTransition with a generated id. Post create hook won't be triggered.
	 */
	override createLabeledTransition() {
		createLabeledTransition(generateUUID)
	}
	
	private def <T extends IdentifiableElement> setInternal(T elm, InternalIdentifiableElement internal) {
		elm => [
			if (id.isNullOrEmpty)
				ID = generateUUID
			switch elm {
				GraphModel: elm.internalElement = internal as InternalGraphModel
				ModelElement: elm.internalElement = internal as InternalModelElement
				Type: elm.internalElement = internal as InternalType
			}
		]
	}
	
	/**
	* This method creates a new UserSequenceGraphModel object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the UserSequenceGraphModel's save method to save your changes.
	*/
	def info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel createUserSequenceGraphModel(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("usersequencegraphmodel");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.usersequence.factory.UserSequenceFactory.eINSTANCE.createUserSequenceGraphModel();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(graph.internalElement);
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return graph;
	}
	
	
}
