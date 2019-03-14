package criteria

import Command
import PromotionModel

class AmountCommand(
    private val criteriaReceiver: CriteriaReceiver,
    private val promotionModel: PromotionModel
) : Command {

    override fun execute() {
        criteriaReceiver.handleAmount(promotionModel)
    }
}