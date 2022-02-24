package com.virtual.mattress.model.sheet

import com.virtual.mattress.model.user.User
import javax.persistence.*

@Entity
data class Sheet(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String,
    @ManyToMany(fetch = FetchType.EAGER)
    val userList: List<User>
)
