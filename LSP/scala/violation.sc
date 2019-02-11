trait DogBehaviour {
  def run
}

class RealDog extends DogBehaviour {
  def run = {
    println("run")
  }
}

class ToyDog extends DogBehaviour {
  val batteryPresent = true
  def run = {
    if(batteryPresent) println("run")
  }
}

object client {
  def runTheDog(dog: DogBehaviour) = {
    dog.run
  }
}

object client2 {
  def runTheDog(dog: DogBehaviour) = {
    if(dog.isInstanceOf[ToyDog]) dog.asInstanceOf[ToyDog].batteryPresent = true; dog.run
  }
}
