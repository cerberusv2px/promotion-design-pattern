package disbursement

import Command
import PromotionModel

class AmountDCommand(
    private var disbursementReceiver: DisbursementReceiver,
    private var promotionModel: PromotionModel
) : Command {

    override fun execute() {
        disbursementReceiver.handleAmount(promotionModel)
    }
}