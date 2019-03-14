package disbursement

import Command
import PromotionModel

class PercentDCommand(
    private var disbursementReceiver: DisbursementReceiver,
    private var promotionModel: PromotionModel
) : Command {

    override fun execute() {
        disbursementReceiver.handlePercentage(promotionModel)
    }
}