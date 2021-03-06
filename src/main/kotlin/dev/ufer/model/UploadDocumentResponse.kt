package dev.ufer.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

/**
 *
 * @param ID
 * @param version
 * @param message
 * @param success
 * @param blobURLPut
 * @param blobURLPutExpires
 */
data class UploadDocumentResponse(
    @get:NotNull
    @JsonProperty("ID") val ID: java.util.UUID,
    @get:NotNull @get:Min(1)
    @JsonProperty("Version") val version: Int,
    @get:NotNull
    @JsonProperty("Message") val message: String,
    @get:NotNull
    @JsonProperty("Success") val success: Boolean,
    @get:NotNull
    @JsonProperty("BlobURLPut") val blobURLPut: String,
    @get:NotNull
    @JsonProperty("BlobURLPutExpires") val blobURLPutExpires: java.time.OffsetDateTime
)
