// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Exception if median does not = list[0] when size=1" {
        val input = List<Float>(1) { 0f } // List of size 1, populated with 0 float
        median(input) shouldBe input[0]
    }

    "Exception if median does not = (list[0] + list[1]) / 2 when size=2" {
        val input = listOf(1f, 5f) // arbritrary values in list of size 2
        median(input) shouldBe ((input[0] + input[1]) / 2)
    }

    "Exception if median does not = list[1] when size=3" {
        val input = listOf(3f, 11f, 9f) // arbritrary values in list of size 3
        median(input) shouldBe input[1]
    }

    "Exception if median does not = (list[1] + list[2]) / 2 when size=4" {
        val input = listOf(3f, 3f, 15f, 8f) // arbritrary values in list of size 2
        median(input) shouldBe ((input[1] + input[2]) / 2)
    }

})
