package com.example.apisers.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.apisers.ui.components.ErrorView
import com.example.apisers.ui.components.LoadingView
import com.example.apisers.ui.sections.CharacterListSection
import com.example.apisers.ui.viewmodel.CharacterUiState
import com.example.apisers.ui.viewmodel.CharacterViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterScreen(viewModel: CharacterViewModel = hiltViewModel()) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(
        topBar = { TopAppBar(title = { Text("Rick & Morty Characters") }) }
    ) { padding ->
        Box(modifier = Modifier.fillMaxSize().padding(padding)) {
            when (val state = uiState) {
                CharacterUiState.Loading -> LoadingView()
                is CharacterUiState.Success -> CharacterListSection(state.characters)
                is CharacterUiState.Error -> ErrorView(
                    message = state.message,
                    onRetry = viewModel::loadCharacters
                )
            }
        }
    }
}
