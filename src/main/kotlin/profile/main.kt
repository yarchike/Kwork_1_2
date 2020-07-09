package profile

import profile.model.Profile

fun main() {
    val user = Profile(15, "yarchik", "Ярослав", "Мартынов", "Женат", "Фото" )
    print(user.fullname)
}