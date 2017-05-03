class Bob {
  def hey(message: String): String = {
    if (message.trim.isEmpty) {
      "Fine. Be that way!"
    } else if (message == message.toUpperCase && message != message.toLowerCase) {
      "Whoa, chill out!"
    } else if (message.last == '?') {
      "Sure."
    } else {
      "Whatever."
    }
  }
}
