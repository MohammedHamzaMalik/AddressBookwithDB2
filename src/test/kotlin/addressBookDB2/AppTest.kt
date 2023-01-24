package com.addressBook

import AppContext
import com.addressBookDB2.tables.Contacts
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll

open class AppTest {
    companion object {
        lateinit var appCtx: AppContext

        @JvmStatic
        @BeforeAll
        fun setUp() {
            println("---------------")
            val db = connectToDatabase()
            appCtx = AppContext(db)

            transaction {
                SchemaUtils.create(Contacts)
            }

            resetDatabase()
        }

        @JvmStatic
        @AfterAll
        fun tearDown() {
            println("---------------")
            transaction {
                SchemaUtils.drop(Contacts)
            }
            resetDatabase()
        }
    }
}