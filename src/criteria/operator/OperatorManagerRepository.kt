package criteria.operator

interface OperatorManagerRepository {

    fun matchGreaterThan(quantity: Double, criteriaValue: Double): Boolean
    fun matchLessThan(quantity: Double, criteriaValue: Double): Boolean
    fun matchGreaterThanEqual(quantity: Double, criteriaValue: Double): Boolean
    fun matchLessThanEqual(quantity: Double, criteriaValue: Double): Boolean
    fun matchEquals(quantity: Double, criteriaValue: Double): Boolean
}