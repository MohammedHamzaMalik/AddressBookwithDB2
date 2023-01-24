package com.commandPattern.addressBook.dataClasses

import java.util.UUID

data class Contact(
    val contactId: UUID,
    val firstName: String,
    val lastName: String
)

data class Emails (
    val emailId: UUID,
    val emailType: String,
    val email: String
)

data class PhoneNumbers (
    val phoneNumberId: UUID,
    val phoneNumberType: String,
    val phoneNumber: String
)

data class Addresses (
    val addressId: UUID,
    val addressType: String,
    val address: String
)

data class Group(
    val groupId: UUID,
    val groupName: String
)

data class GroupMembers(
    val groupId: UUID,
    val groupName: String,
    val contactId: UUID,
//    val groupMembers: MutableList<Contact>
)