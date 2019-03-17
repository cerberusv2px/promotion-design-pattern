package criteria

import PromotionModel
import criteria.operator.OperatorManager
import disbursement.DisbursementReceiver
import Invoke
import disbursement.AmountDCommand
import disbursement.FreeSkuDCommand
import disbursement.PercentDCommand
import PromotionListener

class CriteriaReceiver(private val listener: PromotionListener) {

    private val disbursementReceiver = DisbursementReceiver(listener)
    private val invoker = Invoke()

    fun handleAmount(promotionModel: PromotionModel) {
        val totalQuantity = promotionModel.skuList.sumBy { it.quantity }
        if (OperatorManager.isCriteriaValid(
                totalQuantity,
                promotionModel.criteriaMinValue,
                promotionModel.criteriaMinOperator,
                promotionModel.criteriaMaxValue,
                promotionModel.criteriaMaxOperator
            )
        ) {

            when (promotionModel.disbursementType) {
                "PERCENT" -> invoker.executeCommand(
                    PercentDCommand(
                        disbursementReceiver,
                        promotionModel
                    )
                )
                "AMOUNT" -> invoker.executeCommand(
                    AmountDCommand(
                        disbursementReceiver,
                        promotionModel
                    )
                )
                "FREE SKU" -> invoker.executeCommand(
                    FreeSkuDCommand(
                        disbursementReceiver,
                        promotionModel
                    )
                )
            }
        } else {
            promotionModel.promotionStatus = false
            listener.getUpdatePromotion(promotionModel)
        }
    }

    fun handleQuantity(promotionModel: PromotionModel) {
        val totalQuantity = promotionModel.skuList.sumBy { it.quantity }
        if (OperatorManager.isCriteriaValid(
                totalQuantity,
                promotionModel.criteriaMinValue,
                promotionModel.criteriaMinOperator,
                promotionModel.criteriaMaxValue,
                promotionModel.criteriaMaxOperator
            )
        ) {

            when (promotionModel.disbursementType) {
                "PERCENT" -> invoker.executeCommand(
                    PercentDCommand(
                        disbursementReceiver,
                        promotionModel
                    )
                )
                "AMOUNT" -> invoker.executeCommand(
                    AmountDCommand(
                        disbursementReceiver,
                        promotionModel
                    )
                )
                "FREE SKU" -> invoker.executeCommand(
                    FreeSkuDCommand(
                        disbursementReceiver,
                        promotionModel
                    )
                )
            }
        } else {
            promotionModel.promotionStatus = false
            listener.getUpdatePromotion(promotionModel)
        }
    }
}