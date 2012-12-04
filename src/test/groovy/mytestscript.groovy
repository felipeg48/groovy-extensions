
//Run as:
//groovy -cp ../../../build/libs/groovy-extensions.jar mytestscript.groovy


@groovy.transform.ToString(includeNames=true)
class Sample {
	String name
	String phone
}

x = new Sample(name:"Felipe",phone:"(800) GROOVY ")

s = x.toXml()
println s

n = s.createInstanceFrom(Sample.class)
	
println n
println String.randomUUID()