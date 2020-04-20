object Main {
  def main(args: Array[String]): Unit = {
    val foo = new Concrete1
    execute(foo)
  }

  private def execute(ap: AbstractParent) = ap.execute()
}
