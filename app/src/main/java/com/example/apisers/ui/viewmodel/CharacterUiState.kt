package com.example.apisers.ui.viewmodel

import com.example.apisers.domain.model.Character

sealed interface CharacterUiState {
    data object Loading : CharacterUiState
    data class Success(val characters: List<Character>) : CharacterUiState
    data class Error(val message: String) : CharacterUiState
}
