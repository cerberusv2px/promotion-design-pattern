package disbursement

import PromotionModel
import PromotionListener

class DisbursementReceiver(private val listenter: PromotionListener) {

    fun handleAmount(promotionModel: PromotionModel) {
    }

    fun handlePercentage(promotionModel: PromotionModel) {
        var totalAmount = 0.0
        promotionModel.skuList.forEach {
            val amount = it.batchList[0].rate * it.quantity
            it.promotionDiscount = it.amount.times(promotionModel.disbValue ?: 0.0).div(100)
            totalAmount += amount.times(100 - (promotionModel.disbValue ?: 0.0)).div(100)

        }
        promotionModel.totalAmount = totalAmount
        promotionModel.promotionStatus = true
        listenter.getUpdatePromotion(promotionModel)
    }

    fun handleFreeSku(promotionModel: PromotionModel) {
        promotionModel.skuList.forEach {
            it.promotionDiscount = 0.0
        }
        promotionModel.freeSkuCount = promotionModel.skuList.sumBy {
            (it.quantity / promotionModel.criteriaMinValue) * promotionModel.disbFreeSkuId!!.size
        }
        promotionModel.totalAmount = promotionModel.skuList.sumByDouble {
            it.quantity * it.batchList[0].rate
        }
        listenter.getUpdatePromotion(promotionModel)
    }
}