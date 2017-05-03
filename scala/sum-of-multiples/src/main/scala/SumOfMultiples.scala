object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int =
    factors.flatMap(e => (1 to (limit - 1) / e).map(i => e * i)).sum
}

