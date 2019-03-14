package criteria

import PromotionModel
import Command

class QuantityCommand(
    private val criteriaReceiver: CriteriaReceiver,
    private var promotionModel: PromotionModel
) : Command {

    override fun execute() {
        criteriaReceiver.handleQuantity(promotionModel)
    }
}