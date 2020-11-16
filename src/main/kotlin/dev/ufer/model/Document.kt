package dev.ufer.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern

/**
 *
 * @param ID
 * @param version
 * @param type
 * @param modifiedClient
 * @param vissibleName
 * @param currentPage
 * @param bookmarked
 * @param parent
 * @param message
 * @param success
 * @param blobURLGet
 * @param blobURLGetExpires
 */
data class Document(
    @get:NotNull
    @JsonProperty("ID") val ID: java.util.UUID,
    @get:NotNull @get:Min(1)
    @JsonProperty("Version") val version: Int,
    @get:NotNull
    @JsonProperty("Type") val type: DocumentType,
    @get:NotNull
    @JsonProperty("ModifiedClient") val modifiedClient: java.time.OffsetDateTime,
    @JsonProperty("VissibleName") val vissibleName: String? = null,
    @get:Min(0)
    @JsonProperty("CurrentPage") val currentPage: Int? = null,
    @JsonProperty("Bookmarked") val bookmarked: Boolean? = null,
    @get:Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}|trash|$")
    @JsonProperty("Parent") val parent: String? = null,
    @JsonProperty("Message") val message: String? = null,
    @JsonProperty("Success") val success: Boolean? = null,
    @JsonProperty("BlobURLGet") val blobURLGet: String? = null,
    @JsonProperty("BlobURLGetExpires") val blobURLGetExpires: java.time.OffsetDateTime? = null
)
