/**
 * Created by Steve on 12/10/2017.
 */

class Animal constructor(animaltype:String, colour: String, sex: String, AnimalName : String,Age:Int) {
    var animaltype: String
    var colour: String
    var sex: String
    var AnimalName: String
    var Age: Int

    //we are utilsing the init block, because we have header class constructed in the name of the class.
    //and do not have any space to put the primary constructors members in the header

    init {
        this.animaltype = animaltype
        this.colour = colour
        this.sex = sex
        this.AnimalName = AnimalName
        this.Age = Age
    }

    //member function speak, part of animal class
    fun speak() {
        if (animaltype == "Cat")
            println(this.AnimalName + " mow mow")
        else println(this.AnimalName + " says: woof woof")
    }
}
fun main(args: Array<String>) {
  val dog= Animal("Dog","Black and white","Female","Ruby",3)
  val cat = Animal("Cat","White with patches of grey","Female","Milly",4)
  val cat3 =Animal("Cat","white","Female","Max",3)

    print("the following are the details of the animal: ")
    println(dog.animaltype)

    print("the animals colour is: ")
    println(dog.colour)
    //print(dog.speak())

    println("the animals age is:" + dog.Age)
    dog.speak()

    print("the following are the details of the animal: ")
    println(cat.animaltype)

    print("the animals colour is: ")
    println(cat.colour)
    //print(dog.speak())
    cat.speak( )
    println("the animals age is:" + cat.Age)
    dog.speak()
    cat.speak()
    cat3.speak()


}



