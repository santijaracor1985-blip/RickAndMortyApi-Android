package com.example.apisers.domain.usecase

import com.example.apisers.domain.model.Character
import com.example.apisers.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(): Result<List<Character>> = repository.getCharacters()
}
