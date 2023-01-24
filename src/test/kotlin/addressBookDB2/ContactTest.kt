package com.addressBook


import com.addressBook.entryPoints.addContact
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ContactTest: AppTest() {

    @Test
    fun `add contact`() {
        val req = getAddContactRequest()
        val contactResponse = addContact(appCtx, req)

        Assertions.assertEquals("Hamza", contactResponse.firstName)
        Assertions.assertEquals("Malik", contactResponse.lastName)
    }

    @Test
    fun `delete contact`() {

        val req = getAddContactRequest()
        val contactResponse = addContact(appCtx, req)
        val editedReq = getEditContactRequest()

        Assertions.assertEquals("Mohammed", editedReq.firstName)
    }
}