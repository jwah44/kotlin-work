// Task 15.3: Student class, demonstrating method overriding
class Student(val degree: String) : Person() {
    override fun speak() {
        println("hello i am a Student studying $degree")
    }
}