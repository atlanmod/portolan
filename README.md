# Model-Driven Cartography
We understand Cartography as the whole process from raw data to corresponding visualization.

Model-Driven Engineering (MDE), with its simple core principles and set of base generic techniques (metamodeling, model transformation, model weaving, etc), provides the relevant support for designing and implementing such Cartography solutions. The proposed Portolan prototype is a concrete illustration of a Model-Driven Cartography platform. Thus, the objective is to bridge the gap between raw data of a given domain and visualization world, by four high level tasks we have identified during our experiments on three different use cases:

* Metamodeling: analysis of the domain, to capture its concepts and define corresponding types;
* Discovery: collect user's data, transform and merge them into a central model;
* View Definition: design transformations to filter or compute subsets of the central model;
* Visualization: pass the central model (or a subset of it) to viewers, in order to get a graphical display of user's data.

## *Portolan* prototype
The *Portolan* platform aims at facilitating this process by providing a set of Model-Driven tools to bridge the gap between a given (data) domain and the visualization world, with respect to the four Cartography tasks presented above.

The platform integrates:

* a set of default DSLs like GraphML, KML, Excel;
* visual displays based on Prefuse, Google Maps;
* modeling tools such as ATL language, Ecore modeler, etc.

The included extension mechanisms allow to plug new tools in the platform:

* metamodel extension using Ecore modeler and types inheritance
* View Definition extension point, to add filters to user tool bar
* Visualization extension point, to plug a new viewer in *Portolan* platform

## A research project
The *Portolan* platform is a result of researchs made by the [AtlanMod](http://web.emn.fr/x-info/atlanmod/index.php?title=Main_Page) [Inria](https://www.inria.fr/) research team about visualization through Model-Driven Engineering.

### Publications
* [PORTOLAN: a Model-Driven Cartography Framework](https://hal.archives-ouvertes.fr/inria-00568186/fr/), Vincent Mahé, Salvador Martinez Perez, Guillaume Doux, Hugo Brunelière, and Jordi Cabot, INRIA research report (2011)
* [Model-Driven Interoperability of Dependencies Visualizations](https://hal.archives-ouvertes.fr/file/index/docid/534441/filename/MDTPI_DepsVisualization.pdf), Vincent Mahé, Hugo Brunelière, Frédéric Jouault, Jean Bézivin, and Jean-Pierre Talpin, 3rd Workshop on Model-Driven Tool & Process Integration (co-located with ECMFA 2010), France (2010)
