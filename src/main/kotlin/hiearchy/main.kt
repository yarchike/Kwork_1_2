package hiearchy

import hiearchy.view.TextView
import hiearchy.view.ViewGroup
import hiearchy.widget.Button

fun main() {
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    println()

    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

    println()

    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)
    val readMore = Button("Read more")
    main.addView(readMore)

}