

data class PromotionModel(
    val promotionId: Int,
    val title: String,
    var type: String,
    var criteriaId: Int,
    var criteriaMaxOperator: String,
    var criteriaMaxValue: Int,
    var criteriaMinOperator: String,
    var criteriaMinValue: Int,
    var criteriaType: String,
    var skuCount: Int,
    var disbursementType: String,
    var disbValue: Double?,
    var disbFreeSkuId: List<Int>?,
    var skuList: List<SkuModel>,
    var promotionStatus: Boolean = false,
    var totalAmount: Double = 0.0,
    var freeSkuCount: Int = 0
)

data class SkuModel(
    var skuId: Int,
    var skuName: String,
    var moq: Int,
    var quantity: Int = 0,
    var promotionDiscount: Double = 0.0,
    var amount: Double = 0.0,
    var batchList: List<BatchModel>
)

data class BatchModel(
    var batchId: Int,
    var price: Double,
    var rate: Double,
    var vat: Double,
    var isSelected: Boolean = false
)