import RemoteControl.{ SonyControl, PanasonicControl}
import RemoteControlWithBridge.{SonyTVBridge, RemoteControlBridge}

object Main extends App{
  println("Now test the remote control:")
  println("")

  val control1 = new PanasonicControl()
  control1.turnOn()
  control1.setChannel(1)
  control1.turnOff()

  println("")

  val control2 = new SonyControl()
  control2.turnOn()
  control2.setChannel(2)
  control2.turnOff()

  println("")

  println("Now test the remote control with bridge:")

  println("")

  val sonyTv = new SonyTVBridge
  val controlSony = new RemoteControlBridge(sonyTv)
  controlSony.turnOn()
  controlSony.setChannel(1)
  controlSony.turnOff()

}
