package com.rameshkp.openapi.merger.app.models

import jakarta.validation.constraints.NotBlank

data class ExternalDocs(@field:NotBlank(message = "ExternalDocs Url cannot be blank") var url: String? = null, var description: String? = null)