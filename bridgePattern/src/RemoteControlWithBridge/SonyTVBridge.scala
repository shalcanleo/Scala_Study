package RemoteControlWithBridge

/**
 * Created by shalcanleo on 14-9-11.
 */
class SonyTVBridge extends TV{
  override def tuneChannel(channel: Int) {
    println("Sony TV channel " + channel.toString)
  }

}
