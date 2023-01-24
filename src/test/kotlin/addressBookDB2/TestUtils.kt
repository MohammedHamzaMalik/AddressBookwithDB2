package com.addressBook

import com.addressBookDB2.tables.Contacts
import com.commandPattern.addressBook.requests.AddContactRequest
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

    fun getAddContactRequest(): AddContactRequest {
        transaction {
            Contacts.insert {
                it[this.firstName] = "Hamza"
                it[this.lastName] = "Malik"
            }
        }
        return AddContactRequest("Hamza", "Malik")
    }

//    fun getEditContactRequest(): EditContactRequest {
//        return EditContactRequest(
//            UUID.randomUUID(),
//            "Mohammed","Malik",
//            mutableMapOf("work" to "work@gmail.com","home" to "home@gmail.com"),
//            mutableMapOf("work" to "+91 123","home" to "+91 234"),
//            mutableMapOf("HOME" to "ST","WORK" to "BRC"),
//            mutableListOf("Vayana","PDPU")
//        )
//    }