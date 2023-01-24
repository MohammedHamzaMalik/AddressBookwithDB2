import com.addressBookDB2.tables.Contacts
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction


fun main(args: Array<String>) {
    val url = "jdbc:mysql://localhost:3306/address_book_db"
    val driver = "com.mysql.cj.jdbc.Driver"
    val username = "hamza"
    val password = "password"
    Database.connect(url, driver, username, password)

    transaction {
        SchemaUtils.create(Contacts)
    }


}

//val query = Contact.selectAll()
//query.forEach {
//    Assertions.assertTrue { it[Contact.firstName] == "Hamza" }
//}