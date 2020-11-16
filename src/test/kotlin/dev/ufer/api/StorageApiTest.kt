package dev.ufer.api

import dev.ufer.model.DeleteItemResponse
import dev.ufer.model.Document
import dev.ufer.model.MetaDocument
import dev.ufer.model.UpdateItemStatusResponse
import dev.ufer.model.UploadDocument
import dev.ufer.model.UploadDocumentResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class StorageApiTest {

    private val api: StorageApiController = StorageApiController()

    /**
    * Delete items
    *
    *
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deleteItemsTest() {
        val response: ResponseEntity<List<DeleteItemResponse>> = api.deleteItems()

        // TODO: test validations
    }

    /**
    * Get items
    *
    *
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getItemsTest() {
        val doc: java.util.UUID? = null
        val withBlob: kotlin.Boolean? = null
        val response: ResponseEntity<List<Document>> = api.getItems(doc!!, withBlob!!)

        // TODO: test validations
    }

    /**
    * Update statuses of items
    *
    *
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateItemStatusesTest() {
        val metaDocument: kotlin.collections.List<MetaDocument>? = null
        val response: ResponseEntity<List<UpdateItemStatusResponse>> = api.updateItemStatuses(metaDocument!!)

        // TODO: test validations
    }

    /**
    * Upload documents
    *
    *
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun uploadDocumentsTest() {
        val uploadDocument: kotlin.collections.List<UploadDocument>? = null
        val response: ResponseEntity<List<UploadDocumentResponse>> = api.uploadDocuments(uploadDocument!!)

        // TODO: test validations
    }
}
