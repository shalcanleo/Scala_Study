package RemoteControl

trait RemoteControl {
  def turnOn() {
    println("Hello!")
  }

  def turnOff() {
    println("Bye!")
  }

  def setChannel(Channel: Int)
}
