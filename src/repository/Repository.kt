package dev.adaniel.repository

import dev.adaniel.model.*

interface Repository {

    suspend fun add(post: Post): Post
    suspend fun post(id: Int): Post?
    suspend fun post(id: String): Post?
    suspend fun posts(): ArrayList<Post>
    suspend fun remove(post: Post)
    suspend fun remove(id: Int): Boolean
    suspend fun remove(id: String): Boolean
    suspend fun clear()
}