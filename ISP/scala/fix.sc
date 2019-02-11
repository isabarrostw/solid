trait DoorService {
  def isOpen
  def open
  def close
}

trait TimerDoorService {
  def closeAfterMinutes(duration: Int)
}

class Door extends DoorService {
  def isOpen = {}
  def open = {}
  def close = {}
}

class TimedDoor extends DoorService with TimerDoorService {
  def isOpen = {}
  def open = {}
  def close = {}
  def closeAfterMinutes(duration: Int) = {}
}
