package RemoteControl

/**
 * Created by shalcanleo on 14-9-11.
 */
class PanasonicControl extends RemoteControl{

  override def setChannel(Channel: Int) {
    PanasonicTV.tuneChannel(Channel)
  }

}
