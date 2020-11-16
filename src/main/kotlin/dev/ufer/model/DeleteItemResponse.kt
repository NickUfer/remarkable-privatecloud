package dev.ufer.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

/**
 *
 * @param ID
 * @param version
 */
data class DeleteItemResponse(
    @get:NotNull
    @JsonProperty("ID") val ID: java.util.UUID,
    @get:NotNull @get:Min(1)
    @JsonProperty("Version") val version: Int
)
