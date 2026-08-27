package com.example.apisers.domain.repository

import com.example.apisers.domain.model.Character

interface CharacterRepository {
    suspend fun getCharacters(): Result<List<Character>>
}
