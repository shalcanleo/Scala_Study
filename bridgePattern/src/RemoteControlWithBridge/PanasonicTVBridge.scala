package RemoteControlWithBridge

/**
 * Created by shalcanleo on 14-9-11.
 */
class PanasonicTVBridge extends TV{
  override def tuneChannel(channel: Int) = {
    println("Panasonic TV channel " + channel.toString)
  }

}
