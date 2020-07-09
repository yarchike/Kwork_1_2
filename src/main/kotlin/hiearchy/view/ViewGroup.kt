package hiearchy.view

class ViewGroup ():View(){
    var list: MutableList<View> = mutableListOf()
    fun addView(view:View){
        this.list.add(view)
    }
}