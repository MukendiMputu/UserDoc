	= README =

	This is dynamically generated documentation for the Cinco FlowGraph example project with features
	selected during project setup.

	== Getting Started ==

	                            ┌─────────────────┐
	                            │ /!\ CAUTION /!\ │
	                            └─────────────────┘
	You selected the "prime references" feature. Prior to product generation, 
	you need to build the ExternalLibrary: open model/ExternalLibrary.genmodel,
	right-click on the root node in the opened editor, and select 'Generate All'
	from the context menu. See the "Additional Features" section below for more
	information.

	Please note: You selected one or more features that produced Java source files. As they depend on classes
	generated from the MGL, the project will report build errors (indicated by the red X marker) until you
	generate the Cinco Product.

	Generate your Cinco Product: right-click on /info.scce.cinco.product.example/model/FlowGraphTool.cpd and
	select 'Generate Cinco Product'

	Start your generated Cinco Product: right-click on /info.scce.cinco.product.example and
	select 'Run as > Eclipse Application'.

	Before you can start modeling, you need to create a project: right-click in the Project Explorer and
	select 'New > New FlowGraphTool Project', give the project a name and click 'Finish'.

	Now start a first FlowGraph model: right-click on your created project and select 'New > New FlowGraph'.

	See below for details on the available modeling elements and effects of additional features selected
	during project initialization.


	== General Features ==

	Basic FlowGraph models consist of three types of nodes and two types of edges:

	* 'Start' nodes are shown as a green circle and can may have exactly one outgoing 'Transition'

	* 'Activity' nodes have attributes 'name' and 'description' and are shown as a blue rectangle
	  showing the name.  They can have multiple outgoing 'LabeledTransition' edges, and multiple incoming
	  edges of arbitrary type.

	* 'End' nodes are shown as a red double circle and can have multiple incoming edges of arbitrary type.


	== Additional Features ==	

	=== Containers ===

	Containers are special nodes that can again hold other nodes (and containers). This selected feature adds
	'Swimlane' containers to the FlowGraph example. The containableElements constraint defines what kind of
	nodes (and how many of them) can be contained: Exactly one 'Start' node and arbitrary many of the other
	node types, but no 'Swimlane' containers. The 'actor' attribute is displayed in the top left corner
	of the swimlane.


	=== Icons ===

	This selected feature adds icons to the nodes (displayed in the palette), as well as to the FlowGraph
	model type itself (used as file icon and in the editor tab). The images (png files) are located in the
	icons folder of the project. They are referenced with the @icon(...) annotation (on nodes) and the iconPath
	keyword on the graphModel.


	=== Appearance Provider ===

	Appearances define basic visual properties within the style language, like colors, line widths, line styles
	fonts, etc. The selected feature makes use of an appearance provider, which can determine these values
	dynamically at runtime. The Java class implementing this behavior is referenced in the edgeStyle/nodeStyle.
	For the FlowGraph example, the appearance provider is used on the 'simpleArrow' style, which is used
	by the 'Transition' node defined in the MGL. It will set a dashed line style, if the target node
	of the edge is of type 'End', and a solid one in all other cases. Thus, if a 'Start' node is directly
	connected with an 'End' node, the connecting edge will be rendered with a dashed line style.


	=== Custom Action ===

	Cinco's custom actions allow one to execute arbitrary code based on the selected element. This includes
	analyzing the model, transforming the model, code generation, etc. Currently, the action can be added to
	the element in the MGL with two possible annotations: @contextMenuAction(...) and @doubleClickAction(...).
	While the first appears in the menu for the user to choose when right-clicking on the element, the second
	one is automatically executed on double-clicking the element. In the FlowGraph example, a custom action
	is added to the 'Start' node. It searches for the shortest path to an 'End' node and displays the number
	of required steps in a dialog window.


	=== Code Generator ===

	The example code generator is implemented in Xtend. It is compatible with Java (it actually generates
	.java files from .xtend files), provides several syntactic enhancements and has built-in support for
	templates. See https://eclipse.org/xtend/documentation/ for more information on Xtend.
	Code generators are usually very specific to the target domain, and there is no meaningful execution semantics
	for our	FlowGraph model. So, the example code generator only enumerates all nodes of the model and prints
	some general information about them.


	=== Prime References ===

	Cinco's 'prime references' are a mechanism to represent (parts of) other models as nodes within the currently
	edited model, which allows for interconnected models in a cleanly structured way. The underlying idea is that
	the referenced model is drag&dropped 'as a component' into the modeling canvas, resulting in the instantiation
	of the according prime referencing node. The FlowGraph example utilizes this feature in two ways:

	1) Sub-Models
	A node type 'SubFlowGraph' is added that represents a whole other flow graph as a green rectangle node. It is
	created by drag&dropping a .flowgraph file directly from the project explorer to the canvas. As this is the
	only valid way of creating this kind of node, it is not listed in the palette like regular node types.

	2) External Library
	The second example provides integration of an external library defined with a separate Ecore metamodel, which
	needs to be generated to Java prior to Cinco building the modeling tool (see CAUTION notice above). As this
	integration crosses the boundaries of Cinco, we rely on the model editor automatically generated by the EMF
	framework. To create an external library in your running Cinco Product, right-click in the project explorer
	and select 'New > Other ... > Example EMF Model Creation Wizards > ExternalLibrary Model', give it a name
	and choose 'External Activity Library' as Model Object. Then, open the file, expand the root node and select
	'New Child > External Activity' from the context menu of the 'External Activity Library'. To modify the 'name'
	and 'description' attributes of the external activities, you need Eclipse's property view. Click on any
	element within your .elib file and select 'Show Properties View'. Of course, if the external library were
	defined with Cinco (i.e. a second MGL file), this whole handling would have been simplified. Now, to actually
	use the external activities, refresh the project in the project explorer, expand your .elib file and drag&drop
	the activities into a FlowGraph model. This .elib file expansion is provided by the 'primeviewer' meta plug-in
	of Cinco, which is activated by adding the @primeviewer annotation to the graphModel. The @pvFileExtension(...)
	annotation on the prime reference defines in which files the plug-in has to search for according objects, and
	the @pvLabel(...) annotation defines an attribute of the referenced class that is displayed as a label in the
	expanded .elib file.

	Please note: The 'prime' keyword defines a node as a prime reference node. It is used like 'attr' on the one
	prime referencing attribute. In the example, this attribute's type is given as 'externalLibrary.ExternalActivity'
	for the 'ExternalActivity' and as 'this::FlowGraph' for the 'SubFlowGraph'. The latter covers the special case
	of referencing an element type from the same MGL file. If a model or node type from a different MGL shall be
	referenced, an according import statement needs to be added at the top of the MGL and the there given name
	needs to be used instead of 'this'. Generally, references to Ecore types is done with '.' and references to
	MGL types is done with '::'.


	=== Post-Create Hooks ===

	Hooks are used to execute arbitrary code (e.g. analyzing/transforming the model) before or after certain events
	on elements occur. Currently, four different events are available, which are referenced with according annotations:
	@postCreate(...), @postMove(...), @postResize(...), and @preDelete(...). The post-create hook generated with this
	FlowGraph example is bound to the 'Activity' node type and randomly sets the name when a new activity is created.


	=== Palette Groups ===

	By default, all node types are displayed in the palette in a general group named "Nodes". This selected feature 
	adds the @palette(...) annotation to all node types, either with "Round Elements" or "Rectangular Elements" as
	name for the group.


	=== Transformation API ===

	The Cinco Transformation API (C-API) is automatically generated for every Cinco product. It wraps the actual model
	types as defined in the MGL and the graphical representation into one easy-to-use API. Every model element has an
	according C-prefixed type, i.e. CFlowGraph, CStart, CActivity, etc. on which one can perform programmatically (e.g.
	within custom actions, hooks, or even code generators) everything that the modeling tool user can do by clicking
	within the running tool. This includes adding, moving, resizing, and deleting nodes, connecting, reconnecting and
	deleting edges, setting attributes, etc.

	This selected feature adds a post-create hook to the FlowGraph model itself. It is triggered by the "New FlowGraph"
	wizard after creating the model. It initializes the model with a 'Start' node, an 'Activity' node, and an 'End' node.

	Please note: You also selected the "Post-create hooks" feature during project initialization. So, the added 'Activity'
	node will also contain a random value for the 'name' attribute, as its post-create hook will also trigger when a new
	node is created via the C-API.


	=== Product Branding ===	

	At some point, a Cinco Product needs to be given to modeling users, which requires a standalone installer, as those
	users should not need to install Cinco, Generate the product and start it from within Cinco. The branding feature
	adds some additional information and images to the CPD file, which are displayed when the standalone product is
	started. This includes a splash screen, icons, and an about text. For information on how to actually export a Cinco
	Product, see https://projekte.itmc.tu-dortmund.de/projects/cinco/wiki/Export_Product

