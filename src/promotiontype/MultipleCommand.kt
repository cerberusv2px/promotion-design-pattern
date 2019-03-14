package promotiontype

import PromotionModel
import Command

class MultipleCommand(
    private val promotionTypeReceiver: PromotionTypeReceiver,
    private val promotionModel: PromotionModel
) : Command {

    override fun execute() {
        promotionTypeReceiver.handleMultiplePromotion(promotionModel)
    }
}