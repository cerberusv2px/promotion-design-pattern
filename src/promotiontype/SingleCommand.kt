package promotiontype

import Command
import PromotionModel

class SingleCommand(
    private val promotionTypeReceiver: PromotionTypeReceiver,
    private val promotionModel: PromotionModel
) : Command {

    override fun execute() {
        promotionTypeReceiver.handleSinglePromotion(promotionModel)
    }
}