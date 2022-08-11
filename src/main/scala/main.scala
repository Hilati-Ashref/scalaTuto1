object HelloWorld {
  def test(valeur: Double): String =
    val retour = "The number is "
    retour + valeur.toInt
  def main(args: Array[String]): Unit = {
    println("Hello, " + test(15))
  }
}
object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) { callback(); Thread sleep 1000 }
  }
  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }
}