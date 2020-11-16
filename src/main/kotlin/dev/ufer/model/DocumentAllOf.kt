package dev.ufer.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @param message
 * @param success
 * @param blobURLGet
 * @param blobURLGetExpires
 */
data class DocumentAllOf(
    @JsonProperty("Message") val message: String? = null,
    @JsonProperty("Success") val success: Boolean? = null,
    @JsonProperty("BlobURLGet") val blobURLGet: String? = null,
    @JsonProperty("BlobURLGetExpires") val blobURLGetExpires: java.time.OffsetDateTime? = null
)
