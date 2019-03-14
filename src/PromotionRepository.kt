class PromotionRepository {

    companion object {
        fun getData(): List<PromotionModel> {
            return listOf(
                PromotionModel(
                    1,
                    "Buy 2 get 5% off",
                    "MULTIPLE",
                    1,
                    "LESS THAN",
                    10,
                    "GREATER THAN EQUAL TO",
                    2,
                    "QUANTITY",
                    1,
                    "PERCENT",
                    5.0,
                    null,
                    listOf(
                        SkuModel(
                            1,
                            "Sku1",
                            2,
                            quantity = 1,
                            batchList = listOf(
                                BatchModel(
                                    1,
                                    50.0,
                                    47.0,
                                    0.13
                                ),
                                BatchModel(
                                    2,
                                    60.0,
                                    58.0,
                                    0.13
                                )
                            )
                        ),
                        SkuModel(
                            2,
                            "Sku2",
                            2,
                            quantity = 1,
                            batchList = listOf(
                                BatchModel(
                                    10,
                                    50.0,
                                    47.0,
                                    0.13
                                ),
                                BatchModel(
                                    11,
                                    60.0,
                                    58.0,
                                    0.13
                                )
                            )
                        )
                    )
                ),
                PromotionModel(
                    2,
                    "Buy > 24 get 5% off",
                    "SINGLE",
                    1,
                    "GREATER THAN",
                    24,
                    "GREATER THAN",
                    24,
                    "QUANTITY",
                    1,
                    "PERCENT",
                    5.0,
                    emptyList(),
                    listOf(
                        SkuModel(
                            5,
                            "Sku5",
                            15,
                            quantity = 25,
                            batchList = listOf(
                                BatchModel(
                                    3,
                                    50.0,
                                    47.0,
                                    0.13
                                ),
                                BatchModel(
                                    4,
                                    60.0,
                                    58.0,
                                    0.13
                                )
                            )
                        )
                    )
                )
            )
        }
    }
}