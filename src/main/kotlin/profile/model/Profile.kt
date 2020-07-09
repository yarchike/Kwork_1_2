package profile.model

import java.awt.Image

class Profile(val id: Int, val login:String, val name:String, val surname: String, var status:String, var avatar: String){
        val fullname:String
            get() {
                return "$name $surname"
            }

}




