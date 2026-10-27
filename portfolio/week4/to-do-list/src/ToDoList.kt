// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.filter { it.status == ItemStatus.NotStarted }.size // compute no. of items with NotStarted status
    val inProgress get() = items.filter { it.status == ItemStatus.InProgress }.size   // compute no. of items with InProgress status
    val done get() =       items.filter { it.status == ItemStatus.Done }.size         // compute no. of items with Done status
    val overdue get() =    items.filter { it.isOverdue() == true }.size   // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        var testlist = mutableListOf<ToDoItem>()
        // Implement code to read To Do list from a file here
        Path(filename).forEachLine {
            var itemvalues = it.split(": ")
            val time: LocalDate = LocalDate.parse(itemvalues[0])

            val enumval: ItemStatus = ItemStatus.valueOf(itemvalues[1])
            var listaddition: ToDoItem = ToDoItem(time, enumval, itemvalues[2])

            items.add(listaddition)
        }
        // See data/to-do.csv for an example of the format
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        var check = false
        val startsize = items.size
        // Write code here to remove items with status of Done
        //val iterator = items.iterator()

        //while(iterator.hasNext()) {
        //    val item = iterator.next()
        //    if(item.status == ItemStatus.Done) {
        //        iterator.remove()

        items.removeIf{ it.status == ItemStatus.Done }

        if (items.size < startsize) {
            check = true
            }
        // Return true if any were removed, false if none were removed
        return check
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        if(status == null) {
            return items
        } else {
            val getenum = status
            return items.filter { it.status == getenum }
        }

        // status, or a list of all items if status argument is null
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        return items.filter { it.dueDate == date}
    }
}
