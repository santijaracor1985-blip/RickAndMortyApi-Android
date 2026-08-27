package com.example.apisers.data.repository

import com.example.apisers.data.mapper.toDomain
import com.example.apisers.data.remote.api.CharacterApiService
import com.example.apisers.domain.model.Character
import com.example.apisers.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: CharacterApiService
) : CharacterRepository {
    override suspend fun getCharacters(): Result<List<Character>> = runCatching {
        api.getCharacters().results.map { it.toDomain() }
    }
}
