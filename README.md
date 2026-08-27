# Rick & Morty API - Android

Proyecto Android en Kotlin para consumo de la API pública de Rick and Morty.

## Tecnologías

- Kotlin
- Jetpack Compose / Material 3
- Retrofit
- Moshi + KSP
- Hilt
- Coil
- Coroutines / StateFlow

## Arquitectura

El proyecto está organizado por capas:

- `data`: API, DTOs, mapper y repository implementation.
- `domain`: modelos, repository contract y use case.
- `ui`: pantalla, componentes, sección de lista, UiState y ViewModel.
- `di`: módulos de inyección de dependencias.

## API

Base URL: `https://rickandmortyapi.com/api/`

Endpoint utilizado: `GET /character?page=1`

## Ejecución

Abrir el proyecto con Android Studio, permitir la sincronización de Gradle y ejecutar el módulo `app` en un emulador o dispositivo Android con Internet.
