package dev.ufer.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

/**
 *
 * @param ID
 * @param type
 * @param version
 */
data class UploadDocument(
    @get:NotNull
    @JsonProperty("ID") val ID: java.util.UUID,
    @get:NotNull
    @JsonProperty("Type") val type: Type,
    @get:NotNull @get:Min(1)
    @JsonProperty("Version") val version: Int
) {

    enum class Type(val value: String) {
        @JsonProperty("DocumentType")
        DOCUMENT_TYPE("DocumentType");
    }
}
