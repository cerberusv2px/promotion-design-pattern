import promotiontype.MultipleCommand
import promotiontype.PromotionTypeReceiver
import promotiontype.SingleCommand

fun main() {
    PromotionMain()
}

fun getPromotionList(): List<PromotionModel> = PromotionRepository.getData()

class PromotionMain : PromotionListener {
    init {
        val promotionTypeReceiver = PromotionTypeReceiver(this)
        val invoker = Invoke()

        val dataList = getPromotionList().filter { it.promotionId == 1 }
        dataList.forEach {
            if (it.type == "SINGLE") {
                val singleCommand = SingleCommand(promotionTypeReceiver, it)
                invoker.executeCommand(singleCommand)
            } else if (it.type == "MULTIPLE") {
                invoker.executeCommand(MultipleCommand(promotionTypeReceiver, it))
            }
        }
    }

    override fun getUpdatePromotion(promotionModel: PromotionModel) {
        print(promotionModel)
    }
}

interface PromotionListener {
    fun getUpdatePromotion(promotionModel: PromotionModel)
}