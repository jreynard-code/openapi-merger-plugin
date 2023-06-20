package com.rameshkp.openapi.merger.app.models

import jakarta.validation.constraints.NotBlank

data class License(@field:NotBlank(message = "License name cannot be blank") var name: String? = null, var url: String? = null)