package com.rameshkp.openapi.merger.app.models

import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class OpenApi(@field:NotBlank(message = "OpenApi version cannot be blank") var version: String? = null,
                   @field:NotNull(message = "OpenApi Info object cannot be null") @field:Valid var info: Info? = null,
                   @field:Valid var externalDocs: ExternalDocs? = null, @field:Valid var servers: List<Server> = emptyList())