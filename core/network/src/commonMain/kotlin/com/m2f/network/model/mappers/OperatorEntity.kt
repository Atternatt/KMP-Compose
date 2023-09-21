package com.m2f.network.model.mappers

import com.m2f.model.Operator
import com.m2f.network.model.OperatorEntity

fun OperatorEntity.toOperator() = Operator(
    title,
    logo.toImage(),
    gradientStartColorHex,
    gradientEndColorHex,
    style,
    countries.map { it.toCounty() },
)