package com.addressBookDB2.tables

import org.jetbrains.exposed.sql.Table

object Contacts : Table() {
    val contactId = uuid("contact_id").autoGenerate()
    val firstName = varchar("first_name", length = 100)
    val lastName = varchar("last_name", length = 100)

    override val primaryKey = PrimaryKey(contactId, name = "PK_Contact_ID")
}

//object PhoneNumbers : Table() {
//    val phoneNumberId = uuid("phone_number_id").autoGenerate()
//    val contactId = (uuid("contact_id") references Contacts.contactId).index()
//    val phoneNumberType = varchar("phone_number_type", length = 100)
//    val phoneNumber = varchar("phone_number", length = 100)
//
//    override val primaryKey = PrimaryKey(PhoneNumbers.phoneNumberId, name = "PK_PhoneNumber_ID")
//}
//
//object Emails : Table() {
//    val emailId = uuid("email_id").autoGenerate()
//    val contactId = (uuid("contact_id") references Contacts.contactId).index()
//    val emailType = varchar("email_type", length = 100)
//    val email = varchar("email", length = 100)
//
//    override val primaryKey = PrimaryKey(Emails.emailId, name = "PK_Email_ID")
//}
//
//object Addresses : Table() {
//    val addressId = uuid("address_id").autoGenerate()
//    val contactId = (uuid("contact_id") references Contacts.contactId).index()
//    val addressType = varchar("address_type", length = 100)
//    val address = varchar("address", length = 100)
//
//    override val primaryKey = PrimaryKey(Addresses.addressId, name = "PK_Address_ID")
//}
//
//object Groups : Table() {
//    val groupId = uuid("group_id").autoGenerate()
//    val groupName = varchar("group_name", length = 100)
//
//    override val primaryKey = PrimaryKey(Groups.groupId, name = "PK_Group_ID")
//}
//
//object GroupMembers : Table() {
//    val groupMemberId = uuid("group_member_id").autoGenerate()
//    val groupId = (uuid("group_id") references Groups.groupId).index()
//    val contactId = (uuid("contact_id") references Contacts.contactId).index()
//
//    override val primaryKey = PrimaryKey(GroupMembers.groupMemberId, name = "PK_GroupMember_ID")
//}