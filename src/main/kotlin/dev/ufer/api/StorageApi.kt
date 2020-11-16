package dev.ufer.api

import dev.ufer.model.DeleteItemResponse
import dev.ufer.model.Document
import dev.ufer.model.MetaDocument
import dev.ufer.model.UpdateItemStatusResponse
import dev.ufer.model.UploadDocument
import dev.ufer.model.UploadDocumentResponse
import javax.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class StorageApiController {

    @RequestMapping(
            value = ["/document-storage/json/2/delete"],
            produces = ["application/json"],
            method = [RequestMethod.PUT])
    fun deleteItems(): ResponseEntity<List<DeleteItemResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @RequestMapping(
            value = ["/document-storage/json/2/docs"],
            produces = ["application/json"],
            method = [RequestMethod.GET])
    fun getItems(
        @RequestParam(value = "doc", required = false) doc: java.util.UUID?,
        @RequestParam(value = "withBlob", required = false, defaultValue = "false") withBlob: Boolean
    ): ResponseEntity<List<Document>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @RequestMapping(
            value = ["/document-storage/json/2/upload/update-status"],
            produces = ["application/json"],
            consumes = ["application/json"],
            method = [RequestMethod.PUT])
    fun updateItemStatuses(
        @Valid @RequestBody metaDocument: List<MetaDocument>?
    ): ResponseEntity<List<UpdateItemStatusResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @RequestMapping(
            value = ["/document-storage/json/2/upload/request"],
            produces = ["application/json"],
            consumes = ["application/json"],
            method = [RequestMethod.PUT])
    fun uploadDocuments(
        @Valid @RequestBody uploadDocument: List<UploadDocument>?
    ): ResponseEntity<List<UploadDocumentResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
