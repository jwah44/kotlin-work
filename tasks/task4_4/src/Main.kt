// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size !=3) {
        println("Incorrect number of arguments")
        exitProcess(1)
    }
    val minTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val tempInc = args[2].toFloat()
    var incTotal = minTemp
    while (incTotal <= maxTemp) {
        var tempFarenheit = (incTotal*1.8 + 32)
        println("%5.1fC %6.1fF".format(incTotal, tempFarenheit))
        incTotal += tempInc
    }


}
