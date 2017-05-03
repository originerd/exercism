case class Year(year: Int) {
  val isLeap: Boolean = isDivisibleBy(4) && (!isDivisibleBy(100) || isDivisibleBy(400))

  private def isDivisibleBy(n: Int): Boolean = year % n == 0
}
