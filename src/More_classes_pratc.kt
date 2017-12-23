/**
 * Created by Steve on 12/23/2017.
 */

class Book{
    //below are four read/writeable variables
    var Title : String
    var Author : String
    var isbn : Long
    var PublishedDate : Int

//constrcutor for class Book, which in kotlin is called a secondary constructor, But in java is a constructor
    constructor(Title:String,isbn:Long,Author:String,PublisedDate:Int){
        this.Title =Title
        this.isbn=isbn
        this.Author=Author
        this.PublishedDate=PublisedDate

    }

}


fun main(args: Array<String>) {
//populate the books in the main class
    val book2 = Book("Black Jack",12345678,"Stephen King",1998)
    val book3 = Book("The Shining",1478526,"Stephen King",1997)
    val Bookt4 = Book("Dark rivers of the hart",7894561,"Dean Kootz",1999)
//print out  the membor methords from the respective classes
//show this to the user
    println("The books title is: " + book2.Title)
    println("The Books isbn numer is:" + book2.isbn)
    println("the Author of the book is:"+book2.Author + " It was first published on "+book2.PublishedDate)
}
