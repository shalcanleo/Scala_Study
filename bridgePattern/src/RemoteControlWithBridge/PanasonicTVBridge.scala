package RemoteControlWithBridge

class PanasonicTVBridge extends TV{
  override def tuneChannel(channel: Int) = {
    println("Panasonic TV Channel " + channel.toString)
  }

}
