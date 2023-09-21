package com.m2f.network.model.mappers

import com.m2f.model.Image
import com.m2f.network.model.ImageEntity


fun ImageEntity.toImage() = Image(
    url = url)