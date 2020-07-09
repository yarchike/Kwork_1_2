package social.model

class Post (id:Int, //id записи
            idAuthor:Int,// id автора
            date: Int, //Дата поста
            text:String, //Текст записи
            comments: MutableList<Comments>, //Список коментариев
            like:Int, //Колличество лайков
            deliveredLike:Boolean//Поставлен ли лайк
)