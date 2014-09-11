package RemoteControl

class SonyControl extends RemoteControl{
  override def setChannel(Channel: Int) {
    SonyTV.tuneChannel(Channel)
  }
}
