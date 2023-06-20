package com.rameshkp.openapi.merger.gradle.extensions

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import jakarta.inject.Inject

/**
 *  An extension class for External docs
 */
open class ExternalDocsExtension @Inject constructor(objectFactory: ObjectFactory) {
    val url: Property<String> = objectFactory.property(String::class.java)
    val description: Property<String> = objectFactory.property(String::class.java)
}