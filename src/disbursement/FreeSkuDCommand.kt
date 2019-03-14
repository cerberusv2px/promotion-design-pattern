package disbursement

import  PromotionModel
import Command

class FreeSkuDCommand(
    private var disbursementReceiver: DisbursementReceiver,
    private var promotionModel: PromotionModel
) : Command {

    override fun execute() {
        disbursementReceiver.handleFreeSku(promotionModel)
    }
}