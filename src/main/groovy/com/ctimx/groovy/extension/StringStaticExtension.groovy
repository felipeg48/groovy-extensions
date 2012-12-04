package com.ctimx.groovy.extension
	
import java.util.UUID

class StringStaticExtension {
    static String randomUUID(String selfType) {
        UUID.randomUUID().toString()
    }
}