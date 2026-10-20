// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    if (triangle.first < triangle.second+triangle.third) {
        if (triangle.second < triangle.first+triangle.third) {
            if (triangle.third < triangle.first+triangle.second) {
                return true
            } else {
                return false
            }
        } else {
            return false
        }
    } else {
        return false
    }
}

fun triangleArea(triangle: Triangle): Double {

    require(isValidTriangle(triangle) == true) {"invalid traingle"}
    val semiPerimeter = (triangle.first + triangle.second + triangle.third)/2
    var Area = sqrt((semiPerimeter*(
            (semiPerimeter - triangle.first) * (semiPerimeter - triangle.second) * (semiPerimeter - triangle.third))))
    return Area
}