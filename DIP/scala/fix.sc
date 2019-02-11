// The Dependency inversion principle is somewhat less relevant because functions
// can be passed in functional languages instead of dynamic binding.

trait ProcessorService {
  def process(list: List[String])
}

class TwitterProcessor {
  val myProcessor: ProcessorService = new Processor
}

class Processor extends ProcessorService {
  def process(list: List[String]) = process(list, true)
  def process(list: List[String], someCheck: Boolean) = {}
}
