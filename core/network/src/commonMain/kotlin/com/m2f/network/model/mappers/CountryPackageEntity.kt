package com.m2f.network.model.mappers

import com.m2f.model.CountryPackage
import com.m2f.network.model.CountryPackageEntity

fun CountryPackageEntity.toCountyPackage() = CountryPackage(
    id = id,
    data = data,
    validity = validity,
    price = price,
    operator = operator.toOperator()
)