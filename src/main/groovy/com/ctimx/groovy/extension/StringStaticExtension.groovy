package com.ctimx.groovy.extension
	
import java.util.UUID

class StringStaticExtension {
    static String randomUUID(Integer selfType) {
        UUID.randomUUID().toString()
    }
}