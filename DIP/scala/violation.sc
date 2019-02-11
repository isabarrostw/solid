class TwitterProcessor {
  def processTweets = new Processor.process(List("1", "2"))
}

class Processor {
  def process(list: List[String]) = {}
}


