package RemoteControl

class PanasonicControl extends RemoteControl{

  override def setChannel(Channel: Int) {
    PanasonicTV.tuneChannel(Channel)
  }

}
