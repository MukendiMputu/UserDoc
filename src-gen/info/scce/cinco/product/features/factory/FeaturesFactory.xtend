package info.scce.cinco.product.features.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.features.features.FeaturesPackage
import info.scce.cinco.product.features.features.impl.FeaturesFactoryImpl
import info.scce.cinco.product.features.features.internal.InternalFactory
import info.scce.cinco.product.features.features.internal.InternalPackage

import info.scce.cinco.product.features.features.adapter.*

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

class FeaturesFactory extends FeaturesFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static FeaturesFactory eINSTANCE = FeaturesFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def FeaturesFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(FeaturesPackage.eNS_URI) as FeaturesFactory
			if (fct != null)
				return fct as FeaturesFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new FeaturesFactory
	}
	
	/**
	 * This method creates an FeaturesGraphModel with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createFeaturesGraphModel(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createFeaturesGraphModel => [ 
			setID(ID)
			internal = ime ?: createInternalFeaturesGraphModel => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.features.adapter.FeaturesGraphModelEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an FeaturesGraphModel with the given id. Post create hook won't be triggered.
	 */
	def createFeaturesGraphModel(String ID){
		createFeaturesGraphModel(ID,null,null,false)
	}
	
	/**
	 * This method creates an FeaturesGraphModel with the given id. Post create hook will be triggered.
	 */
	def createFeaturesGraphModel(InternalModelElementContainer parent){
		createFeaturesGraphModel(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an FeaturesGraphModel with the given id. Post create hook will be triggered.
	 */
	def createFeaturesGraphModel(String ID, InternalModelElementContainer parent){
		createFeaturesGraphModel(ID,null,parent,true)
	}
	
	def createFeaturesGraphModel(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createFeaturesGraphModel(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an FeaturesGraphModel with the given id. Post create hook won't be triggered.
	 */
	def createFeaturesGraphModel(InternalModelElement ime) {
		createFeaturesGraphModel(generateUUID,ime,null,false)
	}
	
	override createFeaturesGraphModel() {
		createFeaturesGraphModel(generateUUID)
	}
	/**
	 * This method creates an FeatureContainer with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createFeatureContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createFeatureContainer => [
			setID(ID)
			internal = ime ?: createInternalFeatureContainer => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.features.adapter.FeatureContainerEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an FeatureContainer with the given id. Post create hook won't be triggered.
	 */
	def createFeatureContainer(String ID){
		createFeatureContainer(ID,null,null,false)
	}
	
	/**
	 * This method creates an FeatureContainer with the given id. Post create hook will be triggered.
	 */
	def createFeatureContainer(InternalModelElementContainer parent){
		createFeatureContainer(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an FeatureContainer with the given id. Post create hook will be triggered.
	 */
	def createFeatureContainer(String ID, InternalModelElementContainer parent){
		createFeatureContainer(ID,null,parent,true)
	}
	
	def createFeatureContainer(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createFeatureContainer(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an FeatureContainer with the given id. Post create hook won't be triggered.
	 */
	def createFeatureContainer(InternalModelElement ime) {
		createFeatureContainer(generateUUID,ime,null,false)
	}
	
	override createFeatureContainer() {
		createFeatureContainer(generateUUID)
	}
	/**
	 * This method creates an DocNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createDocNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createDocNode => [
			setID(ID)
			internal = ime ?: createInternalDocNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.features.adapter.DocNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an DocNode with the given id. Post create hook won't be triggered.
	 */
	def createDocNode(String ID){
		createDocNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an DocNode with the given id. Post create hook will be triggered.
	 */
	def createDocNode(InternalModelElementContainer parent){
		createDocNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an DocNode with the given id. Post create hook will be triggered.
	 */
	def createDocNode(String ID, InternalModelElementContainer parent){
		createDocNode(ID,null,parent,true)
	}
	
	def createDocNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createDocNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an DocNode with the given id. Post create hook won't be triggered.
	 */
	def createDocNode(InternalModelElement ime) {
		createDocNode(generateUUID,ime,null,false)
	}
	
	override createDocNode() {
		createDocNode(generateUUID)
	}
	/**
	 * This method creates an EndNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createEndNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createEndNode => [
			setID(ID)
			internal = ime ?: createInternalEndNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.features.adapter.EndNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an EndNode with the given id. Post create hook won't be triggered.
	 */
	def createEndNode(String ID){
		createEndNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an EndNode with the given id. Post create hook will be triggered.
	 */
	def createEndNode(InternalModelElementContainer parent){
		createEndNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an EndNode with the given id. Post create hook will be triggered.
	 */
	def createEndNode(String ID, InternalModelElementContainer parent){
		createEndNode(ID,null,parent,true)
	}
	
	def createEndNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createEndNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an EndNode with the given id. Post create hook won't be triggered.
	 */
	def createEndNode(InternalModelElement ime) {
		createEndNode(generateUUID,ime,null,false)
	}
	
	override createEndNode() {
		createEndNode(generateUUID)
	}
	/**
	 * This method creates an StartNode with the given id.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param hook: Indicates, if the post create hook should be executed
	 */
	def createStartNode(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createStartNode => [
			setID(ID)
			internal = ime ?: createInternalStartNode => [
				setID(ID + "_INTERNAL")
				container = parent
				eAdapters.add(new info.scce.cinco.product.features.adapter.StartNodeEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an StartNode with the given id. Post create hook won't be triggered.
	 */
	def createStartNode(String ID){
		createStartNode(ID,null,null,false)
	}
	
	/**
	 * This method creates an StartNode with the given id. Post create hook will be triggered.
	 */
	def createStartNode(InternalModelElementContainer parent){
		createStartNode(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an StartNode with the given id. Post create hook will be triggered.
	 */
	def createStartNode(String ID, InternalModelElementContainer parent){
		createStartNode(ID,null,parent,true)
	}
	
	def createStartNode(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createStartNode(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an StartNode with the given id. Post create hook won't be triggered.
	 */
	def createStartNode(InternalModelElement ime) {
		createStartNode(generateUUID,ime,null,false)
	}
	
	override createStartNode() {
		createStartNode(generateUUID)
	}
	def createLabeledEdge(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createLabeledEdge => [
			setID(ID)
			internal = ime ?: createInternalLabeledEdge => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.features.adapter.LabeledEdgeEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an LabeledEdge with the given id. Post create hook will be triggered.
	 */
	def createLabeledEdge(String ID, InternalNode source, InternalNode target){
		createLabeledEdge(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an LabeledEdge with generated id. Post create hook will be triggered.
	 */
	def createLabeledEdge(InternalNode source, InternalNode target){
		createLabeledEdge(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an LabeledEdge with the given id. Post create hook won't be triggered.
	 */
	def createLabeledEdge(String ID){
		createLabeledEdge(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an LabeledEdge with a generated id. Post create hook won't be triggered.
	 */
	override createLabeledEdge() {
		createLabeledEdge(generateUUID)
	}
	def createEdge(String ID, InternalModelElement ime, InternalNode source, InternalNode target, boolean hook) {
		super.createEdge => [
			setID(ID)
			internal = ime ?: createInternalEdge => [
				(it as InternalEdge).set_sourceElement(source)
				(it as InternalEdge).set_targetElement(target)
				container = source?.rootElement ?: target?.rootElement
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.features.adapter.EdgeEContentAdapter)
			]
		]
	}
	
	/**
	 * This method creates an Edge with the given id. Post create hook will be triggered.
	 */
	def createEdge(String ID, InternalNode source, InternalNode target){
		createEdge(ID,null,source,target,true)
	}
	
	/**
	 * This method creates an Edge with generated id. Post create hook will be triggered.
	 */
	def createEdge(InternalNode source, InternalNode target){
		createEdge(generateUUID,null,source,target,true)
	}
	
	/**
	 * This method creates an Edge with the given id. Post create hook won't be triggered.
	 */
	def createEdge(String ID){
		createEdge(ID,null,null,null,false)
	}
	
	/**
	 * This method creates an Edge with a generated id. Post create hook won't be triggered.
	 */
	override createEdge() {
		createEdge(generateUUID)
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
	* This method creates a new FeaturesGraphModel object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the FeaturesGraphModel's save method to save your changes.
	*/
	def info.scce.cinco.product.features.features.FeaturesGraphModel createFeaturesGraphModel(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("featuresgraphmodel");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.features.factory.FeaturesFactory.eINSTANCE.createFeaturesGraphModel();
		
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
