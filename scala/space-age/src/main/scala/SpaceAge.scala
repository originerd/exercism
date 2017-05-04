case class SpaceAge(val seconds: Long) {
  lazy val onEarth: Double = getYear("earth")
  lazy val onJupiter: Double = getYear("jupiter")
  lazy val onMars: Double = getYear("mars")
  lazy val onMercury: Double = getYear("mercury")
  lazy val onNeptune: Double = getYear("neptune")
  lazy val onSaturn: Double = getYear("saturn")
  lazy val onUranus: Double = getYear("uranus")
  lazy val onVenus: Double = getYear("venus")

  private lazy val onEarthRaw = seconds / yearToSecondsOnEarth
  private val period = Map(
    "earth" -> 1.0,
    "jupiter" -> 11.862615,
    "mars" -> 1.8808158,
    "mercury" -> 0.2408467,
    "neptune" -> 164.79132,
    "saturn" -> 29.447498,
    "uranus" -> 84.016846,
    "venus" -> 0.61519726
  )
  private val yearToSecondsOnEarth = 31557600.0

  private def getYear(planet: String): Double = roundAtTwo(onEarthRaw / period(planet))
  private def roundAtTwo(n: Double): Double = math.round(n * 100) / 100.0
}
