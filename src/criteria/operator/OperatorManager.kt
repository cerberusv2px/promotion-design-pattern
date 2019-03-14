package criteria.operator

class OperatorManager {

    companion object {
        fun compareCriteria(quantity: Int, criteriaValue: Int, operator: String): Boolean {
            return when (operator) {
                "GREATER THAN" -> quantity > criteriaValue
                "LESS THAN" -> quantity < criteriaValue
                "GREATER THAN EQUAL TO" -> quantity >= criteriaValue
                else -> false
            }
        }

//        fun cC2(quantity: Int, minV, minT, maxV, maxT): Boolean {
//            if(compareCriteria(q,minV, minT) && compareCriteria(q))
//        }
    }
}