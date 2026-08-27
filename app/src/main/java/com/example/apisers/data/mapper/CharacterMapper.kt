package com.example.apisers.data.mapper

import com.example.apisers.data.remote.dto.CharacterDto
import com.example.apisers.domain.model.Character

fun CharacterDto.toDomain(): Character = Character(
    id = id,
    name = name,
    status = status,
    species = species,
    gender = gender,
    origin = origin.name,
    location = location.name,
    image = image
)
