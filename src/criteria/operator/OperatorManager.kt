package criteria.operator

class OperatorManager {

    companion object {
       private fun compareCriteria(quantity: Int, criteriaValue: Int, operator: String): Boolean {
            return when (operator) {
                "GREATER THAN" -> quantity > criteriaValue
                "LESS THAN" -> quantity < criteriaValue
                "GREATER THAN EQUAL TO" -> quantity >= criteriaValue
                else -> false
            }
        }

        fun isCriteriaValid(
            totalQuantity: Int,
            minValue: Int,
            minOperator: String,
            maxValue: Int,
            maxOperator: String
        ): Boolean {

            return (compareCriteria(
                totalQuantity,
                minValue,
                minOperator
            )
                    && compareCriteria(
                totalQuantity,
                maxValue,
                maxOperator
            ))
        }
    }
}