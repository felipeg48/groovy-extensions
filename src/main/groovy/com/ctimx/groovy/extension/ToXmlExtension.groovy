package com.ctimx.groovy.extension

import com.thoughtworks.xstream.XStream
import com.thoughtworks.xstream.annotations.XStreamAlias
import com.thoughtworks.xstream.annotations.XStreamAsAttribute
import com.thoughtworks.xstream.annotations.XStreamImplicit
import com.thoughtworks.xstream.io.xml.DomDriver

class ToXmlExtension {

	static String toXml(self){
		XStream xstream = new XStream()
		xstream.alias(self.class.name.toLowerCase(), self.class);	
		xstream.autodetectAnnotations(true)
		xstream.toXML(self)
	}
	
	static def createInstanceFrom(xml,clazz){
    	XStream xstream = new XStream(new DomDriver())
		xstream.alias(clazz.name.toLowerCase(), clazz);
		xstream.autodetectAnnotations(true)
      	xstream.fromXML(xml)
  }

}