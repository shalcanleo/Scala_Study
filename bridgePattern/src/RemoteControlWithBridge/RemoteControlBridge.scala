package RemoteControlWithBridge

class RemoteControlBridge(private val implement: TV) {
  def turnOn(): Unit ={
    println("Hello!")
  }
  
  def turnOff(): Unit ={
    println("Bye!")
  }

  def setChannel(Channel: Int): Unit = {
    implement.tuneChannel(Channel)
  }
}
