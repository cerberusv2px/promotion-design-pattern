package promotiontype

import PromotionModel
import criteria.CriteriaReceiver
import Invoke
import criteria.AmountCommand
import criteria.QuantityCommand
import PromotionListener

class PromotionTypeReceiver(promotionListener: PromotionListener) {

    private val criteriaReceiver = CriteriaReceiver(promotionListener)
    private val invoker = Invoke()

    fun handleSinglePromotion(promotion: PromotionModel) {
        if (promotion.criteriaType == "AMOUNT") {

            invoker.executeCommand(AmountCommand(criteriaReceiver, promotion))
        } else if (promotion.criteriaType == "QUANTITY") {

            invoker.executeCommand(QuantityCommand(criteriaReceiver, promotion))
        }
    }

    fun handleMultiplePromotion(promotion: PromotionModel) {
        if (promotion.criteriaType == "AMOUNT") {

            invoker.executeCommand(AmountCommand(criteriaReceiver, promotion))
        } else if (promotion.criteriaType == "QUANTITY") {

            invoker.executeCommand(QuantityCommand(criteriaReceiver, promotion))
        }
    }
}