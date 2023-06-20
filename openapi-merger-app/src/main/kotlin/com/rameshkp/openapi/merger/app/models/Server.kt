package com.rameshkp.openapi.merger.app.models

import jakarta.validation.constraints.NotBlank

data class Server(@field:NotBlank(message = "server url cannot be blank") var url: String? = null, var description: String? = null)