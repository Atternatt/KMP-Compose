package com.m2f.network.model.mappers

import com.m2f.model.Country
import com.m2f.network.model.CountryEntity

fun CountryEntity.toCounty() = Country(
    slug = slug,
    title = title,
    image = image.toImage()
)