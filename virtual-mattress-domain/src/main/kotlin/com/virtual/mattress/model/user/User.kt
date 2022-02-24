package com.virtual.mattress.model.user

import com.virtual.mattress.model.sheet.Sheet
import com.virtual.mattress.model.user.type.UserType
import javax.persistence.*

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String,
    val email: String,

    @Enumerated(EnumType.STRING)
    val type: UserType,
    val password: String,

    @ManyToMany
    val sheetList: List<Sheet>
)
